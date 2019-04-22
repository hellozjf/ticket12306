package com.hellozjf.ticket12306.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

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

    @Bean
    public TicketConfig ticketConfig(@Qualifier("yamlObjectMapper") ObjectMapper yamlObjectMapper) {
        try {
            TicketConfig ticketConfig = yamlObjectMapper.readValue(new ClassPathResource("ticket_config.yaml").getInputStream(), TicketConfig.class);
            return ticketConfig;
        } catch (IOException e) {
            log.error("e = {}", e);
            return new TicketConfig();
        }
    }
}
