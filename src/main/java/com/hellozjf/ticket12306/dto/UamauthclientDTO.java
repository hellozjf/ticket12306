package com.hellozjf.ticket12306.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author Jingfeng Zhou
 */
@Data
public class UamauthclientDTO {
    private String apptk;
    @JsonProperty("result_code")
    private Integer resultCode;
    @JsonProperty("result_message")
    private String resultMessage;
    private String username;
}
