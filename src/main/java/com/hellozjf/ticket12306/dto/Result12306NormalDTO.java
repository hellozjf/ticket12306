package com.hellozjf.ticket12306.dto;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import lombok.Data;

/**
 * @author Jingfeng Zhou
 */
@Data
public class Result12306NormalDTO {
    private String validateMessagesShowId;
    private Boolean status;
    private Integer httpstatus;
    private JsonNode data;
    private ArrayNode messages;
    private JsonNode validateMessages;
}
