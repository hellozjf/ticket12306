package com.hellozjf.ticket12306.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author Jingfeng Zhou
 */
@Data
public class TicketConfig {

    @JsonProperty("set")
    private Set set;

    @JsonProperty("ticket_black_list_time")
    private Integer ticketBlackListTime;

    @JsonProperty("is_auto_code")
    private Boolean isAutoCode;

    @JsonProperty("auto_code_type")
    private Integer autoCodeType;

    @JsonProperty("auto_code_account")
    private Map<String, Object> autoCodeAccount;
    private Map<String, Object> email_conf;
    private Map<String, Object> pushbear_conf;
    private Integer is_cdn;
    private Integer order_type;
    private Integer order_model;
    private String open_time;
    private Integer is_proxy;

    @Data
    class Set {
        private List<String> station_dates;
        private Boolean is_by_time;
        private List<String> train_types;
        private String departure_time;
        private String arrival_time;
        private String take_time;
        private List<String> station_trains;
        private String from_station;
        private String to_station;
        private List<String> set_type;
        private Boolean is_more_ticket;
        private List<String> ticke_peoples;
//        private List<Map<String, Object>> _12306account;
    }
}
