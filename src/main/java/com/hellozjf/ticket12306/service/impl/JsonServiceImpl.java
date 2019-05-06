package com.hellozjf.ticket12306.service.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hellozjf.ticket12306.service.JsonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author Jingfeng Zhou
 */
@Service
@Slf4j
public class JsonServiceImpl implements JsonService {

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public JsonNode parse(String json) {
        JsonNode jsonNode = null;
        try {
            jsonNode = objectMapper.readTree(json);
        } catch (IOException e) {
            log.error("e = {}", e);
        }
        return jsonNode;
    }

    @Override
    public boolean haveKey(String json, String key) {
        JsonNode jsonNode = parse(json);
        if (jsonNode != null) {
            return haveKey(jsonNode, key);
        } else {
            return false;
        }
    }

    @Override
    public boolean haveKey(JsonNode jsonNode, String key) {
        return jsonNode.get(key) != null;
    }

    @Override
    public JsonNode getValue(String json, String key) {
        JsonNode jsonNode = parse(json);
        if (jsonNode != null) {
            return getValue(jsonNode, key);
        } else {
            return null;
        }
    }

    @Override
    public JsonNode getValue(JsonNode jsonNode, String key) {
        return jsonNode.get(key);
    }
}
