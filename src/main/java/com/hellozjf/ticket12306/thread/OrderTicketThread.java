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
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
            HttpClient httpClient = HttpClients.createDefault();
            HttpClientContext httpClientContext = HttpClientContext.create();
            UrlConfDTO urlConfDTO = mapUrlConfDTO.get("left_ticket_init");
            HttpPost httpPost = new HttpPost(UrlUtils.getUrl(urlConfDTO.getHttpType(), urlConfDTO.getHost(), urlConfDTO.getReqUrl()));
            httpPost.addHeader(HttpHeaders.REFERER, urlConfDTO.getReferer());
            HttpResponse httpResponse = httpClient.execute(httpPost, httpClientContext);
            CookieStore cookieStore = httpClientContext.getCookieStore();
            HttpEntity httpEntity = httpResponse.getEntity();
            String result = EntityUtils.toString(httpEntity);

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

            httpPost.reset();
            urlConfDTO = mapUrlConfDTO.get("loginInitCdn1");
            httpPost = new HttpPost(UrlUtils.getUrl(urlConfDTO.getHttpType(), urlConfDTO.getHost(), urlConfDTO.getReqUrl()));
            httpPost.addHeader(HttpHeaders.REFERER, urlConfDTO.getReferer());
            httpResponse = httpClient.execute(httpPost, httpClientContext);
            cookieStore = httpClientContext.getCookieStore();
            httpEntity = httpResponse.getEntity();
            result = EntityUtils.toString(httpEntity);
//            log.debug("result = {}", result);

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

        } catch (IOException e) {
            log.error("e = {}", e);
        }
    }
}
