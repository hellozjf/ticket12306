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
    ;

    Integer code;
    String message;
}
