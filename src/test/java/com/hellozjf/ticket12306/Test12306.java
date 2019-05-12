package com.hellozjf.ticket12306;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.hellozjf.ticket12306.custom.FileCookieStore;
import com.hellozjf.ticket12306.dto.OrderTicketDTO;
import com.hellozjf.ticket12306.dto.UrlConfDTO;
import com.hellozjf.ticket12306.service.StationNameService;
import com.hellozjf.ticket12306.util.SendUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.HttpClient;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.DateUtils;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 参考
 * https://www.jianshu.com/p/ca93eba60609
 * https://www.jianshu.com/p/89f6170991c8
 * https://www.jianshu.com/p/6b1f94e32713
 *
 * @author hellozjf
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class Test12306 {

    private FileCookieStore fileCookieStore;
    private HttpClient httpClient;
    private HttpClientContext httpClientContext;
    private OrderTicketDTO orderTicketDTO;

    @Autowired
    @Qualifier("mapUrlConfDTO")
    private Map<String, UrlConfDTO> mapUrlConfDTO;

    @Autowired
    @Qualifier("mapSeatConf")
    private Map<String, Integer> mapSeatConf;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private StationNameService stationNameService;

    @Before
    public void before() {
        fileCookieStore = new FileCookieStore(new File("hellozjf"));
        httpClient = HttpClients.custom()
                .setDefaultCookieStore(fileCookieStore)
                .build();
        httpClientContext = HttpClientContext.create();

        // 车票信息
        orderTicketDTO = new OrderTicketDTO();
        orderTicketDTO.setStationDate("2019-05-18");
        orderTicketDTO.setStationTrain("G7535");
        orderTicketDTO.setFromStation("杭州");
        orderTicketDTO.setToStation("宁波");
        orderTicketDTO.setSeatType("二等座");
        orderTicketDTO.setTicketPeople("周靖峰");
        orderTicketDTO.setUsername("15158037019");
        orderTicketDTO.setPassword("Zjf@1234");
        orderTicketDTO.setEmail("908686171@qq.com");
    }

    @Test
    public void otnLeftTicketInit() throws IOException {
        String result = SendUtils.sendUrl(httpClient, httpClientContext, mapUrlConfDTO, "left_ticket_init", null);
        String leftTicketQueryUrl = SendUtils.getMatch(result, "var CLeftTicketUrl = '(.*)';");
        String stationVersionUrl = SendUtils.getMatch(result, "<script .* src=\"(/otn/resources/js/framework/station_name.js\\?station_version=.*)\" .*</script>");
        log.debug("leftTicketQueryUrl = {}", leftTicketQueryUrl);
        log.debug("stationNameUrl = {}", stationVersionUrl);

        Cookie leftTicketQuerCookie = new BasicClientCookie("leftTicketQueryUrl", leftTicketQueryUrl);
        Cookie stationNameCookie = new BasicClientCookie("stationNameUrl", "https://kyfw.12306.cn" + stationVersionUrl);
        fileCookieStore.addCookie(leftTicketQuerCookie);
        fileCookieStore.addCookie(stationNameCookie);
    }

    @Test
    public void otnLoginConf() throws IOException {
        String result = SendUtils.sendUrl(httpClient, httpClientContext, mapUrlConfDTO, "loginConf", null);
        JsonNode jsonNode = objectMapper.readTree(result);
        String prettyResult = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);
        log.debug("prettyResult = {}", prettyResult);
    }

    @Test
    public void passportCaptchaCaptchaImage64() throws IOException {
        String result = SendUtils.sendUrl(httpClient, httpClientContext, mapUrlConfDTO, "getCodeImg1", null, String.valueOf(System.currentTimeMillis()));
        result = SendUtils.getMatch(result, ".*\\((.*)\\)");
        JsonNode jsonNode = objectMapper.readTree(result);
        String prettyResult = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);
        log.debug("prettyResult = {}", prettyResult);

        // 将问题图片的base64值放入cookie中
        String image = jsonNode.get("image").textValue();
        Cookie cookie = new BasicClientCookie("image", image);
        fileCookieStore.addCookie(cookie);
    }

    @Test
    public void getAnswer() throws IOException {
        Cookie image = fileCookieStore.getCookie("image");
        Map<String, String> postParams = new HashMap<>();
        postParams.put("base64String", image.getValue());
        String result = SendUtils.sendPost(httpClient, httpClientContext, "http://aliyun.hellozjf.com:8080/result/base64", postParams);
        JsonNode jsonNode = objectMapper.readTree(result);
        String prettyResult = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);
        log.debug("prettyResult = {}", prettyResult);

        // 将问题的答案放到cookie中
        Cookie cookie = new BasicClientCookie("answer", jsonNode.get("data").textValue());
        fileCookieStore.addCookie(cookie);
    }

    @Test
    public void passportCaptchaCaptchaCheck() throws IOException {
        Cookie answer = fileCookieStore.getCookie("answer");
        Map<String, String> postParams = new HashMap<>();
        postParams.put("answer", answer.getValue());
        postParams.put("login_site", "E");
        postParams.put("rand", "sjrand");
        postParams.put("_json_attr", "");
        String result = SendUtils.sendUrl(httpClient, httpClientContext, mapUrlConfDTO, "codeCheck", postParams);
        JsonNode jsonNode = objectMapper.readTree(result);
        String prettyResult = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);
        log.debug("prettyResult = {}", prettyResult);
    }

    @Test
    public void passportWebLogin() throws IOException {
        Map<String, String> postParams = new HashMap<>();
        postParams.put("username", orderTicketDTO.getUsername());
        postParams.put("password", orderTicketDTO.getPassword());
        postParams.put("appid", "otn");
        postParams.put("_json_attr", "");
        String result = SendUtils.sendUrl(httpClient, httpClientContext, mapUrlConfDTO, "login", postParams);
        log.debug("result = {}", result);

        if (! StringUtils.isEmpty(result)) {
            JsonNode jsonNode = objectMapper.readTree(result);
            String uamtk = jsonNode.get("uamtk").textValue();
            Cookie cookie = new BasicClientCookie("uamtk", uamtk);
            fileCookieStore.addCookie(cookie);
        } else {
            fileCookieStore.delCookie("uamtk");
        }
    }

    @Test
    public void passportWebAuthUamtk() throws IOException {
        Map<String, String> postParams = new HashMap<>();
        postParams.put("appid", "otn");
        String result = SendUtils.sendUrl(httpClient, httpClientContext, mapUrlConfDTO, "auth", postParams);
        log.debug("result = {}", result);

        JsonNode jsonNode = objectMapper.readTree(result);
        String newapptk = jsonNode.get("newapptk").textValue();
        Cookie cookie = new BasicClientCookie("newapptk", newapptk);
        fileCookieStore.addCookie(cookie);
    }

    @Test
    public void otnUamauthclient() throws IOException {
        Cookie answer = fileCookieStore.getCookie("newapptk");
        Map<String, String> postParams = new HashMap<>();
        postParams.put("tk", answer.getValue());
        String result = SendUtils.sendUrl(httpClient, httpClientContext, mapUrlConfDTO, "uamauthclient", postParams);
        log.debug("result = {}", result);
    }

    @Test
    public void updateStationName() throws IOException {
        Cookie stationNameUrl = fileCookieStore.getCookie("stationNameUrl");
        log.debug("stationNameUrl = {}", stationNameUrl.getValue());
        String result = SendUtils.sendGet(httpClient, httpClientContext, stationNameUrl.getValue());
        log.debug("result = {}", result);
        stationNameService.updateStationName(result);
    }

    @Test
    public void otnLeftTicketQuery() throws IOException {
        Cookie leftTicketQueryUrl = fileCookieStore.getCookie("leftTicketQueryUrl");
        log.debug("leftTicketQueryUrl = {}", leftTicketQueryUrl.getValue());

        // 先要更新一下站点的代码
        updateStationName();

        // 获取起点代码和终点代码，并存入cookie
        String fromStationCode = stationNameService.getStationCode(orderTicketDTO.getFromStation());
        String toStationCode = stationNameService.getStationCode(orderTicketDTO.getToStation());
        Cookie fromStationCodeCookie = new BasicClientCookie("fromStationCode", fromStationCode);
        Cookie toStationCodeCookie = new BasicClientCookie("toStationCode", toStationCode);
        fileCookieStore.addCookie(fromStationCodeCookie);
        fileCookieStore.addCookie(toStationCodeCookie);

        String result = SendUtils.sendUrl(httpClient, httpClientContext, mapUrlConfDTO, "select_url", null,
                orderTicketDTO.getStationDate(),
                fromStationCode,
                toStationCode,
                leftTicketQueryUrl.getValue());
        log.debug("result = {}", result);

        // 解析列车数据
        ArrayNode arrayNode = (ArrayNode) objectMapper.readTree(result).get("data").get("result");
        for (JsonNode jsonNode : arrayNode) {
            String r = jsonNode.textValue();
            String[] rs = r.split("\\|");
            if (rs[3].equalsIgnoreCase(orderTicketDTO.getStationTrain())) {
                int seatType = mapSeatConf.get(orderTicketDTO.getSeatType());
                if (! rs[seatType].equalsIgnoreCase("无") &&
                        ! rs[seatType].equalsIgnoreCase("") &&
                        ! rs[seatType].equalsIgnoreCase("*")) {
                    // 查询到符合条件的票存入cookie
                    String secret = URLDecoder.decode(rs[0], StandardCharsets.UTF_8);
                    log.debug("secret = {}", secret);
                    Cookie cookie = new BasicClientCookie("secret", secret);
                    fileCookieStore.addCookie(cookie);
                    break;
                }
            }
        }
    }

    @Test
    public void otnLeftTicketSubmitOrderRequest() throws IOException {

        Cookie fromStationCode = fileCookieStore.getCookie("fromStationCode");
        Cookie toStationCode = fileCookieStore.getCookie("toStationCode");
        Cookie secret = fileCookieStore.getCookie("secret");
        if (secret == null) {
            log.error("没有票，无法下单");
            return;
        }

        Map<String, String> postParams = new HashMap<>();
        postParams.put("secretStr", secret.getValue());
        postParams.put("train_date", orderTicketDTO.getStationDate());
        postParams.put("back_train_date", orderTicketDTO.getStationDate());
        postParams.put("tour_flag", "dc");
        postParams.put("purpose_codes", "ADULT");
        postParams.put("query_from_station_name", fromStationCode.getValue());
        postParams.put("toStationCode", toStationCode.getValue());
        String result = SendUtils.sendUrl(httpClient, httpClientContext, mapUrlConfDTO, "submit_station_url", postParams);
        JsonNode jsonNode = objectMapper.readTree(result);
        result = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);
        log.debug("result = {}", result);
    }

    @Test
    public void otnConfirmPassengerInitDc() throws IOException {
        String result = SendUtils.sendUrl(httpClient, httpClientContext, mapUrlConfDTO, "initdc_url", null);
        log.debug("result = {}", result);
        String globalRepeatSubmitToken = SendUtils.getMatch(result, "var globalRepeatSubmitToken = '(.*)';");
        String ticketInfoForPassengerForm = SendUtils.getMatch(result, "var ticketInfoForPassengerForm=(.*);");
        ticketInfoForPassengerForm = ticketInfoForPassengerForm.replaceAll("'", "\"");
        log.debug("globalRepeatSubmitToken = {}", globalRepeatSubmitToken);
        log.debug("ticketInfoForPassengerForm = {}", ticketInfoForPassengerForm);

        Cookie globalRepeatSubmitTokenCookie = new BasicClientCookie("globalRepeatSubmitTokenCookie", globalRepeatSubmitToken);
        Cookie ticketInfoForPassengerFormCookie = new BasicClientCookie("ticketInfoForPassengerForm", ticketInfoForPassengerForm);
        fileCookieStore.addCookie(globalRepeatSubmitTokenCookie);
        fileCookieStore.addCookie(ticketInfoForPassengerFormCookie);
    }

    @Test
    public void otnConfirmPassengerGetPassengerDTOs() throws IOException {
        Cookie globalRepeatSubmitTokenCookie = fileCookieStore.getCookie("globalRepeatSubmitTokenCookie");

        Map<String, String> postParams = new HashMap<>();
        postParams.put("_json_attr", "");
        postParams.put("REPEAT_SUBMIT_TOKEN", globalRepeatSubmitTokenCookie.getValue());
        String result = SendUtils.sendUrl(httpClient, httpClientContext, mapUrlConfDTO, "get_passengerDTOs", postParams);
        log.debug("result = {}", result);

        JsonNode root = objectMapper.readTree(result);
        boolean status = root.get("status").booleanValue();
        if (status) {
            JsonNode data = root.get("data");
            ArrayNode normalPassengers = (ArrayNode) data.get("normal_passengers");
            for (JsonNode normalPassenger : normalPassengers) {
                if (normalPassenger.get("passenger_name").textValue().equalsIgnoreCase(orderTicketDTO.getTicketPeople())) {
                    // 将乘坐人信息写入cookie
                    Cookie ticketPeople = new BasicClientCookie("ticketPeople", objectMapper.writeValueAsString(normalPassenger));
                    log.debug("ticketPeople = {}", ticketPeople.getValue());
                    fileCookieStore.addCookie(ticketPeople);
                }
            }
        } else {
            log.error("error = {}", root.get("messages").textValue());
        }
    }

    @Test
    public void otnConfirmPassengerCheckOrderInfo() throws IOException {
        Cookie globalRepeatSubmitTokenCookie = fileCookieStore.getCookie("globalRepeatSubmitTokenCookie");
        Cookie ticketPeople = fileCookieStore.getCookie("ticketPeople");
        Cookie ticketInfoForPassengerForm = fileCookieStore.getCookie("ticketInfoForPassengerForm");
        JsonNode ticketPeopleNode = objectMapper.readTree(ticketPeople.getValue());
        JsonNode ticketInfoForPassengerFormNode = objectMapper.readTree(ticketInfoForPassengerForm.getValue());
        log.debug("ticketPeopleNode = {}", objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(ticketPeopleNode));
        log.debug("ticketInfoForPassengerForm = {}", objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(ticketInfoForPassengerFormNode));

        String seatType = ticketInfoForPassengerFormNode.get("queryLeftNewDetailDTO").get("WZ_seat_type_code").textValue();
        // TODO 这个也应该从ticketInfoForPassengerFormNode获取，但是我偷懒，直接定死成人票
        String ticketType = "1";
        // TODO 这个也应该从ticketInfoForPassengerFormNode获取，但是我偷懒，直接定死身份证
        String cardType = "1";

        Map<String, String> postParams = new HashMap<>();
        // TODO 下面两个参数，如果ticketInfoForPassengerFormNode中为null，才写死
        postParams.put("cancel_flag", "2");
        postParams.put("bed_level_order_num", "000000000000000000000000000000");
        postParams.put("passengerTicketStr", String.join(",",
                seatType,
                "0",
                ticketType,
                ticketPeopleNode.get("passenger_name").textValue(),
                cardType,
                ticketPeopleNode.get("passenger_id_no").textValue(),
                ticketPeopleNode.get("mobile_no").textValue(),
                "N"));
        postParams.put("oldPassengerStr", String.join(",",
                ticketPeopleNode.get("passenger_name").textValue(),
                cardType,
                ticketPeopleNode.get("passenger_id_no").textValue(),
                "1") + "_");
        postParams.put("tour_flag", "dc");
        postParams.put("randCode", "");
        postParams.put("whatSelect", "1");
        postParams.put("_json_attr", "");
        postParams.put("REPEAT_SUBMIT_TOKEN", globalRepeatSubmitTokenCookie.getValue());
        String result = SendUtils.sendUrl(httpClient, httpClientContext, mapUrlConfDTO, "checkOrderInfoUrl", postParams);
        JsonNode jsonNode = objectMapper.readTree(result);
        log.debug("result = {}", objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode));
    }

    @Test
    public void otnConfirmPassengerGetQueueCount() throws IOException {
        Cookie globalRepeatSubmitTokenCookie = fileCookieStore.getCookie("globalRepeatSubmitTokenCookie");
        Cookie ticketInfoForPassengerForm = fileCookieStore.getCookie("ticketInfoForPassengerForm");
        JsonNode ticketInfoForPassengerFormNode = objectMapper.readTree(ticketInfoForPassengerForm.getValue());

        Map<String, String> postParams = new HashMap<>();
        String trainDate = DateUtils.formatDate(new Date(), "EEE MMM dd yyyy") + " 00:00:00 GMT+0800 (中国标准时间)";
        log.debug("trainDate = {}", trainDate);
        postParams.put("train_date", trainDate);
        postParams.put("train_no", ticketInfoForPassengerFormNode.get("orderRequestDTO").get("train_no").textValue());
        postParams.put("stationTrainCode", ticketInfoForPassengerFormNode.get("orderRequestDTO").get("station_train_code").textValue());
        postParams.put("seatType", ticketInfoForPassengerFormNode.get("queryLeftNewDetailDTO").get("WZ_seat_type_code").textValue());
        postParams.put("fromStationTelecode", ticketInfoForPassengerFormNode.get("orderRequestDTO").get("from_station_telecode").textValue());
        postParams.put("toStationTelecode", ticketInfoForPassengerFormNode.get("orderRequestDTO").get("to_station_telecode").textValue());
        postParams.put("leftTicket", ticketInfoForPassengerFormNode.get("leftTicketStr").textValue());
        postParams.put("purpose_codes", ticketInfoForPassengerFormNode.get("purpose_codes").textValue());
        postParams.put("train_location", ticketInfoForPassengerFormNode.get("train_location").textValue());
        postParams.put("_json_att", "");
        postParams.put("REPEAT_SUBMIT_TOKEN", globalRepeatSubmitTokenCookie.getValue());
        String result = SendUtils.sendUrl(httpClient, httpClientContext, mapUrlConfDTO, "getQueueCountUrl", postParams);
        log.debug("result = {}", result);
    }

    @Test
    public void otnConfirmPassengerConfirmSingleForQueue() throws IOException {
        Cookie globalRepeatSubmitTokenCookie = fileCookieStore.getCookie("globalRepeatSubmitTokenCookie");
        Cookie ticketPeople = fileCookieStore.getCookie("ticketPeople");
        Cookie ticketInfoForPassengerForm = fileCookieStore.getCookie("ticketInfoForPassengerForm");
        JsonNode ticketPeopleNode = objectMapper.readTree(ticketPeople.getValue());
        JsonNode ticketInfoForPassengerFormNode = objectMapper.readTree(ticketInfoForPassengerForm.getValue());

        String seatType = ticketInfoForPassengerFormNode.get("queryLeftNewDetailDTO").get("WZ_seat_type_code").textValue();
        // TODO 这个也应该从ticketInfoForPassengerFormNode获取，但是我偷懒，直接定死成人票
        String ticketType = "1";
        // TODO 这个也应该从ticketInfoForPassengerFormNode获取，但是我偷懒，直接定死身份证
        String cardType = "1";

        Map<String, String> postParams = new HashMap<>();
        postParams.put("passengerTicketStr", String.join(",",
                seatType,
                "0",
                ticketType,
                ticketPeopleNode.get("passenger_name").textValue(),
                cardType,
                ticketPeopleNode.get("passenger_id_no").textValue(),
                ticketPeopleNode.get("mobile_no").textValue(),
                "N"));
        postParams.put("oldPassengerStr", String.join(",",
                ticketPeopleNode.get("passenger_name").textValue(),
                cardType,
                ticketPeopleNode.get("passenger_id_no").textValue(),
                "1") + "_");
        postParams.put("randCode", "");
        postParams.put("purpose_codes", ticketInfoForPassengerFormNode.get("purpose_codes").textValue());
        postParams.put("key_check_isChange", ticketInfoForPassengerFormNode.get("key_check_isChange").textValue());
        postParams.put("leftTicketStr", ticketInfoForPassengerFormNode.get("leftTicketStr").textValue());
        postParams.put("train_location", ticketInfoForPassengerFormNode.get("train_location").textValue());
        // TODO 可选座位
        postParams.put("choose_seats", "");
        postParams.put("seatDetailType", "");
        postParams.put("whatsSelect", "1");
        postParams.put("roomType", "00");
        postParams.put("dwAll", "N");
        postParams.put("_json_att", "");
        postParams.put("REPEAT_SUBMIT_TOKEN", globalRepeatSubmitTokenCookie.getValue());
        String result = SendUtils.sendUrl(httpClient, httpClientContext, mapUrlConfDTO, "checkQueueOrderUrl", postParams);
        log.debug("result = {}", result);
    }

    @Test
    public void otnConfirmPassengerQueryOrderWaitTime() throws IOException {
        String result = SendUtils.sendUrl(httpClient, httpClientContext, mapUrlConfDTO, "queryOrderWaitTimeUrl", null,
                String.valueOf(System.currentTimeMillis()));
        JsonNode jsonNode = objectMapper.readTree(result);
        log.debug("result = {}", objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode));
    }

    @Test
    public void init() throws IOException {
        otnLeftTicketInit();
    }

    @Test
    public void login() throws IOException {
        passportCaptchaCaptchaImage64();
        getAnswer();
        passportCaptchaCaptchaCheck();
        while (true) {
            passportWebLogin();
            if (fileCookieStore.getCookie("uamtk") != null) {
                break;
            }
        }
        passportWebAuthUamtk();
        otnUamauthclient();
    }

    @Test
    public void order() throws IOException {
        otnLeftTicketQuery();
        otnLeftTicketSubmitOrderRequest();
        otnConfirmPassengerInitDc();
        otnConfirmPassengerGetPassengerDTOs();
        otnConfirmPassengerCheckOrderInfo();
        otnConfirmPassengerGetQueueCount();
        otnConfirmPassengerConfirmSingleForQueue();
        otnConfirmPassengerQueryOrderWaitTime();
    }
}
