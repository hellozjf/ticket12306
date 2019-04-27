package com.hellozjf.ticket12306.thread;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hellozjf.ticket12306.dto.OrderTicketDTO;
import com.hellozjf.ticket12306.dto.UrlConfDTO;
import com.hellozjf.ticket12306.util.UrlUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.*;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 这个线程用来购票
 * @author Jingfeng Zhou
 */
@Slf4j
public class OrderTicketThread extends Thread {

    /**
     * 购票相关的信息
     */
    private OrderTicketDTO orderTicketDTO;

    /**
     * 各种UrlConfDTO，里面有uri，host，referer等信息
     */
    private Map<String, UrlConfDTO> mapUrlConfDTO;

    /**
     * JSON工具
     */
    private ObjectMapper objectMapper;

    /**
     * 构造方法
     * @param orderTicketDTO
     */
    public OrderTicketThread(OrderTicketDTO orderTicketDTO, Map<String, UrlConfDTO> mapUrlConfDTO, ObjectMapper objectMapper) {
        this.orderTicketDTO = orderTicketDTO;
        this.mapUrlConfDTO = mapUrlConfDTO;
        this.objectMapper = objectMapper;
    }

    /**
     * 线程体
     */
    @Override
    public void run() {
        try {

            // 浏览列车列表
            HttpClient httpClient = HttpClients.createDefault();
            HttpClientContext httpClientContext = HttpClientContext.create();
            UrlConfDTO urlConfDTO = mapUrlConfDTO.get("left_ticket_init");
            HttpPost httpPost = new HttpPost(UrlUtils.getUrl(urlConfDTO.getHttpType(), urlConfDTO.getHost(), urlConfDTO.getReqUrl()));
            httpPost.addHeader(HttpHeaders.REFERER, urlConfDTO.getReferer());
            HttpResponse httpResponse = httpClient.execute(httpPost, httpClientContext);
            CookieStore cookieStore = httpClientContext.getCookieStore();
            HttpEntity httpEntity = httpResponse.getEntity();
            String result = EntityUtils.toString(httpEntity);

            // 查看是否已经登录
            httpPost.reset();
            urlConfDTO = mapUrlConfDTO.get("loginConf");
            httpPost = new HttpPost(UrlUtils.getUrl(urlConfDTO.getHttpType(), urlConfDTO.getHost(), urlConfDTO.getReqUrl()));
            httpPost.addHeader(HttpHeaders.REFERER, urlConfDTO.getReferer());
            httpResponse = httpClient.execute(httpPost, httpClientContext);
            cookieStore = httpClientContext.getCookieStore();
            httpEntity = httpResponse.getEntity();
            result = EntityUtils.toString(httpEntity);
            log.debug("result = {}", result);
            JsonNode jsonNode = objectMapper.readTree(result);
            log.debug("是否需要登录：{}", jsonNode.get("data").get("is_login_passCode").textValue());

            // 打开登录页面
            httpPost.reset();
            urlConfDTO = mapUrlConfDTO.get("loginInitCdn1");
            httpPost = new HttpPost(UrlUtils.getUrl(urlConfDTO.getHttpType(), urlConfDTO.getHost(), urlConfDTO.getReqUrl()));
            httpPost.addHeader(HttpHeaders.REFERER, urlConfDTO.getReferer());
            httpResponse = httpClient.execute(httpPost, httpClientContext);
            cookieStore = httpClientContext.getCookieStore();
            httpEntity = httpResponse.getEntity();
            result = EntityUtils.toString(httpEntity);
//            log.debug("result = {}", result);

            // 登录接口
            httpPost.reset();
            urlConfDTO = mapUrlConfDTO.get("uamtk-static");
            httpPost = new HttpPost(UrlUtils.getUrl(urlConfDTO.getHttpType(), urlConfDTO.getHost(), urlConfDTO.getReqUrl()));
            httpPost.addHeader(HttpHeaders.REFERER, urlConfDTO.getReferer());
            List<NameValuePair> formParams = new ArrayList<>();
            formParams.add(new BasicNameValuePair("appid", "otn"));
            UrlEncodedFormEntity requestEntity = new UrlEncodedFormEntity(formParams, Consts.UTF_8);
            httpPost.setEntity(requestEntity);
            httpResponse = httpClient.execute(httpPost, httpClientContext);
            cookieStore = httpClientContext.getCookieStore();
            httpEntity = httpResponse.getEntity();
            result = EntityUtils.toString(httpEntity);
            log.debug("result = {}", result);

            // 获取设备ID并写入cookie中
            httpPost.reset();
            urlConfDTO = mapUrlConfDTO.get("getDevicesId");
            httpPost = new HttpPost(UrlUtils.getUrl(urlConfDTO.getHttpType(), urlConfDTO.getHost(),
                    urlConfDTO.getReqUrl().replaceAll("\\{0\\}", String.valueOf(System.currentTimeMillis()))));
            httpPost.addHeader(HttpHeaders.REFERER, urlConfDTO.getReferer());
            httpResponse = httpClient.execute(httpPost, httpClientContext);
            cookieStore = httpClientContext.getCookieStore();
            httpEntity = httpResponse.getEntity();
            result = EntityUtils.toString(httpEntity);
            log.debug("result = {}", result);
            Pattern pattern = Pattern.compile("callbackFunction\\('(.*)'\\)");
            Matcher matcher = pattern.matcher(result);
            if (matcher.find()) {
                String deviceInfo = matcher.group(1);
                log.debug("group = {}", deviceInfo);
                JsonNode deviceInfoNode = objectMapper.readTree(deviceInfo);
                String dfp = deviceInfoNode.get("dfp").textValue();
                log.debug("dfp = {}", dfp);
                if (dfp != null) {
                    cookieStore.addCookie(new BasicClientCookie("RAIL_DEVICEID", dfp));
                }
            }

            // 获取验证图片
            httpPost.reset();
            urlConfDTO = mapUrlConfDTO.get("getCodeImg1");
            httpPost = new HttpPost(UrlUtils.getUrl(urlConfDTO.getHttpType(), urlConfDTO.getHost(),
                    urlConfDTO.getReqUrl().replaceAll("\\{0\\}", String.valueOf(Math.random()))));
            httpPost.addHeader(HttpHeaders.REFERER, urlConfDTO.getReferer());
            httpResponse = httpClient.execute(httpPost, httpClientContext);
            cookieStore = httpClientContext.getCookieStore();
            httpEntity = httpResponse.getEntity();
            result = EntityUtils.toString(httpEntity);
            log.debug("result = {}", result);
            pattern = Pattern.compile(".*\\((.*)\\)");
            matcher = pattern.matcher(result);
            String image = null;
            if (matcher.find()) {
                String group = matcher.group(1);
                log.debug("group = {}", group);
                JsonNode imageNode = objectMapper.readTree(group);
                image = imageNode.get("image").textValue();
                log.debug("image = {}", image);
            }

            // 获取验证图片的code
            httpPost.reset();
            httpPost = new HttpPost("http://aliyun.hellozjf.com:8080/result/base64");formParams = new ArrayList<>();
            formParams.add(new BasicNameValuePair("base64String", image));
            requestEntity = new UrlEncodedFormEntity(formParams, Consts.UTF_8);
            httpPost.setEntity(requestEntity);
            httpResponse = httpClient.execute(httpPost, httpClientContext);
            cookieStore = httpClientContext.getCookieStore();
            httpEntity = httpResponse.getEntity();
            result = EntityUtils.toString(httpEntity);
            log.debug("result = {}", result);
            JsonNode randCodeNode = objectMapper.readTree(result);
            String randCode = randCodeNode.get("data").textValue();
            log.debug("randCode = {}", randCode);

            // 验证码校验
            httpPost.reset();
            urlConfDTO = mapUrlConfDTO.get("codeCheck1");
            httpPost = new HttpPost(UrlUtils.getUrl(urlConfDTO.getHttpType(), urlConfDTO.getHost(),
                    urlConfDTO.getReqUrl().replaceAll("\\{1\\}", String.valueOf(System.currentTimeMillis()))
                                            .replaceAll("\\{0\\}", randCode)));
            httpPost.addHeader(HttpHeaders.REFERER, urlConfDTO.getReferer());
            httpResponse = httpClient.execute(httpPost, httpClientContext);
            cookieStore = httpClientContext.getCookieStore();
            httpEntity = httpResponse.getEntity();
            result = EntityUtils.toString(httpEntity);
            log.debug("result = {}", result);
            pattern = Pattern.compile(".*\\((.*)\\)");
            matcher = pattern.matcher(result);
            if (matcher.find()) {
                String group = matcher.group(1);
                log.debug("group = {}", group);
                JsonNode imageNode = objectMapper.readTree(group);
                String resultCode = imageNode.get("result_code").textValue();
                log.debug("resultCode = {}", resultCode);
            }

        } catch (IOException e) {
            log.error("e = {}", e);
        }
    }
}
