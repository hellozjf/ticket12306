package com.hellozjf.ticket12306.service;

import com.hellozjf.ticket12306.dto.PersonalInfoDTO;

import java.io.IOException;

/**
 * @author Jingfeng Zhou
 */
public interface TicketService {

    /**
     * 获取登录所需要的验证码图片
     * @param personalInfoDTO
     * @throws IOException
     */
    void passportCaptchaCaptchaImage64(PersonalInfoDTO personalInfoDTO) throws IOException;

    /**
     * 获取验证码图片的答案
     * @param personalInfoDTO
     * @throws IOException
     */
    void getAnswer(PersonalInfoDTO personalInfoDTO) throws IOException;

    /**
     * 验证答案是否正确
     * @param personalInfoDTO
     * @throws IOException
     */
    void passportCaptchaCaptchaCheck(PersonalInfoDTO personalInfoDTO) throws IOException;

    /**
     * 使用用户名密码登录
     * @param personalInfoDTO
     * @throws IOException
     */
    void passportWebLogin(PersonalInfoDTO personalInfoDTO) throws IOException;

    /**
     * 通过登录返回的umatk获取newapptk
     * @param personalInfoDTO
     * @throws IOException
     */
    void passportWebAuthUamtk(PersonalInfoDTO personalInfoDTO) throws IOException;

    /**
     * 通过newapptk获取账号对应的姓名
     * @param personalInfoDTO
     * @throws IOException
     */
    void otnUamauthclient(PersonalInfoDTO personalInfoDTO) throws IOException;

    /**
     * 查询符合条件的余票
     * @param personalInfoDTO
     * @throws IOException
     */
    void otnLeftTicketQuery(PersonalInfoDTO personalInfoDTO) throws IOException;

    /**
     * 提交订单
     * @param personalInfoDTO
     * @throws IOException
     */
    void otnLeftTicketSubmitOrderRequest(PersonalInfoDTO personalInfoDTO) throws IOException;

    /**
     * 获取订单详细信息
     * @param personalInfoDTO
     * @throws IOException
     */
    void otnConfirmPassengerInitDc(PersonalInfoDTO personalInfoDTO) throws IOException;

    /**
     * 获取乘客信息
     * @param personalInfoDTO
     * @throws IOException
     */
    void otnConfirmPassengerGetPassengerDTOs(PersonalInfoDTO personalInfoDTO) throws IOException;

    /**
     * 确认订单信息
     * @param personalInfoDTO
     * @throws IOException
     */
    void otnConfirmPassengerCheckOrderInfo(PersonalInfoDTO personalInfoDTO) throws IOException;

    /**
     * 获取排队数
     * @param personalInfoDTO
     * @throws IOException
     */
    void otnConfirmPassengerGetQueueCount(PersonalInfoDTO personalInfoDTO) throws IOException;

    /**
     * 确认排队
     * @param personalInfoDTO
     * @throws IOException
     */
    void otnConfirmPassengerConfirmSingleForQueue(PersonalInfoDTO personalInfoDTO) throws IOException;

    /**
     * 等待排队完成
     * @param personalInfoDTO
     * @throws IOException
     */
    void otnConfirmPassengerQueryOrderWaitTime(PersonalInfoDTO personalInfoDTO) throws IOException;

    /**
     * 登录，一系列操作的组合
     * @param personalInfoDTO
     * @throws IOException
     */
    void login(PersonalInfoDTO personalInfoDTO) throws IOException;

    /**
     * 购票，一系列操作的组合
     * @param personalInfoDTO
     * @throws IOException
     */
    void order(PersonalInfoDTO personalInfoDTO) throws IOException;

    /**
     * 清除自定义的Cookie
     * @throws IOException
     */
    void clearCustomCookie(PersonalInfoDTO personalInfoDTO) throws IOException;
}
