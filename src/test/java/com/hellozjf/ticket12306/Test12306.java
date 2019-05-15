package com.hellozjf.ticket12306;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.hellozjf.ticket12306.constant.CookieEnum;
import com.hellozjf.ticket12306.constant.ResultEnum;
import com.hellozjf.ticket12306.custom.FileCookieStore;
import com.hellozjf.ticket12306.dto.*;
import com.hellozjf.ticket12306.exception.Ticket12306Exception;
import com.hellozjf.ticket12306.service.StationNameService;
import com.hellozjf.ticket12306.util.RegexUtils;
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
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;
import java.util.concurrent.TimeUnit;

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
        // 建立cookie文件夹
        File folder = new File("cookie");
        if (! folder.exists()) {
            folder.mkdir();
        }

        // 在该文件夹下面创建cookie持久化文件
        fileCookieStore = new FileCookieStore(new File(folder, "15158037019"));
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
    public void printCookie() throws IOException {
        // 打印Cookie信息
        List<Cookie> cookieList = fileCookieStore.getCookies();
        for (Cookie cookie : cookieList) {
            log.debug("cookie = {}", cookie);
        }
    }

    /**
     * 登录前，需要获取和设备相关的cookie
     * @throws IOException
     */
    @Test
    public void otnHttpZFLogdevice() throws IOException {

        // 访问/otn/HttpZF/logdevice，获取结果
        String result = SendUtils.sendUrl(httpClient, httpClientContext, mapUrlConfDTO, "getDevicesId", null, String.valueOf(System.currentTimeMillis()));
        result = RegexUtils.getMatch(result, "callbackFunction\\('(.*)'\\)");
        log.debug("result = {}", result);
        JsonNode jsonNode = objectMapper.readTree(result);
        String dfp = jsonNode.get("dfp").textValue();
        Cookie cookie = new BasicClientCookie("RAIL_DEVICEID", dfp);
        fileCookieStore.addCookie(cookie);
    }

    /**
     * 获取登录所需要的验证码图片
     *
     * @throws IOException
     */
    @Test
    public void passportCaptchaCaptchaImage64() throws IOException {

        // 访问/passport/captcha/captcha-image64，获取结果
        String result = SendUtils.sendUrl(httpClient, httpClientContext, mapUrlConfDTO, "getCodeImg1", null, String.valueOf(System.currentTimeMillis()));
        result = RegexUtils.getMatch(result, ".*\\((.*)\\)");
        Result12306ImageDTO result12306ImageDTO = objectMapper.readValue(result, Result12306ImageDTO.class);
        log.debug("Result12306ImageDTO = {}", objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(result12306ImageDTO));

        if (result12306ImageDTO.getResultCode().equalsIgnoreCase("0")) {
            // 成功，将问题图片的base64值放入cookie中
            String image = result12306ImageDTO.getImage();
            log.debug("image = {}", image);
            Cookie cookie = new BasicClientCookie(CookieEnum.IMAGE.getKey(), image);
            fileCookieStore.addCookie(cookie);
        } else {
            // 失败，打印错误信息，抛出异常
            String errorMsg = result12306ImageDTO.getResultMessage();
            log.error("error = {}", errorMsg);
            throw new Ticket12306Exception(ResultEnum.PASSPORT_CAPTCHA_CAPTCHA_IMAGE64_ERROR.getCode(),
                    ResultEnum.PASSPORT_CAPTCHA_CAPTCHA_IMAGE64_ERROR.getMessage() + ":" + errorMsg);
        }
    }

    /**
     * 获取验证码图片的答案
     * @throws IOException
     */
    @Test
    public void getAnswer() throws IOException {

        // 获取cookie中保存的验证码图片
        Cookie image = fileCookieStore.getCookie(CookieEnum.IMAGE.getKey());

        // 访问http://aliyun.hellozjf.com:8080/result/base64，获取结果
        Map<String, String> postParams = new HashMap<>();
        postParams.put("base64String", image.getValue());
        String result = SendUtils.sendPost(httpClient, httpClientContext, "http://aliyun.hellozjf.com:8080/result/base64", postParams);
        AnswerDTO answerDTO = objectMapper.readValue(result, AnswerDTO.class);
        log.debug("answerDTO = {}", objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(answerDTO));

        if (answerDTO.getCode() == 0) {
            // 成功，将问题的答案放到cookie中
            Cookie cookie = new BasicClientCookie(CookieEnum.ANSWER.getKey(), answerDTO.getData());
            fileCookieStore.addCookie(cookie);
        } else {
            // 失败，打印错误信息，抛出异常
            String errorMsg = answerDTO.getMsg();
            log.error("error = {}", errorMsg);
            throw new Ticket12306Exception(ResultEnum.GET_ANSWER_ERROR.getCode(),
                    ResultEnum.GET_ANSWER_ERROR.getMessage() + ":" + errorMsg);
        }
    }

    /**
     * 验证答案是否正确
     * @throws IOException
     */
    @Test
    public void passportCaptchaCaptchaCheck() throws IOException {

        // 获取cookie中保存的答案
        Cookie answer = fileCookieStore.getCookie(CookieEnum.ANSWER.getKey());

        // 访问/passport/captcha/captcha-check，获取结果
        Map<String, String> postParams = new HashMap<>();
        postParams.put("answer", answer.getValue());
        postParams.put("login_site", "E");
        postParams.put("rand", "sjrand");
        postParams.put("_json_attr", "");
        String result = SendUtils.sendUrl(httpClient, httpClientContext, mapUrlConfDTO, "codeCheck", postParams);
        CheckDTO checkDTO = objectMapper.readValue(result, CheckDTO.class);
        log.debug("checkDTO = {}", objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(checkDTO));

        if (checkDTO.getResultCode().equalsIgnoreCase("4")) {
            // 成功
            log.debug(checkDTO.getResultMessage());
        } else {
            // 失败，打印错误信息，抛出异常
            String errorMsg = checkDTO.getResultMessage();
            log.error("error = {}", errorMsg);
            throw new Ticket12306Exception(ResultEnum.GET_CHECK_ERROR.getCode(),
                    ResultEnum.GET_CHECK_ERROR.getMessage() + ":" + errorMsg);
        }
    }

    /**
     * 使用用户名密码登录
     * @throws IOException
     */
    @Test
    public void passportWebLogin() throws IOException {

        // 访问/passport/web/login，获取结果
        Map<String, String> postParams = new HashMap<>();
        postParams.put("username", orderTicketDTO.getUsername());
        postParams.put("password", orderTicketDTO.getPassword());
        postParams.put("appid", "otn");
        postParams.put("_json_attr", "");
        String result = null;
        while (true) {
            result = SendUtils.sendUrl(httpClient, httpClientContext, mapUrlConfDTO, "login", postParams);
            if (! StringUtils.isEmpty(result)) {
                break;
            }
            try {
                log.debug("/passport/web/login未返回任何结果，等待1秒后重试");
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                log.error("e = {}", e);
            }
        }
        LoginDTO loginDTO = objectMapper.readValue(result, LoginDTO.class);
        log.debug("loginDTO = {}", objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(loginDTO));

        if (loginDTO.getResultCode() == 0) {
            // 成功，将uamtk放到cookie中
            String uamtk = loginDTO.getUamtk();
            Cookie cookie = new BasicClientCookie(CookieEnum.UAMTK.getKey(), uamtk);
            fileCookieStore.addCookie(cookie);
        } else {
            // 失败，打印错误信息，抛出异常
            String errorMsg = loginDTO.getResultMessage();
            log.error("error = {}", errorMsg);
            throw new Ticket12306Exception(ResultEnum.LOGIN_ERROR.getCode(),
                    ResultEnum.LOGIN_ERROR.getMessage() + ":" + errorMsg);
        }
    }

    /**
     * 通过登录返回的umatk获取newapptk
     * @throws IOException
     */
    @Test
    public void passportWebAuthUamtk() throws IOException {

        // 访问/passport/web/auth/uamtk，获取结果
        Map<String, String> postParams = new HashMap<>();
        postParams.put("appid", "otn");
        String result = SendUtils.sendUrl(httpClient, httpClientContext, mapUrlConfDTO, "auth", postParams);
        AuthUamtkDTO authUamtkDTO = objectMapper.readValue(result, AuthUamtkDTO.class);
        log.debug("authUamtkDTO = {}", objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(authUamtkDTO));

        if (authUamtkDTO.getResultCode() == 0) {
            // 成功，将newapptk放到cookie中
            String newapptk = authUamtkDTO.getNewapptk();
            Cookie cookie = new BasicClientCookie(CookieEnum.NEWAPPTK.getKey(), newapptk);
            fileCookieStore.addCookie(cookie);
        } else {
            // 失败，打印错误信息，抛出异常
            String errorMsg = authUamtkDTO.getResultMessage();
            log.error("error = {}", errorMsg);
            throw new Ticket12306Exception(ResultEnum.AUTH_UAMTK_ERROR.getCode(),
                    ResultEnum.AUTH_UAMTK_ERROR.getMessage() + ":" + errorMsg);
        }
    }

    /**
     * 通过newapptk获取账号对应的姓名
     * @throws IOException
     */
    @Test
    public void otnUamauthclient() throws IOException {

        // 获取cookie中保存的newapptk
        Cookie newapptk = fileCookieStore.getCookie(CookieEnum.NEWAPPTK.getKey());

        // 访问/otn/uamauthclient，获取结果
        Map<String, String> postParams = new HashMap<>();
        postParams.put("tk", newapptk.getValue());
        String result = SendUtils.sendUrl(httpClient, httpClientContext, mapUrlConfDTO, "uamauthclient", postParams);
        UamauthclientDTO uamauthclientDTO = objectMapper.readValue(result, UamauthclientDTO.class);
        log.debug("uamauthclientDTO = {}", objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(uamauthclientDTO));

        if (uamauthclientDTO.getResultCode() == 0) {
            // 成功，打印账号对应的姓名
            log.debug("欢迎{}登录", uamauthclientDTO.getUsername());
        } else {
            // 失败，打印错误信息，抛出异常
            String errorMsg = uamauthclientDTO.getResultMessage();
            log.error("error = {}", errorMsg);
            throw new Ticket12306Exception(ResultEnum.AUTH_UAMTK_ERROR.getCode(),
                    ResultEnum.AUTH_UAMTK_ERROR.getMessage() + ":" + errorMsg);
        }
    }

    /**
     * 初始化操作，用于获取余票查询和车站代码映射的URL地址
     * 余票查询地址会在otnLeftTicketQuery用到
     * 车站代码映射地址会在otnLeftTicketQuery用到
     *
     * @return List第一个是leftTicketQueryUrl，第二个是stationVersionUrl
     * @throws IOException
     */
    private List<String> otnLeftTicketInit() throws IOException {

        // 访问/otn/leftTicket/init，获取结果
        String result = SendUtils.sendUrl(httpClient, httpClientContext, mapUrlConfDTO, "left_ticket_init", null);
        String leftTicketQueryUrl = RegexUtils.getMatch(result, "var CLeftTicketUrl = '(.*)';");
        String stationVersionUrl = RegexUtils.getMatch(result, "<script .* src=\"(/otn/resources/js/framework/station_name.js\\?station_version=.*)\" .*</script>");
        log.debug("leftTicketQueryUrl = {}", leftTicketQueryUrl);
        log.debug("stationNameUrl = {}", stationVersionUrl);

        if (! StringUtils.isEmpty(leftTicketQueryUrl) && ! StringUtils.isEmpty(stationVersionUrl)) {
            // 成功，将获取到的url就存入cookie
            stationVersionUrl = "https://kyfw.12306.cn" + stationVersionUrl;
            List<String> ret = new ArrayList<>();
            ret.add(leftTicketQueryUrl);
            ret.add(stationVersionUrl);
            return ret;
        } else {
            // 失败，打印错误信息，并抛出异常
            String errorMsg = "获取url失败";
            log.error("error = {}", errorMsg);
            throw new Ticket12306Exception(ResultEnum.OTN_LEFT_TICKET_INIT_ERROR.getCode(),
                    ResultEnum.OTN_LEFT_TICKET_INIT_ERROR.getMessage() + ":" + errorMsg);
        }
    }

    /**
     * 更新最新的站点代码
     * @throws IOException
     */
    private void updateStationName(String stationNameUrl) throws IOException {

        // 如果当前站点代码不是最新的，那就更新它
        if (!stationNameService.getStationNameUrl().equalsIgnoreCase(stationNameUrl)) {
            String result = SendUtils.sendGet(httpClient, httpClientContext, stationNameUrl);
            log.debug("result = {}", result);
            stationNameService.updateStationName(result);
        }
    }

    /**
     * 获取到开始站点和结束站点的代码，并将它们写入cookie中
     *
     * @return List第一个是起始站点代码，第二个是结束站点代码
     * @throws IOException
     */
    private List<String> getCodeAndSaveToCookie() throws IOException {

        String fromStationCode = stationNameService.getStationCode(orderTicketDTO.getFromStation());
        String toStationCode = stationNameService.getStationCode(orderTicketDTO.getToStation());
        Cookie fromStationCodeCookie = new BasicClientCookie(CookieEnum.FROM_STATION_CODE.getKey(), fromStationCode);
        Cookie toStationCodeCookie = new BasicClientCookie(CookieEnum.TO_STATION_CODE.getKey(), toStationCode);
        fileCookieStore.addCookie(fromStationCodeCookie);
        fileCookieStore.addCookie(toStationCodeCookie);

        List<String> ret = new ArrayList<>();
        ret.add(fromStationCode);
        ret.add(toStationCode);
        return ret;
    }

    /**
     * 查询符合条件的车票，查到返回secret，并存入cookie
     * @param arrayNode
     * @return
     * @throws IOException
     */
    private String getWantedTicketSecret(ArrayNode arrayNode) throws IOException {
        for (JsonNode jsonNode : arrayNode) {
            String r = jsonNode.textValue();
            String[] rs = r.split("\\|");
            if (rs[3].equalsIgnoreCase(orderTicketDTO.getStationTrain())) {
                int seatType = mapSeatConf.get(orderTicketDTO.getSeatType());
                if (!rs[seatType].equalsIgnoreCase("无") &&
                        !rs[seatType].equalsIgnoreCase("") &&
                        !rs[seatType].equalsIgnoreCase("*")) {
                    // 查询到符合条件的票存入cookie
                    String secret = URLDecoder.decode(rs[0], StandardCharsets.UTF_8);
                    log.debug("secret = {}", secret);
                    Cookie cookie = new BasicClientCookie(CookieEnum.SECRET.getKey(), secret);
                    fileCookieStore.addCookie(cookie);
                    return secret;
                }
            }
        }
        return null;
    }

    /**
     * 返回是否已经登录
     * @return
     * @throws IOException
     */
    private boolean isLogin() throws IOException {
        // 访问/otn/login/conf，获取结果
        String result = SendUtils.sendUrl(httpClient, httpClientContext, mapUrlConfDTO, "loginConf", null);
        Result12306NormalDTO result12306NormalDTO = objectMapper.readValue(result, Result12306NormalDTO.class);
        log.debug("result12306NormalDTO = {}", objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(result12306NormalDTO));

        if (result12306NormalDTO.getStatus()) {
            // 成功，将是否登录放入cookie中
            String isLogin = result12306NormalDTO.getData().get("is_login").textValue();
            log.debug("isLogin = {}", isLogin);
            return isLogin.equalsIgnoreCase("Y");
        } else {
            // 失败，打印错误信息，并抛出异常
            String errorMsg = objectMapper.writeValueAsString(result12306NormalDTO.getMessages());
            log.error("error = {}", errorMsg);
            throw new Ticket12306Exception(ResultEnum.OTN_LOGIN_CONF_ERROR.getCode(),
                    ResultEnum.OTN_LOGIN_CONF_ERROR.getMessage() + ":" + errorMsg);
        }
    }

    /**
     * 查询符合条件的余票
     * @throws IOException
     */
    @Test
    public void otnLeftTicketQuery() throws IOException {

        while (true) {

            // 调用otnLeftTicketInit获取leftTicketQueryUrl和stationNameUrl
            List<String> urlList = otnLeftTicketInit();
            String leftTicketQueryUrl = urlList.get(0);
            String stationNameUrl = urlList.get(1);
            log.debug("leftTicketQueryUrl = {}", leftTicketQueryUrl);
            log.debug("stationNameUrl = {}", stationNameUrl);

            // 如果当前站点代码不是最新的，那就更新它
            updateStationName(stationNameUrl);

            // 获取起点代码和终点代码，并存入cookie
            List<String> codeList = getCodeAndSaveToCookie();

            // 获取当前北京时间
            Instant instant = Instant.now();
            ZoneId zoneId = ZoneId.of("Asia/Shanghai");
            LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zoneId);
            log.debug("localDateTime = {}", localDateTime);

            if (7 <= localDateTime.getHour() && localDateTime.getHour() < 23) {
                // 7点-23点正常购买火车票

                // 购票前先确保已经登录过了
                while (! isLogin()) {
                    login();
                }

                // 访问/otn/leftTicket/query，获取结果
                String result = SendUtils.sendUrl(httpClient, httpClientContext, mapUrlConfDTO, "select_url", null,
                        orderTicketDTO.getStationDate(),
                        codeList.get(0),
                        codeList.get(1),
                        leftTicketQueryUrl);
                LeftTicketDTO leftTicketDTO = objectMapper.readValue(result, LeftTicketDTO.class);
                log.debug("leftTicketDTO = {}", objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(leftTicketDTO));

                if (leftTicketDTO.getStatus()) {
                    // 成功，跳出循环
                    ArrayNode arrayNode = (ArrayNode) leftTicketDTO.getData().get("result");
                    String secret = getWantedTicketSecret(arrayNode);
                    if (!StringUtils.isEmpty(secret)) {
                        break;
                    }
                } else {
                    // 失败，打印错误信息，并抛出异常
                    String errorMsg = leftTicketDTO.getMessages();
                    log.error("error = {}", errorMsg);
                    throw new Ticket12306Exception(ResultEnum.LEFT_TICKET_QUERY_ERROR.getCode(),
                            ResultEnum.LEFT_TICKET_QUERY_ERROR.getMessage() + ":" + errorMsg);
                }
            } else {
                // 休眠一分钟
                try {
                    TimeUnit.MINUTES.sleep(1);
                } catch (InterruptedException e) {
                    log.error("e = {}", e);
                }
            }
        }
    }

    @Test
    public void otnLeftTicketSubmitOrderRequest() throws IOException {

        // 获取cookie中保存的fromStationCode, toStationCode, secret
        Cookie fromStationCode = fileCookieStore.getCookie(CookieEnum.FROM_STATION_CODE.getKey());
        Cookie toStationCode = fileCookieStore.getCookie(CookieEnum.TO_STATION_CODE.getKey());
        Cookie secret = fileCookieStore.getCookie(CookieEnum.SECRET.getKey());
        if (secret == null) {
            log.error("没有票，无法下单");
            return;
        }

        // 访问/otn/leftTicket/submitOrderRequest，获取结果
        Map<String, String> postParams = new HashMap<>();
        postParams.put("secretStr", secret.getValue());
        postParams.put("train_date", orderTicketDTO.getStationDate());
        postParams.put("back_train_date", orderTicketDTO.getStationDate());
        postParams.put("tour_flag", "dc");
        postParams.put("purpose_codes", "ADULT");
        postParams.put("query_from_station_name", fromStationCode.getValue());
        postParams.put("toStationCode", toStationCode.getValue());
        String result = SendUtils.sendUrl(httpClient, httpClientContext, mapUrlConfDTO, "submit_station_url", postParams);
        Result12306NormalDTO result12306NormalDTO = objectMapper.readValue(result, Result12306NormalDTO.class);
        log.debug("result12306NormalDTO = {}", objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(result12306NormalDTO));

        if (result12306NormalDTO.getStatus()) {
            // 成功
        } else {
            // 失败，打印错误信息，并抛出异常
            String errorMsg = objectMapper.writeValueAsString(result12306NormalDTO.getMessages());
            log.error("error = {}", errorMsg);
            throw new Ticket12306Exception(ResultEnum.LEFT_TICKET_QUERY_ERROR.getCode(),
                    ResultEnum.LEFT_TICKET_QUERY_ERROR.getMessage() + ":" + errorMsg);
        }
    }

    @Test
    public void otnConfirmPassengerInitDc() throws IOException {

        // 访问/otn/confirmPassenger/initDc，获取结果
        String result = SendUtils.sendUrl(httpClient, httpClientContext, mapUrlConfDTO, "initdc_url", null);
        String globalRepeatSubmitToken = RegexUtils.getMatch(result, "var globalRepeatSubmitToken = '(.*)';");
        String ticketInfoForPassengerForm = RegexUtils.getMatch(result, "var ticketInfoForPassengerForm=(.*);");
        ticketInfoForPassengerForm = ticketInfoForPassengerForm.replaceAll("'", "\"");
        log.debug("globalRepeatSubmitToken = {}", globalRepeatSubmitToken);
        log.debug("ticketInfoForPassengerForm = {}", ticketInfoForPassengerForm);

        if (! StringUtils.isEmpty(globalRepeatSubmitToken) && ! StringUtils.isEmpty(ticketInfoForPassengerForm)) {
            // 成功，将globalRepeatSubmitToken和ticketInfoForPassengerForm写入cookie
            Cookie globalRepeatSubmitTokenCookie = new BasicClientCookie(CookieEnum.GLOBAL_REPEAT_SUBMIT_TOKEN_COOKIE.getKey(), globalRepeatSubmitToken);
            Cookie ticketInfoForPassengerFormCookie = new BasicClientCookie(CookieEnum.TICKET_INFO_FOR_PASSENGER_FORM.getKey(), ticketInfoForPassengerForm);
            fileCookieStore.addCookie(globalRepeatSubmitTokenCookie);
            fileCookieStore.addCookie(ticketInfoForPassengerFormCookie);
        } else {
            // 失败，打印错误信息，并抛出异常
            String errorMsg = "获取globalRepeatSubmitToken或ticketInfoForPassengerForm失败";
            log.error("error = {}", errorMsg);
            throw new Ticket12306Exception(ResultEnum.OTN_CONFIRM_PASSENGER_INIT_DC_ERROR.getCode(),
                    ResultEnum.OTN_CONFIRM_PASSENGER_INIT_DC_ERROR.getMessage() + ":" + errorMsg);
        }
    }

    @Test
    public void otnConfirmPassengerGetPassengerDTOs() throws IOException {

        // 获取cookie中保存的globalRepeatSubmitTokenCookie
        Cookie globalRepeatSubmitTokenCookie = fileCookieStore.getCookie(CookieEnum.GLOBAL_REPEAT_SUBMIT_TOKEN_COOKIE.getKey());

        // 访问/otn/confirmPassenger/getPassengerDTOs，获取结果
        Map<String, String> postParams = new HashMap<>();
        postParams.put("_json_attr", "");
        postParams.put("REPEAT_SUBMIT_TOKEN", globalRepeatSubmitTokenCookie.getValue());
        String result = SendUtils.sendUrl(httpClient, httpClientContext, mapUrlConfDTO, "get_passengerDTOs", postParams);
        Result12306NormalDTO result12306NormalDTO = objectMapper.readValue(result, Result12306NormalDTO.class);
        log.debug("result12306NormalDTO = {}", objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(result12306NormalDTO));

        if (result12306NormalDTO.getStatus()) {
            // 成功，获取所需要订票的乘客信息
            ArrayNode normalPassengers = (ArrayNode) result12306NormalDTO.getData().get("normal_passengers");
            for (JsonNode normalPassenger : normalPassengers) {
                if (normalPassenger.get("passenger_name").textValue().equalsIgnoreCase(orderTicketDTO.getTicketPeople())) {
                    // 将乘坐人信息写入cookie
                    log.debug("ticketPeople = {}", objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(normalPassenger));
                    Cookie ticketPeople = new BasicClientCookie(CookieEnum.TICKET_PEOPLE.getKey(), objectMapper.writeValueAsString(normalPassenger));
                    fileCookieStore.addCookie(ticketPeople);
                    return;
                }
            }

            // 失败，打印错误信息，并抛出异常
            String errorMsg = "未找到所需的乘客信息";
            log.error("error = {}", errorMsg);
            throw new Ticket12306Exception(ResultEnum.OTN_CONFIRM_PASSENGER_GET_PASSENGER_DTOS_ERROR.getCode(),
                    ResultEnum.OTN_CONFIRM_PASSENGER_GET_PASSENGER_DTOS_ERROR.getMessage() + ":" + errorMsg);
        } else {
            // 失败，打印错误信息，并抛出异常
            String errorMsg = objectMapper.writeValueAsString(result12306NormalDTO.getMessages());
            log.error("error = {}", errorMsg);
            throw new Ticket12306Exception(ResultEnum.OTN_CONFIRM_PASSENGER_GET_PASSENGER_DTOS_ERROR.getCode(),
                    ResultEnum.OTN_CONFIRM_PASSENGER_GET_PASSENGER_DTOS_ERROR.getMessage() + ":" + errorMsg);
        }
    }

    @Test
    public void otnConfirmPassengerCheckOrderInfo() throws IOException {

        // 获取cookie中保存的globalRepeatSubmitTokenCookie, ticketPeople, ticketInfoForPassengerForm
        Cookie globalRepeatSubmitTokenCookie = fileCookieStore.getCookie(CookieEnum.GLOBAL_REPEAT_SUBMIT_TOKEN_COOKIE.getKey());
        Cookie ticketPeople = fileCookieStore.getCookie(CookieEnum.TICKET_PEOPLE.getKey());
        Cookie ticketInfoForPassengerForm = fileCookieStore.getCookie(CookieEnum.TICKET_INFO_FOR_PASSENGER_FORM.getKey());
        JsonNode ticketPeopleNode = objectMapper.readTree(ticketPeople.getValue());
        JsonNode ticketInfoForPassengerFormNode = objectMapper.readTree(ticketInfoForPassengerForm.getValue());
        log.debug("ticketPeopleNode = {}", objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(ticketPeopleNode));
        log.debug("ticketInfoForPassengerForm = {}", objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(ticketInfoForPassengerFormNode));

        // 从ticketInfoForPassengerForm中获取seatType, ticketType, cardType, cancelFlag, bedLevelOrderNum
        String seatType = ticketInfoForPassengerFormNode.get("queryLeftNewDetailDTO").get("WZ_seat_type_code").textValue();
        // TODO 这个也应该从ticketInfoForPassengerFormNode获取，但是我偷懒，直接定死成人票
        String ticketType = "1";
        // TODO 这个也应该从ticketInfoForPassengerFormNode获取，但是我偷懒，直接定死身份证
        String cardType = "1";
        // 下面两个参数，如果ticketInfoForPassengerFormNode中为null，才写死
        String cancelFlag = "2";
        String bedLevelOrderNum = "000000000000000000000000000000";

        // 访问/otn/confirmPassenger/checkOrderInfo，获取结果
        Map<String, String> postParams = new HashMap<>();
        // TODO 下面两个参数，如果ticketInfoForPassengerFormNode中为null，才写死
        postParams.put("cancel_flag", cancelFlag);
        postParams.put("bed_level_order_num", bedLevelOrderNum);
        // TODO 以后可以支持多人的
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
        Result12306NormalDTO result12306NormalDTO = objectMapper.readValue(result, Result12306NormalDTO.class);
        log.debug("result12306NormalDTO = {}", objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(result12306NormalDTO));

        if (result12306NormalDTO.getStatus()) {
            // 成功，打印一下data信息
            log.debug("data = {}", objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(result12306NormalDTO.getData()));
        } else {
            // 失败，打印错误信息，并抛出异常
            String errorMsg = objectMapper.writeValueAsString(result12306NormalDTO.getMessages());
            log.error("error = {}", errorMsg);
            throw new Ticket12306Exception(ResultEnum.OTN_CONFIRM_PASSENGER_CHECK_ORDER_INFO_ERROR.getCode(),
                    ResultEnum.OTN_CONFIRM_PASSENGER_CHECK_ORDER_INFO_ERROR.getMessage() + ":" + errorMsg);
        }
    }

    @Test
    public void otnConfirmPassengerGetQueueCount() throws IOException {

        // 获取cookie中保存的globalRepeatSubmitTokenCookie, ticketInfoForPassengerForm
        Cookie globalRepeatSubmitTokenCookie = fileCookieStore.getCookie(CookieEnum.GLOBAL_REPEAT_SUBMIT_TOKEN_COOKIE.getKey());
        Cookie ticketInfoForPassengerForm = fileCookieStore.getCookie(CookieEnum.TICKET_INFO_FOR_PASSENGER_FORM.getKey());
        JsonNode ticketInfoForPassengerFormNode = objectMapper.readTree(ticketInfoForPassengerForm.getValue());

        // 访问/otn/confirmPassenger/getQueueCount，获取结果
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
        Result12306NormalDTO result12306NormalDTO = objectMapper.readValue(result, Result12306NormalDTO.class);
        log.debug("result12306NormalDTO = {}", objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(result12306NormalDTO));

        if (result12306NormalDTO.getStatus()) {
            // 成功，打印一下data信息
            log.debug("data = {}", objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(result12306NormalDTO.getData()));
        } else {
            // 失败，打印错误信息，并抛出异常
            String errorMsg = objectMapper.writeValueAsString(result12306NormalDTO.getMessages());
            log.error("error = {}", errorMsg);
            throw new Ticket12306Exception(ResultEnum.OTN_CONFIRM_PASSENGER_GET_QUEUE_COUNT_ERROR.getCode(),
                    ResultEnum.OTN_CONFIRM_PASSENGER_GET_QUEUE_COUNT_ERROR.getMessage() + ":" + errorMsg);
        }
    }

    @Test
    public void otnConfirmPassengerConfirmSingleForQueue() throws IOException {

        // 获取cookie中保存的globalRepeatSubmitTokenCookie, ticketPeople, ticketInfoForPassengerForm
        Cookie globalRepeatSubmitTokenCookie = fileCookieStore.getCookie(CookieEnum.GLOBAL_REPEAT_SUBMIT_TOKEN_COOKIE.getKey());
        Cookie ticketPeople = fileCookieStore.getCookie(CookieEnum.TICKET_PEOPLE.getKey());
        Cookie ticketInfoForPassengerForm = fileCookieStore.getCookie(CookieEnum.TICKET_INFO_FOR_PASSENGER_FORM.getKey());
        JsonNode ticketPeopleNode = objectMapper.readTree(ticketPeople.getValue());
        JsonNode ticketInfoForPassengerFormNode = objectMapper.readTree(ticketInfoForPassengerForm.getValue());

        // 从ticketInfoForPassengerForm中获取seatType, ticketType, cardType
        String seatType = ticketInfoForPassengerFormNode.get("queryLeftNewDetailDTO").get("WZ_seat_type_code").textValue();
        // TODO 这个也应该从ticketInfoForPassengerFormNode获取，但是我偷懒，直接定死成人票
        String ticketType = "1";
        // TODO 这个也应该从ticketInfoForPassengerFormNode获取，但是我偷懒，直接定死身份证
        String cardType = "1";

        // 访问/otn/confirmPassenger/confirmSingleForQueue，获取结果
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
        postParams.put("seatDetailType", "1F");
        postParams.put("whatsSelect", "1");
        postParams.put("roomType", "00");
        postParams.put("dwAll", "N");
        postParams.put("_json_att", "");
        postParams.put("REPEAT_SUBMIT_TOKEN", globalRepeatSubmitTokenCookie.getValue());
        String result = SendUtils.sendUrl(httpClient, httpClientContext, mapUrlConfDTO, "checkQueueOrderUrl", postParams);
        Result12306NormalDTO result12306NormalDTO = objectMapper.readValue(result, Result12306NormalDTO.class);
        log.debug("result12306NormalDTO = {}", objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(result12306NormalDTO));

        if (result12306NormalDTO.getStatus()) {
            // 成功，打印一下data信息
            log.debug("data = {}", objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(result12306NormalDTO.getData()));
        } else {
            // 失败，打印错误信息，并抛出异常
            String errorMsg = objectMapper.writeValueAsString(result12306NormalDTO.getMessages());
            log.error("error = {}", errorMsg);
            throw new Ticket12306Exception(ResultEnum.OTN_CONFIRM_PASSENGER_CONFIRM_SINGLE_FOR_QUEUE_ERROR.getCode(),
                    ResultEnum.OTN_CONFIRM_PASSENGER_CONFIRM_SINGLE_FOR_QUEUE_ERROR.getMessage() + ":" + errorMsg);
        }
    }

    @Test
    public void otnConfirmPassengerQueryOrderWaitTime() throws IOException {
        while (true) {

            // 访问/otn/confirmPassenger/queryOrderWaitTime，获取结果
            String result = SendUtils.sendUrl(httpClient, httpClientContext, mapUrlConfDTO, "queryOrderWaitTimeUrl", null,
                    String.valueOf(System.currentTimeMillis()));
            Result12306NormalDTO result12306NormalDTO = objectMapper.readValue(result, Result12306NormalDTO.class);
            log.debug("result12306NormalDTO = {}", objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(result12306NormalDTO));

            if (result12306NormalDTO.getStatus()) {
                JsonNode data = result12306NormalDTO.getData();
                JsonNode orderId = data.get("orderId");
                if (orderId != null && !orderId.isNull()) {
                    log.debug("data = {}", objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(data));
                    break;
                }

                int waitTime = data.get("waitTime").intValue();
                if (waitTime > 0) {
                    try {
                        TimeUnit.SECONDS.sleep(waitTime);
                    } catch (InterruptedException e) {
                        log.error("e = {}", e);
                    }
                }
            } else {
                // 失败，打印错误信息，并抛出异常
                String errorMsg = objectMapper.writeValueAsString(result12306NormalDTO.getMessages());
                log.error("error = {}", errorMsg);
                throw new Ticket12306Exception(ResultEnum.OTN_CONFIRM_PASSENGER_QUERY_ORDER_WAIT_TIME_ERROR.getCode(),
                        ResultEnum.OTN_CONFIRM_PASSENGER_QUERY_ORDER_WAIT_TIME_ERROR.getMessage() + ":" + errorMsg);
            }
        }
    }

    @Test
    public void login() throws IOException {
        passportCaptchaCaptchaImage64();
        getAnswer();
        passportCaptchaCaptchaCheck();
        passportWebLogin();
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
