package com.hellozjf.ticket12306.service.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.hellozjf.ticket12306.dto.UrlConfDTO;
import com.hellozjf.ticket12306.service.UrlService;
import org.apache.http.Consts;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @author Jingfeng Zhou
 */
@Component
public class UrlServiceImpl implements UrlService {

    @Autowired
    @Qualifier("mapUrlConfDTO")
    private Map<String, UrlConfDTO> mapUrlConfDTO;

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public String send(String urls, Map<String, Object> data) {
        UrlConfDTO urlConfDTO = mapUrlConfDTO.get(urls);
        Boolean allowRedirects = false;
        Boolean isLogger = Optional.ofNullable(urlConfDTO.getIsLogger()).orElse(false);
        String reqUrl = Optional.ofNullable(urlConfDTO.getReqUrl()).orElse("");
        Integer reTry = Optional.ofNullable(urlConfDTO.getReTry()).orElse(0);
        Float sTime = Optional.ofNullable(urlConfDTO.getSTime()).orElse(0.0f);
        Boolean isCdn = Optional.ofNullable(urlConfDTO.getIsCdn()).orElse(false);
        Boolean isTestCdn = Optional.ofNullable(urlConfDTO.getIsTestCdn()).orElse(false);
        String http = Optional.ofNullable(urlConfDTO.getHttpType()).orElse("https");
        String urlHost = Optional.ofNullable(urlConfDTO.getHost()).orElse("");

        Map<String, Object> errorData = new HashMap();
        errorData.put("code", 99999);
        errorData.put("message", "重试次数达到上限");

        Object sendObject;
        if (data != null) {
            String url = http + "://" + urlHost + reqUrl;
            HttpPost httpPost = new HttpPost(reqUrl);
            List<NameValuePair> formParms = new ArrayList<>();
            for (Map.Entry<String, Object> entry : data.entrySet()) {
                formParms.add(new BasicNameValuePair(entry.getKey(), entry.getValue().toString()));
            }
            UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formParms, Consts.UTF_8);
            httpPost.setEntity(entity);
        }
    }
}
