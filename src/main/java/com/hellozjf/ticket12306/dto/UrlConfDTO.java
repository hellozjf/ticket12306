package com.hellozjf.ticket12306.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author Jingfeng Zhou
 */
@Data
public class UrlConfDTO {

    @JsonProperty("req_url")
    private String reqUrl;

    @JsonProperty("req_type")
    private String reqType;

    @JsonProperty("Referer")
    private String referer;

    @JsonProperty("Host")
    private String host;

    @JsonProperty("Content-Type")
    private Integer contentType;

    @JsonProperty("re_try")
    private Integer reTry;

    @JsonProperty("re_time")
    private Integer reTime;

    @JsonProperty("s_time")
    private Float sTime;

    @JsonProperty("is_logger")
    private Boolean isLogger;

    @JsonProperty("is_test_cdn")
    private Boolean isTestCdn;

    @JsonProperty("is_json")
    private Boolean isJson;

    @JsonProperty("httpType")
    private String httpType;

    @JsonProperty("is_cdn")
    private Boolean isCdn;

    @JsonProperty("not_decode")
    private Boolean notDecode;
}
