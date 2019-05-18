package com.hellozjf.ticket12306.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hellozjf.ticket12306.custom.FileCookieStore;
import com.hellozjf.ticket12306.dto.UrlConfDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author hellozjf
 */
@Slf4j
public class SendUtils {

    /**
     * 传入url和参数，获取返回值
     *
     * @param httpClient
     * @param httpClientContext
     * @param url
     * @param params
     * @return
     * @throws IOException
     */
    public static String sendUrl(HttpClient httpClient,
                                 HttpClientContext httpClientContext,
                                 FileCookieStore fileCookieStore,
                                 Map<String, UrlConfDTO> mapUrlConfDTO,
                                 String url,
                                 Map<String, String> postParams,
                                 String... params) throws IOException {

        // 获取请求url，并为它赋上参数
        UrlConfDTO urlConfDTO = mapUrlConfDTO.get(url);
        String reqUrl = urlConfDTO.getReqUrl();
        for (int i = 0; i < params.length; i++) {
            reqUrl = reqUrl.replaceAll("\\{" + i + "\\}", params[i]);
        }

        // 全部使用HttpPost
        HttpResponse httpResponse = null;
        String urlString = UrlUtils.getUrl(urlConfDTO.getHttpType(), urlConfDTO.getHost(), reqUrl);
        HttpGet httpGet = new HttpGet(urlString);
        httpGet.setHeader(HttpHeaders.REFERER, urlConfDTO.getReferer());
        httpGet.setHeader(HttpHeaders.HOST, urlConfDTO.getHost());
        httpGet.setHeader(HttpHeaders.USER_AGENT, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_4) AppleWebKit/537.36 (KHTML, like Gecko) 12306-electron/1.0.1 Chrome/59.0.3071.115 Electron/1.8.4 Safari/537.36");
        httpGet.setHeader(HttpHeaders.ACCEPT_ENCODING, "gzip, deflate");
        httpGet.setHeader(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded; charset=UTF-8");
        httpGet.setHeader("Origin", "https://kyfw.12306.cn");
        httpGet.setHeader("Connection", "keep-alive");
        HttpPost httpPost = new HttpPost(urlString);
        httpPost.setHeader(HttpHeaders.REFERER, urlConfDTO.getReferer());
        httpPost.setHeader(HttpHeaders.HOST, urlConfDTO.getHost());
        httpPost.setHeader(HttpHeaders.USER_AGENT, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_4) AppleWebKit/537.36 (KHTML, like Gecko) 12306-electron/1.0.1 Chrome/59.0.3071.115 Electron/1.8.4 Safari/537.36");
        httpPost.setHeader(HttpHeaders.ACCEPT_ENCODING, "gzip, deflate");
        httpPost.setHeader(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded; charset=UTF-8");
        httpPost.setHeader("Origin", "https://kyfw.12306.cn");
        httpPost.setHeader("Connection", "keep-alive");
        if (postParams != null) {
            fillFormParams(postParams, httpPost);
        }

        // 如果没有得到值，则一直重试，重试到有值，或者超过最大次数为止
        ObjectMapper objectMapper = new ObjectMapper();
        for (int i = 0; i < urlConfDTO.getReTry(); i++) {
            if (postParams != null) {
                httpResponse = httpClient.execute(httpPost, httpClientContext);
            } else {
                httpResponse = httpClient.execute(httpGet, httpClientContext);
            }
            HttpEntity httpEntity = httpResponse.getEntity();
            String result = EntityUtils.toString(httpEntity);
            if (!StringUtils.isEmpty(result)) {
                log.info("url: {}", urlString);
                if (postParams != null) {
                    log.info("input: {}", objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(postParams));
                } else {
                    log.info("input: null");
                }
                log.info("output: {}", result);
                log.info("cookie: {}", fileCookieStore.getCookies());
                return result;
            }
            try {
                Thread.sleep((long) (urlConfDTO.getSTime() * 1000));
            } catch (InterruptedException e) {
                log.error("e = {}", e);
            }
        }

        log.info("url: {}", urlString);
        log.info("input: {}", objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(postParams));
        log.info("output: null");
        HttpEntity httpEntity = httpResponse.getEntity();
        String result = EntityUtils.toString(httpEntity);
        return result;
    }

    /**
     * 传入url和参数，获取返回值
     *
     * @param httpClient
     * @param httpClientContext
     * @param url
     * @param params
     * @return
     * @throws IOException
     */
    public static byte[] sendUrl2(HttpClient httpClient,
                                  HttpClientContext httpClientContext,
                                  Map<String, UrlConfDTO> mapUrlConfDTO,
                                  String url,
                                  Map<String, String> postParams,
                                  String... params) throws IOException {

        // 获取请求url，并为它赋上参数
        UrlConfDTO urlConfDTO = mapUrlConfDTO.get(url);
        String reqUrl = urlConfDTO.getReqUrl();
        for (int i = 0; i < params.length; i++) {
            reqUrl = reqUrl.replaceAll("\\{" + i + "\\}", params[i]);
        }

        // 全部使用HttpPost
        HttpResponse httpResponse = null;
        String urlString = UrlUtils.getUrl(urlConfDTO.getHttpType(), urlConfDTO.getHost(), reqUrl);
        HttpPost httpPost = new HttpPost(urlString);
        httpPost.setHeader(HttpHeaders.REFERER, urlConfDTO.getReferer());
        httpPost.setHeader(HttpHeaders.HOST, urlConfDTO.getHost());
        fillFormParams(postParams, httpPost);

        // 如果没有得到值，则一直重试，重试到有值，或者超过最大次数为止
        for (int i = 0; i < urlConfDTO.getReTry(); i++) {
            httpResponse = httpClient.execute(httpPost, httpClientContext);
            HttpEntity httpEntity = httpResponse.getEntity();
            byte[] result = EntityUtils.toByteArray(httpEntity);
            if (result != null) {
                log.info("url: {}", urlString);
                log.info("input: {}", httpPost.getEntity() == null ? null : EntityUtils.toString(httpPost.getEntity()));
                log.info("output: {}", Arrays.toString(result));
                return result;
            }
            try {
                Thread.sleep((long) (urlConfDTO.getSTime() * 1000));
            } catch (InterruptedException e) {
                log.error("e = {}", e);
            }
        }

        HttpEntity httpEntity = httpResponse.getEntity();
        byte[] result = EntityUtils.toByteArray(httpEntity);
        return result;
    }

    /**
     * 传入url和参数，发送普通请求，获取返回值
     *
     * @param httpClient
     * @param httpClientContext
     * @param url
     * @return
     * @throws IOException
     */
    public static String sendPost(HttpClient httpClient,
                                 HttpClientContext httpClientContext,
                                 String url,
                                 Map<String, String> postParams) throws IOException {

        // 全部使用HttpPost
        HttpPost httpPost = new HttpPost(url);
        fillFormParams(postParams, httpPost);

        HttpResponse httpResponse = httpClient.execute(httpPost, httpClientContext);
        HttpEntity httpEntity = httpResponse.getEntity();
        String result = EntityUtils.toString(httpEntity);
        log.info("url: {}", url);
        log.info("input: {}", httpPost.getEntity() == null ? null : EntityUtils.toString(httpPost.getEntity()));
        log.info("output: {}", result);
        return result;
    }

    /**
     * 传入url和参数，发送普通请求，获取返回值
     *
     * @param httpClient
     * @param httpClientContext
     * @param url
     * @return
     * @throws IOException
     */
    public static String sendGet(HttpClient httpClient,
                              HttpClientContext httpClientContext,
                              String url) throws IOException {

        // 全部使用HttpPost
        HttpGet httpGet = new HttpGet(url);

        HttpResponse httpResponse = httpClient.execute(httpGet, httpClientContext);
        HttpEntity httpEntity = httpResponse.getEntity();
        String result = EntityUtils.toString(httpEntity);
        log.info("url: {}", url);
        log.info("input: {}", "null");
        log.info("output: {}", result);
        return result;
    }

    private static void fillFormParams(Map<String, String> postParams, HttpPost httpPost) {
        if (postParams != null) {
            List<NameValuePair> formParams = new ArrayList<>();
            for (Map.Entry<String, String> entry : postParams.entrySet()) {
                formParams.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
            }
            UrlEncodedFormEntity requestEntity = new UrlEncodedFormEntity(formParams, Consts.UTF_8);
            httpPost.setEntity(requestEntity);
        }
    }
}
