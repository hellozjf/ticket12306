package com.hellozjf.ticket12306.config;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.hellozjf.ticket12306.custom.FileCookieStore;
import com.hellozjf.ticket12306.dto.OrderTicketDTO;
import com.hellozjf.ticket12306.dto.PersonalInfoDTO;
import com.hellozjf.ticket12306.dto.TicketConfigDTO;
import com.hellozjf.ticket12306.dto.UrlConfDTO;
import com.hellozjf.ticket12306.service.TicketService;
import com.hellozjf.ticket12306.thread.OrderTicketRunable;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.HttpClient;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author Jingfeng Zhou
 */
@Configuration
@Slf4j
public class BeanConfig {

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper;
    }

    @Bean("yamlObjectMapper")
    public ObjectMapper yamlObjectMapper() {
        ObjectMapper yamlObjectMapper = new ObjectMapper(new YAMLFactory());
        return yamlObjectMapper;
    }

    /**
     * ticket_config.yaml文件的内容
     * @param yamlObjectMapper
     * @return
     */
    @Bean
    public TicketConfigDTO ticketConfigDTO(@Qualifier("yamlObjectMapper") ObjectMapper yamlObjectMapper) {
        try {
            TicketConfigDTO ticketConfig = yamlObjectMapper.readValue(new ClassPathResource("ticket_config.yaml").getInputStream(), TicketConfigDTO.class);
            return ticketConfig;
        } catch (IOException e) {
            log.error("e = {}", e);
            return new TicketConfigDTO();
        }
    }

    @Bean("mapSeatConf")
    public Map<String, Integer> mapSeatConf() {
        Map<String, Integer> map = new HashMap<>();
        map.put("商务座", 32);
        map.put("一等座", 31);
        map.put("二等座", 30);
        map.put("特等座", 25);
        map.put("高级软卧", 21);
        map.put("软卧", 23);
        map.put("动卧", 33);
        map.put("硬卧", 28);
        map.put("软座", 24);
        map.put("硬座", 29);
        map.put("无座", 26);
        map.put("其他", 22);
        return map;
    }

    @Bean("mapPassengerTicketStr")
    public Map<String, String> mapPassengerTicketStr() {
        Map<String, String> map = new HashMap<>();
        map.put("一等座", "M");
        map.put("特等座", "P");
        map.put("二等座", "O");
        map.put("商务座", "9");
        map.put("硬座", "1");
        map.put("无座", "1");
        map.put("软座", "2");
        map.put("软卧", "4");
        map.put("硬卧", "3");
        return map;
    }

    @Bean("mapSeatConf2")
    public Map<Integer, String> mapSeatConf2(@Qualifier("mapSeatConf") Map<String, Integer> mapSeatConf) {
        Map<Integer, String> map = new HashMap<>();
        for (Map.Entry<String, Integer> entry : mapSeatConf.entrySet()) {
            map.put(entry.getValue(), entry.getKey());
        }
        return map;
    }

    /**
     * urlConf.py文件的内容
     * @param objectMapper
     * @return
     */
    @Bean("mapUrlConfDTO")
    public Map<String, UrlConfDTO> mapUrlConfDTO(ObjectMapper objectMapper) {
        Map<String, UrlConfDTO> mapUrlConfDTO = new HashMap<>();
        try {
            Resource resource = new ClassPathResource("urlConf.py");
            InputStream inputStream = resource.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line = null;
            StringBuilder jsonStringBuilder = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                // 去掉py文件中的注解
                line = line.replaceAll("# .*", "");
                // 去掉py文件中的import
                line = line.replaceAll("import .*", "");
                // 替换布尔变量
                line = line.replaceAll("True", "true").replaceAll("False", "false");
                // 替换里面有个.format()的东西
                line = line.replaceAll(".format\\(.*\\)", "");
                jsonStringBuilder.append(line);
            }

            String jsonString = jsonStringBuilder.toString();
            // 替换掉urls = 为空字符串
            jsonString = jsonString.replaceAll("\\s*urls\\s*=\\s*", "");
            // 替换掉, }这样的东西为}
            jsonString = jsonString.replaceAll(",\\s*}", "}");
            // 替换掉{}为{0}
            jsonString = jsonString.replaceAll("\\{\\}", "{0}");
            // 将字符串转json对象
            JsonNode urls = objectMapper.readTree(jsonString);
            for (Iterator<String> iter = urls.fieldNames(); iter.hasNext(); ) {
                String fieldName = iter.next();
                JsonNode jsonNode = urls.get(fieldName);
                String s = jsonNode.toString();
                UrlConfDTO urlConfDTO = objectMapper.readValue(s, UrlConfDTO.class);
                mapUrlConfDTO.put(fieldName, urlConfDTO);
            }
        } catch (IOException e) {
            log.error("e = {}", e);
        }
        return mapUrlConfDTO;
    }

    @Bean
    public CommandLineRunner commandLineRunner(TicketService ticketService) {
        return (args) -> {
            OrderTicketDTO orderTicketDTO = new OrderTicketDTO();
            orderTicketDTO.setStationDate("2019-05-22");
            orderTicketDTO.setStationTrain("D379");
            orderTicketDTO.setFromStation("杭州");
            orderTicketDTO.setToStation("宁波");
            orderTicketDTO.setSeatType("二等座");
            orderTicketDTO.setTicketPeople("周靖峰");
            orderTicketDTO.setUsername("15158037019");
            orderTicketDTO.setPassword("Zjf@1234");
            orderTicketDTO.setEmail("908686171@qq.com");

            Runnable runnable = new OrderTicketRunable(orderTicketDTO, ticketService);
            new Thread(runnable).start();
        };
    }
}
