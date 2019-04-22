package com.hellozjf.ticket12306;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.hellozjf.ticket12306.config.TicketConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.test.context.junit4.SpringRunner;
import org.yaml.snakeyaml.Yaml;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class Ticket12306ApplicationTests {

    @Autowired
    private TicketConfig ticketConfig;

    @Test
    public void contextLoads() {
    }

    @Test
    public void snakeYaml() throws Exception {
        Yaml yaml = new Yaml();
        Resource resource = new ClassPathResource("ticket_config.yaml");
        Object object = yaml.load(resource.getInputStream());
        log.debug("ticketConfig = {}", object);
    }

    @Test
    public void jsonYaml() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        TicketConfig test = objectMapper.readValue(new ClassPathResource("ticket_config.yaml").getInputStream(), TicketConfig.class);
        log.debug("test = {}", test);
        log.debug("account = {}", test.getSet().getAccount().get(0).get("user"));
    }

    @Test
    public void showJsonYaml() throws Exception {
        log.debug("ticketConfig = {}", ticketConfig);
    }
}
