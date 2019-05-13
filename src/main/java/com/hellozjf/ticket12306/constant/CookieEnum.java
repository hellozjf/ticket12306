package com.hellozjf.ticket12306.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Jingfeng Zhou
 */
@Getter
@AllArgsConstructor
public enum CookieEnum {

    LEFT_TICKET_QUERY_URL("cookie_leftTicketQueryUrl", "查询余票所需要的路径地址"),
    STATION_NAME_URL("cookie_stationNameUrl", "查询站点代码所需要的路径地址"),
    IMAGE("cookie_image", "需要识别的验证码的base64值"),
    ANSWER("cookie_answer", "验证码的答案"),
    UAMTK("cookie_uamtk", "登录所需要的uamtk"),
    NEWAPPTK("cookie_newapptk", "登录后获取到的newapptk"),
    FROM_STATION_CODE("cookie_fromStationCode", "出发站点的代码"),
    TO_STATION_CODE("cookie_toStationCode", "到达站点的代码"),
    SECRET("cookie_secret", "需要购买的车票的密钥"),
    GLOBAL_REPEAT_SUBMIT_TOKEN_COOKIE("cookie_globalRepeatSubmitTokenCookie", "后续购票需要用到的token"),
    TICKET_INFO_FOR_PASSENGER_FORM("cookie_ticketInfoForPassengerForm", "票相关的所有信息"),
    TICKET_PEOPLE("cookie_ticketPeople", "乘坐人信息"),
    IS_LOGIN("cookie_is_login", "是否登录"),
    ;

    String key;
    String desc;
}
