# coding=utf-8
import random

import time

urls = {
    "auth": {  # 登录接口
        "req_url": "/passport/web/auth/uamtk",
        "req_type": "post",
        "Referer": "https://kyfw.12306.cn/otn/resources/login.html",
        "Host": "kyfw.12306.cn",
        "Content-Type": 1,
        "re_try": 10,
        "re_time": 1,
        "s_time": 0.1,
        "is_logger": True,
        "is_json": True,
    },
    "uamtk-static": {  # 登录接口
        "req_url": "/passport/web/auth/uamtk-static",
        "req_type": "post",
        "Referer": "https://kyfw.12306.cn/otn/resources/login.html",
        "Host": "kyfw.12306.cn",
        "Content-Type": 1,
        "re_try": 10,
        "re_time": 1,
        "s_time": 0.1,
        "is_logger": True,
        "is_json": True,
    },
    "login": {   # 登录接口
        "req_url": "/passport/web/login",
        "req_type": "post",
        "Referer": "https://kyfw.12306.cn/otn/resources/login.html",
        "Host": "kyfw.12306.cn",
        "Content-Type": 1,
        "re_try": 30,
        "re_time": 1,
        "s_time": 0.1,
        "is_logger": True,
        "is_json": True,

    },
    "left_ticket_init": {   # 登录接口
        "req_url": "/otn/leftTicket/init",
        "req_type": "post",
        "Referer": "https://kyfw.12306.cn/otn/resources/login.html",
        "Host": "kyfw.12306.cn",
        "Content-Type": 1,
        "re_try": 10,
        "re_time": 1,
        "s_time": 0.1,
        "is_logger": False,
        "is_json": False,

    },
    "getCodeImg": {  # 登录验证码
        "req_url": "/passport/captcha/captcha-image?login_site=E&module=login&rand=sjrand&{0}",
        "req_type": "get",
        "Referer": "https://kyfw.12306.cn/otn/resources/login.html",
        "Host": "kyfw.12306.cn",
        "Content-Type": 1,
        "re_try": 10,
        "re_time": 1,
        "s_time": 0.1,
        "is_logger": False,
        "is_json": False,
        "not_decode": True,
    },
    "getCodeImg1": {  # 登录验证码
        "req_url": "/passport/captcha/captcha-image64?login_site=E&module=login&rand=sjrand&{0}&callback=jQuery19108016482864806321_1554298927290&_=1554298927293",
        "req_type": "get",
        "Referer": "https://kyfw.12306.cn/otn/resources/login.html",
        "Host": "kyfw.12306.cn",
        "Content-Type": 1,
        "re_try": 10,
        "re_time": 1,
        "s_time": 0.1,
        "is_logger": True,
        "is_json": False,
    },
    "codeCheck": {  # 验证码校验
        "req_url": "/passport/captcha/captcha-check",
        "req_type": "post",
        "Referer": "https://kyfw.12306.cn/otn/resources/login.html",
        "Host": "kyfw.12306.cn",
        "Content-Type": 1,
        "re_try": 10,
        "re_time": 1,
        "s_time": 0.1,
        "is_logger": True,
        "is_json": False,
    },
    "codeCheck1": {  # 验证码校验
        "req_url": "/passport/captcha/captcha-check?callback=jQuery19108016482864806321_1554298927290&answer={0}&rand=sjrand&login_site=E&_={1}",
        "req_type": "get",
        "Referer": "https://kyfw.12306.cn/otn/resources/login.html",
        "Host": "kyfw.12306.cn",
        "Content-Type": 1,
        "re_try": 10,
        "re_time": 1,
        "s_time": 0.1,
        "is_logger": True,
        "is_json": False,
    },
    "loginInit": {  # 登录页面
        "req_url": "/otn/login/init",
        "req_type": "get",
        "Referer": "https://kyfw.12306.cn/otn/index/init",
        "Host": "kyfw.12306.cn",
        "re_try": 1,
        "re_time": 1,
        "s_time": 0.1,
        "is_logger": False,
        "is_json": False,
    },
    "loginInitCdn": {  # 登录页面
        "req_url": "/otn/login/init",
        "req_type": "get",
        "Referer": "https://kyfw.12306.cn/otn/index/init",
        "Host": "kyfw.12306.cn",
        "re_try": 1,
        "re_time": 1,
        "s_time": 0.1,
        "is_logger": False,
        "is_test_cdn": True,
        "is_json": False,
    },
    "loginInitCdn1": {  # 登录页面
        "req_url": "/otn/resources/login.html",
        "req_type": "get",
        "Referer": "https://kyfw.12306.cn/otn/view/index.html",
        "Host": "kyfw.12306.cn",
        "re_try": 1,
        "re_time": 1,
        "s_time": 0.1,
        "is_logger": False,
        "is_test_cdn": False,
        "is_json": False,
    },
    "loginBanner": {  # 登录页面用到的，不太清楚
        "req_url": "/otn/index12306/getLoginBanner",
        "req_type": "get",
        "Referer": "https://kyfw.12306.cn/otn/view/index.html",
        "Host": "kyfw.12306.cn",
        "re_try": 1,
        "re_time": 1,
        "s_time": 0.1,
        "is_logger": False,
        "is_test_cdn": False,
        "is_json": False,
    },
    "getDevicesId": {  # 获取用户信息
        "req_url": "/otn/HttpZF/logdevice?algID=sV3XbAmeRg&hashCode=9JGmYn7tyQpz7ARsg5hs0afNuPy3NlZXSCye9VHEJII&FMQw=0&q4f3=zh-CN&VPIf=1&custID=133&VEek=unknown&dzuS=0&yD16=1&EOQP=1acda25d532249b0b1635671927a47e0&jp76=69f27b80c0ec8437d2a1f4278674e7fb&hAqN=MacIntel&platform=WEB&ks0Q=e848b8c6800147e416e6663782ca3789&TeRS=831x1440&tOHY=24xx900x1440&Fvje=i1l1o1s1&q5aJ=-8&wNLf=99115dfb07133750ba677d055874de87&0aew=Mozilla/5.0%20(Macintosh;%20Intel%20Mac%20OS%20X%2010_13_4)%20AppleWebKit/605.1.15%20(KHTML,%20like%20Gecko)%20Version/11.1%20Safari/605.1.15&E3gR=3492a53db5709ba4cade22e8fe879dc1&timestamp={0}",
        "req_type": "get",
        "Referer": "https://kyfw.12306.cn/otn/passport?redirect=/otn/",
        "Host": "kyfw.12306.cn",
        "re_try": 10,
        "re_time": 1,
        "s_time": 0.01,
        "is_logger": True,
        "is_json": False,
    },
    "getUserInfo": {  # 获取用户信息
        "req_url": "/otn/index/initMy12306",
        "req_type": "get",
        "Referer": "https://kyfw.12306.cn/otn/passport?redirect=/otn/login/userLogin",
        "Host": "kyfw.12306.cn",
        "re_try": 10,
        "re_time": 1,
        "s_time": 0.01,
        "is_logger": False,
        "is_json": False,
    },
    "userLogin": {  # 用户登录
        "req_url": "/otn/login/userLogin",
        "req_type": "get",
        "Referer": "https://kyfw.12306.cn/otn/passport?redirect=/otn/login/userLogin",
        "Host": "kyfw.12306.cn",
        "re_try": 10,
        "re_time": 1,
        "s_time": 0.1,
        "is_logger": True,
        "is_json": True,
    },
    "uamauthclient": {  # 登录
        "req_url": "/otn/uamauthclient",
        "req_type": "post",
        "Referer": "https://kyfw.12306.cn/otn/passport?redirect=/otn/login/userLogin",
        "Host": "kyfw.12306.cn",
        "Content-Type": 1,
        "re_try": 10,
        "re_time": 1,
        "s_time": 0.1,
        "is_logger": True,
        "is_json": True,
    },
    "initdc_url": {  # 生成订单页面
        "req_url": "/otn/confirmPassenger/initDc",
        "req_type": "get",
        "Referer": "https://kyfw.12306.cn/otn/leftTicket/init",
        "Host": "kyfw.12306.cn",
        "re_try": 10,
        "re_time": 0.1,
        "s_time": 1,
        "is_logger": False,
        "is_json": False,
    },
    "GetJS": {   # 订单页面js
        "req_url": "/otn/HttpZF/GetJS",
        "req_type": "get",
        "Referer": "https://kyfw.12306.cn/otn/confirmPassenger/initDc",
        "Host": "kyfw.12306.cn",
        "re_try": 10,
        "re_time": 0.1,
        "s_time": 0.1,
        "is_logger": False,
        "is_json": False,
    },
    "odxmfwg": {  # 订单页面js
        "req_url": "/otn/dynamicJs/odxmfwg",
        "req_type": "get",
        "Referer": "https://kyfw.12306.cn/otn/confirmPassenger/initDc",
        "Host": "kyfw.12306.cn",
        "re_try": 10,
        "re_time": 0.1,
        "s_time": 0.1,
        "is_logger": False,
        "is_json": False,
    },
    "get_passengerDTOs": {  # 获取乘车人
        "req_url": "/otn/confirmPassenger/getPassengerDTOs",
        "req_type": "post",
        "Referer": "https://kyfw.12306.cn/otn/confirmPassenger/initDc",
        "Host": "kyfw.12306.cn",
        "re_try": 10,
        "re_time": 0.1,
        "s_time": 0.1,
        "is_logger": True,
        "is_json": True,
    },
    "select_url": {  # 查询余票
        "req_url": "/otn/{3}?leftTicketDTO.train_date={0}&leftTicketDTO.from_station={1}&leftTicketDTO.to_station={2}&purpose_codes=ADULT",
        "req_type": "get",
        "Referer": "https://kyfw.12306.cn/otn/leftTicket/init",
        "Host": "kyfw.12306.cn",
        "re_try": 10,
        "re_time": 0.01,
        "s_time": 0.01,
        "is_logger": False,
        "is_json": True,
        "is_cdn": True,
    },
    "check_user_url": {  # 检查用户登录
        "req_url": "/otn/login/checkUser",
        "req_type": "post",
        "Referer": "https://kyfw.12306.cn/otn/leftTicket/init",
        "Host": "kyfw.12306.cn",
        "re_try": 10,
        "re_time": 0.3,
        "s_time": 0.1,
        "is_logger": True,
        "is_json": True,
    },
    "submit_station_url": {  # 提交订单
        "req_url": "/otn/leftTicket/submitOrderRequest",
        "req_type": "post",
        "Referer": "https://kyfw.12306.cn/otn/leftTicket/init",
        "Host": "kyfw.12306.cn",
        "re_try": 10,
        "re_time": 0.01,
        "s_time": 0.1,
        "is_logger": True,
        "is_json": True,
    },
    "checkOrderInfoUrl": {  # 检查订单信息规范
        "req_url": "/otn/confirmPassenger/checkOrderInfo",
        "req_type": "post",
        "Referer": "https://kyfw.12306.cn/otn/confirmPassenger/initDc",
        "Host": "kyfw.12306.cn",
        "re_try": 10,
        "re_time": 0.01,
        "s_time": 0.1,
        "is_logger": True,
        "is_json": True,
    },
    "getQueueCountUrl": {  # 剩余余票数
        "req_url": "/otn/confirmPassenger/getQueueCount",
        "req_type": "post",
        "Referer": "https://kyfw.12306.cn/otn/confirmPassenger/initDc",
        "Host": "kyfw.12306.cn",
        "re_try": 10,
        "re_time": 0.01,
        "s_time": 0.1,
        "is_logger": True,
        "is_json": True,
    },
    "checkQueueOrderUrl": {  # 订单队列排队
        "req_url": "/otn/confirmPassenger/confirmSingleForQueue",
        "req_type": "post",
        "Referer": "https://kyfw.12306.cn/otn/confirmPassenger/initDc",
        "Host": "kyfw.12306.cn",
        "re_try": 10,
        "re_time": 0.01,
        "s_time": 0.1,
        "is_logger": True,
        "is_json": True,
    },
    "checkRandCodeAnsyn": {  # 暂时没用到
        "req_url": "/otn/passcodeNew/checkRandCodeAnsyn",
        "req_type": "post",
        "Referer": "https://kyfw.12306.cn/otn/confirmPassenger/initDc",
        "Host": "kyfw.12306.cn",
        "re_try": 10,
        "re_time": 0.01,
        "s_time": 0.1,
        "is_logger": True,
        "is_json": True,
    },
    "codeImgByOrder": {  # 订单页面验证码
        "req_url": "/otn/passcodeNew/getPassCodeNew?module=passenger&rand=randp&{}",
        "req_type": "post",
        "Referer": "https://kyfw.12306.cn/otn/confirmPassenger/initDc",
        "Host": "kyfw.12306.cn",
        "re_try": 10,
        "re_time": 0.01,
        "s_time": 0.1,
        "is_logger": False,
        "is_json": False,
    },
    "queryOrderWaitTimeUrl": {  # 订单等待页面
        "req_url": "/otn/confirmPassenger/queryOrderWaitTime?random={0}&tourFlag=dc&_json_att=",
        "req_type": "get",
        "Referer": "https://kyfw.12306.cn/otn/confirmPassenger/initDc",
        "Host": "kyfw.12306.cn",
        "re_try": 10,
        "re_time": 0.01,
        "s_time": 0.1,
        "is_logger": True,
        "is_json": True,
    },
    "queryMyOrderNoCompleteUrl": {  # 订单查询页面
        "req_url": "/otn/queryOrder/queryMyOrderNoComplete",
        "req_type": "post",
        "Referer": "https://kyfw.12306.cn/otn/queryOrder/initNoComplete",
        "Host": "kyfw.12306.cn",
        "re_try": 10,
        "re_time": 0.01,
        "s_time": 0.1,
        "is_logger": True,
        "is_json": True,
    },
    "initNoCompleteUrl": {  # 获取订单列表
        "req_url": "/otn/queryOrder/initNoComplete",
        "req_type": "post",
        "Referer": "https://kyfw.12306.cn/otn/queryOrder/initNoComplete",
        "Host": "kyfw.12306.cn",
        "re_try": 10,
        "re_time": 0.01,
        "s_time": 0.1,
        "is_logger": False,
        "is_json": False,
    },
    "cancelNoCompleteMyOrder": {  # 取消订单
        "req_url": "/otn/queryOrder/cancelNoCompleteMyOrder",
        "req_type": "post",
        "Referer": "https://kyfw.12306.cn/otn/queryOrder/initNoComplete",
        "Host": "kyfw.12306.cn",
        "re_try": 10,
        "re_time": 0.01,
        "s_time": 0.1,
        "is_logger": True,
        "is_json": True,
    },
    "autoSubmitOrderRequest": {  # 快速自动提交订单
        "req_url": "/otn/confirmPassenger/autoSubmitOrderRequest",
        "req_type": "post",
        "Referer": "https://kyfw.12306.cn/otn/leftTicket/init",
        "Host": "kyfw.12306.cn",
        "Content-Type": 1,
        "re_try": 10,
        "re_time": 0.01,
        "s_time": 0.1,
        "is_logger": True,
        "is_json": True,
    },
    "getQueueCountAsync": {  # 快速获取订单数据
        "req_url": "/otn/confirmPassenger/getQueueCountAsync",
        "req_type": "post",
        "Referer": "https://kyfw.12306.cn/otn/leftTicket/init",
        "Host": "kyfw.12306.cn",
        "Content-Type": 1,
        "re_try": 10,
        "re_time": 0.01,
        "s_time": 0.1,
        "is_logger": True,
        "is_json": True,
    },
    "confirmSingleForQueueAsys": {  # 快速订单排队
        "req_url": "/otn/confirmPassenger/confirmSingleForQueueAsys",
        "req_type": "post",
        "Referer": "https://kyfw.12306.cn/otn/leftTicket/init",
        "Content-Type": 1,
        "Host": "kyfw.12306.cn",
        "re_try": 10,
        "re_time": 0.01,
        "s_time": 0.1,
        "is_logger": True,
        "is_json": True,
    },
    "Pushbear": {  # push通知
        "req_url": "/sub",
        "req_type": "post",
        "Referer": "",
        "Content-Type": 1,
        "Host": "pushbear.ftqq.com",
        "re_try": 10,
        "re_time": 0.01,
        "s_time": 0.1,
        "is_logger": False,
        "is_json": True,
    },
    "cdn_host": {
        "req_url": "http://ping.chinaz.com/kyfw.12306.cn",
        "req_type": "post"
    },
    "cdn_list": {
        "req_url": "http://ping.chinaz.com/iframe.ashx?t=ping&callback=jQuery111304824429956769827_{}".format(int(round(time.time() * 1000))),
        "req_type": "post"
    },

    "TPLINK": {  # TPLINK请求地址
        "req_url": "/",
        "req_type": "post",
        "Referer": "",
        "Content-Type": 1,
        "Host": "192.168.0.1",
        "re_try": 10,
        "re_time": 0.01,
        "s_time": 0.1,
        "is_logger": False,
        "is_json": True,
        "httpType": "http"
    },
    "TPds": {  # TPLINK路由器内部切换地址
        "req_url": "/stok={}/ds",
        "req_type": "post",
        "Referer": "",
        "Content-Type": 1,
        "Host": "192.168.0.1",
        "re_try": 10,
        "re_time": 0.01,
        "s_time": 0.1,
        "is_logger": False,
        "is_json": True,
        "httpType": "http"
    },
    "xiaomiHome": {  # 小米路由器登录
        "req_url": "/cgi-bin/luci/web",
        "req_type": "get",
        "Referer": "",
        "Content-Type": 1,
        "Host": "192.168.31.1",
        "re_try": 10,
        "re_time": 0.01,
        "s_time": 0.1,
        "is_logger": False,
        "is_json": False,
        "httpType": "http"
    },
    "xiaomi": {  # 小米路由器登录
        "req_url": "/cgi-bin/luci/api/xqsystem/login",
        "req_type": "post",
        "Referer": "",
        "Content-Type": 1,
        "Host": "192.168.31.1",
        "re_try": 10,
        "re_time": 0.01,
        "s_time": 0.1,
        "is_logger": False,
        "is_json": True,
        "httpType": "http"
    },
    "loginHtml": {  # 登录接口2
        "req_url": "/otn/resources/login.html",
        "req_type": "get",
        "Referer": "https://kyfw.12306.cn/otn/leftTicket/init",
        "Host": "kyfw.12306.cn",
        "re_try": 10,
        "re_time": 0.3,
        "s_time": 0.1,
        "is_logger": True,
        "is_json": True,
    },
    "loginConf": {  # 登录接口2
        "req_url": "/otn/login/conf",
        "req_type": "post",
        "Referer": "https://kyfw.12306.cn/otn/leftTicket/init",
        "Host": "kyfw.12306.cn",
        "re_try": 10,
        "re_time": 0.3,
        "s_time": 0.1,
        "is_logger": True,
        "is_json": True,
    },
    "loginAysnSuggest": {  # 登录接口2
        "req_url": "/otn/login/loginAysnSuggest",
        "req_type": "post",
        "Referer": "https://kyfw.12306.cn/otn/leftTicket/init",
        "Host": "kyfw.12306.cn",
        "re_try": 10,
        "re_time": 0.3,
        "s_time": 0.1,
        "is_logger": True,
        "is_json": True,
    },


}