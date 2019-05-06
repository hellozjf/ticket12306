package com.hellozjf.ticket12306.thread;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.hellozjf.ticket12306.custom.FileCookieStore;
import com.hellozjf.ticket12306.dto.OrderTicketDTO;
import com.hellozjf.ticket12306.dto.UrlConfDTO;
import com.hellozjf.ticket12306.service.StationNameService;
import com.hellozjf.ticket12306.util.UrlUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.*;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.http.HttpMethod;
import org.springframework.util.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 这个线程用来购票
 * @author Jingfeng Zhou
 */
@Slf4j
public class OrderTicketThread extends Thread {

    /**
     * 购票相关的信息
     */
    private OrderTicketDTO orderTicketDTO;

    /**
     * 各种UrlConfDTO，里面有uri，host，referer等信息
     */
    private Map<String, UrlConfDTO> mapUrlConfDTO;

    /**
     * JSON工具
     */
    private ObjectMapper objectMapper;

    /**
     * 站点名称和code工具
     */
    private StationNameService stationNameService;

    /**
     * 座位对应的ticketInfo中的序号
     */
    private Map<String, Integer> mapSeatConf;
    private Map<Integer, String> mapSeatConf2;

    /**
     * 作为对应购票时使用的编码
     */
    private Map<String, String> mapPassengerTicketStr;

    /**
     * 构造方法
     * @param orderTicketDTO
     */
    public OrderTicketThread(OrderTicketDTO orderTicketDTO,
                             Map<String, UrlConfDTO> mapUrlConfDTO,
                             ObjectMapper objectMapper,
                             StationNameService stationNameService,
                             Map<String, Integer> mapSeatConf,
                             Map<Integer, String> mapSeatConf2,
                             Map<String, String> mapPassengerTicketStr) {
        this.orderTicketDTO = orderTicketDTO;
        this.mapUrlConfDTO = mapUrlConfDTO;
        this.objectMapper = objectMapper;
        this.stationNameService = stationNameService;
        this.mapSeatConf = mapSeatConf;
        this.mapSeatConf2 = mapSeatConf2;
        this.mapPassengerTicketStr = mapPassengerTicketStr;
    }

    /**
     * 从文本中提取一个正则表达式分组信息
     * @param text
     * @param regex
     * @return
     */
    private String getMatch(String text, String regex) throws IOException {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return matcher.group(1);
        } else {
            return "";
        }
    }

    /**
     * 通过图片的base64码，获取需要选择的坐标
     * @param image
     * @return
     * @throws IOException
     */
    private String getAnswer(String image) throws IOException {

        HttpClient httpClient = HttpClients.createDefault();
        HttpClientContext httpClientContext = HttpClientContext.create();
        HttpPost httpPost = new HttpPost("http://aliyun.hellozjf.com:8080/result/base64");
        List<BasicNameValuePair> formParams = new ArrayList<>();
        formParams.add(new BasicNameValuePair("base64String", image));
        UrlEncodedFormEntity requestEntity = new UrlEncodedFormEntity(formParams, Consts.UTF_8);
        httpPost.setEntity(requestEntity);

        HttpResponse httpResponse = httpClient.execute(httpPost, httpClientContext);
        HttpEntity httpEntity = httpResponse.getEntity();
        String result = EntityUtils.toString(httpEntity);
        JsonNode randCodeNode = objectMapper.readTree(result);
        String randCode = randCodeNode.get("data").textValue();
        return randCode;
    }

    /**
     * 传入url和参数，获取返回值
     * @param httpClient
     * @param httpClientContext
     * @param url
     * @param params
     * @return
     * @throws IOException
     */
    private String doIt(HttpClient httpClient,
                        HttpClientContext httpClientContext,
                        String url,
                        Map<String, String> postParams,
                        String... params) throws IOException {

        // 获取请求url，并为它赋上参数
        UrlConfDTO urlConfDTO = mapUrlConfDTO.get(url);
        String reqUrl = urlConfDTO.getReqUrl();
        for (int i = 0; i < params.length; i++) {
            reqUrl = reqUrl.replaceAll("\\{" + i + "\\}", params[i]);
        }

        // 全部使用HttpPost
        HttpResponse httpResponse = null;
        String urlString = UrlUtils.getUrl(urlConfDTO.getHttpType(), urlConfDTO.getHost(), reqUrl);
        HttpPost httpPost = new HttpPost(urlString);
        httpPost.setHeader(HttpHeaders.REFERER, urlConfDTO.getReferer());
        httpPost.setHeader(HttpHeaders.HOST, urlConfDTO.getHost());
        if (postParams != null) {
            List<NameValuePair> formParams = new ArrayList<>();
            for (Map.Entry<String, String> entry : postParams.entrySet()) {
                formParams.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
            }
            UrlEncodedFormEntity requestEntity = new UrlEncodedFormEntity(formParams, Consts.UTF_8);
            httpPost.setEntity(requestEntity);
        }

        // 如果没有得到值，则一直重试，重试到有值，或者超过最大次数为止
        for (int i = 0; i < urlConfDTO.getReTry(); i++) {
            httpResponse = httpClient.execute(httpPost, httpClientContext);
            HttpEntity httpEntity = httpResponse.getEntity();
            String result = EntityUtils.toString(httpEntity);
            if (!StringUtils.isEmpty(result)) {
                log.info("url: {}", urlString);
                log.info("input: {}", httpPost.getEntity() == null ? null : EntityUtils.toString(httpPost.getEntity()));
                log.info("output: {}", result);
                return result;
            }
            try {
                Thread.sleep((long) (urlConfDTO.getSTime() * 1000));
            } catch (InterruptedException e) {
                log.error("e = {}", e);
            }
        }

        HttpEntity httpEntity = httpResponse.getEntity();
        String result = EntityUtils.toString(httpEntity);
        return result;
    }

    /**
     * 获取某个key对应的value
     * @param json
     * @param key
     * @return
     * @throws IOException
     */
    private String getStringJsonValue(String json, String key) throws IOException {
        JsonNode jsonNode = objectMapper.readTree(json);
        return jsonNode.get(key).textValue();
    }

    /**
     * 判断json串中有没有某个key
     * @param json
     * @param key
     * @return
     * @throws IOException
     */
    private boolean haveJsonValue(String json, String key) throws IOException {
        JsonNode jsonNode = objectMapper.readTree(json);
        return jsonNode.get(key) != null;
    }

    /**
     * 获取某个key对应的value
     * @param json
     * @param key
     * @return
     * @throws IOException
     */
    private Integer getIntegerJsonValue(String json, String key) throws IOException {
        JsonNode jsonNode = objectMapper.readTree(json);
        return jsonNode.get(key).intValue();
    }

    /**
     * 打开登录页面，访问uamtk-static
     * @param httpClient
     * @param httpClientContext
     * @return
     * @throws IOException
     */
    private String auth(HttpClient httpClient, HttpClientContext httpClientContext) throws IOException {

        String result = null;
        Map<String, String> postParams = null;

        // 访问/otn/resources/login.html
        doIt(httpClient, httpClientContext, "loginInitCdn1", null);

        // 访问/passport/web/auth/uamtk-static
        postParams = new HashMap<>();
        postParams.put("appid", "otn");
        result = doIt(httpClient, httpClientContext, "uamtk-static", postParams);
        log.debug("result = {}", result);
        return result;
    }

    /**
     * 执行登录操作
     * @param httpClient
     * @param httpClientContext
     * @throws IOException
     */
    private String login(HttpClient httpClient, HttpClientContext httpClientContext) throws IOException {

        String result = null;
        String json = null;
        String image = null;
        String dfp = null;
        Map<String, String> postParams = null;

        while (true) {

            // 访问/otn/login/checkUser
            postParams = new HashMap<>();
            postParams.put("_json_att", "");
            result = doIt(httpClient, httpClientContext, "check_user_url", postParams);
            if (objectMapper.readTree(result).get("data").get("flag").booleanValue()) {
                // 已经登录过了，返回cookie中的tk
                CookieStore cookieStore = httpClientContext.getCookieStore();
                for (Cookie cookie : cookieStore.getCookies()) {
                    if (cookie.getName().equalsIgnoreCase("tk")) {
                        return cookie.getValue();
                    }
                }
            }
            log.debug("result = {}", result);

            // 访问/otn/login/conf
            result = doIt(httpClient, httpClientContext, "loginConf", null);
            log.debug("result = {}", result);

            // 打开登录页面，访问uamtk-static
            auth(httpClient, httpClientContext);

            // 访问/otn/HttpZF/logdevice
            result = doIt(httpClient, httpClientContext, "getDevicesId", null, String.valueOf(System.currentTimeMillis()));
            log.debug("result = {}", result);
            json = getMatch(result, ".*\\('(.*)'\\)");
            log.debug("json = {}", json);
            dfp = getStringJsonValue(json, "dfp");
            log.debug("dfp = {}", dfp);
            httpClientContext.getCookieStore().addCookie(new BasicClientCookie("RAIL_DEVICEID", dfp));

            // 访问/passport/captcha/captcha-image64，获取验证码
            result = doIt(httpClient, httpClientContext, "getCodeImg1", null, String.valueOf(System.currentTimeMillis()));
            log.debug("result = {}", result);
            json = getMatch(result, ".*\\((.*)\\)");
            log.debug("json = {}", json);
            image = getStringJsonValue(json, "image");
            log.debug("image = {}", image);
            log.info("获取到验证码");

            // 获取验证码坐标
            String answer = getAnswer(image);
            log.debug("answer = {}", answer);

            // 打开登录页面，访问uamtk-static
            auth(httpClient, httpClientContext);

            // 访问/passport/captcha/captcha-check，验证验证码
            result = doIt(httpClient, httpClientContext, "codeCheck1", null, answer, String.valueOf(System.currentTimeMillis()));
            log.debug("result = {}", result);
            json = getMatch(result, ".*\\((.*)\\)");
            log.debug("json = {}", json);
            result = getStringJsonValue(json, "result_code");
            log.debug("result = {}", result);
            log.info("验证码验证成功");

            // 登录
            postParams = new HashMap<>();
            postParams.put("username", orderTicketDTO.getUsername());
            postParams.put("password", orderTicketDTO.getPassword());
            postParams.put("appid", "otn");
            postParams.put("answer", answer);
            result = doIt(httpClient, httpClientContext, "login", postParams);
            log.debug("result = {}", result);

            if (! StringUtils.isEmpty(result)) {
                Integer resultCode = getIntegerJsonValue(result, "result_code");
                if (resultCode.intValue() == 0) {
                    // 打开登录页面，访问uamtk-static
                    String authResult = auth(httpClient, httpClientContext);
                    String newapptk = getStringJsonValue(authResult, "newapptk");
                    if (newapptk != null) {
                        log.info("登录成功");
                        return newapptk;
                    }
                } else {
                    log.error("unknow");
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                log.debug("e = {}", e);
            }

        }
    }

    /**
     * 线程体
     */
    @Override
    public void run() {
        try {
            // 定义需要用到的公共变量
            // cookie持久化
            FileCookieStore fileCookieStore = new FileCookieStore(new File("hellozjf"));
            // httpClient
            HttpClient httpClient = HttpClients.custom()
                    .setDefaultCookieStore(fileCookieStore)
                    .build();
            // httpClientContext
            HttpClientContext httpClientContext = HttpClientContext.create();
            // post的参数
            Map<String, String> postParams = null;
            // 返回结果
            String result = null;
            // 返回代码
            Integer resultCode = null;

            // 访问/otn/leftTicket/init，todo 不知道有什么用处，以后删了它试试
            doIt(httpClient, httpClientContext, "left_ticket_init", null);

            // 进行登录操作，如果没有登录过这里可能要花很长时间才能登录成功
            // 如果登陆过且保存的cookie没有过期应该直接就能获取到result的，result本质上就是后面用到的tk
            result = login(httpClient, httpClientContext);
            log.debug("result = {}", result);

            // 登录成功后，显示用户名
            result = showUserName(httpClient, httpClientContext, result);

            // todo 记住，这里可能要新开一个checkUser线程

            // 获取乘客列表
            JsonNode wantNormalPassenger = getPassengerList(httpClient, httpClientContext);

            // 抢票
            orderTicket(httpClient, httpClientContext, wantNormalPassenger);

        } catch (IOException e) {
            log.error("e = {}", e);
        }
    }

    /**
     * 开始抢票
     * @param httpClient
     * @param httpClientContext
     * @param wantNormalPassenger
     * @throws IOException
     */
    private void orderTicket(HttpClient httpClient, HttpClientContext httpClientContext, JsonNode wantNormalPassenger) throws IOException {

        while (true) {
            Map<String, Object> leftTicketMap = checkLeftTickets(httpClient, httpClientContext);
            Map<String, Object> passengerTicketStrListAndOldPassengerStr = getPassengerTicketStr(httpClient, httpClientContext, wantNormalPassenger);
            // 提交订单
            submitOrder(httpClient, httpClientContext, leftTicketMap, passengerTicketStrListAndOldPassengerStr);
        }
    }

    private void submitOrder(HttpClient httpClient, HttpClientContext httpClientContext, Map<String, Object> leftTicketMap, Map<String, Object> passengerTicketStrListAndOldPassengerStr) throws IOException {
        Map<String, String> postParams;
        String result;
        postParams = new HashMap<>();
        postParams.put("secretStr", leftTicketMap.get("secretStr").toString());
        postParams.put("train_date", leftTicketMap.get("train_date").toString());
        postParams.put("back_train_date", "");
        postParams.put("tour_flag", "dc");
        postParams.put("purpose_codes", "ADULT");
        postParams.put("query_from_station_name", stationNameService.getStationCode(orderTicketDTO.getFromStation()));
        postParams.put("query_to_station_name", stationNameService.getStationCode(orderTicketDTO.getToStation()));
        result = doIt(httpClient, httpClientContext, "submit_station_url", postParams);
        if (haveJsonValue(result, "data") && getStringJsonValue(result, "data").equalsIgnoreCase("N")) {
            // 首先获取token
            result = doIt(httpClient, httpClientContext, "initdc_url", null);
            Pattern tokenNamePattern = Pattern.compile("var globalRepeatSubmitToken = '(.*)'");
            Pattern ticketInfoForPassengerFormNamePattern = Pattern.compile("var ticketInfoForPassengerForm=(\\{.+\\})?");
            Pattern orderRequestParamsNamePattern = Pattern.compile("var orderRequestDTO=(\\{.+\\})?");
            Matcher tokenNameMatcher = tokenNamePattern.matcher(result);
            Matcher ticketInfoForPassengerFormNameMatcher = tokenNamePattern.matcher(result);
            Matcher orderRequestParamsNameMatcher = orderRequestParamsNamePattern.matcher(result);
            String token = null;
            JsonNode ticketInfoForPassengerForm = null;
            JsonNode orderRequestParams = null;
            if (tokenNameMatcher.find()) {
                token = tokenNameMatcher.group(1);
            }
            if (ticketInfoForPassengerFormNameMatcher.find()) {
                String s = ticketInfoForPassengerFormNameMatcher.group(1);
                ticketInfoForPassengerForm = objectMapper.readTree(s);
            }
            if (orderRequestParamsNameMatcher.find()) {
                String s = orderRequestParamsNameMatcher.group(1);
                orderRequestParams = objectMapper.readTree(s);
            }

            // 说明在排队了
            postParams = new HashMap<>();
            postParams.put("passengerTicketStr", passengerTicketStrListAndOldPassengerStr.get("passengerTicketStrList").toString());
            postParams.put("oldPassengerStr", passengerTicketStrListAndOldPassengerStr.get("oldPassengerStr").toString());
            postParams.put("REPEAT_SUBMIT_TOKEN", token);
            postParams.put("randCode", "");
            postParams.put("cancel_flag", "2");
            postParams.put("bed_level_order_num", "000000000000000000000000000000");
            postParams.put("tour_flag", "dc");
            postParams.put("_json_att", "");
            result = doIt(httpClient, httpClientContext, "checkOrderInfoUrl", postParams);
            JsonNode checkOrderInfoRoot = objectMapper.readTree(result);
            if (checkOrderInfoRoot.get("data").get("submitStatus").booleanValue()) {
                log.info("车票提交通过，正在尝试排队");
                float ifShowPassCodeTime = Integer.valueOf(checkOrderInfoRoot.get("data").get("ifShowPassCodeTime").textValue()) / 1000.0f;
                boolean isNeedCode = false;
                if (checkOrderInfoRoot.get("data").get("ifShowPassCode").textValue().equalsIgnoreCase("Y")) {
                    isNeedCode = true;
                }

                // 那就排队吧
                postParams = new HashMap<>();
            }
        } else {
            JsonNode jsonNode = objectMapper.readTree(result);
            JsonNode messages = jsonNode.get("messages");
            if (messages != null && messages.isArray()) {
                ArrayNode arrayNode = (ArrayNode) messages;
                log.debug("{}", arrayNode.get(0).textValue());
            }
        }
    }

    private JsonNode getPassengerList(HttpClient httpClient, HttpClientContext httpClientContext) throws IOException {
        Map<String, String> postParams;
        String result;
        postParams = new HashMap<>();
        postParams.put("_json_att", "");
        result = doIt(httpClient, httpClientContext, "get_passengerDTOs", postParams);
        log.debug("result = {}", result);
        JsonNode root = objectMapper.readTree(result);
        JsonNode data = root.get("data");
        JsonNode normalPassengers = data.get("normal_passengers");
        JsonNode wantNormalPassenger = null;
        if (normalPassengers.isArray()) {
            ArrayNode array = (ArrayNode) normalPassengers;
            for (JsonNode normalPassenger : array) {
                if (normalPassenger.get("passenger_name").textValue().equals(orderTicketDTO.getTicketPeople())) {
                    wantNormalPassenger = normalPassenger;
                    break;
                }
            }
        }
        log.debug("wantNormalPassenger = {}", wantNormalPassenger);
        return wantNormalPassenger;
    }

    /**
     * 显示登录的用户名
     * @param httpClient
     * @param httpClientContext
     * @param result
     * @return
     * @throws IOException
     */
    private String showUserName(HttpClient httpClient, HttpClientContext httpClientContext, String result) throws IOException {
        Map<String, String> postParams;
        Integer resultCode;
        postParams = new HashMap<>();
        postParams.put("tk", result);
        result = doIt(httpClient, httpClientContext, "uamauthclient", postParams);
        resultCode = getIntegerJsonValue(result, "result_code");
        if (resultCode.intValue() == 0) {
            log.info("欢迎 {} 登录", getStringJsonValue(result, "username"));
        }
        return result;
    }

    /**
     * 构造需要购买的票信息
     * @param httpClient
     * @param httpClientContext
     * @param wantNormalPassenger
     * @return
     * @throws IOException
     */
    private Map<String, Object> getPassengerTicketStr(HttpClient httpClient,
                                                      HttpClientContext httpClientContext,
                                                      JsonNode wantNormalPassenger) throws IOException {
        String seatCode = mapPassengerTicketStr.get(orderTicketDTO.getSeatType());
        List<String> passengerTicketStrList = new ArrayList<>();
        passengerTicketStrList.add("0");
        // TODO 这里的passengerTicketStrList可以扩展成多个人，注意人和人之间用_隔开
        passengerTicketStrList.add(seatCode);
        passengerTicketStrList.add(wantNormalPassenger.get("passenger_type").textValue());
        passengerTicketStrList.add(wantNormalPassenger.get("passenger_name").textValue());
        passengerTicketStrList.add(wantNormalPassenger.get("passenger_id_type_code").textValue());
        passengerTicketStrList.add(wantNormalPassenger.get("passenger_id_no").textValue());
        passengerTicketStrList.add(wantNormalPassenger.get("mobile_no").textValue());
        passengerTicketStrList.add("N");
        List<String> oldPassengerStr = new ArrayList<>();
        // TODO 这里的oldPassengerStr理论上也应该扩展成多人，注意人和人之间用_隔开
        oldPassengerStr.add(wantNormalPassenger.get("passenger_name").textValue());
        oldPassengerStr.add(wantNormalPassenger.get("passenger_id_type_code").textValue());
        oldPassengerStr.add(wantNormalPassenger.get("passenger_id_no").textValue());
        oldPassengerStr.add(wantNormalPassenger.get("passenger_type").textValue());

        Map<String, Object> mapPassengerTicketStrListAndOldPassengerStr = new HashMap<>();
        mapPassengerTicketStrListAndOldPassengerStr.put("passengerTicketStrList", String.join(",", passengerTicketStrList));
        mapPassengerTicketStrListAndOldPassengerStr.put("oldPassengerStr", String.join(",", oldPassengerStr));
        mapPassengerTicketStrListAndOldPassengerStr.put("code", 000000);
        mapPassengerTicketStrListAndOldPassengerStr.put("set_type", seatCode);
        mapPassengerTicketStrListAndOldPassengerStr.put("status", true);
        // TODO 这里的user_info不知道是不是对的
        mapPassengerTicketStrListAndOldPassengerStr.put("user_info", wantNormalPassenger.toString());
        return mapPassengerTicketStrListAndOldPassengerStr;
    }

    /**
     * 查询余票
     * @param httpClient
     * @param httpClientContext
     * @return
     * @throws IOException
     */
    private Map<String, Object> checkLeftTickets(HttpClient httpClient, HttpClientContext httpClientContext) throws IOException {
        String result;
        String fromStationCode = stationNameService.getStationCode(orderTicketDTO.getFromStation());
        String toStationCode = stationNameService.getStationCode(orderTicketDTO.getToStation());
        while (true) {
            result = doIt(httpClient, httpClientContext, "select_url", null,
                    orderTicketDTO.getStationDate(), fromStationCode, toStationCode, "leftTicket/query");
            log.debug("result = {}", result);
            // todo 这里可能需要判断有没有c_url，有的话需要重新设置doIt最后那个参数

            JsonNode leftTicketNode = objectMapper.readTree(result);
            JsonNode leftTicketData = leftTicketNode.get("data");
            if (leftTicketData != null) {
                JsonNode leftTicketResult = leftTicketData.get("result");
                if (leftTicketResult.isArray()) {
                    ArrayNode arrayNode = (ArrayNode) leftTicketResult;
                    for (JsonNode node : arrayNode) {
                        String[] ticketInfo = node.textValue().split("\\|");
                        if (ticketInfo[11].equalsIgnoreCase("Y") && ticketInfo[1].equalsIgnoreCase("预订")) {
                            int seatType = mapSeatConf.get(orderTicketDTO.getSeatType()).intValue();
                            String isTicketPass = ticketInfo[seatType];
                            if (! isTicketPass.equalsIgnoreCase("") &&
                                    ! isTicketPass.equalsIgnoreCase("无") &&
                                    ! isTicketPass.equalsIgnoreCase("*") &&
                                    ticketInfo[3].equalsIgnoreCase(orderTicketDTO.getStationTrain())) {
                                // 说明是我需要的火车票，打印一下
                                log.debug("need ticket = {}", node.textValue());

                                String secretStr = ticketInfo[0];
                                String trainNo = ticketInfo[2];
                                String queryFromStationName = ticketInfo[6];
                                String queryToStationName = ticketInfo[7];
                                String trainLocation = ticketInfo[15];
                                String stationTrainCode = ticketInfo[3];
                                String leftTicket = ticketInfo[12];
                                String startTime = ticketInfo[8];
                                String arrivalTime = ticketInfo[9];
                                String distanceTime = ticketInfo[10];
                                log.debug("startTime = {}, arrivalTime = {}, distanceTime = {}",
                                        startTime, arrivalTime, distanceTime);
                                Integer seat = seatType;

                                Map<String, Object> leftTicketMap = new HashMap<>();
                                leftTicketMap.put("secretStr", secretStr);
                                leftTicketMap.put("train_no", trainNo);
                                leftTicketMap.put("stationTrainCode", stationTrainCode);
                                leftTicketMap.put("train_date", orderTicketDTO.getStationDate());
                                leftTicketMap.put("query_from_station_name", queryFromStationName);
                                leftTicketMap.put("query_to_station_name", queryToStationName);
                                leftTicketMap.put("seat", seat);
                                leftTicketMap.put("leftTicket", leftTicket);
                                leftTicketMap.put("train_location", trainLocation);
                                leftTicketMap.put("code", 000000);
                                leftTicketMap.put("is_more_ticket_num", 1);
                                leftTicketMap.put("cdn", null);
                                leftTicketMap.put("status", true);
                                return leftTicketMap;
                            }
                        }
                    }
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                log.error("e = {}", e);
            }
        }
    }
}
