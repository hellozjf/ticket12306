package com.hellozjf.ticket12306;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.hellozjf.ticket12306.config.TestConfig;
import com.hellozjf.ticket12306.config.TicketConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.test.context.junit4.SpringRunner;
import org.yaml.snakeyaml.Yaml;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class Ticket12306ApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void testLoad() throws Exception {
//        Yaml yaml = new Yaml();
//        Resource resource = new ClassPathResource("test.yaml");
//        Map<String, Object> map = yaml.load(resource.getInputStream());
//        log.debug("map = {}", map);
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        TestConfig test = objectMapper.readValue(new ClassPathResource("test.yaml").getInputStream(), TestConfig.class);
        log.debug("test = {}", test);
    }

    @Test
    public void testType() throws Exception {
        Yaml yaml = new Yaml();
        Resource resource = new ClassPathResource("ticket_config.yaml");
        TicketConfig ticketConfig = yaml.loadAs(resource.getInputStream(), TicketConfig.class);
        log.debug("ticketConfig = {}", ticketConfig);
//        log.debug("{}", ((List)ticketConfig.getSet().get("12306account")).get(0).getClass().getSimpleName());
    }
}
