package com.hellozjf.ticket12306.thread;

import com.hellozjf.ticket12306.custom.FileCookieStore;
import com.hellozjf.ticket12306.dto.OrderTicketDTO;
import com.hellozjf.ticket12306.dto.PersonalInfoDTO;
import com.hellozjf.ticket12306.service.TicketService;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.HttpClient;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.HttpClients;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * 这个线程用来购票
 * @author Jingfeng Zhou
 */
@Slf4j
public class OrderTicketRunable implements Runnable {

    /**
     * 购票相关的信息
     */
    private OrderTicketDTO orderTicketDTO;

    /**
     * 购票服务
     */
    private TicketService ticketService;

    /**
     * 个人信息DTO
     */
    private PersonalInfoDTO personalInfoDTO;

    /**
     * 构造方法
     * @param orderTicketDTO
     */
    public OrderTicketRunable(OrderTicketDTO orderTicketDTO,
                              TicketService ticketService) {
        this.orderTicketDTO = orderTicketDTO;
        this.ticketService = ticketService;

        // 建立cookie文件夹
        File folder = new File("cookie");
        if (! folder.exists()) {
            folder.mkdir();
        }

        // 在该文件夹下面创建cookie持久化文件
        FileCookieStore fileCookieStore = new FileCookieStore(new File(folder, orderTicketDTO.getUsername()));
        HttpClient httpClient = HttpClients.custom()
                .setDefaultCookieStore(fileCookieStore)
                .build();
        HttpClientContext httpClientContext = HttpClientContext.create();

        // 组成个人信息
        this.personalInfoDTO = new PersonalInfoDTO();
        personalInfoDTO.setHttpClient(httpClient);
        personalInfoDTO.setHttpClientContext(httpClientContext);
        personalInfoDTO.setFileCookieStore(fileCookieStore);
        personalInfoDTO.setOrderTicketDTO(orderTicketDTO);
    }

    @Override
    public void run() {
        while (true) {
            try {
                ticketService.order(personalInfoDTO);
                break;
            } catch (Exception e) {
                log.error("e = {}", e);
                log.error("捕获到异常，关小黑屋五分钟");
                try {
                    TimeUnit.MINUTES.sleep(5);
                } catch (InterruptedException e1) {
                    log.error("e1 = {}", e1);
                }
            }
        }
    }
}
