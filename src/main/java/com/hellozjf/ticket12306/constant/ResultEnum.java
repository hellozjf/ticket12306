package com.hellozjf.ticket12306.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Jingfeng Zhou
 */
@Getter
@AllArgsConstructor
public enum ResultEnum {

    OTN_LEFT_TICKET_INIT_ERROR(1, "调用otnLeftTicketInit失败"),
    OTN_LOGIN_CONF_ERROR(2, "调用otnLoginConf失败"),
    PASSPORT_CAPTCHA_CAPTCHA_IMAGE64_ERROR(3, "调用passportCaptchaCaptchaImage64失败"),
    GET_ANSWER_ERROR(4, "获取验证码答案失败"),
    GET_CHECK_ERROR(5, "验证验证码答案失败"),
    LOGIN_ERROR(6, "登录失败"),
    AUTH_UAMTK_ERROR(7, "通过uamtk获取newapptk失败"),
    UAMAUTHCLIENT_ERROR(8, "通过newapptk获取姓名失败"),
    LEFT_TICKET_QUERY_ERROR(9, "余票查询失败"),
    OTN_LEFT_TICKET_SUBMIT_ORDER_REQUEST_ERROR(10, "提交订单失败"),
    OTN_CONFIRM_PASSENGER_INIT_DC_ERROR(11, "获取订单详情失败"),
    OTN_CONFIRM_PASSENGER_GET_PASSENGER_DTOS_ERROR(12, "获取乘客信息失败"),
    OTN_CONFIRM_PASSENGER_CHECK_ORDER_INFO_ERROR(13, "确认订单信息失败"),
    OTN_CONFIRM_PASSENGER_GET_QUEUE_COUNT_ERROR(14, "获取排队数失败"),
    OTN_CONFIRM_PASSENGER_CONFIRM_SINGLE_FOR_QUEUE_ERROR(15, "确认排队失败"),
    OTN_CONFIRM_PASSENGER_QUERY_ORDER_WAIT_TIME_ERROR(16, "等待排队完成失败"),
    ;

    Integer code;
    String message;
}
