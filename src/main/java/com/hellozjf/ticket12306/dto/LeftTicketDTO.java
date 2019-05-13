package com.hellozjf.ticket12306.dto;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;

/**
 * @author Jingfeng Zhou
 */
@Data
public class LeftTicketDTO {
    private JsonNode data;
    private Integer httpstatus;
    private String messages;
    private Boolean status;
}
