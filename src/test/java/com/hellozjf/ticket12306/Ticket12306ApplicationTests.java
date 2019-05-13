package com.hellozjf.ticket12306;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.hellozjf.ticket12306.dto.TicketConfigDTO;
import com.hellozjf.ticket12306.dto.UrlConfDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.test.context.junit4.SpringRunner;
import org.yaml.snakeyaml.Yaml;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class Ticket12306ApplicationTests {

    @Autowired
    private TicketConfigDTO ticketConfigDTO;

    @Autowired
    @Qualifier("mapUrlConfDTO")
    private Map<String, UrlConfDTO> mapUrlConfDTO;

    @Test
    public void contextLoads() {
    }

    @Test
    public void snakeYaml() throws Exception {
        Yaml yaml = new Yaml();
        Resource resource = new ClassPathResource("ticket_config.yaml");
        Object object = yaml.load(resource.getInputStream());
        log.debug("ticketConfigDTO = {}", object);
    }

    @Test
    public void jsonYaml() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        TicketConfigDTO test = objectMapper.readValue(new ClassPathResource("ticket_config.yaml").getInputStream(), TicketConfigDTO.class);
        log.debug("test = {}", test);
        log.debug("account = {}", test.getSet().getAccount().get(0).get("user"));
    }

    @Test
    public void showJsonYaml() throws Exception {
        log.debug("ticketConfigDTO = {}", ticketConfigDTO);
    }

    @Test
    public void testUrlConf() throws Exception {
        log.debug("{}", mapUrlConfDTO);
    }

    @Test
    public void testOrderTicket() throws Exception {
    }
}
