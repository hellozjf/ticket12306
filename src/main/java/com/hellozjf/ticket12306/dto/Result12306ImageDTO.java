package com.hellozjf.ticket12306.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author Jingfeng Zhou
 */
@Data
public class Result12306ImageDTO {
    private String image;
    @JsonProperty("result_message")
    private String resultMessage;
    @JsonProperty("result_code")
    private String resultCode;
}
