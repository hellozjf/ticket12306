package com.hellozjf.ticket12306.service;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * @author Jingfeng Zhou
 *
 * Json工具类
 */
public interface JsonService {

    /**
     * 将json字符串转化为JsonNode
     * @param json
     * @return
     */
    JsonNode parse(String json);

    /**
     * 判断某个json串里面有没有某个key
     * @return
     */
    boolean haveKey(String json, String key);

    /**
     * 判断某个json对象里面有没有某个key
     * @param jsonNode
     * @param key
     * @return
     */
    boolean haveKey(JsonNode jsonNode, String key);

    /**
     * 从某个json串中获取某个key对应的value
     * 获取到这个value之后，自己再调用intValue(), textValue(), doubleValue()等
     * 甚至还能转化成ArrayNode
     * @param json
     * @param key
     * @return
     */
    JsonNode getValue(String json, String key);

    /**
     * 从某个json对象中获取某个key对应的value
     * 获取到这个value之后，自己再调用intValue(), textValue(), doubleValue()等
     * 甚至还能转化成ArrayNode
     * @param jsonNode
     * @param key
     * @return
     */
    JsonNode getValue(JsonNode jsonNode, String key);
}
