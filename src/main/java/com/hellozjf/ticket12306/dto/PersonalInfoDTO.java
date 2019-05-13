package com.hellozjf.ticket12306.dto;

import com.hellozjf.ticket12306.custom.FileCookieStore;
import lombok.Data;
import org.apache.http.client.HttpClient;
import org.apache.http.client.protocol.HttpClientContext;

/**
 * @author Jingfeng Zhou
 */
@Data
public class PersonalInfoDTO {
    private HttpClient httpClient;
    private HttpClientContext httpClientContext;
    private FileCookieStore fileCookieStore;
    private OrderTicketDTO orderTicketDTO;
}
