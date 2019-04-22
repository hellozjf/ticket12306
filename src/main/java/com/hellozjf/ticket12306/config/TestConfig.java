package com.hellozjf.ticket12306.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author Jingfeng Zhou
 */
@Data
public class TestConfig {

    @JsonProperty("1")
    private String a;

    @JsonProperty("hello")
    private Integer b;

    @JsonProperty("t-t")
    private Integer c;
}
