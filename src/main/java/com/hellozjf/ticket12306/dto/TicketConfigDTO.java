package com.hellozjf.ticket12306.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author Jingfeng Zhou
 */
@Data
public class TicketConfigDTO {

    @JsonProperty("set")
    private Set set;

    @JsonProperty("ticket_black_list_time")
    private Integer ticketBlackListTime;

    @JsonProperty("is_auto_code")
    private Boolean isAutoCode;

    @JsonProperty("auto_code_type")
    private Integer autoCodeType;

    @JsonProperty("auto_code_account")
    private AutoCodeAccount autoCodeAccount;

    @JsonProperty("email_conf")
    private EmailConf emailConf;

    @JsonProperty("pushbear_conf")
    private PushbearConf pushbearConf;

    @JsonProperty("is_cdn")
    private Integer isCdn;

    @JsonProperty("order_type")
    private Integer orderType;

    @JsonProperty("order_model")
    private Integer orderModel;

    @JsonProperty("open_time")
    private String openTime;

    @JsonProperty("is_proxy")
    private Integer isProxy;

    @Data
    public class Set {

        @JsonProperty("station_dates")
        private List<String> stationDates;

        @JsonProperty("is_by_time")
        private Boolean isByTime;

        @JsonProperty("train_types")
        private List<String> trainTypes;

        @JsonProperty("departure_time")
        private String departureTime;

        @JsonProperty("arrival_time")
        private String arrivalTime;

        @JsonProperty("take_time")
        private String takeTime;

        @JsonProperty("station_trains")
        private List<String> stationTrains;

        @JsonProperty("from_station")
        private String fromStation;

        @JsonProperty("to_station")
        private String toStation;

        @JsonProperty("set_type")
        private List<String> setType;

        @JsonProperty("is_more_ticket")
        private Boolean isMoreTicket;

        @JsonProperty("ticke_peoples")
        private List<String> tickePeoples;

        @JsonProperty("12306account")
        private List<Map<String, String>> account;
    }

    @Data
    public class AutoCodeAccount {

        @JsonProperty("user")
        private String user;

        @JsonProperty("pwd")
        private String pwd;
    }

    @Data
    public class EmailConf {

        @JsonProperty("is_email")
        private Boolean isEmail;

        @JsonProperty("email")
        private String email;

        @JsonProperty("notice_email_list")
        private String noticeEmailList;

        @JsonProperty("username")
        private String username;

        @JsonProperty("password")
        private String password;

        @JsonProperty("host")
        private String host;
    }

    @Data
    public class PushbearConf {

        @JsonProperty("is_pushbear")
        private boolean isPushbear;

        @JsonProperty("send_key")
        private String sendKey;
    }
}
