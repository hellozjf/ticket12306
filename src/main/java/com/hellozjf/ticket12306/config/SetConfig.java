package com.hellozjf.ticket12306.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author Jingfeng Zhou
 */
@Data
public class SetConfig {
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
    @JsonProperty("12306account")
    private List<Map<String, Object>> _12306account;
}
