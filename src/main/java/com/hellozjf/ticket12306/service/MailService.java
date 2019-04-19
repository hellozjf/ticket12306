package com.hellozjf.ticket12306.service;

/**
 * @author Jingfeng Zhou
 */
public interface MailService {

    /**
     * 发送邮件
     * @param from
     * @param to
     * @param subject
     * @param text
     */
    void sendMail(String from, String to, String subject, String text);
}
