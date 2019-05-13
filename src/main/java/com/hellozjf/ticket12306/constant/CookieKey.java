package com.hellozjf.ticket12306.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Jingfeng Zhou
 */
@AllArgsConstructor
@Getter
public enum  CookieKey {

    LEFT_TICKET_QUERY_URL("leftTicketQueryUrl", "查询余票所需要的路径地址"),
    STATION_NAME_URL("stationNameUrl", "查询站点代码所需要的路径地址"),
    IMAGE("image", "需要识别的验证码的base64值"),
    ANSWER("answer", "验证码的答案"),
    UAMTK("uamtk", "登录所需要的uamtk"),
    NEWAPPTK("newapptk", "登录后获取到的newapptk"),
    FROM_STATION_CODE("fromStationCode", "出发站点的代码"),
    TO_STATION_CODE("toStationCode", "到达站点的代码"),
    SECRET("secret", "需要购买的车票的密钥"),
    GLOBAL_REPEAT_SUBMIT_TOKEN_COOKIE("globalRepeatSubmitTokenCookie", "后续购票需要用到的token"),
    TICKET_INFO_FOR_PASSENGER_FORM("ticketInfoForPassengerForm", "票相关的所有信息"),
    TICKET_PEOPLE("ticketPeople", "乘坐人信息"),
    ;

    String key;
    String desc;
}
