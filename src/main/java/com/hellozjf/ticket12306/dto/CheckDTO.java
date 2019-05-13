package com.hellozjf.ticket12306.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author Jingfeng Zhou
 */
@Data
public class CheckDTO {
    @JsonProperty("result_code")
    private String resultCode;
    @JsonProperty("result_message")
    private String resultMessage;
}
