package com.hellozjf.ticket12306.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author Jingfeng Zhou
 */
@Data
public class AuthUamtkDTO {
    private String apptk;
    @JsonProperty("result_message")
    private String resultMessage;
    @JsonProperty("result_code")
    private Integer resultCode;
    private String newapptk;
}
