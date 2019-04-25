package com.hellozjf.ticket12306.config;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.hellozjf.ticket12306.dto.TicketConfigDTO;
import com.hellozjf.ticket12306.dto.UrlConfDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.HttpClient;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import javax.xml.ws.spi.http.HttpContext;
import java.io.*;
import java.net.HttpCookie;
import java.util.HashMap;
import java.util.Iterator;
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
            log.debug("jsonString = {}", jsonString);
            // 将字符串转json对象
            JsonNode urls = objectMapper.readTree(jsonString);
            log.debug("urls = {}", urls);
            for (Iterator<String> iter = urls.fieldNames(); iter.hasNext(); ) {
                String fieldName = iter.next();
                log.debug("{}", fieldName);
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
    public HttpClient httpClient() {
        HttpClient httpClient = HttpClients.createDefault();
        return httpClient;
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return (args) -> {

        };
    }
}
