package com.hellozjf.ticket12306.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author Jingfeng Zhou
 */
@Data
public class LoginDTO {
    @JsonProperty("result_message")
    private String resultMessage;
    private String uamtk;
    @JsonProperty("result_code")
    private Integer resultCode;
}
