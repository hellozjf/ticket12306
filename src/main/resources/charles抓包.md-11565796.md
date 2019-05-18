# /otn/login/conf

## 输入

```
POST /otn/login/conf HTTP/1.1
Host: kyfw.12306.cn
Connection: keep-alive
Content-Length: 0
Accept: */*
Origin: https://kyfw.12306.cn
X-Requested-With: XMLHttpRequest
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.157 Safari/537.36
Referer: https://kyfw.12306.cn/otn/resources/login.html
Accept-Encoding: gzip, deflate, br
Accept-Language: zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,ja;q=0.6
Cookie: JSESSIONID=3135B88A70E3A2108D6D713BE3D60C1F; _jc_save_fromStation=%u676D%u5DDE%2CHZH; _jc_save_toStation=%u5B81%u6CE2%2CNGH; _jc_save_wfdc_flag=dc; _jc_save_toDate=2019-05-12; _jc_save_fromDate=2019-05-18; BIGipServerotn=619708938.64545.0000; RAIL_EXPIRATION=1558445401115; RAIL_DEVICEID=ojOchhXouyQKkRIDOIOEYE223_WcKcaOuF-_z82P-CYHNuKQOQA6fkynsTMigwJkqEHRabHNmpVRc0I8wVMQioy8eY2wYFbmATsvNP5SRPVofNqBITahBMUmcv5zPO3WcdwpO4jr6MtgbmqT1knkYn0qBbUShMDp; BIGipServerpool_passport=351076874.50215.0000; route=6f50b51faa11b987e576cdb301e545c4
 
 
```

 

## 输出

```
{
    "validateMessagesShowId": "_validatorMessage",
    "status": true,
    "httpstatus": 200,
    "data": {
        "isstudentDate": true,
        "is_login_passCode": "Y",
        "is_sweep_login": "Y",
        "psr_qr_code_result": "N",
        "login_url": "resources/login.html",
        "studentDate": ["2019-06-01", "2019-09-30", "2019-12-01", "2019-12-31", "2019-01-01", "2019-03-31"],
        "stu_control": 30,
        "is_uam_login": "Y",
        "is_login": "N",
        "other_control": 30
    },
    "messages": [],
    "validateMessages": {}
}
```

# /otn/index12306/getLoginBanner

##  输入

```
GET /otn/index12306/getLoginBanner HTTP/1.1
Host: kyfw.12306.cn
Connection: keep-alive
Accept: text/plain, */*; q=0.01
X-Requested-With: XMLHttpRequest
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.157 Safari/537.36
Referer: https://kyfw.12306.cn/otn/resources/login.html
Accept-Encoding: gzip, deflate, br
Accept-Language: zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,ja;q=0.6
Cookie: JSESSIONID=3135B88A70E3A2108D6D713BE3D60C1F; _jc_save_fromStation=%u676D%u5DDE%2CHZH; _jc_save_toStation=%u5B81%u6CE2%2CNGH; _jc_save_wfdc_flag=dc; _jc_save_toDate=2019-05-12; _jc_save_fromDate=2019-05-18; BIGipServerotn=619708938.64545.0000; RAIL_EXPIRATION=1558445401115; RAIL_DEVICEID=ojOchhXouyQKkRIDOIOEYE223_WcKcaOuF-_z82P-CYHNuKQOQA6fkynsTMigwJkqEHRabHNmpVRc0I8wVMQioy8eY2wYFbmATsvNP5SRPVofNqBITahBMUmcv5zPO3WcdwpO4jr6MtgbmqT1knkYn0qBbUShMDp; BIGipServerpool_passport=351076874.50215.0000; route=6f50b51faa11b987e576cdb301e545c4
 
 
```

 

## 输出

```
{
    "validateMessagesShowId": "_validatorMessage",
    "status": true,
    "httpstatus": 200,
    "data": {
        "index_banner_url": [{
            "target": "1",
            "src": "https://exservice.12306.cn/excater/index.html",
            "url": "https://www.12306.cn/index/images/pic/banner-login.jpg"
        }]
    },
    "messages": [],
    "validateMessages": {}
}
```

# /passport/web/auth/uamtk-static

## 输入

```
POST /passport/web/auth/uamtk-static HTTP/1.1
Host: kyfw.12306.cn
Connection: keep-alive
Content-Length: 9
Accept: */*
Origin: https://kyfw.12306.cn
X-Requested-With: XMLHttpRequest
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.157 Safari/537.36
Content-Type: application/x-www-form-urlencoded; charset=UTF-8
Referer: https://kyfw.12306.cn/otn/resources/login.html
Accept-Encoding: gzip, deflate, br
Accept-Language: zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,ja;q=0.6
Cookie: _passport_session=971500cc11f140d7bd3e80620db66af29311; _jc_save_fromStation=%u676D%u5DDE%2CHZH; _jc_save_toStation=%u5B81%u6CE2%2CNGH; _jc_save_wfdc_flag=dc; _jc_save_toDate=2019-05-12; _jc_save_fromDate=2019-05-18; BIGipServerotn=619708938.64545.0000; RAIL_EXPIRATION=1558445401115; RAIL_DEVICEID=ojOchhXouyQKkRIDOIOEYE223_WcKcaOuF-_z82P-CYHNuKQOQA6fkynsTMigwJkqEHRabHNmpVRc0I8wVMQioy8eY2wYFbmATsvNP5SRPVofNqBITahBMUmcv5zPO3WcdwpO4jr6MtgbmqT1knkYn0qBbUShMDp; BIGipServerpool_passport=351076874.50215.0000; route=6f50b51faa11b987e576cdb301e545c4
 
appid=otn
```

 

## 输出

```
{
    "result_message": "用户未登录",
    "result_code": 1
}
```

# /passport/captcha/captcha-image64

## 输入

```
GET /passport/captcha/captcha-image64?login_site=E&module=login&rand=sjrand&1558182497061&callback=jQuery191027188156577876876_1558182495381&_=1558182495382 HTTP/1.1
Host: kyfw.12306.cn
Connection: keep-alive
Accept: text/javascript, application/javascript, application/ecmascript, application/x-ecmascript, */*; q=0.01
X-Requested-With: XMLHttpRequest
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.157 Safari/537.36
Referer: https://kyfw.12306.cn/otn/resources/login.html
Accept-Encoding: gzip, deflate, br
Accept-Language: zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,ja;q=0.6
Cookie: _passport_session=971500cc11f140d7bd3e80620db66af29311; _jc_save_fromStation=%u676D%u5DDE%2CHZH; _jc_save_toStation=%u5B81%u6CE2%2CNGH; _jc_save_wfdc_flag=dc; _jc_save_toDate=2019-05-12; _jc_save_fromDate=2019-05-18; BIGipServerotn=619708938.64545.0000; RAIL_EXPIRATION=1558445401115; RAIL_DEVICEID=ojOchhXouyQKkRIDOIOEYE223_WcKcaOuF-_z82P-CYHNuKQOQA6fkynsTMigwJkqEHRabHNmpVRc0I8wVMQioy8eY2wYFbmATsvNP5SRPVofNqBITahBMUmcv5zPO3WcdwpO4jr6MtgbmqT1knkYn0qBbUShMDp; BIGipServerpool_passport=351076874.50215.0000; route=6f50b51faa11b987e576cdb301e545c4
 
 
```

 

## 输出

```
/**/
jQuery191027188156577876876_1558182495381({
    "image": "/9j/4AAQSkZJRgABAgAAAQABAAD/2wBDAAgGBgcGBQgHBwcJCQgKDBQNDAsLDBkSEw8UHRofHh0aHBwgJC4nICIsIxwcKDcpLDAxNDQ0Hyc5PTgyPC4zNDL/2wBDAQkJCQwLDBgNDRgyIRwhMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjL/wAARCAC+ASUDASIAAhEBAxEB/8QAHwAAAQUBAQEBAQEAAAAAAAAAAAECAwQFBgcICQoL/8QAtRAAAgEDAwIEAwUFBAQAAAF9AQIDAAQRBRIhMUEGE1FhByJxFDKBkaEII0KxwRVS0fAkM2JyggkKFhcYGRolJicoKSo0NTY3ODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqDhIWGh4iJipKTlJWWl5iZmqKjpKWmp6ipqrKztLW2t7i5usLDxMXGx8jJytLT1NXW19jZ2uHi4+Tl5ufo6erx8vP09fb3+Pn6/8QAHwEAAwEBAQEBAQEBAQAAAAAAAAECAwQFBgcICQoL/8QAtREAAgECBAQDBAcFBAQAAQJ3AAECAxEEBSExBhJBUQdhcRMiMoEIFEKRobHBCSMzUvAVYnLRChYkNOEl8RcYGRomJygpKjU2Nzg5OkNERUZHSElKU1RVVldYWVpjZGVmZ2hpanN0dXZ3eHl6goOEhYaHiImKkpOUlZaXmJmaoqOkpaanqKmqsrO0tba3uLm6wsPExcbHyMnK0tPU1dbX2Nna4uPk5ebn6Onq8vP09fb3+Pn6/9oADAMBAAIRAxEAPwD3+ivPNS1bUJdPlW2XWIJZ550EExgZ4mwMplZDkA5IIJwGA7Vd8P63d2Wi39zqC3k32C3VmR9gYkKSQPmJyeMZxQB21FcPqV14igvb/Vfs2qWlklsh8qKS1fGzeWbDk9iOnpU+r6tqVsohtdYij2W48w3GiT3DuxGdweJ0QcEcAcEHnsADsaK4Xwrq2p3un6fBd6zHIk1oqjydGuIpQxQYbzndkyPUrg0zXZdR0fxLpVqmq65c2k9rdTTpbpC8i+W0IDAbMkASNkAEnjAoA72iuH1C6iNlpk1tr11d2lxcPula7WDpE+FLoF24YDIIyCMYzxXKXOoapB4f1W4k1PUY5LfT7qaOctcxqZlVygjJkZWA25ywGRt4OTgA9jorh/Eev3507xBFb3OnWwtN0S75mWU/u1bcMdPvcfSpdS8RahBZ6lEtxYNLHps1zHNZuWKMm0DIOR/F+lKTsrl04OpNQW7djs6K8t/te+WGCAXOvLM9zsuws0MsxHkGUeWfuKMEE+2e9Ra/4hktvDVguma1qkEt+gWOC9MJdkZjmV5D90EHAO4AYHTBrneJik3Y9eOSVZTjBSXvPz89dL9vu7Hq9FeZaHrl5LqmnaWNcvCsjeWn76yuOFUthim5uQOp596ojxbq41DUzFqFrK90lwDAWZfsQh+VW64GRljgZJFH1mNr2BZHWcnFSW1+vd+Wmz+63VHrdIzBFLMcADJrlfCN7qRvLzSr69gvUsbe3MVzGrZlDqx3MSxycKOfetfxFf3Gl+Hr6/tjEJLaF5cyglcKCTwCMnit4S5lc8zEUHQqOm3fb7mrr8GY8HxB0SV77dcKEgnFvCASXnfC5AXAwdxKgHrjNdHbX9reW8k8EytFG7o79AGU4Yc+hBH4V5KLi706GytLuS9ki0+CfULoTQJHHK8eTlT94/vHBz0JHHetm30ZrLw1Y6ZNaW0d5qtzDb3E1vOZFuFAMsrNwMFgjA8fxdaowOquvGeiws0dvcm+nUgGKyQzMCeADtyF/HFX9C1Zdc0iHUUt5II5slElI3bc4B4JHPUYPQ15hcatLNHqujz3MSLprMLTyl2CR5JBGkmMYxGSencZPSvQ/tFrF4XgTTtzwGIRwGFioCgdd3YADrQBp29/Dc3t3aRh99qVWQkfLll3AA+uCD+Iq1XmFm+qWui2wtryWO9vGE80wmMgfzvkhJDD5Dll4HZPc16ZECsaqz72UAMxGMn1oAfRRRQAUUUUAFFFFABRRRQAUUUUAFFFFABRRRQAUUUUAcjceD7i91Hzbu8ia1+1y3CxCBG2BlwPvqwYnucDHGO5MOm+FdRi07UrS4i06JNQnRZYl2yp5AGHGBFGpZhkYK4Gc5OMV13nSf8APtL+a/8AxVHnSf8APtL+a/8AxVAHGj4a6KSUfSdEMTNcKSNLgDBH5jIIT7yfdHYjrk1pnT9fjlSdDp80r2EdtOGkeNRIpYllAU8Hd09q3/Ok/wCfaX81/wDiqPOk/wCfaX81/wDiqAOf0jS9atrvSVvVshbWFk9uWgmdmdsRgEqVA/gPfvV670qefxZpeqq0YgtLS6gdSTuLSNCVIGMY/dtnnuOtaXnSf8+0v5r/APFUedJ/z7S/mv8A8VQBla3pd5dyWL6cbeJoJpHk8wsuQ0bqSCvO7LA5rmb7wZr8unaxb29/ZFtRsZrRlmUYJdSAxcJv4yepI56V3fnSf8+0v5r/APFUedJ/z7S/mv8A8VQBla54ftdR0nUYoLO1+1XUbDzHjGS5AAJOM9AOfam6z4ehvdHvrawhtbW6ubdoBN5QGFbGQcdjitfzpP8An2l/Nf8A4qjzpP8An2l/Nf8A4qk1dWZdObpzU47rU51/CVvDqNtLYQW1ta28E2Io02l5nUIGOO23d+dV7jwlNc+GNG00tClzaNbCeVSQSkZ+YKcdeTjIrqvOk/59pfzX/wCKo86T/n2l/Nf/AIqo9jDU6lmGIXK+bVf8H/NnJQ+ELyDxVZXqXIawtHZ182YvIxKFcbdoA5J5yah03wjq9nqtvcT3NhNbQm82whGyPOOQCf4h69Mds12fnSf8+0v5r/8AFUedJ/z7S/mv/wAVU+wh/X9eRbzTENWdtrbev4+8zB8MaFeaXdX91erZRPcLDFHBZbvLjSMEDBYA5O41tX+m2WqQrFfW0dxGrBgkgyM+uKk86T/n2l/Nf/iqPOk/59pfzX/4qtIxUVZHJXrSrzdSe+n4KxkX3hSwvYNQVjIJb4BZZS247QQdoz0XjpVW88Jg3UZ0x7fT7aJHMUcEIXbI/wArPgcZ25H1NdD50n/PtL+a/wDxVHnSf8+0v5r/APFVRkc5qHw+0LUpYHuIZMQ25twEfblT3Pqev510EWn2sOnJp8cKrapGIlj7bcYxT/Ok/wCfaX81/wDiqPOk/wCfaX81/wDiqAKtxo1lPpxsREIosLtaLCspXG1gfUYGKfpmn/2bamA3U90xcuZZyC7E+uAB+QFT+dJ/z7S/mv8A8VR50n/PtL+a/wDxVAE1FQ+dJ/z7S/mv/wAVR50n/PtL+a//ABVAE1FQ+dJ/z7S/mv8A8VR50n/PtL+a/wDxVAE1FQ+dJ/z7S/mv/wAVR50n/PtL+a//ABVAE1FQ+dJ/z7S/mv8A8VR50n/PtL+a/wDxVAE1FQ+dJ/z7S/mv/wAVR50n/PtL+a//ABVAE1FQ+dJ/z7S/mv8A8VR50n/PtL+a/wDxVAE1FQ+dJ/z7S/mv/wAVR50n/PtL+a//ABVAE1FQ+dJ/z7S/mv8A8VRQBNRSGkoAdRTc1znjGeeHTIPJnlh3TAM8cjKcYPdTmnFczsJu2p0tFfPWmavrz+I7zT38Q6jsgZY0L3kh4ZjknJ5IwOe3StTS7zXZ7a3Zta1Flfc7l7xwWO4AAZYYCjkjPTPfitXRaVzP2que40V5/wDDTWNS1N9ai1C9Ny0MyOMsSU3g5Xk8AbRgcfTmu+rJqzsaJ3HUU2nUhhRRRQAUUUUAFFFFABRRRQAUUGk70ALRSU3eBjJAz70APopu4Z6/rS5pBcWikBpaYBRUF5cx2VlPdTHEUMbSOfQAZP8AKsbxhdz2WkxSQSyRsZwpKMVJG1uMj8KaV3YTdlc6CivJDrupyaymNQu9ifOUEzBSeAqkZ5GVz+J9albWtQIOdRuRkcYnfPB/+tV+zfcx9uux6tRXmJ1y8mtkU392jKTl1kI49+eaq2uvX6a/aiXUbprdUDspmYhsnnIz7frR7Nj9sux6xRXAXutXK6rNJHeSCGcKEX7RgQ/dySAcA8HqR1o1bU54y32bU5WB2L8srDlRg4+uc5/nQqcmHtkd/RXnVrr08UVws13cs5UCMeYSc5BPfjgGtfRteiw32q8cttwFdicHJ/8ArUOm0CrRZ11FFFZmwh6UlKaa2ccdaAIrq4htLd555UiiTlndgoA9ya4HxL4kGtWa2lhp1zJbvvZL10+QMAwGEwWIzkcgeoBHNQ61cP4o1FSZC2mQNiGHO3zGA/1hHU5B49B9ant7C3tYm2BVPUjB+c4x1HOcD9Oo61tCNrMylPoeWiCHT5XmjuXeZIC7lrZofOYkZ+VlAzwwAGMH6VoeGLTxDq8KvDYRpGCWDTLIqYJwcEpg8jnaSc+ldP4m8QWPh+1L3kK3ssw/cWLYIC92cnPHGPf8yPNbTxhq/iTxTBDqmo3Zt5C6eTbDaoJVtvyA4IB253ZOB1HUV7TVor6vOybW+x7n4Gsj4e0ue1umJZ5BMs5jIMgYDsTuGDnr3ycc4HZRSpMm6N1dfUGvljxDq0tvrUUemS+W9v8AKZE4Lv3ORyOnauo8M/Eq80jUIbbU52mtycee/wB5M/3v7w6cnnnNYr372OnEYaWGsp9T6Cp1UtOvo9QtEuIzww5Gc4NXGIAyTgCpMRaKyp9ctI3KIzSuM8J/j0FUYvFMVzczQWyxyzQbfNiE43x7hldygErkDjPvT5WK50dFcX4q8W6lpWgyXGmWMcmpbv3NtKCwlwCzAYIOQiu3fO3ABJFXPB/ia41zw/a3mrQQ2N5MpZoFdsAZwOWAwT125OP5FmF0dRRTQwPQ0Z9x+dIY6ikzS0AFMd8YA6k+lJM+yPPU9APU1ha/4itvD9tG85DzSnAXdjOByR6/7o5OOMms6lSME2xN2Rp3V5FbQvJcTKioAWAPQZwK4rVfiPptisYFvNtlh85N2EJ+gP4+x2kDOCRwT6ldaxqsOoPLm9gcCSNZfMKuHdcP5fCoBkk/MVGMehoWsn2LRrS2G60RJFKXTviH5kYLKAC2DlQrcFTtxgN97zKmKnPSJjKTZ2MvjLUCksxtJEQuBFKOVwdoySO2d/zcAhOO9X9P8ft5oXzH5JAinjYN1wRyOoyucHuPeuEhiKS2z+dCssziGKWBS8csbBQhbCuocBGwQSd/bGCK+pTyPp0nnW9o87qlzJKqqrljkbwBlcELjHHJXGGwDzqtUTWpKbWp73o+vWWrx5hlXzO6bua1q+dtKv73RtTe5t2uDZl5ViDRsGhCNnLcAD5T0xwM5AwDXuXh7Wota09J1I37QSAcjBHBB7ivTw+J53yy3NoyvuX760iv7GeznBaG4jaKQA4JVhg89utUPEbFbK3w2CbhQM9DweDWvWdraGSyQBtv7wHOxW7HswIrqd2tCnsed262a3dxJIqZkkCoX5yAoHfvnNXWSA7iyxDPBJjTn05wfWrixRRXaedJG0x3CMPu2sMDP7vO0d+3vVG/sNdl1JPso02K2MYLRtIybSSR0CYY49Twa56lVw3Y6eF9pr0BLO3YYLF1/unkcd+MVUs47VtSuo0tfNDSEO7n5YwFX39WA4BP5VuWEUU2lwTX+nwQ3DgsyK7YA3cHI4zjB/GqkhtY93l6dEJfM2nbO6/Ly3XPXjmtIzajzNmboNS5UQy6WqSkM0YxjGFwOeQeue/oKelnCE2sHb3zjFasVnYzIBDvCYyNrjkHkdRx1pZ9N2L/AKNHIznoJX+X9Bk/Sq5qnQn2VnYwpdOTLbFRQOctJgD9KsrpqyRQqJpAV/dgKueSxI5OB3P5VYv7NHtGtnkKSSIc7Bk5wTkKT7HAz2rldV1a3h0qWyu7GK7sw8KS784ByArudpCDJ6k9Qe1RPEOn8RvQwcqj0R7RRRRW4hDWD4vvVs/Ds6mQI1yy26577zg/+O7j+FbxrkviCv8AxJbaQnakd0GZiCQMo6jp7kU47kydkU7dERUjXGEUAEdM9/1yfxqvrN3BpunTXc/McaF2XuQOw9+w96q2eopKzGORHG4g+WRx+HUd+tY3jS9sZNGuEvb020bRlI/3TOZJPvKmF6Z9emBjvW8tNWZQTnK0Vdnl13qs3iCW4u7vBuZGy2OVHoB7AcCs/Tbu3029uZwN90YtkJOCATgH6HGeazJgylmVygIxgDr/AJNaOmRRpY78P++JDbTgkenHUZHSuGpLW8T6/Cuc4RhUhZxCxguLq5eZbeecRjLFIy2GOcZ/WlvLO8t543vIWhWQ/Lu7/pxV2z1G70/7QluXzI21mTknb2J9t2M/4VVv5b++KtMWwDkbjToyklaKMMfhKNSTqTn02PZPgx4ja7tH0yaTLwjy1U8nA+Zfw++Pwr0Lxjq0Oh+GZ9QuGZIUlhSR1ONoeVEycdhuyfbNeMfBZDH4qmweH2/+gSV2H7QNzeW3w9txaTzRedqCRS+U7LvjMUuVbHVTxweOldEtGj526fwlOw1j7LcTWl58s6yMyuT8sqE5VlI4Ix6f41S8G6isHiTxNNIIwk1yhR1wSSFPB9xxx7msT4V2MfiXw1e2F1qKF7Ax+R5w2yIHBGwPz8mQuPvDrlRxWtrfh3WtD8yWS2+0WyZZpo3WM4yACQTsJbjA3KeB8o6VqpJmeqZY+IXjMaUNGNlO0c5ud4kSVlxtK43DoV5Ocg5HHfI6+z8uHSbS2kdfNihRHO7PzYAPpnkeg/AV5g+oeXuS7We3KbXK3Ns6gccHftKfjk/X0vw6+qRhxqVkVI4P2uPp/wB9c07CczmNT8P+MNCmupWjl1gFisFxHEJ2bduHzJneCPUAhT0PArl7Pxz4pFyLO31CS0kJK7fOePB9Pvde2K9ZtfE8l05jsoHu5AOkJ3rx6sOB+dc74js11C4WGwsmv/EKXIvrhrG2+0GFFXYkTsqnggKSvIyCe4zE4dS0yO30j43XcKTwy6r5bgkB79Yj36o7hh+Qrq/hR4p8XN411Dwt4kuPtLW0BkdXkWWSFwV/jUnI+bBBJweOOQcgxfGPXbSJ4Ib63ic8GSdbZgPdcq3c12fwz+Gt94V1XUda1q9jutWvAyny3ZhtZg7MxbksWH6Hk54ysUemzMiRl3Kqq8lm6D3rwfxLqLarqupQyK6c3D27yu4MimIqyBdoViMjjJPAA6mvY/Fdz9l8N3khj3qV2sMAgA8ZIJGRXg0osLmJpXkufLumZpoYd8YyWZzGikmNnXygAM5JfIyVFeZjZXkomVR9CTUEjEEqTuFM0biGKSJopAhnypZtqhDhPlVhgEHGM4qR8xC4up3BeQSM68xMSfM3tmMkKHEADbmbJZmBHDGpHdynQ7YeaZJWEqxLDMTHtUeSzBXXAGJHY4O3Cc4ySdZY2W3Pk24dQPMhjjtlHlhRuVGUKSCGIOBnesrEEliK4ndaGZUu41hSMtMJoViEmJ4s9AJfndWX5ipIwQzHLEABhhbMTzXOooZY0sUhdURgjwkLvYBkLZyu0kE7sqFBBBrOtluYojHEZ90LLJ5rA/aYQyxhpACVMihdyEYwMjnhas2E6XU93crDA11uMpltriPZHKiOB8rMveMspxjD4bdkUctloImvreW38zTGtYpHuIliIYskplU8Zc9dybtjYBK8HOBXS/C7VrmC6W1njxFwkcyKAki4Dc/7XzL68dcEViz2Udxam2uIXheGQLCQ2WtQSEIYMAZAJMxqwzg56Ec3fCoEWroBtBkgjl2gAdcgfwrg7VU4AxznuKUJuLi+pSke5A5/Ks/Wf+PJf98cYz2NXYv9Wp9hXCfGA3sPgyG8stQubE2l9FNI9uu5mTDKVxkBhlgcE4OOa9675bo6VqYni20vruVHspBGYhgybsMpyckc+h/z0rKvdWuIbmyee8ZZbSMEyBerY+6MjGSD3xj8MHH0XxRZ+Kba7ffLb3Vt8zO4Q+YrtsHGMHJdV6cFx90AYtwzwGWNJ74CFl2gSOGVj3XB+8xyPcd8V4OIjUU7yR9PhHSdNQjtEvNpuoeJZIYbtobkxQs8XyxhoQRwPu5zkEArwdueMcbt5HFf6bd+aqNEsIZl3lVYfeO4cEDAxg9fmBGKqeGNdtLC8vW1EJBZxKEXKADYxxnA4/hHAHU++Kr+JNWkjha3lsUOlrMyQzL8yOrq2BgHOfX3B9jXZSco0+boclTDupX5Ix9Ctp3iOPQ4FeHy/sEjOltFO7MVYKX4OB8gz0znGewroLrxjqEmnXN9D/ZYhijeVE3OJHCqp2gHGTkONxAxkfLwa5TR9LGuaaLUb4dPs04nJDAv0VQPlBY5GOo+6TnPOvdvLfazHHZhI7aaFFwQQfvNngnAOT/IY+Wrp1pxhdGVfDU1V5JpLQwtZ8T6z4v0WPVbG2tbe1gttxilhFw80gYlgA0YA4RcEKOSOc42zWsMGt20Ca1cR2cOpAPc7ogxV3OeSx/djIAHXll9yJ9Y0mUzLDNfwqm4RGGEknGTyrkFugHBJ5DemTs6nakaXZX6yy7WZ4ZHjRWI5PDE4OSBnjnjrzWFXEtyu1tubU6EYR5Yv4tD1iiiivYPCENZfiHTf7Y0K7sA21pkwhJwAw5Un8QK1D0pKNgtc+a5b640++eCUGOVDtZVblWxyPY57HkYOcdK6DTdKXx1BFYz6g0Li4Lh/K3cBDgYyMdSM+1dv48+H9v4kH26znisdRRfnkYfu5VAwN+OmMfeweBj0x5ZoerS+FNdWG6ns9kh/wBdb3Mc0ZZWO0llJ2jOQQ2ODziunnU42ZjTlKlUU4vVHeSfBbwzHbifUNQvmSEF5SJEjjIA5z8uQPxryLTNPXUtS1OSwC6fpcAeeBZGkYpz+7iDA5LE4ySeAGbtXp/xH+Iu7w7caRbWs0Mt6vlNKzjhTjeFAByCMrnI6+orgtC04x6eHZQHm+ZsenYdenf8a5PZXly2Pahi6kaTxE5Xk9EYUF4be7KyxCNd2wovATnp17fnzkk5ybl3CNpYfgRzn0qzruiSXAE9uB5o4bPGR659v5Zp/hywn8Q3S2dtDI0SkKjjq3b6Ank+grSjFwk4s58fWpYqEa8fi6o734M6Puup9RKcJnBD9z8qjH08z8xWl+0LcLB8OIUMKSNNqESKzDJjOx23D3wpX6Ma7zwzokWgaPHYxkFx80jA8FsY49BgAD6eua4b9oGwnvPhuk0SBktL+KabLYwhV48j/gTr/PtRJ3ZwwVkafwb0KPSPhvpkr2scV3eIbiV1HMgZiUJ/4BtroPGsn2PwZrd7E7RzwWM8sbIxU7xG2DxjnIH5A9hVzw3bQWPhnSrO2nWeC3tIoY5VIIdVQAHP0FcX8cNSSx+GWoRecY5Lpo4YwD98lwWH/fKtU2KPKfgtYNqutXYt7m4toYoAsyb96M7uSGUdFwqgYOSeTkZwPcW8EaRAsk8yy3TEZHnSkDd2Py4xXmvwDsDBo013JGAZ7ksjj+JQAv8AMNXq/inVYdM0e4uZ2IihieRyOSFUEnH5VrrojN2PM9X1VtP8La74rhQ+XA72VhaTyedGrJN5fnncPv7gcDJAwPU49H8E6BBo+iR3ElmsOrahHHc6k55aS4K5fPoNxbCj5Rk4HNeQ+JLAT6D4F8HXCTLNf3kLXix8n1mY++XLfhmvoMZzU1FZ2KiGAfSjAzmloqCjM8QLO2jzG2JEi/OMdeOeODzx6HPSvAZreyRLi2us281vOWjuI2ZuWG5NrtGOGC7fnbPfHy19HS42gHoTivF/FmiHStfJS6WN7hW8ljlUWXlomKjBG07ySAwPcc15mOg+ZTRlUXU5a0kcBQz28apqLRwSzjEWGyHkSTBAO5R93P3gDkEEak3k3SMlzNDAsqSRNDtP7xyp80j5VHm71RdgYAsOg5AybRTb3E9xYSuLff5chmmkiUl0UDay5IKnO7PB4OAOKs30s7izR0u1hvykhdAWkWf5+UKY3MGkJ752AEnkVwy1ZjuPGnKIoY5I5ZCluwVEPM5V9w35QZDOoUOpVj8qnGMjKm1q5NveRNe2k01s3zx3kZxKEZAAoLMhYCPJHA/eN1IFdTNHbzxebcyO0kZRzdqhjL4MrnG1iMuib8bWUkjgMc1z8rRErZS3whhglhkkCSs25SkKrJGzFWIJcMQSOBwVI5qEhrQkNu9ysU1msggXY6bGQAiZVCxZkbbkfNl1HzHlgDgjpPCrwanrVq1vEiMHlGYgjqqllwowq7eBkZAO3Aye3LNN9n1lojLLa3czlbyaASuoZxIWc/PhsB4+wzuPTnPr/gnSWVZNRmge3kunMzQuxbazY34yT1YdRgHrjsNKdNzmkC1O1jGFA9q5T4h6laaZo1lNeQxSxverGPNhEoUlH5APfAIH1rrRXD/FXT31HwvbRxhi8d6kgC9SQjj+tetV0pux6GFSdWKlsed29xogaa5sNPWx1GRZI2uElkQqP4vkzjqQQOgKgjoKq6XpEst8luHjDkGNTIoMbrg4w+CQQfTnn8aybjT7u3CmRVZpVlVXztJLDB4x047DvXT6Xo+ti0j1KzsUuLcQhsRSAyvIOpABzkDpgZzjjuPOp05VKnK5HvVqkMPQcoLVnT+KNNtbLTbfcILSxJb7QVXIzjPUDvtwCeckADJFYt/YeHJNBazt/EUMmJhc+XeswMp2kEHbtO3lcYXjHGc8W59auNe06ay1CyuEdsQPG0DBldlO0EbSN2CCOvJHcZHma6Hqn297E6ZeSXKAyNFDCZGKjHIx1HIGR1z1PFdtWg4z5lqmjLK5RrxbnU5WjdfVnv8Aw4to9mg0q12h5HbDCTcWA2Z56c9c8nI4NXtP1OEXMJk43RbTKy4jUnDKMt/FlPQHhtvY1ral4SvfMtZ5rjSNJ+cLLFcSrGGjxkbducspJHX17YNZY8C2enX8l+fGlkYMfPHbwgsem1disQRgt2P41y+z97mWlhzqwnR5N230Qmo3SkWMFoFkQYWSK3ibLhsbdvAAAOcc+gxxite6+TwXcaTLKsDaXchlmySVd/mGTxwPMx3zjqeazdDu/D+kanLB/Z8kkJYNHds23YF5GUYtg4wSyY3ZHyrxWoddnS5vX06FfMmnaZLniQugON2MYBGMdMY6knNJSXK4t3ZPLapaMbLsz2WiiivUPBEPSmnpzTzzSYoA5TxP4KtPF1zCdRvrpbWBDsghKrhz1Ykg5OMDHbHuaSw+HPhPTmEiaNbzS7Npa6Blz74bKj8AK6zbTJYzJE6LIY2KkB1AypPcZ4p3YrHF+K/Buk3tqHYWtui8BJsLHnttJ+7XC/2JtuCsNyTztA2BufTIODXqSeD9Oa5e5vXuL64kwWknfHI9lAGPbGK2beytrRSttBFCp6iNAv8AKtIzUSZRbVrnkMXhDV74PGbKRoT8jvMnkj34J3Ee4FdDpXw7ubIRj+1Ws0UlWisV25U88PxjJ5PGK9D20baTqNjUUjn9G8I6XoUwuLUTtc4KtNJM2XB7EDCn8q1tU0+31XS7rT7td1vdRNDKoJGVYEHkdODVrFLjPWsyjwm08Y+IvhJdR+HvEOnyapo0eEsr63GH8oA8AHhyBgFcgr3ONueU+KXxR0fxzoNvp+n219DJFdLPm5RACoR14IY8/N+lfTF9YWmpWclpe2sFzbyY3wzxh0bByMqeDyAa8z1v4A+E9Ulea0mvtPkK8LHL5ibvUh8se3Rh0p3A5z4XeL/C2j+H7Kwl1iCGaOINILgmLDMSzAMwAOCT0NT+OPiP4a1GGTS4tWilWYrFM0asyiIn958ygjJXcBjPJHbJEH/DNoH3PFewdwNPPP1/e11Phz4F+FtEuY7u88zU7hFxtnAEO7Od2zk5+rEVXP2J5RPBukz+I/EkHjO8glgsbaBotJilyHffkPcFf4VZflUHqMtgcV6cvWlA4xxS4qW23djSsFFFFIYjAFSDWD4h0ltRsQkRxcqRsY9GGckHkZ6Z69QK36a6K67WAI61nUpqpFxlsJq54zr/AIduNLS7gbzGjlh2xqULiKNDI4IyTkgsuST0bng1zzxu1qbW2lKyx2xlBgLFEbzI33ff+VcIPlx8gG4D5gK+gmtY5BiRVkA6b1zXM3Pw+0meaaSPMPmx+UQqKRtJOR7ggkYPbGOQCPNngZw0p6oxdJr4Tya+a4h1G5EwdoJrhrYKtow8tSGC7drKzKVuG2r/ABCMcAcK57Vr3TLUx3jKs1qPOVYX5eZkBYA4CINoxtO0mPbgdD60ngSwS5EnnzGPOfLz75xnuv8AsnIHbHe9pnhq30ied7N9iSIqqrKWwQMZJJyTgAdun5THCVm/eVhezkcPoPg2+1DdL4iFxHIroYVEuRgcgABjgqdwDcEhjnPb06CJYkCgdKEgZeWcM2eG29B6dfpUoGK9Chh40lpuaxgkwrzr40X9/pvhCyudOZllXUE3FVB+Xy5OoJHfFejVk+ItBh8RaclnOYwiyrJ88e/pnpyMHBPNdHqWfNr69e61pYuXSSWWKXZIFUc4AOcY4HB7+nSr2k+JdQsIVe2nZFYAsueCeD7/AORXrsXws0yAuYJVjDxhGAjbDEADJG/k8cnqeeeTUD/CDR2WQpcSRStwGQNge+0scn3rjq4bmd4nqYHHqlH2dVXRxsPxG1XyBGs6oy/dOAcc89R70jeOtdZWB1Lgrhh5SK2DnocdK6mH4NWazFptauTEc/LFEqnk56tu/QZ96jb4NIJmaLX5VjySitbBiBnjJ3DPHsKxeGrdGd8cbl99Y/gcHJcNds9xPNJLIeWkkfJYDGTknnHH5e1RxsLmUQp8q8ht7cLxyTxz/wDqr06D4UWsRjZ9Vmd0IwNhCYzlht3Hgjgjp7GrkHw+lglDLq0O0D+GwVW7Z5Dd8elQsDJu8ncipnSjpSiedWGiyToCZNg3EE7T/iMVcl8NT2oXUNIlV5gFaRGZQHyMZAPVgGPUdyfr6GPBU3niU6qMjOAtqF6+uG5/Gq83w9Mruw1iVdxPymAEc9c8810Qw/KrWPNrY6rVd5P5HbUUUV2nCef/ABf1qXQvCdpcw31xZs98kfmQOysQY5DjIPTj9K8di8eX0jBf+Ep1bJ9J5T/WvWvjXY21/wCDbOG6+4NQRh82OfLkH9a+cta0aPTIop7ecCNmKtvYEg9RgD6VtB+6Zy3PQF8V37Ln/hMNQX3N24/QtU1j4j1C+1e206Pxfqsk07Y2wzuxXvk4fAH+cVjeD/CFvMJP7Wd3k2qyxKSAAfWvRNL0rTtKLmytUid/vOBlm+p61VxLzNS0tbmH/Wa1rFw3/TS/lH6Aisqe61RvEJxrepQyKz+XE144i2R+U4yueS22QZPXdjsc66yjGK5/VdKjvNWjuXBYsMH0FLco7iO+vHjVjc3AJGTmU8H/ADj9azb3VZ5tXh0131ILLGZPPinkjVccYJVhz0z9R6miO4xEqE5IUAknrVEs66sZQzBDHjgDjp/hUspNIoavp/iCNTLpviPVemTDLeScZ9Dn+ldn8Sr+707w5bzWdzLbyNdqheJypIKPkZH0z+Fc7d3DCBigyCOvb8K1/i2+zwnbE9DeoP8Axx6mpsgjucxo0+s6pGZX8RXsCq23Blkbt/vfWtqDS9SkJLeKr9lzwFmdD+RJNcv4MudzXMBByVV8/Tj+tdtEBuFcspM1ETRriSTaviDWiQef9LOKwvE2pXGglYLXVdQmuz82ZL2TCL1JIzg/TBrtEkWytXc9FUsx45AGe9eMX15Jq1/NfSM255CQYyTtGSFH3eP/AK4oTYwTxbr6GUSavqGV5BWeQ4HQcDP6+vJyKuxeKtXkCN/bV8Qy8bbo/TI+Y+lc8pTypiyq6dQEO9mfBHfr14GO+ODk1XsYZ08p5JgFZivJJGM4/EAnruxipaZSaOtu9T1m7tlX+39SiI5jlivZE56888jsc1gL4i8U2/7q61rVo5EJQhruTLYOc53c9QPwHWti1bzc5xhuQM9ef8fp/hma/bbPJuFTGfkc4646f1/Kqg2Q0uY+j7suI12OVO7qKro8gzulJqxdf6of71VhXQZEwdj/ABH86UM394/nTBSigB+5v7x/Ojc3qfzpuaUGkA7cfU/nSbz6n86QmkpgO3n1P51YqpUl3dJZxCSQMQTj5aTAnpD0rFm8S2saE7WQ5ADSkIm4nABbPGSQM81T0DX7q58O20uphDqjod0UKHazFiFAwSBnjnPvx2nmQynoN9daj8RPEB+1TtZWiRwJCZCYw5xkhemcqfzrs68x+EqTKusXF1eGd57khZBJuWbaSCwJUMfqT0Ir00HNNMBaKKKYBRRRQAUUUUAedfGfSodY8HWtvMzqFv0cFDyD5cg9Pevn658D3bYWG/WRV+6JVxj9f6V9K/EmPzPDtuP+ntT/AOOPXmAtSe351tBJxJa1Ibcm4dJsEXCDa+z+IDvXR2ckcy4+2Rq/dZflx/jXNXnmWghkjYrlgpPHv610Fi9xPApZIZh/tpz+eKZPU1TZ3ATeoSRfVG4qq0xRtro4P04p8tja7AfsMaN3wT/jWa6wrJgQL9NlAzdt4YHXdPqMEK+m4FvyOM1aWPTiMWcNzqEnTzGBWMH3yBj8jVbS7bdtMMUK+rPGCfwrcuoJjbnzbqQgD7q/KP8AGl1GjldUuorOGa6v7iBEiOGRW+VDjox65xjitT413P2bwbaH+/fqufQ+VIR+oFcP8QvDM3iKC2MFyIzaswAkXcpBA/X5RXdfGi2iuvB1oksgQC/UgkZGfKkHP4E1nWlZXYRdtTz3whdNHrMShgEdSGz3HYfnXpkBHyc5HvXkWkpJp9zaTn5gmx8kfexg/wA69VEhj4HT8655WvdG0R/iS7ceH74QsBJ5LBee+K8ctriSOWOJTvk3bWDnhDkqTj8B+Veq6pvuNMuo0ALNG2B6nHFedjSo7u9juNjrIhDLlyeck8456kCiAMp267ozwVd2DEBgwG4Hg44ADZ/BqnMQa4YiZgyqeBHlmJyHxj+vbuByNJLS2QOA6lEGd2chcZB/Xt9O9NKxShWeTem1ij9SynuDznOT044x81VJAmW7JWEkS7cAcYDZx9fU0mv26DSpSxI2MGyT74/9mq5pUJdom+9/tdm9/Y+op+v28tzpFxDBB50jkAKSB0IPc+1RqtUJs9ouv9UP96qoNWrv/VD/AHqqD2610X0IJAacDUTyJECzsqKO7GkW5haFpVmQxgZLhgQKh1YxerHyyeqRPRWP/biyNmFRs7ZPX9a5H4g+Ib60trNLd5ILaUlZGRuWbj5ffAyevP4VwwzPDzk4xd2XVpTpw5mj0F7q3SKSVp41jhBaVywwgHJye3HrXl+o/Ge2j1YW+mWaXFqrFTNJIVL8cEDtyDxyT3wRiuRt9aLSPGHI3KyNtY8qRz/hg+tecajALTWLm2tnJRZPlYH+Htk+3T8K6adfndrHnOrKatE9g8QfEa81aaJLR3srbYN8SksWb3bAOO3+cD2PW9v2JN3TzB/I18v6PpOoXqK6ksqjGDxx7V9U3yq8ADxrIu7kH+ld1eSdKKXn+heHU9XM4+/sTe2E9sjIRKhX5gT/ACqhd2w07Skhjtp5EQFP9HG513IVLgd+T07810k1tZg5Ekluf7rDIqhc2kdwnlNcQyDORiUxsDjGcgjHWuKx0lDSrVbcyxBPLtfNkMMQQAIpdmx09z+nTpWul3cWwzBMdi4+RjuXHf6VFDay20CRJbuyKMBi29iPUsSSfxpDkHLWr/iM0AJqPj+z0V7eG/tbqSacHaLVQ/A9iR69t1aum+LNK1WVIbeSfzmIXy3tpFIOCeu3HbqDiuc1XSLPWrbyb/TPPQcqWBBXkHhhgjOB3HvXk/i231vwJeQXOm6nO1q7YUTMGeJgPuk/njGOn4nWLTFdn0jDdwXKs1vPHKqttYowbB9OKmB96+XrX4ya1EFF/BFeBHDr5hDBSO4DZwfxFb2n/GswuiG4u4QqnK3KCdCTzknPmH8GAq+ULs+hKKKKko5nxzH5uiwr/wBPKn/x1q4EWftXpPiePzdNjX/psD+jVyos/atIvQVjjtfsmGlmRRzG6t/T+tWdCmBiUe1burWO7Rb0bckQOw47gEiuN0G4kVFAww6YJweKsh7naM+Yqw7hsTH61fF1+6+eKVfbbn+WayLi4UyEgSD6xt/hQM6nRJfmGa37n54D9K4/SLsqRshlkPoowf1wK6SSS6eE/LHGnqTuP5YwP1pMaOd1TaIZN2BnpXSfE3RYtd8OWtrNIyRpeLKSo5OEcYH51zN9GNkhJLN6nr+nFdz4xIGkRZx/rx1/3WqKq0CO55lpvhyy0+1e2zLJGzb8TPnb9MYx+VdKmDCuBgY/lVFWUDhhj61btWDR4GODiueS0N0Vp5/JkZW+6etcjqUU1veSKCsdsG3BhgDbjnJPbJ2/hXUaupUKw7j09K5PUtTt7ULFfzxwITuSVjypH+zn5h6gVnGTvYpxQ+PPkGPGYyMMuRhh9enc47c4qlpul3K6qLYbjp6jIYuQ0ZwAVxwDk5OMH3OeTtWum+ckci3cUsDAkNHjDA/3WDe1bFtZQ20QRVVY1GAo4/PitGzOxJZ26wxKwUhcfIPb1/nUNxKolwTyO9N1DUngUx28QlmI6fwr7n0+lZsFvcA5lYvIeWPSgD1Xxh4htvDWire3KO4eURRqvdyrEZPYcH1ribT4mmWTc9mhiZhtRHO9RxnqPm4+ner3xrx/whtnnp/aKcHv+7krxuxumXAJbYFzt38cfyH05pzlJPQ+gyrBYatRvVWrPVb/AMSf2xdeZbyMsQwERhtKnHIIzjr39vzkGov9jkCONzIRnHX61xGimfypHEZYNId2M4OMDgH6V0dss85KRwsA/Dbx1r5XFYetKu2up2zhhqceVdDQiunAxCdvqPcDnNZHjJJ9Y0q1toFLXCSiYqOMjBAH/jxrp4fDzuFMfmK/U7TWjY+G2ik3ydT1Zjya6MLllSNVSZ5OMxNGpTcEjxuz0DUZJ/8Aj3kV84ycEL9DXa6N8NrGcrLPar5mdzybMc16Zb2MFuvyxqW/vHmrGAOlfR06ShqeDGnGOxzln4PtLM4jkwnsBmum1WZIbZHeTYvmAZ257Gmg1D4h/wCQen/XUfyNXPYtaGbcX0SjDXFu6kd3xgfU5A/Osqe3spmDtDIgP8cfKn8ctn9KpXmCDmsUxkTb0JVv7ynBrEls67T0gjz5eoOuOMbsfzIrZW4YLxdSN7gKf/Zq4y081lJeUuSMZdiTVr7PKFyszAUDTOjupGeMnz5CvcMyp+ua4DxVb6XeWpjvDFNBGQ+0E/KR33fiavXm+NTmVj7msjWUWPwpqq45NnKSCf8AYNNbiueFX/2b+0Z1t1ZE8xhGozkLk4wT17Vnym4hbHk4TqOM/rWhaNd/ao47ETfaZXCxpADvdjwAAOSScDFdgvw68fpp0Vy2gzvBjzQrmJ5MEZ5QnfnnlcDHpW4z6woooqSihq0fm2qL/tg/oayBae1dFNH5iAe+ahFqKdwMRrFZI2jdcowww9q8jj0650PUpbC7QiSJsBsHDr2Yex6/oeRXvItgKo6r4fsNYtxFdx5K58uRThk+h/p0pqVhNXPNIZcx8Vm3jfOa6658D6rbMfsFxbXUfYTbonHtwCD9eKw7jwr4ldiBo0h91uIiP1etFJE6i6LJiQY9a6xm3W+M4GOa5/S/C3iOOT5tPjhx3luFx/47uP6V1Fv4av5owL6/jiTvHaJ83/fbf/Eg0m1uCOdFlNqN2ba3TLtwSMkL7n0rq/Gn/IHh4/5eF/8AQWrXsdOtdPiMVtEqKeW53En1JPJ/GsfxsQNGhJGf9IX/ANBas5yuXFWOI27hj9BUckUwX91PJEQc5TH9eKcJB2zj6UBWfkNWdi7mLfWmoXIKzaxdMvYLHEpX6FVBrLXwtaRuWWEtIeTLLlmJ9yea66S2WePyzI/JHKnB6+tLHZpGmE3YBxnduz+JqeULnL22hXNs4aC7kgG7cQjHB4x06Ht19K2FspXjVbi7nlIOc7ih+nyY4rT8tVLHkY9aQpk/UmnyhcqW9rHbRIkahVXOPapMjoBnFTMoC8cGmJ1FOwjrPiVp51Pw7bW46G8Un6bHry+DwTMJMfMyN1yOte5avbpc20aydFkDfof8aqpHGoAVAAPalKnzO510cXKlT5UcvoHhhbe2AkXavuOtdDHpFtGcqDVwUtONJIwnWlJ3YqIsYwoxTiaaDRmtNjFsUmkzTSaTNAh+6meIv+Qen/XUfyNJmjxGcacn/XUfyNKWwHE3rcVljl6vXrHdVKLl+lYmbNa0X5RVxj8tV7YYUVNKcKaBmXfHLAd813lro9jNotvbXdlDcIYsMk8YfO4cjn6muEWM3WpQQL1dwP1r1EVcBwOf0nwN4Z0TVX1LTtGtbe7bOJFUnZkYOwHhOMj5cda6LAGcDrRRVlhRRRQAUUUUAFFFFABikxS0UAJt5zQBilooAKzdb0kazZpbmbytsgkzs3ZwCMdR61pUUAcivgcLn/iYcf8AXD/7KnHwVxxf44/54/8A2VdZRQBya+Cdpz/aH/kH/wCyp/8AwhvX/T+v/TH/AOyrqaKAOTPgrJydQz/2x/8AsqD4Kz/zEP8AyD/9lXWUUWC5yR8Eg/8AMQ/8g/8A2VMHgXB/5CX/AJA/+yrsKKLBciuIfPjC7tuDnpmoBYY/5af+O1cooAqfYv8App+lL9j/AOmn6VaoouBV+x/7f6UfY/8Ab/SrVFAFT7F/00/8do+w/wDTT/x2rdFO4FP7B/01/wDHaNSsf7Qtlh8zy8Nuztz2I/rVyik9QOWm8GiY/wDH9j/tj/8AZVGngdUOft+f+2P/ANlXW0VPKhWRzyeFggx9sz/2y/8Ar0SeF94x9sx/2y/+vXQ0U+VBZHN2PhJbTUYrt7zzPLOQnlY5+ua6MDFLRRawWsFFFFMYUUUUAQCgDwCxCyKvDwvbLAS/Cw+6AP/ZCgo=",
    "result_message": "生成验证码成功",
    "result_code": "0"
});
```

# /passport/captcha/captcha-check

## 输入

```
GET /passport/captcha/captcha-check?callback=jQuery191027188156577876876_1558182495381&answer=42%2C53%2C122%2C109&rand=sjrand&login_site=E&_=1558182495383 HTTP/1.1
Host: kyfw.12306.cn
Connection: keep-alive
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.157 Safari/537.36
Accept: */*
Referer: https://kyfw.12306.cn/otn/resources/login.html
Accept-Encoding: gzip, deflate, br
Accept-Language: zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,ja;q=0.6
Cookie: _passport_session=971500cc11f140d7bd3e80620db66af29311; _passport_ct=58036a0450f54dfe88c635b3f1de8c58t8209; _jc_save_fromStation=%u676D%u5DDE%2CHZH; _jc_save_toStation=%u5B81%u6CE2%2CNGH; _jc_save_wfdc_flag=dc; _jc_save_toDate=2019-05-12; _jc_save_fromDate=2019-05-18; BIGipServerotn=619708938.64545.0000; RAIL_EXPIRATION=1558445401115; RAIL_DEVICEID=ojOchhXouyQKkRIDOIOEYE223_WcKcaOuF-_z82P-CYHNuKQOQA6fkynsTMigwJkqEHRabHNmpVRc0I8wVMQioy8eY2wYFbmATsvNP5SRPVofNqBITahBMUmcv5zPO3WcdwpO4jr6MtgbmqT1knkYn0qBbUShMDp; BIGipServerpool_passport=351076874.50215.0000; route=6f50b51faa11b987e576cdb301e545c4
 
 
```

 

## 输出

```
/**/
jQuery191027188156577876876_1558182495381({
    "result_message": "验证码校验成功",
    "result_code": "4"
});
```

# /passport/web/login

## 输入

```
POST /passport/web/login HTTP/1.1
Host: kyfw.12306.cn
Connection: keep-alive
Content-Length: 77
Accept: application/json, text/javascript, */*; q=0.01
Origin: https://kyfw.12306.cn
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.157 Safari/537.36
Content-Type: application/x-www-form-urlencoded; charset=UTF-8
Referer: https://kyfw.12306.cn/otn/resources/login.html
Accept-Encoding: gzip, deflate, br
Accept-Language: zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,ja;q=0.6
Cookie: _passport_session=971500cc11f140d7bd3e80620db66af29311; _passport_ct=58036a0450f54dfe88c635b3f1de8c58t8209; _jc_save_fromStation=%u676D%u5DDE%2CHZH; _jc_save_toStation=%u5B81%u6CE2%2CNGH; _jc_save_wfdc_flag=dc; _jc_save_toDate=2019-05-12; _jc_save_fromDate=2019-05-18; BIGipServerotn=619708938.64545.0000; RAIL_EXPIRATION=1558445401115; RAIL_DEVICEID=ojOchhXouyQKkRIDOIOEYE223_WcKcaOuF-_z82P-CYHNuKQOQA6fkynsTMigwJkqEHRabHNmpVRc0I8wVMQioy8eY2wYFbmATsvNP5SRPVofNqBITahBMUmcv5zPO3WcdwpO4jr6MtgbmqT1knkYn0qBbUShMDp; BIGipServerpool_passport=351076874.50215.0000; route=6f50b51faa11b987e576cdb301e545c4
 
username=15158037019&password=Zjf%401234&appid=otn&answer=42%2C53%2C122%2C109
```

 

## 输出

```
{
    "result_message": "登录成功",
    "uamtk": "uRbT4n5zacnLbcc_uyXhaopjasUukqEvdqZHid64reAga1110",
    "result_code": 0
}
```

# /otn/login/userLogin

## 输入

```
GET /otn/login/userLogin HTTP/1.1
Host: kyfw.12306.cn
Connection: keep-alive
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.157 Safari/537.36
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3
Referer: https://kyfw.12306.cn/otn/resources/login.html
Accept-Encoding: gzip, deflate, br
Accept-Language: zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,ja;q=0.6
Cookie: JSESSIONID=3135B88A70E3A2108D6D713BE3D60C1F; _jc_save_fromStation=%u676D%u5DDE%2CHZH; _jc_save_toStation=%u5B81%u6CE2%2CNGH; _jc_save_wfdc_flag=dc; _jc_save_toDate=2019-05-12; _jc_save_fromDate=2019-05-18; BIGipServerotn=619708938.64545.0000; RAIL_EXPIRATION=1558445401115; RAIL_DEVICEID=ojOchhXouyQKkRIDOIOEYE223_WcKcaOuF-_z82P-CYHNuKQOQA6fkynsTMigwJkqEHRabHNmpVRc0I8wVMQioy8eY2wYFbmATsvNP5SRPVofNqBITahBMUmcv5zPO3WcdwpO4jr6MtgbmqT1knkYn0qBbUShMDp; BIGipServerpool_passport=351076874.50215.0000; route=6f50b51faa11b987e576cdb301e545c4
 
 
```

 

## 输出

```
HTTP/1.1 302 Moved Temporarily
Date: Sat, 18 May 2019 12:28:25 GMT
Content-Length: 0
Location: https://kyfw.12306.cn/otn/passport?redirect=/otn/login/userLogin
X-Via: 1.1 PSjsntydap17:13 (Cdn Cache Server V2.0)
X-Cdn-Src-Port: 29310
Cdn-Src-Ip: 218.205.81.84
Connection: keep-alive
```

# /otn/passport?redirect=/otn/login/userLogin

## 输入

```
GET /otn/passport?redirect=/otn/login/userLogin HTTP/1.1
Host: kyfw.12306.cn
Connection: keep-alive
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.157 Safari/537.36
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3
Referer: https://kyfw.12306.cn/otn/resources/login.html
Accept-Encoding: gzip, deflate, br
Accept-Language: zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,ja;q=0.6
Cookie: JSESSIONID=3135B88A70E3A2108D6D713BE3D60C1F; _jc_save_fromStation=%u676D%u5DDE%2CHZH; _jc_save_toStation=%u5B81%u6CE2%2CNGH; _jc_save_wfdc_flag=dc; _jc_save_toDate=2019-05-12; _jc_save_fromDate=2019-05-18; BIGipServerotn=619708938.64545.0000; RAIL_EXPIRATION=1558445401115; RAIL_DEVICEID=ojOchhXouyQKkRIDOIOEYE223_WcKcaOuF-_z82P-CYHNuKQOQA6fkynsTMigwJkqEHRabHNmpVRc0I8wVMQioy8eY2wYFbmATsvNP5SRPVofNqBITahBMUmcv5zPO3WcdwpO4jr6MtgbmqT1knkYn0qBbUShMDp; BIGipServerpool_passport=351076874.50215.0000; route=6f50b51faa11b987e576cdb301e545c4
 
 
```

 

## 输出

```
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="X-UA-Compatible" content="IE=edge"></meta>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="/otn/resources/css/validation.css" rel="stylesheet" />
<link href="/otn/resources/merged/common_css.css?cssVersion=1.9051" rel="stylesheet" />
<link rel="icon" href="/otn/resources/images/ots/favicon.ico" type="image/x-icon" />
<link rel="shortcut icon" href="/otn/resources/images/ots/favicon.ico" type="image/x-icon" />
<script>
/*<![CDATA[*/
var ctx='/otn/';
var globalRepeatSubmitToken = null;
var global_lang = 'zh_CN';
var sessionInit = '';
var isShowNotice = null;
var CLeftTicketUrl = null;
var isTestFlow = null;
var isMobileCheck = null;
var passport_appId = 'otn';
var passport_login = 'https://kyfw.12306.cn/passport/web/login';
var passport_captcha = 'https://kyfw.12306.cn/passport/captcha/captcha-image';
var passport_authuam = 'https://kyfw.12306.cn/passport/web/auth/uamtk';
var passport_captcha_check = 'https://kyfw.12306.cn/passport/captcha/captcha-check';
var passport_authclient = 'uamauthclient';
var passport_loginPage = 'resources/login.html';
var passport_okPage = 'view/index.html';
 var passport_proxy_captcha =  'resources/login.html';
/*]]>*/
</script>
<script src="/otn/resources/merged/common_js.js?scriptVersion=1.9140" type="text/javascript"></script>
<!-- js i18n -->
<!-- jquery validation i18n -->
<!-- head and footer -->
<script src="/otn/HttpZF/GetJS" type="text/javascript"></script>
<script src="/otn/resources/merged/passport_js.js?scriptVersion=1.9140" type="text/javascript" xml:space="preserve"></script>
<link href="/otn/resources/merged/myOrderStatic_css.css?cssVersion=1.9051" rel="stylesheet" />
</head>
<div class="header"><div class="wrapper"><!-- 头部内容 -->
<div class="header-con"><h1 class="logo"><a href="http://www.12306.cn/index.html" shape="rect">中国铁路12306</a>
</h1>
<div class="header-right"><!-- 搜索条 -->
<div class="header-search"><div class="search-bd"><input type="text" class="search-input" value="" placeholder="搜索车票、专列/旅行地/酒店/订餐" data-provide="typeahead" />
<!-- 搜索提示 -->
<div class="search-down"><a href="javascript:;" class="close" shape="rect">关闭</a>
<ul class="search-down-list"></ul>
<!-- 热门推荐 -->
<!-- <div class="search-down-hot">
                            <h3 class="search-hot-tit">热门推荐</h3>
                            <div class="search-hot-key"><a href="#">车站</a><a href="#">进站乘车</a><a href="#">互联网购票</a></div>
                        </div> -->
</div>
<!-- 搜索历史 -->
<div class="search-history"><a href="javascript:;" class="history-clear" shape="rect">清除</a>
<h3 class="search-history-tit">搜索历史</h3>
<ul class="search-history-list"></ul>
</div>
</div>
<a class="search-btn" href="javascript:;" shape="rect"><i class="icon icon-search"></i>
</a>
</div>
<!-- 右侧菜单 -->
<ul class="header-menu"><li class="menu-item menu-nav"><a href="/otn/view/index.html" class="menu-nav-hd" shape="rect">我的12306
                            <i class="caret"></i>
</a>
<ul class="menu-nav-bd"><li><a href="/otn/queryOrder/initNoComplete" shape="rect">未完成订单</a>
</li>
<li><a href="/otn/queryOrder/init" shape="rect">已完成订单(改/退)</a>
</li>
<li class="nav-line"></li>
<li><a href="https://exservice.12306.cn/excater/queryMyOrder.html" shape="rect">我的餐饮•特产</a>
</li>
<li><a href="/otn/insurance/init" shape="rect">我的保险</a>
</li>
<li><a href="https://cx.12306.cn/tlcx/welcome.html" shape="rect">我的会员</a>
</li>
<li class="nav-line"></li>
<li><a href="/otn/modifyUser/initQueryUserInfo" shape="rect">查看个人信息</a>
</li>
<li><a href="/otn/userSecurity/init" shape="rect">账户安全</a>
</li>
<li class="nav-line"></li>
<li><a href="/otn/passengers/init" shape="rect">常用联系人</a>
</li>
<li class="nav-line"></li>
<li><a href="/otn/icentre/serviceQuery" shape="rect">温馨服务查询</a>
</li>
</ul>
</li>
<li class="menu-item menu-line">|</li>
<li id="J-header-login" class="menu-item menu-login">
                        您好，请<a id="login_user" href="/otn/login/init" shape="rect">登录</a>
<a id="regist_out" href="/otn/regist/init" class="ml" shape="rect">免费注册</a>
</li>
</ul>
</div>
</div>
</div>
<!-- 导航 -->
<div class="nav-box"><ul class="nav"><li class="nav-item nav-item-w1 active"><a href="../../index.html" class="nav-hd" shape="rect">首页</a>
</li>
<li class="nav-item nav-item-w1"><a href="javascript:void(0)" class="nav-hd" shape="rect">车票
                    <i class="icon icon-down"></i>
</a>
<div class="nav-bd"><div class="nav-bd-item nav-col2"><h3 class="nav-tit">购买</h3>
<ul class="nav-con"><li><a href="/otn/leftTicket/init?linktypeid=dc" shape="rect">单程</a>
</li>
<li><a href="/otn/leftTicket/init?linktypeid=wf" shape="rect">往返</a>
</li>
<li><a href="/otn/lcQuery/init" shape="rect">接续换乘</a>
</li>
<li></li>
</ul>
</div>
<div class="nav-bd-item nav-col2"><h3 class="nav-tit">变更</h3>
<ul class="nav-con"><li><a href="/otn/queryOrder/init?linktypeid=ref" shape="rect">退票</a>
</li>
<li><a href="/otn/queryOrder/init?linktypeid=res" shape="rect">改签</a>
</li>
<li><a href="/otn/queryOrder/init?linktypeid=chg" shape="rect">变更到站</a>
</li>
<li></li>
</ul>
</div>
<div class="nav-bd-item nav-col2"><h3 class="nav-tit border-none">更多</h3>
<ul class="nav-con"><li><a href="javascript:void(0)" shape="rect">中铁银通卡</a>
</li>
<li class="border-none"><a href=" javascript:void(0) " shape="rect">广九直通车</a>
</li>
<li><a href="javascript:void(0) " shape="rect">市郊快速铁路</a>
</li>
<li><a href="../ticket/international_train.html" shape="rect">国际列车</a>
</li>
</ul>
</div>
</div>
</li>
<li class="nav-item "><a href="javascript:void(0) " class="nav-hd " shape="rect">团购服务
                    <i class="icon icon-down "></i>
</a>
<div class="nav-bd "><div class="nav-bd-item nav-col6 "><ul class="nav-con "><li><a href="https://travel.12306.cn/portal " shape="rect">旅游列车</a>
</li>
<li><a href="javascript:void(0) " shape="rect">团体办理</a>
</li>
</ul>
</div>
</div>
</li>
<li class="nav-item "><a href="javascript:void(0) " class="nav-hd " shape="rect">会员服务
                    <i class="icon icon-down "></i>
</a>
<div class="nav-bd "><div class="nav-bd-item nav-col6"><ul class="nav-con "><li><a href="https://cx.12306.cn/tlcx/index.html " shape="rect">会员管理</a>
</li>
<li><a href="https://cx.12306.cn/tlcx/index.html " shape="rect">积分账户</a>
</li>
<li><a href="https://cx.12306.cn/tlcx/index.html " shape="rect">积分兑换</a>
</li>
<li><a href="https://cx.12306.cn/tlcx/index.html " shape="rect">会员专享</a>
</li>
<li class="border-none "><a href="https://cx.12306.cn/tlcx/index.html " shape="rect">会员中心</a>
</li>
</ul>
</div>
</div>
</li>
<li class="nav-item "><a href="javascript:void(0) " class="nav-hd " shape="rect">站车服务
                    <i class="icon icon-down "></i>
</a>
<div class="nav-bd "><div class="nav-bd-item nav-col4 "><ul class="nav-con "><li><a href="https://kyfw.12306.cn/otn/index/init " shape="rect">共享汽车</a>
</li>
<li><a href="https://kyfw.12306.cn/otn/index/init " shape="rect">网络约车</a>
</li>
<li><a href="https://kyfw.12306.cn/otn/lcQuery/init " shape="rect">行李搬运</a>
</li>
<li><a href="https://kyfw.12306.cn/otn/lcQuery/init " shape="rect">行包托运</a>
</li>
<li><a href="https://kyfw.12306.cn/otn/lcQuery/init " shape="rect">定制接送</a>
</li>
<li><a href="javascript:; " shape="rect">随手寄</a>
</li>
<li><a href="javascript:; " shape="rect">随手送</a>
</li>
<li></li>
</ul>
</div>
<div class="nav-bd-item "><ul class="nav-con "><li><a href="/otn/icentre/qxyyInfo" shape="rect">重点旅客预约</a>
</li>
<li><a href="/otn/icentre/lostInfo" shape="rect">遗失物品查找</a>
</li>
</ul>
</div>
<div class="nav-bd-item "><ul class="nav-con "><li><a href="javascript:; " shape="rect">车站引导</a>
</li>
<li><a href="javascript:; " shape="rect">站车风采</a>
</li>
</ul>
</div>
</div>
</li>
<li class="nav-item "><a href="javascript:void(0) " class="nav-hd " shape="rect">商旅服务
                    <i class="icon icon-down "></i>
</a>
<div class="nav-bd "><div class="nav-bd-item nav-col6 "><ul class="nav-con "><li><a href="javascript:void(0) " shape="rect">热点推荐</a>
</li>
<li><a href="https://travel.12306.cn/portal" shape="rect">旅游</a>
</li>
<li><a href="https://kyfw.12306.cn/otn/insurance/init" shape="rect">保险</a>
</li>
<li class="border-none "><a href="javascript:; " shape="rect">合作联盟</a>
</li>
</ul>
</div>
</div>
</li>
<li class="nav-item "><a href="javascript:void(0) " class="nav-hd " shape="rect">出行指南
                    <i class="icon icon-down "></i>
</a>
<div class="nav-bd "><div class="nav-bd-item nav-col2 "><h3 class="nav-tit ">常见问题</h3>
<ul class="nav-con "><li><a href="https://kyfw.12306.cn/otn/gonggao/ticketType.html " shape="rect">车票</a>
</li>
<li><a href="https://kyfw.12306.cn/otn/gonggao/ticketWindow.html " shape="rect">购票</a>
</li>
<li><a href="https://kyfw.12306.cn/otn/gonggao/windowEndorse.html " shape="rect">改签、变更到站</a>
</li>
<li><a href="https://kyfw.12306.cn/otn/gonggao/windowRefund.html " shape="rect">退票</a>
</li>
<li><a href="https://kyfw.12306.cn/otn/gonggao/help.html " class="txt-lighter " shape="rect">更多>></a>
</li>
<li></li>
</ul>
</div>
<div class="nav-bd-item nav-col2 "><h3 class="nav-tit ">旅客须知</h3>
<ul class="nav-con "><li><a href="https://kyfw.12306.cn/otn/gonggao/usersNeedToKnow.html?linktypeid=reg " shape="rect">注册新用户</a>
</li>
<li><a href="https://kyfw.12306.cn/otn/gonggao/usersNeedToKnow.html?linktypeid=reg " shape="rect">网上购票流程</a>
</li>
<li><a href="https://kyfw.12306.cn/otn/gonggao/usersNeedToKnow.html?linktypeid=reg " shape="rect">铁路电子客票</a>
</li>
<li><a href="https://kyfw.12306.cn/otn/gonggao/usersNeedToKnow.html?linktypeid=reg " shape="rect">身份核验</a>
</li>
<li><a href="https://kyfw.12306.cn/otn/gonggao/help.html " class="txt-lighter " shape="rect">更多>></a>
</li>
<li></li>
</ul>
</div>
<div class="nav-bd-item nav-col2 "><h3 class="nav-tit border-none ">相关章程</h3>
<ul class="nav-con "><li><a href="https://kyfw.12306.cn/otn/gonggao/saleTicketMeans.html?linktypeid=means1 " shape="rect">铁路互联网暂行方法</a>
</li>
<li class="border-none "><a href="https://kyfw.12306.cn/otn/gonggao/saleTicketMeans.html?linktypeid=means1 " shape="rect">铁路旅客运输规程</a>
</li>
<li><a href="https://kyfw.12306.cn/otn/gonggao/saleTicketMeans.html?linktypeid=means1 " shape="rect">铁路进站乘车禁止和限制携带品公告</a>
</li>
<li class="border-none "><a href="https://kyfw.12306.cn/otn/gonggao/help.html " class="txt-lighter " shape="rect">更多>></a>
</li>
<li></li>
<li class="border-none "></li>
</ul>
</div>
</div>
</li>
<li class="nav-item last "><a href="javascript:void(0) " class="nav-hd " shape="rect">信息查询
                    <i class="icon icon-down "></i>
</a>
<div class="nav-bd "><div class="nav-bd-item nav-col5 "><h3 class="nav-tit border-none ">常用查询</h3>
<ul class="nav-con "><li><a href="https://kyfw.12306.cn/otn/zwdch/init " shape="rect">正晚点</a>
</li>
<li><a href="https://kyfw.12306.cn/otn/leftTicket/init " shape="rect">时刻表</a>
</li>
<li><a href="javascript:void(0) " shape="rect">公布票价</a>
</li>
<li><a href="../infos/ticket_check.html " shape="rect">检票口</a>
</li>
<li><a href="../infos/sale_time.html " shape="rect">起售时间</a>
</li>
<li><a href="../infos/weather.html " shape="rect">天气</a>
</li>
<li><a href="javascript:void(0) " shape="rect">交通查询</a>
</li>
<li><a href="https://kyfw.12306.cn/otn/queryAgencySellTicket/init " shape="rect">代售点</a>
</li>
<li><a href="../infos/service_number.html" shape="rect">客服电话</a>
</li>
<li></li>
</ul>
</div>
<div class="nav-bd-item "><ul class="nav-con nav-con-pt nav-con-tits "><li class="border-none"><a href="http://www.12306.cn/mormhweb/zxdt/201512/t20151201_3949.html" shape="rect">公告</a>
</li>
<li class="border-none"><a href=" http://dynamic.12306.cn/otn/queryDishonest/init " shape="rect">信用信息</a>
</li>
</ul>
</div>
</div>
</li>
</ul>
</div>
</div>
<div class="content"><div class="pay-wait"><span class="icon" style="margin-left:50px;"><img src="/otn/resources/images/working.gif" />
</span>
<strong style="padding-top:16px;">页面加载中，请稍候...</strong>
</div>
<script xml:space="preserve">
window.onload=function(){
    uampassport.checkLogin();
}
</script>
</div>
<!--
<div class="guide-nav" id="guid_nav" th:fragment="guide-frag">
    <ul>
        <li><a th:href="${#httpServletRequest.contextPath}+'/lcxxcx/init'" href="列车信息查询.html" class="cur">票价查询</a></li>
        <li><a th:href="${#httpServletRequest.contextPath}+'/czxx/init'" href="车站信息查询.html">车站信息查询</a></li>
        <li><a th:href="${#httpServletRequest.contextPath}+'/zzzcx/init'" href="#">中转查询</a></li>
        <li><a th:href="${#httpServletRequest.contextPath}+'/zwdch/init'" href="#nogo">正晚点查询</a></li>
        <li class="last"><a th:href="${#httpServletRequest.contextPath}+'/queryAgencySellTicket/init'" href="客票代售点.html">客票代售点</a></li>
    </ul>
</div>
-->
<div class="footer"><div class="footer-con wrapper"><div class="foot-links"><h2 class="foot-con-tit">友情链接</h2>
<ul class="foot-links-list"><li><a href="javascript:void(0)" shape="rect"><img src="/otn/resources/images/12306_index/link01.png" alt="" />
</a>
</li>
<li><a href="javascript:void(0)" shape="rect"><img src="/otn/resources/images/12306_index/link02.png" alt="" />
</a>
</li>
<li><a href="javascript:void(0)" shape="rect"><img src="/otn/resources/images/12306_index/link03.png" alt="" />
</a>
</li>
<li><a href="javascript:void(0)" shape="rect"><img src="/otn/resources/images/12306_index/link04.png" alt="" />
</a>
</li>
</ul>
</div>
<ul class="foot-code"><li><h2 class="foot-con-tit">12306 公众号</h2>
<img src="/otn/resources/images/12306_index/pic/code.png" class="code-pic" alt="" />
<div class="code-txt">扫一扫,出行及时提醒</div>
</li>
<li><h2 class="foot-con-tit">12306 APP</h2>
<img src="/otn/resources/images/12306_index/pic/code.png" class="code-pic" alt="" />
<div class="code-txt">官方唯一指定下载</div>
</li>
</ul>
</div>
<div class="footer-txt"><p><span class="mr">版权所有©2008-2018</span>
<span class="mr">中国铁路信息技术中心</span>
<span class="mr">中国铁道科学研究院集团有限公司</span>
<span class="mr">京ICP备15003716号-3 | 京ICP证150437号</span>
</p>
</div>
</div>
</html>
 
```

# /passport/web/auth/uamtk

## 输入

```
POST /passport/web/auth/uamtk HTTP/1.1
Host: kyfw.12306.cn
Connection: keep-alive
Content-Length: 9
Accept: application/json, text/javascript, */*; q=0.01
Origin: https://kyfw.12306.cn
X-Requested-With: XMLHttpRequest
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.157 Safari/537.36
Content-Type: application/x-www-form-urlencoded; charset=UTF-8
Referer: https://kyfw.12306.cn/otn/passport?redirect=/otn/login/userLogin
Accept-Encoding: gzip, deflate, br
Accept-Language: zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,ja;q=0.6
Cookie: _passport_session=971500cc11f140d7bd3e80620db66af29311; uamtk=uRbT4n5zacnLbcc_uyXhaopjasUukqEvdqZHid64reAga1110; _jc_save_fromStation=%u676D%u5DDE%2CHZH; _jc_save_toStation=%u5B81%u6CE2%2CNGH; _jc_save_wfdc_flag=dc; _jc_save_toDate=2019-05-12; _jc_save_fromDate=2019-05-18; BIGipServerotn=619708938.64545.0000; RAIL_EXPIRATION=1558445401115; RAIL_DEVICEID=ojOchhXouyQKkRIDOIOEYE223_WcKcaOuF-_z82P-CYHNuKQOQA6fkynsTMigwJkqEHRabHNmpVRc0I8wVMQioy8eY2wYFbmATsvNP5SRPVofNqBITahBMUmcv5zPO3WcdwpO4jr6MtgbmqT1knkYn0qBbUShMDp; BIGipServerpool_passport=351076874.50215.0000; route=6f50b51faa11b987e576cdb301e545c4
 
appid=otn
```

 

## 输出

```
{
    "apptk": null,
    "result_message": "验证通过",
    "result_code": 0,
    "newapptk": "c9g0-ECRWXRzrVzAM9mty3IEo020ratnKtn-76pLPh4ij1110"
}
```

# /otn/uamauthclient

## 输入

```
POST /otn/uamauthclient HTTP/1.1
Host: kyfw.12306.cn
Connection: keep-alive
Content-Length: 52
Accept: */*
Origin: https://kyfw.12306.cn
X-Requested-With: XMLHttpRequest
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.157 Safari/537.36
Content-Type: application/x-www-form-urlencoded; charset=UTF-8
Referer: https://kyfw.12306.cn/otn/passport?redirect=/otn/login/userLogin
Accept-Encoding: gzip, deflate, br
Accept-Language: zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,ja;q=0.6
Cookie: JSESSIONID=17D2A5B49CB312109D036040D8EF5154; _jc_save_fromStation=%u676D%u5DDE%2CHZH; _jc_save_toStation=%u5B81%u6CE2%2CNGH; _jc_save_wfdc_flag=dc; _jc_save_toDate=2019-05-12; _jc_save_fromDate=2019-05-18; BIGipServerotn=619708938.64545.0000; RAIL_EXPIRATION=1558445401115; RAIL_DEVICEID=ojOchhXouyQKkRIDOIOEYE223_WcKcaOuF-_z82P-CYHNuKQOQA6fkynsTMigwJkqEHRabHNmpVRc0I8wVMQioy8eY2wYFbmATsvNP5SRPVofNqBITahBMUmcv5zPO3WcdwpO4jr6MtgbmqT1knkYn0qBbUShMDp; BIGipServerpool_passport=351076874.50215.0000; route=6f50b51faa11b987e576cdb301e545c4
 
tk=c9g0-ECRWXRzrVzAM9mty3IEo020ratnKtn-76pLPh4ij1110
```

 

## 输出

```
{
    "apptk": "c9g0-ECRWXRzrVzAM9mty3IEo020ratnKtn-76pLPh4ij1110",
    "result_code": 0,
    "result_message": "验证通过",
    "username": "周靖峰"
}
```

# /otn/login/userLogin

## 输入

```
GET /otn/login/userLogin HTTP/1.1
Host: kyfw.12306.cn
Connection: keep-alive
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.157 Safari/537.36
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3
Referer: https://kyfw.12306.cn/otn/passport?redirect=/otn/login/userLogin
Accept-Encoding: gzip, deflate, br
Accept-Language: zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,ja;q=0.6
Cookie: JSESSIONID=17D2A5B49CB312109D036040D8EF5154; tk=c9g0-ECRWXRzrVzAM9mty3IEo020ratnKtn-76pLPh4ij1110; _jc_save_fromStation=%u676D%u5DDE%2CHZH; _jc_save_toStation=%u5B81%u6CE2%2CNGH; _jc_save_wfdc_flag=dc; _jc_save_toDate=2019-05-12; _jc_save_fromDate=2019-05-18; BIGipServerotn=619708938.64545.0000; RAIL_EXPIRATION=1558445401115; RAIL_DEVICEID=ojOchhXouyQKkRIDOIOEYE223_WcKcaOuF-_z82P-CYHNuKQOQA6fkynsTMigwJkqEHRabHNmpVRc0I8wVMQioy8eY2wYFbmATsvNP5SRPVofNqBITahBMUmcv5zPO3WcdwpO4jr6MtgbmqT1knkYn0qBbUShMDp; BIGipServerpool_passport=351076874.50215.0000; route=6f50b51faa11b987e576cdb301e545c4
 
 
```

 

## 输出

无

# /otn/index/initMy12306Api

## 输入

```
POST /otn/index/initMy12306Api HTTP/1.1
Host: kyfw.12306.cn
Connection: keep-alive
Content-Length: 0
Accept: */*
Origin: https://kyfw.12306.cn
X-Requested-With: XMLHttpRequest
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.157 Safari/537.36
Referer: https://kyfw.12306.cn/otn/view/index.html
Accept-Encoding: gzip, deflate, br
Accept-Language: zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,ja;q=0.6
Cookie: JSESSIONID=17D2A5B49CB312109D036040D8EF5154; tk=c9g0-ECRWXRzrVzAM9mty3IEo020ratnKtn-76pLPh4ij1110; _jc_save_fromStation=%u676D%u5DDE%2CHZH; _jc_save_toStation=%u5B81%u6CE2%2CNGH; _jc_save_wfdc_flag=dc; _jc_save_toDate=2019-05-12; _jc_save_fromDate=2019-05-18; BIGipServerotn=619708938.64545.0000; RAIL_EXPIRATION=1558445401115; RAIL_DEVICEID=ojOchhXouyQKkRIDOIOEYE223_WcKcaOuF-_z82P-CYHNuKQOQA6fkynsTMigwJkqEHRabHNmpVRc0I8wVMQioy8eY2wYFbmATsvNP5SRPVofNqBITahBMUmcv5zPO3WcdwpO4jr6MtgbmqT1knkYn0qBbUShMDp; BIGipServerpool_passport=351076874.50215.0000; route=6f50b51faa11b987e576cdb301e545c4
 
 
```

 

## 输出

```
{
    "validateMessagesShowId": "_validatorMessage",
    "status": true,
    "httpstatus": 200,
    "data": {
        "notify_way": "7",
        "qr_code_url": "Y",
        "if_show_ali_qr_code": true,
        "isSuperUser": "N",
        "_email": "zhoujingfeng0338@sina.com",
        "user_status": "1",
        "_is_needModifyPassword": null,
        "needEdit": false,
        "member_status": "",
        "id_type_code": "1",
        "notify_TWO_2": "完成手机双向核验，即可使用手机号码直接登录的新服务，解除您遗忘用户名的烦恼。",
        "user_name": "周靖峰",
        "member_level": "",
        "isCanRegistMember": true,
        "user_regard": "先生,下午好！",
        "resetMemberPwd": "N",
        "_is_active": "Y"
    },
    "messages": [],
    "validateMessages": {}
}
```

# /otn/queryOrder/queryMyOrderNoComplete

## 输入

```
POST /otn/queryOrder/queryMyOrderNoComplete HTTP/1.1
Host: kyfw.12306.cn
Connection: keep-alive
Content-Length: 10
Accept: application/json, text/javascript, */*; q=0.01
Origin: https://kyfw.12306.cn
X-Requested-With: XMLHttpRequest
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.157 Safari/537.36
Content-Type: application/x-www-form-urlencoded; charset=UTF-8
Referer: https://kyfw.12306.cn/otn/view/train_order.html
Accept-Encoding: gzip, deflate, br
Accept-Language: zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,ja;q=0.6
Cookie: JSESSIONID=17D2A5B49CB312109D036040D8EF5154; tk=c9g0-ECRWXRzrVzAM9mty3IEo020ratnKtn-76pLPh4ij1110; _jc_save_fromStation=%u676D%u5DDE%2CHZH; _jc_save_toStation=%u5B81%u6CE2%2CNGH; _jc_save_wfdc_flag=dc; _jc_save_toDate=2019-05-12; _jc_save_fromDate=2019-05-18; BIGipServerotn=619708938.64545.0000; RAIL_EXPIRATION=1558445401115; RAIL_DEVICEID=ojOchhXouyQKkRIDOIOEYE223_WcKcaOuF-_z82P-CYHNuKQOQA6fkynsTMigwJkqEHRabHNmpVRc0I8wVMQioy8eY2wYFbmATsvNP5SRPVofNqBITahBMUmcv5zPO3WcdwpO4jr6MtgbmqT1knkYn0qBbUShMDp; BIGipServerpool_passport=351076874.50215.0000; route=6f50b51faa11b987e576cdb301e545c4
 
_json_att=
```

 

## 输出

```
{
    "validateMessagesShowId": "_validatorMessage",
    "status": true,
    "httpstatus": 200,
    "data": {
        "orderCacheDTO": {
            "requestId": 6535425392512577935,
            "userId": 1500017832335,
            "number": 2,
            "tourFlag": "dc",
            "requestTime": "2019-05-18 16:07:15",
            "queueOffset": 937903,
            "queueName": "ORDER_SL1",
            "trainDate": "2019-05-22 00:00:00",
            "startTime": "1970-01-01 08:13:00",
            "stationTrainCode": "D379",
            "fromStationCode": "HGH",
            "fromStationName": "杭州东",
            "toStationCode": "NGH",
            "toStationName": "宁波",
            "status": 9,
            "message": {
                "messageKey": "prompt.displaytext.userNumTooManyConErr",
                "message": "占座失败"
            },
            "modifyTime": "2019-05-18 16:08:17",
            "tickets": [{
                "seatTypeName": "二等座",
                "seatTypeCode": "O",
                "ticketTypeName": "成人票",
                "passengerName": "周靖峰",
                "passengerIdTypeName": "中国居民身份证"
            }],
            "waitTime": -2,
            "waitCount": 0,
            "ticketCount": 1,
            "startTimeString": "2019-05-22 08:13",
            "array_passser_name_page": ["周靖峰"]
        },
        "to_page": "cache"
    },
    "messages": [],
    "validateMessages": {}
}
```

# /otn/queryOrder/initNoCompleteQueueApi

## 输入

```
POST /otn/queryOrder/initNoCompleteQueueApi HTTP/1.1
Host: kyfw.12306.cn
Connection: keep-alive
Content-Length: 0
Accept: application/json, text/javascript, */*; q=0.01
Origin: https://kyfw.12306.cn
X-Requested-With: XMLHttpRequest
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.157 Safari/537.36
Referer: https://kyfw.12306.cn/otn/view/train_order.html
Accept-Encoding: gzip, deflate, br
Accept-Language: zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,ja;q=0.6
Cookie: JSESSIONID=17D2A5B49CB312109D036040D8EF5154; tk=c9g0-ECRWXRzrVzAM9mty3IEo020ratnKtn-76pLPh4ij1110; _jc_save_fromStation=%u676D%u5DDE%2CHZH; _jc_save_toStation=%u5B81%u6CE2%2CNGH; _jc_save_wfdc_flag=dc; _jc_save_toDate=2019-05-12; _jc_save_fromDate=2019-05-18; BIGipServerotn=619708938.64545.0000; RAIL_EXPIRATION=1558445401115; RAIL_DEVICEID=ojOchhXouyQKkRIDOIOEYE223_WcKcaOuF-_z82P-CYHNuKQOQA6fkynsTMigwJkqEHRabHNmpVRc0I8wVMQioy8eY2wYFbmATsvNP5SRPVofNqBITahBMUmcv5zPO3WcdwpO4jr6MtgbmqT1knkYn0qBbUShMDp; BIGipServerpool_passport=351076874.50215.0000; route=6f50b51faa11b987e576cdb301e545c4
 
 
```

 

## 输出

```
{
    "validateMessagesShowId": "_validatorMessage",
    "status": true,
    "httpstatus": 200,
    "data": {
        "startTimeString": "08:13",
        "errorMsgInfo": "占座失败",
        "waitTime": 0,
        "toStationName": "宁波",
        "trainDateString": "2019-05-22 (周三) ",
        "passengerNames": "周靖峰",
        "stationTrainCode": "D379",
        "fromStationName": "杭州东",
        "can_jb": "N",
        "orderCacheDO": {
            "requestId": 6535425392512577935,
            "userId": 1500017832335,
            "number": 2,
            "tourFlag": "dc",
            "requestTime": "2019-05-18 16:07:15",
            "queueOffset": 937903,
            "queueName": "ORDER_SL1",
            "trainDate": "2019-05-22 00:00:00",
            "startTime": "1970-01-01 08:13:00",
            "stationTrainCode": "D379",
            "fromStationCode": "HGH",
            "fromStationName": "杭州东",
            "toStationCode": "NGH",
            "toStationName": "宁波",
            "status": 9,
            "message": {
                "messageKey": "prompt.displaytext.userNumTooManyConErr",
                "message": "占座失败"
            },
            "modifyTime": "2019-05-18 16:08:17",
            "tickets": [{
                "seatTypeName": "二等座",
                "seatTypeCode": "O",
                "ticketTypeName": "成人票",
                "passengerName": "周靖峰",
                "passengerIdTypeName": "中国居民身份证"
            }],
            "waitTime": -2,
            "waitCount": 0,
            "ticketCount": 1,
            "startTimeString": "2019-05-22 08:13",
            "array_passser_name_page": ["周靖峰"]
        },
        "current_page": "fail",
        "endTimeString": "08:13"
    },
    "messages": [],
    "validateMessages": {}
}
```

# /otn/leftTicket/init

## 输入

```
POST /otn/leftTicket/init HTTP/1.1
Host: kyfw.12306.cn
Connection: keep-alive
Content-Length: 10
Cache-Control: max-age=0
Origin: https://kyfw.12306.cn
Upgrade-Insecure-Requests: 1
Content-Type: application/x-www-form-urlencoded
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.157 Safari/537.36
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3
Referer: https://kyfw.12306.cn/otn/view/train_order.html
Accept-Encoding: gzip, deflate, br
Accept-Language: zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,ja;q=0.6
Cookie: JSESSIONID=17D2A5B49CB312109D036040D8EF5154; tk=c9g0-ECRWXRzrVzAM9mty3IEo020ratnKtn-76pLPh4ij1110; _jc_save_fromStation=%u676D%u5DDE%2CHZH; _jc_save_toStation=%u5B81%u6CE2%2CNGH; _jc_save_wfdc_flag=dc; _jc_save_toDate=2019-05-12; _jc_save_fromDate=2019-05-18; BIGipServerotn=619708938.64545.0000; RAIL_EXPIRATION=1558445401115; RAIL_DEVICEID=ojOchhXouyQKkRIDOIOEYE223_WcKcaOuF-_z82P-CYHNuKQOQA6fkynsTMigwJkqEHRabHNmpVRc0I8wVMQioy8eY2wYFbmATsvNP5SRPVofNqBITahBMUmcv5zPO3WcdwpO4jr6MtgbmqT1knkYn0qBbUShMDp; BIGipServerpool_passport=351076874.50215.0000; route=6f50b51faa11b987e576cdb301e545c4
 
_json_att=
```

 

## 输出

```
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="/otn/resources/css/validation.css" rel="stylesheet" />
<link href="/otn/resources/merged/common_css.css?cssVersion=1.9051" rel="stylesheet" />
<link rel="icon" href="/otn/resources/images/ots/favicon.ico" type="image/x-icon" />
<link rel="shortcut icon" href="/otn/resources/images/ots/favicon.ico" type="image/x-icon" />
<script>
/*<![CDATA[*/
var ctx='/otn/';
var globalRepeatSubmitToken = null;
var global_lang = 'zh_CN';
var sessionInit = '\u5468\u9756\u5CF0';
var isShowNotice = null;
var CLeftTicketUrl = 'leftTicket/query';
var isTestFlow = null;
var isMobileCheck = 'N';
var passport_appId = 'otn';
var passport_login = 'https://kyfw.12306.cn/passport/web/login';
var passport_captcha = 'https://kyfw.12306.cn/passport/captcha/captcha-image';
var passport_authuam = 'https://kyfw.12306.cn/passport/web/auth/uamtk';
var passport_captcha_check = 'https://kyfw.12306.cn/passport/captcha/captcha-check';
var passport_authclient = 'uamauthclient';
var passport_loginPage = 'resources/login.html';
var passport_okPage = 'view/index.html';
 var passport_proxy_captcha =  'resources/login.html';
/*]]>*/
</script>
<script src="/otn/resources/merged/common_js.js?scriptVersion=1.9140" type="text/javascript"></script>
<!-- js i18n -->
<!-- jquery validation i18n -->
<!-- head and footer -->
<script src="/otn/HttpZF/GetJS" type="text/javascript"></script>
<title>中国铁路12306</title>
<!-- 双日历 -->
<link href="/otn/resources/js/rich/calender_double/datepicker/skin/WdatePicker.css" rel="stylesheet" />
<script type="text/javascript" src="/otn/resources/js/rich/calender_double/datepicker/WdatePicker.js" xml:space="preserve"></script>
<script src="/otn/resources/js/framework/data.jcokies.js" type="text/javascript" xml:space="preserve"></script>
<script src="/otn/resources/merged/queryLeftTicket_js.js?scriptVersion=1.9140" type="text/javascript" xml:space="preserve"></script>
<link href="/otn/resources/merged/queryLeftTicket_css.css?cssVersion=1.9051" rel="stylesheet" />
<script src="/otn/resources/js/framework/jquery.bgiframe.mi.js" type="text/javascript" xml:space="preserve"></script>
<script src="/otn/dynamicJs/qjqtdbd" type="text/javascript" xml:space="preserve"></script>
<link href="/otn/resources/merged/queryLeftTicket_end_css.css?cssVersion=1.9051" rel="stylesheet" />
<script src="/otn/resources/js/framework/jquery.fly.min.js" type="text/javascript" xml:space="preserve"></script>
<!--[if lte IE 9]-->
<script src="/otn/resources/js/framework/requestAnimationFrame.js" type="text/javascript" xml:space="preserve"></script>
<!--[endif]-->
</head>
<body><!--header start-->
<div class="header"><div class="wrapper"><!-- 头部内容 -->
<div class="header-con"><h1 class="logo"><a name="g_href" data-type="1" data-href="index.html" data-redirect="Y" href="javascript:;">中国铁路12306</a>
</h1>
<div class="header-right"><!-- 搜索条 -->
<div class="header-search"><div class="search-bd"><input type="password" value="" style="display:none" />
<input type="text" class="search-input" id="search-input" value="" auto-complete="new-password" placeholder="搜索车票/餐饮/常旅客/相关规章" />
<!-- 搜索提示 -->
<div class="search-down"><a href="javascript:;" class="close">关闭</a>
<ul class="search-down-list"></ul>
<!-- 热门推荐 -->
<!-- <div class="search-down-hot">
                            <h3 class="search-hot-tit">热门推荐</h3>
                            <div class="search-hot-key"><a href="#">车站</a><a href="#">进站乘车</a><a href="#">互联网购票</a></div>
                        </div> -->
</div>
<!-- 搜索历史 -->
<div class="search-history"><a href="javascript:;" class="history-clear">清除</a>
<h3 class="search-history-tit">搜索历史</h3>
<ul class="search-history-list"></ul>
</div>
</div>
<a class="search-btn" href="javascript:;"><i class="icon icon-search"></i>
</a>
</div>
<!-- 右侧菜单 -->
<ul class="header-menu"><li class="menu-item menu-nav"><a name="g_href" data-type="2" data-href="view/index.html" data-redirect="Y" href="javascript:;" class="menu-nav-hd">我的12306
                            <i class="caret"></i>
</a>
<ul class="menu-nav-bd"><li><a style="color: #333;" name="g_href" data-type="2" data-href="view/train_order.html" data-redirect="Y" href="javascript:;">火车票订单</a>
</li>
<li><a style="color: #333;" name="g_href" data-type="2" data-href="view/lineUp_order.html" data-redirect="Y" href="javascript:;">候补订单</a>
</li>
<li><a style="color: #333;" name="g_href" data-type="2" data-href="view/personal_travel.html" data-redirect="Y" href="javascript:;">我的行程</a>
</li>
<li class="nav-line"></li>
<li><a style="color: #333;" name="g_href" data-type="10" data-href="queryMyOrder.html" data-redirect="Y" href="javascript:;">我的餐饮•特产</a>
</li>
<li><a style="color: #333;" name="g_href" data-type="2" data-href="view/my_insurance.html" data-redirect="Y" href="javascript:;">我的保险</a>
</li>
<li><a style="color: #333;" name="g_href" data-type="3" data-href="welcome.html" data-redirect="Y" href="javascript:;">我的会员</a>
</li>
<li class="nav-line"></li>
<li><a style="color: #333;" name="g_href" data-type="2" data-href="view/information.html" data-redirect="Y" href="javascript:;">查看个人信息</a>
</li>
<li><a style="color: #333;" name="g_href" data-type="2" data-href="view/userSecurity.html" data-redirect="Y" href="javascript:;">账户安全</a>
</li>
<li class="nav-line"></li>
<li><a style="color: #333;" name="g_href" data-type="2" data-href="view/passengers.html" data-redirect="Y" href="javascript:;">常用联系人</a>
</li>
<li><a style="color: #333;" name="g_href" data-type="2" data-href="view/address_init.html" data-redirect="Y" href="javascript:;">车票快递地址</a>
</li>
<li class="nav-line"></li>
<li><a style="color: #333;" name="g_href" data-type="2" data-href="view/icentre_serviceQuery.html" data-redirect="Y" href="javascript:;">温馨服务查询</a>
</li>
</ul>
</li>
<li class="menu-item menu-line">|</li>
<li id="J-header-logout" class="menu-item menu-login">
                        您好，<a id="login_user" name="g_href" data-type="2" data-href="view/index.html" data-redirect="Y" href="javascript:;" class="colorA" style="margin-left:-0.5px;"><span style="width:50px;">周靖峰</span>
</a>
<span class="txt-primary"></span>
&nbsp;|&nbsp;<a name="g_href" data-type="2" data-href="login/loginOut" data-redirect="Y" href="javascript:;">退出</a>
</li>
</ul>
</div>
</div>
</div>
<!-- 导航 -->
<div class="nav-box"><ul class="nav"><li class="nav-item nav-item-w1"><a name="g_href" data-type="1" data-href="index.html" data-redirect="Y" href="javascript:;" class="nav-hd">首页</a>
</li>
<li class="nav-item nav-item-w1"><a href="javascript:void(0)" class="nav-hd">车票
                    <i class="icon icon-down"></i>
</a>
<div class="nav-bd"><div class="nav-bd-item nav-col2"><h3 class="nav-tit">购买</h3>
<ul class="nav-con"><li><a name="g_href" data-type="2" data-href="leftTicket/init?linktypeid=dc" data-redirect="Y" href="javascript:;">单程</a>
</li>
<li><a name="g_href" data-type="2" data-href="leftTicket/init?linktypeid=wf" data-redirect="Y" href="javascript:;">往返</a>
</li>
<li><a name="g_href" data-type="2" data-href="lcQuery/init" data-redirect="Y" href="javascript:;">接续换乘</a>
</li>
<li></li>
</ul>
</div>
<div class="nav-bd-item nav-col2"><h3 class="nav-tit">变更</h3>
<ul class="nav-con"><li><a name="g_href" data-type="2" data-href="view/train_order.html?type=2" data-param="typefilt=4" data-redirect="Y" href="javascript:;">退票</a>
</li>
<li><a name="g_href" data-type="2" data-href="view/train_order.html?type=2" data-param="typefilt=2" data-redirect="Y" href="javascript:;">改签</a>
</li>
<li><a name="g_href" data-type="2" data-href="view/train_order.html?type=2" data-param="typefilt=3" data-redirect="Y" href="javascript:;">变更到站</a>
</li>
<li></li>
</ul>
</div>
<div class="nav-bd-item nav-col2"><h3 class="nav-tit border-none">更多</h3>
<ul class="nav-con"><li><a name="g_href" data-type="1" data-href="view/ticket/zt_card.html" data-redirect="Y" href="javascript:;">中铁银通卡</a>
</li>
<li class="border-none"><a name="g_href" data-type="1" data-href="view/ticket/through_train.html" data-redirect="Y" href="javascript:;">广九直通车</a>
</li>
<li><a name="g_href" data-type="1" data-href="view/ticket/railway.html" data-redirect="Y" href="javascript:;">市郊快速铁路</a>
</li>
<li><a name="g_href" data-type="1" data-href="view/ticket/international_train.html" data-redirect="Y" href="javascript:;">国际列车</a>
</li>
</ul>
</div>
</div>
</li>
<li class="nav-item "><a href="javascript:void(0)" class="nav-hd ">团购服务
                    <i class="icon icon-down "></i>
</a>
<div class="nav-bd "><div class="nav-bd-item nav-col6 "><ul class="nav-con "><li><a name="g_href" data-type="1" data-href="view/group/group_management.html?type=1" data-redirect="Y" href="javascript:;">务工人员</a>
</li>
<li><a name="g_href" data-type="1" data-href="view/group/group_management.html?type=2" data-redirect="Y" href="javascript:;">学生团体</a>
</li>
</ul>
</div>
</div>
</li>
<li class="nav-item "><a href="javascript:void(0) " class="nav-hd ">会员服务
                    <i class="icon icon-down "></i>
</a>
<div class="nav-bd "><div class="nav-bd-item nav-col6"><ul class="nav-con "><li><a name="g_href" data-type="3" data-href="index.html" data-redirect="Y" href="javascript:;">会员管理</a>
</li>
<li><a name="g_href" data-type="3" data-href="index.html" data-redirect="Y" href="javascript:;">积分账户</a>
</li>
<li><a name="g_href" data-type="3" data-href="index.html" data-redirect="Y" href="javascript:;">积分兑换</a>
</li>
<li><a name="g_href" data-type="3" data-href="index.html" data-redirect="Y" href="javascript:;">会员专享</a>
</li>
<li class="border-none "><a name="g_href" data-type="3" data-href="welcome.html" data-redirect="Y" href="javascript:;">会员中心</a>
</li>
</ul>
</div>
</div>
</li>
<li class="nav-item "><a href="javascript:void(0) " class="nav-hd ">站车服务
                    <i class="icon icon-down "></i>
</a>
<div class="nav-bd "><div class="nav-bd-item nav-col4 "><ul class="nav-con "><li><a name="g_href" data-type="2" data-href="view/icentre_qxyyInfo.html" data-redirect="Y" href="javascript:;">重点旅客预约</a>
</li>
<li><a name="g_href" data-type="1" data-href="view/station/hand.html" data-redirect="Y" href="javascript:;">便民托运</a>
</li>
<li><a name="g_href" data-type="1" data-href="view/station/shared_Car.html" data-redirect="Y" href="javascript:;">共享汽车</a>
</li>
<li><a name="g_href" data-type="4" data-href="czyd_2143/" data-redirect="Y" href="javascript:;">车站引导</a>
</li>
<li><a name="g_href" data-type="2" data-href="view/icentre_lostInfo.html" data-redirect="Y" href="javascript:;">遗失物品查找</a>
</li>
<li><a name="g_href" data-type="1" data-href="view/station/train_intro.html" data-redirect="Y" href="javascript:;">动车组介绍</a>
</li>
<li><a name="g_href" data-type="1" data-href="view/station/custom_PickUp.html" data-redirect="Y" href="javascript:;">定制接送</a>
</li>
<li><a name="g_href" data-type="4" data-href="zcfc_2548/" data-redirect="Y" href="javascript:;">站车风采</a>
</li>
</ul>
</div>
</div>
</li>
<li class="nav-item "><a href="javascript:void(0) " class="nav-hd ">商旅服务
                    <i class="icon icon-down "></i>
</a>
<div class="nav-bd "><div class="nav-bd-item nav-col6 "><ul class="nav-con "><li><a name="g_href" data-type="10" data-href="index.html" data-redirect="Y" href="javascript:;">餐饮•特产</a>
</li>
<li><a name="g_href" data-type="5" data-href="" data-redirect="Y" href="javascript:;">旅游</a>
</li>
<li><a name="g_href" data-type="2" data-href="view/my_insurance.html" data-redirect="Y" href="javascript:;">保险</a>
</li>
</ul>
</div>
</div>
</li>
<li class="nav-item "><a href="javascript:void(0) " class="nav-hd ">出行指南
                    <i class="icon icon-down "></i>
</a>
<div class="nav-bd "><div class="nav-bd-item nav-col2 "><h3 class="nav-tit ">常见问题</h3>
<ul class="nav-con "><li><a name="g_href" data-type="2" data-href="gonggao/ticketType.html" data-redirect="Y" href="javascript:;">车票</a>
</li>
<li><a name="g_href" data-type="2" data-href="gonggao/ticketWindow.html" data-redirect="Y" href="javascript:;">购票</a>
</li>
<li><a name="g_href" data-type="2" data-href="gonggao/windowEndorse.html" data-redirect="Y" href="javascript:;">改签、变更到站</a>
</li>
<li><a name="g_href" data-type="2" data-href="gonggao/windowRefund.html" data-redirect="Y" href="javascript:;">退票</a>
</li>
<li><a name="g_href" data-type="2" data-href="gonggao/help.html" data-redirect="Y" href="javascript:;" class="txt-lighter">更多>></a>
</li>
<li></li>
</ul>
</div>
<div class="nav-bd-item nav-col2 "><h3 class="nav-tit ">旅客须知</h3>
<ul class="nav-con "><li><a name="g_href" data-type="2" data-href="gonggao/usersNeedToKnow.html?linktypeid=txt" data-redirect="Y" href="javascript:;">铁路电子客票</a>
</li>
<li><a name="g_href" data-type="2" data-href="gonggao/saleTicketMeans.html?linktypeid=means5" data-redirect="Y" href="javascript:;">身份核验</a>
</li>
<li><a name="g_href" data-type="2" data-href="gonggao/help.html" data-redirect="Y" href="javascript:;" class="txt-lighter">更多>></a>
</li>
<li></li>
</ul>
</div>
<div class="nav-bd-item nav-col2 "><h3 class="nav-tit border-none ">相关章程</h3>
<ul class="nav-con "><li><a name="g_href" data-type="2" data-href="gonggao/saleTicketMeans.html?linktypeid=means1" data-redirect="Y" href="javascript:;">铁路互联网售票暂行办法</a>
</li>
<li class="border-none "><a name="g_href" data-type="2" data-href="gonggao/saleTicketMeans.html?linktypeid=means2" data-redirect="Y" href="javascript:;">铁路旅客运输规程</a>
</li>
<li style="text-overflow: ellipsis;white-space: nowrap;"><a name="g_href" data-type="2" data-href="gonggao/saleTicketMeans.html?linktypeid=means6" data-redirect="Y" href="javascript:;">铁路进站乘车禁止和限制携带品公告</a>
</li>
<li class="border-none" style="text-overflow: ellipsis;white-space: nowrap;"><a name="g_href" data-type="2" data-href="gonggao/saleTicketMeans.html?linktypeid=means7" data-redirect="Y" href="javascript:;">广深港高速铁路跨境旅客运输组织规则</a>
</li>
<li><a name="g_href" data-type="2" data-href="gonggao/help.html" data-redirect="Y" href="javascript:;" class="txt-lighter">更多>></a>
</li>
<li></li>
</ul>
</div>
</div>
</li>
<li class="nav-item last "><a href="javascript:void(0) " class="nav-hd ">信息查询
                    <i class="icon icon-down "></i>
</a>
<div class="nav-bd "><div class="nav-bd-item nav-col5 "><h3 class="nav-tit border-none ">常用查询</h3>
<ul class="nav-con "><li><a name="g_href" data-type="2" data-href="zwdch/init" data-redirect="Y" href="javascript:;">正晚点</a>
</li>
<li><a name="g_href" data-type="2" data-href="queryTrainInfo/init" data-redirect="Y" href="javascript:;">时刻表</a>
</li>
<li><a name="g_href" data-type="2" data-href="leftTicketPrice/initPublicPrice" data-redirect="Y" href="javascript:;">公布票价</a>
</li>
<li><a name="g_href" data-type="1" data-href="view/infos/ticket_check.html" data-redirect="Y" href="javascript:;">检票口</a>
</li>
<li><a name="g_href" data-type="1" data-href="view/infos/sale_time.html" data-redirect="Y" href="javascript:;">起售时间</a>
</li>
<li><a name="g_href" data-href="https://forecast.lytq.com/pc.html" data-redirect="N" href="javascript:;">天气</a>
</li>
<li><a name="g_href" data-type="1" data-href="view/infos/jiaotong.html" data-redirect="Y" href="javascript:;">交通查询</a>
</li>
<li><a name="g_href" data-type="2" data-href="queryAgencySellTicket/init" data-redirect="Y" href="javascript:;">代售点</a>
</li>
<li><a name="g_href" data-type="1" data-href="view/infos/service_number.html" data-redirect="Y" href="javascript:;">客服电话</a>
</li>
<li></li>
</ul>
</div>
<div class="nav-bd-item "><ul class="nav-con nav-con-pt"><li class="border-none"><a name="g_href" data-type="1" data-href="index.html#index_ads" data-redirect="Y" href="javascript:;">最新发布</a>
</li>
<li class="border-none"><a name="g_href" data-type="6" data-href="queryDishonest/init" data-redirect="Y" href="javascript:;">信用信息</a>
</li>
</ul>
</div>
</div>
</li>
</ul>
</div>
</div>
<div id="dialog_smoker" style="display: none;"><div class="mark"></div>
<div class="up-box w600"><div class="up-box-hd">温馨提示<a href="javascript:" id="dialog_smoker_close" shape="rect">关闭</a>
</div>
<div class="up-box-bd"><div class="up-con clearfix"><span class="icon i-opt"></span>
<div class="r-txt"><div class="tit" id="dialog_smoker_msg"></div>
</div>
</div>
<div class="lay-btn"><a href="javascript:" id="dialog_smoker_cancel" class="btn92" shape="rect">取消</a>
<a href="javascript:" id="dialog_smoker_ok" class="btn92s" shape="rect">确定</a>
</div>
</div>
</div>
</div>
<!--header end-->
<div id="608_complain" style="display: none;"><div class="mark"></div>
<div class="up-box" style="width:640px;"><div class="up-box-hd">举报告知确认书<a href="javascript:" id="608_complain_close" shape="rect">关闭</a>
</div>
<div class="up-box-bd" style="padding:15px 10px;border:1px solid #298CCE;"><table class="per-ticket" style="margin-left:0px;"><tr><td rowspan="1" colspan="1">举报人姓名：<strong id="608_name" style="font-size:20px"></strong>
</td>
<td rowspan="1" colspan="1">联系电话：<strong id="608_tel" style="font-size:20px"></strong>
</td>
</tr>
<tr><td colspan="2" rowspan="1">身份证件号码：<strong id="608_card" style="font-size:20px"></strong>
</td>
</tr>
<tr></tr>
<tr><td colspan="2" rowspan="1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;本人确认举报身份信息被他人冒用购买<strong id="ticketInfo" style="font-size:20px"></strong>
次车票。本人承诺本次举报及购票所提交的身份信息属实，并对虚假举报后果负责。</td>
</tr>
<tr><td colspan="2" rowspan="1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;铁路部门郑重提醒，将在车站和列车对该车票进行重点查验。根据国务院颁布的《铁路安全管理条例》，对该车票所记载身份信息与所持身份证件或者真实身份不符的持票人，铁路部门将拒绝其进站乘车。同时，公安机关将依法调查。</td>
</tr>
<tr><td colspan="2" rowspan="1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;铁路部门将对您的举报信息保密，谢谢您的合作！</td>
</tr>
</table>
<div class="lay-btn"><a href="javascript:" id="608_complain_cancel" class="btn92" shape="rect">取消</a>
<a href="javascript:" id="608_complain_ok" class="btn92s" shape="rect">确认举报</a>
</div>
</div>
</div>
</div>
<div id="608_check" style="display: none;"><div class="mark"></div>
<div class="up-box"><div class="up-box-hd">温馨提示<a href="javascript:" id="608_check_close" shape="rect">关闭</a>
</div>
<div class="up-box-bd"><div class="up-con clearfix"><span class="icon i-opt"></span>
<div class="r-txt"><div class="tit" id="608_check_msg"></div>
<div class="tit" style="color:#FB7403">是否举报？</div>
</div>
</div>
<div class="lay-btn"><a href="javascript:" id="608_check_cancel" class="btn92" shape="rect">取消</a>
<a href="javascript:" id="608_check_ok" class="btn92s" shape="rect">网上举报</a>
</div>
</div>
</div>
</div>
<div id="hb_info" style="display: none;"><div class="mark"></div>
<div class="up-box w600"><div class="up-box-hd">温馨提示<a href="javascript:" id="hb_info_close" shape="rect">关闭</a>
</div>
<div class="up-box-bd"><div class="up-con clearfix"><span class="icon i-opt"></span>
<div class="r-txt"><div class="tit" id="hb_msg"></div>
</div>
</div>
<div class="lay-btn"><a href="javascript:" id="hb_info_cancel" class="btn92" shape="rect">取消</a>
<a href="javascript:" id="hb_info_ok" class="btn92s" shape="rect">清空</a>
</div>
</div>
</div>
</div>
<!--页面主体  开始-->
<div class="content content-lg"><div style="display: none"><audio preload="auto" loop="true" src="/otn/resources/js/framework/audio/message.wav"></audio>
</div>
<div id="jplayerId" style="display: none"></div>
<!--步骤 开始-->
<!--公告 开始-->
<div class="notice" id="scroll" style="display: none;"><strong style="width: 60px;">温馨提示：</strong>
<div class="notice_in"><ul style="cursor:pointer"><li style="color:#FB7403">列车运行图调整，12月30日之后车票预售期调整为30天，12月29日及之前的车票正常发售。</li>
</ul>
</div>
<a href="#nogo" class="i-close" shape="rect"></a>
</div>
<!--公告 结束-->
<!--车票搜索框 开始-->
<div class="sear-box quick-sear-box sear-box-lg"><form id="queryLeftForm" method="get" enctype="application/x-www-form-urlencoded"><div class="dfc" id="dfc"><ul><li><input name="singleRoundType" type="radio" id="dc" class="radio" checked="checked" value="dc" />
<label for="dc" id="dc_label" class="cursor">单程</label>
</li>
<li><input name="singleRoundType" type="radio" id="wf" class="radio" value="wc" />
<label for="wf" id="wf_label" class="cursor">往返</label>
</li>
</ul>
</div>
<div class="s-info" id="place_area"><ul><li><span class="label"><label id="fromStationText_label">出发地</label>
</span>
<div class="inp-w"><input id="fromStation" type="hidden" value="" name="leftTicketDTO.from_station" />
<input type="text" id="fromStationText" class="inp-txt" value="" name="leftTicketDTO.from_station_name" />
<span class="i-city" id="fromStation_icon_image"></span>
</div>
</li>
<li class="i-change i-change2" id="change_station" style="background-position:-67px -96px"></li>
<li><span class="label"><label id="toStationText_label"> 目的地</label>
</span>
<div class="inp-w"><input id="toStation" type="hidden" value="" name="leftTicketDTO.to_station" />
<input type="text" id="toStationText" class="inp-txt" value="" name="leftTicketDTO.to_station_name" />
<span class="i-city" id="toStation_icon_image"></span>
</div>
</li>
<li><span class="label"> 出发日</span>
<div class="inp-w" style="z-index:1200"><input type="text" class="inp-txt" name="leftTicketDTO.train_date" id="train_date" value="2013-06-07 周五" readonly="readonly" />
<!--    <div id="train_date_" style="position: absolute; height: 250px;z-index:1200;left:0; top:30px;"></div>-->
<span id="date_icon_1" class="i-date"></span>
</div>
<!--<div class="inp-w">
                                <input th:value="${train_date}" type="text" class="inp-txt" name="leftTicketDTO.train_date" id="train_date"
                                    value="2013-06-07 周五" readonly="readonly"></input> <span id="date_icon_1" class="i-date"></span>
                            </div>-->
</li>
<li><span class="label"> 返程日</span>
<div class="inp-w" id="back_div" style="z-index:1100"><input type="text" class="inp-txt" name="back_train_date" id="back_train_date" value="" readonly="readonly" />
<!--    <div id="back_train_date_" style="position: absolute; height: 250px;z-index:1100;left:0; top:30px;"></div>-->
<span id="date_icon_2" class="i-date"></span>
</div>
<!--<div class="inp-w" id="back_div">
                                <input th:value="${back_train_date}" type="text" class="inp-txt" name="back_train_date" id="back_train_date"
                                    value="2013-06-16 周日" readonly="readonly"></input> <span id="date_icon_2" class="i-date"></span>
                            </div>-->
</li>
</ul>
</div>
<div class="quick-s"><ul><li><input type="radio" id="sf1" class="radio" name="sf" checked="checked" />
<label id="sf1_label" for="sf1" class="cursor">普通</label>
</li>
<li><input type="radio" id="sf2" class="radio" name="sf" />
<label id="sf2_label" for="sf2" class="cursor">学生</label>
</li>
</ul>
<div class="btn-area"><a href="javascript:" id="query_ticket" class="btn92s btn-disabled" shape="rect">查询</a>
<div><input id="auto_query" type="checkbox" class="check" style="margin-right:0px;" />
<label id="autoQueryTxt">开启自动查询</label>
</div>
</div>
</div>
</form>
</div>
<!--车票搜索框 开始-->
<div class="sear-sel sear-sel-lg" id="sear-sel"><div id="date_range" class="sear-sel-hd clearfix"><ul><li><span>05-18</span>
<span class="hide">05-18</span>
</li>
<li><span>05-19</span>
<span class="hide">05-19</span>
</li>
<li><span>05-20</span>
<span class="hide">05-20</span>
</li>
<li><span>05-21</span>
<span class="hide">05-21</span>
</li>
<li><span>05-22</span>
<span class="hide">05-22</span>
</li>
<li><span>05-23</span>
<span class="hide">05-23</span>
</li>
<li><span>05-24</span>
<span class="hide">05-24</span>
</li>
<li><span>05-25</span>
<span class="hide">05-25</span>
</li>
<li><span>05-26</span>
<span class="hide">05-26</span>
</li>
<li><span>05-27</span>
<span class="hide">05-27</span>
</li>
<li><span>05-28</span>
<span class="hide">05-28</span>
</li>
<li><span>05-29</span>
<span class="hide">05-29</span>
</li>
<li><span>05-30</span>
<span class="hide">05-30</span>
</li>
<li><span>05-31</span>
<span class="hide">05-31</span>
</li>
<li><span>06-01</span>
<span class="hide">06-01</span>
</li>
<li><span>06-02</span>
<span class="hide">06-02</span>
</li>
<li><span>06-03</span>
<span class="hide">06-03</span>
</li>
<li><span>06-04</span>
<span class="hide">06-04</span>
</li>
<li><span>06-05</span>
<span class="hide">06-05</span>
</li>
<li><span>06-06</span>
<span class="hide">06-06</span>
</li>
<li style="display: none;"><span>06-07</span>
<span class="hide">06-07</span>
</li>
<li style="display: none;"><span>06-08</span>
<span class="hide">06-08</span>
</li>
<li style="display: none;"><span>06-09</span>
<span class="hide">06-09</span>
</li>
<li style="display: none;"><span>06-10</span>
<span class="hide">06-10</span>
</li>
<li style="display: none;"><span>06-11</span>
<span class="hide">06-11</span>
</li>
<li style="display: none;"><span>06-12</span>
<span class="hide">06-12</span>
</li>
<li style="display: none;"><span>06-13</span>
<span class="hide">06-13</span>
</li>
<li style="display: none;"><span>06-14</span>
<span class="hide">06-14</span>
</li>
<li style="display: none;"><span>06-15</span>
<span class="hide">06-15</span>
</li>
<li style="display: none;"><span>06-16</span>
<span class="hide">06-16</span>
</li>
</ul>
<div class="clear"></div>
</div>
<div class="sear-sel-bd quick-buy-sel quick-buy-open" id="sear-sel-bd" style="height: 17px"><!--展开式高度设置为204px，合拢时为72px-->
<div class="pos-top" style="margin-right:20px;">发车时间：
                    <select class="select-small" id="cc_start_time"><option value="00002400">00:00--24:00</option>
<option value="00000600">00:00--06:00</option>
<option value="06001200">06:00--12:00</option>
<option value="12001800">12:00--18:00</option>
<option value="18002400">18:00--24:00</option>
</select>
</div>
<div class="section clearfix"><div class="section-hd">车次类型：</div>
<div class="section-bd" id="cc_train_type_btn_all"><span class="btn-all" id="train_type_btn_all">全部</span>
<ul id="_ul_station_train_code"></ul>
</div>
</div>
<div class="section clearfix"><div class="section-hd">出发车站：</div>
<div class="section-bd" id="cc_from_station_name_all"><span class="btn-all" id="from_station_name_all">全部</span>
<ul id="from_station_ul"><!-- 默认初始化页面时，该过滤条件下无复选框 -->
</ul>
</div>
</div>
<!-- 
                <div class="section clearfix">
                    <div class="section-hd">出发时段：</div>
                    <div class="section-bd" id="cc_start_time_btn_all">
                        <span class="btn-all" id="start_time_btn_all">全部</span>
                        <ul>
                            <li><input type="checkbox" class="check" value="00000600" name="cc_start_time"></input><label for="">凌晨（0-6点）</label></li>
                            <li><input type="checkbox" class="check" value="06001200" name="cc_start_time"></input><label for="">上午（6-12点）</label></li>
                            <li><input type="checkbox" class="check" value="12001800" name="cc_start_time"></input><label for="">下午（12-18点）</label></li>
                            <li><input type="checkbox" class="check" value="18002400" name="cc_start_time"></input><label for="">晚上（18-24点）</label></li>
                        </ul>
                    </div>
                </div>
                -->
<div class="section clearfix"><div class="section-hd">到达车站：</div>
<div class="section-bd" id="cc_to_station_name_all"><span class="btn-all" id="to_station_name_all">全部</span>
<ul id="to_station_ul"><!-- 默认初始化页面时，该过滤条件下无复选框 -->
</ul>
</div>
</div>
<!--
                <div class="section clearfix">
                    <div class="section-hd">到达时段：</div>
                    <div class="section-bd" id="cc_arrive_time_btn_all">
                        <span class="btn-all" id="arrive_time_btn_all">全部</span>
                        <ul>
                            <li><input type="checkbox" class="check" value="00000600" name="cc_arrive_time"></input><label for="">凌晨（0-6点）</label></li>
                            <li><input type="checkbox" class="check" value="06001200" name="cc_arrive_time"></input><label for="">上午（6-12点）</label></li>
                            <li><input type="checkbox" class="check" value="12001800" name="cc_arrive_time"></input><label for="">下午（12-18点）</label></li>
                            <li><input type="checkbox" class="check" value="18002400" name="cc_arrive_time"></input><label for="">晚上（18-24点）</label></li>
                        </ul>
                    </div>
                </div>
                 -->
<div class="section pt2 clearfix"><div class="section-hd" id="memb">乘车人：</div>
<div class="section-bd pt2" id="setion_postion" style="width:688px;"><span class="wrap-left"><a href="javascript:" class="btn-small" onclick="$.showSelectBuyer()" shape="rect">请选择</a>
</span>
</div>
<span style="color:red;width:auto;">您可点击“成人乘车人”添加儿童票。</span>
</div>
<div class="section clearfix"><div class="section-hd" id="train_first">优先车次：</div>
<div class="section-bd pt2" id="prior_train"><span id="showYxTrainSpan" class="wrap-left"><a href="javascript:" class="btn-small" onclick="$.showYxTrain()" shape="rect">请选择</a>
</span>
<span style="display: none;" name="prior_train-span" class="wrap-left add-cc"><input type="text" maxlength="5" class="inp-small" id="inp-train" style="text-transform:uppercase" value="  请输入" onkeypress="$.checkTrain(event,this)" />
<a href="javascript:" class="btn-add" id="add-train" shape="rect"></a>
</span>
</div>
</div>
<div class="section clearfix"><div class="section-hd" id="seat_first">优先席别：</div>
<div class="section-bd pt2" id="prior_seat"><span class="wrap-left"><a href="javascript:" class="btn-small" onclick="$.showSelectSeat()" shape="rect">请选择</a>
</span>
</div>
</div>
<div class="section pt2 clearfix"><div class="section-hd" id="select_date">备选日期：</div>
<div class="section-bd pt2" id="prior_date"><span class="wrap-left"><a href="javascript:" class="btn-small" id="train_date" onclick="$.showSelectDate()" shape="rect">请选择</a>
</span>
</div>
</div>
<div class="section pt2 clearfix"><div class="section-hd" id="ad_setting">高级设置：</div>
<div class="section-bd pt2"><span class="mr17"><select id="_prior" class="select-small" style="width:75px;margin-right:10px"><option value="1">席别优先</option>
<option value="2">车次优先</option>
</select>
</span>
<span class="mr17"><input type="checkbox" class="check" id="autoSubmit" />
<label for="autoSubmit" id="autoSubmitTxt">自动提交</label>
</span>
<span class="mr17"><input type="checkbox" class="check" id="partSubmit" />
<label for="partSubmit" id="partSubmitTxt">余票不足时部分提交</label>
</span>
<a href="javascript:" class="btn-small mr5" id="tryPlayer" shape="rect">试听提示音乐</a>
<a href="javascript:" id="clearAll" class="btn-small" shape="rect">清空所有选项</a>
</div>
</div>
<div class="section cc-pos" style="display:none"><div class="section-hd">车次：</div>
<div class="section-bd" id="train_combo_box_div"><span class="inptxt w90" id="train_combo_box" style="float: left;"></span>
</div>
</div>
</div>
<div class="quick-gif" style="top:58px"><a href="javascript:" id="show_more" class="down" shape="rect">订票帮手</a>
</div>
<!--箭头方向修改<a href="#nogo" class="up"></a>-->
</div>
<!--车票搜索框 结束-->
<div class="sear-result" id="sear-result"><span class="fr"><input type="checkbox" class="check" id="avail_jf" />
<label for="">显示积分兑换车次</label>
<input type="checkbox" class="check" id="avail_ticket" />
<label for="">显示全部可预订车次</label>
</span>
<p><!-- 显示查询统计结果 -->
</p>
</div>
<div class="t-list" id="t-list"><table><thead><tr class="th" id="float"><th width="90" colspan="1" rowspan="1">车次</th>
<th width="100" colspan="1" rowspan="1">出发站<br clear="none" />
到达站</th>
<th width="82" colspan="1" rowspan="1" id="startendtime"></th>
<th width="82" colspan="1" rowspan="1"><span class="b3" id="l_s">历时</span>
</th>
<th width="66" colspan="1" rowspan="1">商务座<br clear="none" />
特等座</th>
<th width="66" colspan="1" rowspan="1">一等座</th>
<th width="66" colspan="1" rowspan="1">二等座</th>
<th width="66" colspan="1" rowspan="1">高级<br clear="none" />
软卧</th>
<th width="66" colspan="1" rowspan="1">软卧<br clear="none" />
一等卧</th>
<th width="66" colspan="1" rowspan="1">动卧</th>
<th width="66" colspan="1" rowspan="1">硬卧<br clear="none" />
二等卧</th>
<th width="66" colspan="1" rowspan="1">软座</th>
<th width="66" colspan="1" rowspan="1">硬座</th>
<th width="66" colspan="1" rowspan="1">无座</th>
<th width="66" colspan="1" rowspan="1">其他</th>
<th class="last" colspan="1" rowspan="1">备注</th>
</tr>
<tbody id="queryLeftTable"></tbody>
</thead>
<tbody id="queryLeftTable"></tbody>
</table>
<!-- 当查询有余票结果后，在table下显示还可以选择接续换乘查询换乘车次的提示 -->
<div class="tips-txt mt10" id="_lc_link_foot" style="display: none"><p>如果查询结果中没有满足需求的车次，您还可以使用<a style="color:#07f" href="/otn/lcQuery/init" shape="rect">接续换乘</a>
功能，查询途中换乘一次的部分列车余票情况。</p>
<p>显示的卧铺票价均为上铺票价，供您参考。具体票价以您确认支付时实际购买的铺别票价为准。</p>
</div>
<div class="t-list-bd" id="t-list-bd"><div class="no-ticket" id="no_filter_ticket" style="display: none"><span class="i-no"></span>
<p><!-- 没有符合筛选条件的车次，请修改筛选条件！<br />您可以<a href="#" id="show_all_query_result">显示全部</a>或<a href="/otsweb/zzzcx/init">使用中转查询功能</a>查询换乘车次。-->
 
 
                        没有符合筛选条件的车次，请修改筛选条件<br clear="none" />
或<a href="#" id="show_all_query_result" shape="rect">显示全部车次</a>
！
                    </p>
</div>
<div class="no-ticket" id="no_filter_ticket_3" style="display: none"><span class="i-no"></span>
<p>
                        没有查询到符合条件的车次，5秒后继续查询，请稍后！
                    </p>
</div>
<div class="no-ticket" id="no_filter_ticket_4" style="display: none"><span class="i-no"></span>
<p>
                        没有符合筛选条件的车次，5秒后开始查询备选日期，请稍后！
                    </p>
</div>
</div>
</div>
<div class="no-ticket" id="no_filter_ticket_2" style="display: none"><span class="i-no"></span>
<p>
                        很抱歉，按您的查询条件，当前未找到从<span id="no_filter_ticket_fromstation"></span>
到<span id="no_filter_ticket_tostation"></span>
的列车。您可以使用<a style="color:#07f" href="/otn/lcQuery/init" shape="rect">接续换乘</a>
功能，查询途中换乘一次的部分列车余票情况。
                    </p>
</div>
<div class="no-ticket" id="no_filter_ticket_6" style="display: none"><span class="i-no"></span>
<p>对不起，您操作频率过快，请稍后再试！</p>
</div>
</div>
<!--页面主体  结束-->
<!--页面底部  开始-->
<div class="footer"><div class="footer-con wrapper"><div class="foot-links" style="margin-right:20px;"><h2 class="foot-con-tit">友情链接</h2>
<ul class="foot-links-list"><li><a name="g_href" data-href="http://www.china-railway.com.cn/" data-redirect="N" href="javascript:;" data-target="_blank"><img src="/otn/resources/images/12306_index/link01.png" alt="" />
</a>
</li>
<li><a name="g_href" data-href="http://www.china-ric.com/" data-redirect="N" href="javascript:;" data-target="_blank"><img src="/otn/resources/images/12306_index/link02.png" alt="" />
</a>
</li>
<li><a name="g_href" data-href="http://www.95306.cn/" data-redirect="N" href="javascript:;" data-target="_blank"><img src="/otn/resources/images/12306_index/link03.png" alt="" />
</a>
</li>
<li><a name="g_href" data-href="http://www.cre.cn/" data-redirect="N" href="javascript:;" data-target="_blank"><img src="/otn/resources/images/12306_index/link04.png" alt="" />
</a>
</li>
</ul>
</div>
<ul class="foot-code"><li style="width: 140px;"><h2 class="foot-con-tit">中国铁路官方微信</h2>
<div class="code-pic"><img src="/otn/resources/images/zgtlwb.png" class="code-pic" alt="" />
</div>
</li>
<li style="width: 140px;"><h2 class="foot-con-tit">中国铁路官方微博</h2>
<div class="code-pic"><img src="/otn/resources/images/zgtlwx.png" class="code-pic" alt="" />
</div>
</li>
<li style="width: 110px;"><h2 class="foot-con-tit">12306 公众号</h2>
<div class="code-pic"><img src="/otn/resources/images/public.png" class="code-pic" alt="" />
</div>
</li>
<li style="width: 110px;"><h2 class="foot-con-tit">铁路12306</h2>
<div class="code-pic"><img src="/otn/resources/images/download.png" class="code-pic" alt="" />
<div class="code-tips">官方APP下载，目前铁路未授权其他网站或APP开展类似服务内容，敬请广大用户注意。</div>
</div>
</li>
</ul>
</div>
<div class="footer-txt"><p><span class="mr">版权所有©2008-2019</span>
<span>中国铁道科学研究院集团有限公司</span>
</p>
<p><span class="mr">京ICP备05020493号-4</span>
<span class="mr">|</span>
<span>京ICP证150437号</span>
</p>
</div>
</div>
<!-- 检索车站下拉框 -->
<div id="search_div" style="z-index: 1000; position: absolute;"><div id="form_cities"><div id="top_cities">操作提示</div>
<div id="panel_cities"></div>
<div id="flip_cities">翻页控制区</div>
</div>
</div>
<!-- 选择车站下拉框 -->
<div id="choice_div" style="z-index: 2000; position: absolute;"><div id="form_cities2"><div id="panel_cities2"></div>
</div>
</div>
<!--页面底部  结束-->
<!-- 选择乘车人 -->
<div id="sel-buyer" class="quick-box sel-rank" style="display:none;width: 515px;"><div class="quick-box-hd"><a onclick="$.closeSelectBuyer()" href="javascript:void(0);" shape="rect">关闭</a>
<a onclick="$.reloadPassenger()" href="javascript:void(0);" shape="rect">刷新</a>
<div class="inp-wrap"><input id="searchPassenger" type="text" class="inp-txt" placeholder="输入乘客姓名" />
<a href="javascript:void(0);" id="passenger_a_close" class="del" shape="rect"></a>
</div>
 
               常用联系人
        </div>
<div class="first-train-list"><ul id="buyer-list"></ul>
<div id="passenger_page" class="train-page" style="display: none;"></div>
</div>
</div>
<!-- 选择乘车人结束 -->
<!-- 选择优先席别 -->
<div id="sel-seat" class="quick-box sel-rank" style="display:none;width: 350px;"><div class="quick-box-hd"><a onclick="$.closeSelectSeat()" href="javascript:void(0);" shape="rect">关闭</a>
 
               选择席别（最多选择五个优先席别）
        </div>
<div class="first-train-list"><ul id="seat-list"><li name="商务座" scode="SWZ">商务座</li>
<li name="特等座" scode="TZ">特等座</li>
<li name="一等座" scode="ZY">一等座</li>
<li name="二等座" scode="ZE">二等座</li>
<li name="高级软卧" scode="GR">高级软卧</li>
<li name="软卧" scode="RW">软卧</li>
<li name="硬卧" scode="YW">硬卧</li>
<li name="动卧" scode="SRRB">动卧</li>
<li name="高级动卧" scode="YYRW">高级动卧</li>
<li name="软座" scode="RZ">软座</li>
<li name="硬座" scode="YZ">硬座</li>
<li name="无座" scode="WZ">无座</li>
</ul>
</div>
</div>
<!-- 选择优先席别结束 -->
<!-- 选择优先日期-->
<div id="sel-date" class="quick-box sel-rank" style="display:none;width: 710px;"><div class="quick-box-hd"><a onclick="$.closeSelectDate()" href="javascript:void(0);" shape="rect">关闭</a>
 
               选择日期（最多选择5个备选日期）
        </div>
<div class="first-train-list"><ul id="date-list"><li name="2019-05-18">2019-05-18</li>
<li name="2019-05-19">2019-05-19</li>
<li name="2019-05-20">2019-05-20</li>
<li name="2019-05-21">2019-05-21</li>
<li name="2019-05-22">2019-05-22</li>
<li name="2019-05-23">2019-05-23</li>
<li name="2019-05-24">2019-05-24</li>
<li name="2019-05-25">2019-05-25</li>
<li name="2019-05-26">2019-05-26</li>
<li name="2019-05-27">2019-05-27</li>
<li name="2019-05-28">2019-05-28</li>
<li name="2019-05-29">2019-05-29</li>
<li name="2019-05-30">2019-05-30</li>
<li name="2019-05-31">2019-05-31</li>
<li name="2019-06-01">2019-06-01</li>
<li name="2019-06-02">2019-06-02</li>
<li name="2019-06-03">2019-06-03</li>
<li name="2019-06-04">2019-06-04</li>
<li name="2019-06-05">2019-06-05</li>
<li name="2019-06-06">2019-06-06</li>
<li name="2019-06-07">2019-06-07</li>
<li name="2019-06-08">2019-06-08</li>
<li name="2019-06-09">2019-06-09</li>
<li name="2019-06-10">2019-06-10</li>
<li name="2019-06-11">2019-06-11</li>
<li name="2019-06-12">2019-06-12</li>
<li name="2019-06-13">2019-06-13</li>
<li name="2019-06-14">2019-06-14</li>
<li name="2019-06-15">2019-06-15</li>
<li name="2019-06-16">2019-06-16</li>
</ul>
</div>
</div>
<!-- 选择优先席别结束 -->
<!-- 快捷购票提示信息 -->
<div class="quick-tips" id="showquick1" style="display: none;width:200px;z-index:4000;"><span style="line-height:22px; color:#666;">选中后，在点击“查询”按钮时，系统将按您设置的查询条件自动、持续查询车票。当查询到满足条件的车票时，查询将自动停止。</span>
</div>
<div class="quick-tips" id="showquick2" style="display: none"><!--<span style="line-height:22px; color:#666;">闪购高级选项。选中后，“自动提交”默认选中，当系统查询到满足闪购选项的车票但票额少于选定的乘车人时，允许系统按票额数量忽略排在后面的乘车人，自动提交订单。</span> -->
<span style="line-height:22px; color:#666;">如果网站查询同一车次只有部分符合您设定条件的车票时，将按您设定的乘车人和席别优先顺序进行提交。</span>
</div>
<div class="quick-tips" id="showquick3" style="display: none;"><!-- <span style="line-height:22px; color:#666;">闪购高级选项。选中后，在点击“查询”按钮时系统将自动、持续查询车票，并在查询到满足闪购选项的车票时自动提交订单。</span>-->
<span style="line-height:22px; color:#666;">勾选本选项并点击查询后，网站将自动查询符合设定条件的车票信息，如有符合条件的车次，将自动提交订单信息。</span>
</div>
<div class="quick-tips" id="showquick4" style="display: none"><span style="line-height:22px; color:#666;">您可以从常用联系人中选择最多5个乘车人，网站将按您设定的先后顺序自动选择。</span>
</div>
<div class="quick-tips" id="showquick6" style="display: none"><span style="line-height:22px; color:#666;">您可以设定最多5个席别，网站将根据您设定的席别先后顺序和同一车次的余票情况自动选择。</span>
</div>
<div class="quick-tips" id="showquick5" style="display: none"><span style="line-height:22px; color:#666;">您可以设定最多5个车次，网站将根据您设定的车次先后顺序和同一车次的余票情况自动选择。</span>
</div>
<div class="quick-tips" id="showquick8" style="display: none"><span style="line-height:22px; color:#666;">您可以在当前日期外另行设定最多5个出发日，网站将根据您设定的先后顺序和余票情况自动选择。</span>
</div>
<div id="getTicket" style="display: none;margin-right: 1px;margin-bottom: 1px;height: 140px"><div class="mark" style="height: 20px"></div>
<div class="up-box" style="height: 140px"><div class="up-box-hd">恭喜您，查到有票车次了<a href="javascript:$jpopup.startOrHiden()" shape="rect">关闭</a>
</div>
<div class="up-box-bd" style="height: 140px"><div class="tit" id="filterRes"></div>
<div class="lay-btn" style="margin-left: -245px"><a href="javascript:" class="btn92s" id="showOnlyTicA" shape="rect">仅显示选定车次</a>
<a href="javascript:$jpopup.startOrHiden()" class="btn92" shape="rect">关闭</a>
</div>
</div>
</div>
</div>
<!-- 快捷购票提示信息结束 -->
<!-- 提交订单核对车票信息弹出层 start -->
<div id="autosubmitcheckticketinfo" style="display: none; top:600px;left:200px;"><div class="mark"></div>
<div class="up-box w664" id="content_autosubmitcheckticketinfo"><div class="up-box-hd">
                已查到车票，请核对以下信息
            </div>
<div class="up-box-bd ticket-check"><div class="info2" id="autosubmit_check_ticket_tit" style="width:550px;"></div>
<table class="table-a"><tr><th width="28" rowspan="1" colspan="1">序号</th>
<th rowspan="1" colspan="1">席别</th>
<th id="bed_show" style="display: none;" rowspan="1" colspan="1">铺别</th>
<th rowspan="1" colspan="1">票种</th>
<th rowspan="1" colspan="1">姓名</th>
<th rowspan="1" colspan="1">证件类型</th>
<th rowspan="1" colspan="1">证件号码</th>
<th rowspan="1" colspan="1">手机号码</th>
</tr>
<tbody id="autosubmit_check_ticketInfo"></tbody>
</table>
<!-- <p style="color: #3177BF;" id="notice_1_id">
 
                      注：1.系统将随机为您申请席位，暂不支持自选席位。
 
                </p>
 
 
                <div class="seat-sel seat-sel-round" id="id-seat-sel" style="display: none;">
                    <div class="seat-sel-hd"><div class="tips-xz">选座喽</div>已选座<span id='selectNo'>1/4</span></div>
                    <div class="seat-sel-bd">
                        第一排
                        <div class="sel-item" id="yideng1"  style="display: none;">
                            一等座
                            <div class="txt">窗</div>
                            <ul class="seat-list">
                                <li><a href="javascript:" id="1A">A</a></li>
                                <li><a href="javascript:" id="1C">C</a></li>
                            </ul>
                            <div class="txt">过道</div>
                             <ul class="seat-list">
                                <li><a href="javascript:" id="1D">D</a></li>
                                <li><a href="javascript:" id="1F">F</a></li>
                            </ul>
                            <div class="txt txt-last">窗</div>
                        </div>
                        <div class="sel-item" id="erdeng1"  style="display: none;">
                                二等座
                            <div class="txt">窗</div>
                            <ul class="seat-list">
                                <li><a href="javascript:" id="1A">A</a></li>
                                <li><a href="javascript:" id="1B">B</a></li>
                                <li><a href="javascript:" id="1C">C</a></li>
                            </ul>
                            <div class="txt">过道</div>
                             <ul class="seat-list">
                                <li><a href="javascript:" id="1D">D</a></li>
                                <li><a href="javascript:" id="1F">F</a></li>
                            </ul>
                            <div class="txt txt-last">窗</div>
                        </div>
                        <div class="sel-item" id="tedeng1"  style="display: none;">
                            特等座
                            <div class="txt">窗</div>
                            <ul class="seat-list">
                                <li><a href="javascript:" id="1A">A</a></li>
                                <li><a href="javascript:" id="1C">C</a></li>
                            </ul>
                            <div class="txt">过道</div>
                             <ul class="seat-list">
                                <li><a href="javascript:" id="1F">F</a></li>
                            </ul>
                            <div class="txt txt-last">窗</div>
                        </div>
 
                        第二排
                        <div class="sel-item"   id="yideng2"  style="display: none;">
                            一等座
                            <div class="txt">窗</div>
                            <ul class="seat-list">
                                <li><a href="javascript:" id="2A">A</a></li>
                                <li><a href="javascript:" id="2C">C</a></li>
 
                            </ul>
                            <div class="txt">过道</div>
                             <ul class="seat-list">
                                <li><a href="javascript:" id="2D">D</a></li>
                                <li><a href="javascript:" id="2F">F</a></li>
                            </ul>
                            <div class="txt txt-last">窗</div>
                        </div>
                        <div class="sel-item"    id="erdeng2"  style="display: none;">
                            二等座
                            <div class="txt">窗</div>
                            <ul class="seat-list">
                                <li><a href="javascript:" id="2A">A</a></li>
                                <li><a href="javascript:" id="2B">B</a></li>
                                <li><a href="javascript:" id="2C">C</a></li>
                            </ul>
                            <div class="txt">过道</div>
                             <ul class="seat-list">
                                <li><a href="javascript:" id="2D">D</a></li>
                                <li><a href="javascript:" id="2F">F</a></li>
                            </ul>
                            <div class="txt txt-last">窗</div>
                        </div>
                        <div class="sel-item"   id="tedeng2"  style="display: none;">
                            特等座
                            <div class="txt">窗</div>
                            <ul class="seat-list">
                                <li><a href="javascript:" id="2A">A</a></li>
                                <li><a href="javascript:" id="2C">C</a></li>
                            </ul>
                            <div class="txt">过道</div>
                             <ul class="seat-list">
                                <li><a href="javascript:" id="2F">F</a></li>
                            </ul>
                            <div class="txt txt-last">窗</div>
                        </div>
 
                    </div>
                </div>
 
 
                <div class="seat-sel seat-sel-round" id="id-bed-sel" style="display: none;">
                    <div class="seat-sel-hd">
                        <div class="tips-xz">选铺喽</div>
                            已选铺<span  id='selectBedNo'>1/4</span>
                    </div>
                    <div class="seat-sel-bd">
                        <div class="sel-item">
                            <div class="bed-yw">硬卧</div>
                            <div class="bed-item">
                                <div class="txt">下铺</div>
                                <div class="number-control-mini">
                                    <a href="javascript:" class="num-reduce" onclick="javascript:numSet('reduce','x_no');">-</a>
                                    <span class="num" id="x_no">1</span>
                                    <a href="javascript:" class="num-increase" onclick="javascript:numSet('add','x_no');">+</a>
                                </div>
                            </div>
                            <div class="bed-item" style="display: none;" id="mid_bed">
                                <div class="txt">中铺</div>
                                <div class="number-control-mini">
                                    <a href="javascript:" class="num-reduce" onclick="javascript:numSet('reduce','z_no');">-</a>
                                    <span class="num"  id="z_no">0</span>
                                    <a href="javascript:" class="num-increase" onclick="javascript:numSet('add','z_no');">+</a>
                                </div>
                            </div>
                            <div class="bed-item">
                                <div class="txt">上铺</div>
                                <div class="number-control-mini">
                                    <a href="javascript:" class="num-reduce" onclick="javascript:numSet('reduce','s_no');">-</a>
                                    <span class="num" id="s_no">0</span>
                                    <a href="javascript:" class="num-increase" onclick="javascript:numSet('add','s_no');">+</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div> -->
<p id="sy_ticket_num_id"><!--  尊敬的旅客，本次列车您选择的席别尚有余票<strong>1135</strong>张，无座<strong>840</strong>张。特此提醒。<br /> 请确认信息是否正确。如正确请点击“确定”，系统将为您分配席位。-->
</p>
<p id="orange_msg" style="color: orange;">
                    请确认以上信息是否正确，稍后系统将自动提交...
                </p>
<div class="yzm" style="display: none;"><form id="randCodeForm_id" onsubmit="javascript:return false;" method="get" enctype="application/x-www-form-urlencoded"><ul><div id="mypasscode2" data-code_type="passenger" data-touclick-type="inside"></div>
</ul>
</form>
</div>
<div class="lay-btn captchaButton passengerInfo-inside" data-touclick-name="other"></div>
<div class="lay-btn"><a id="back_edit" href="javascript:" class="btn92" shape="rect">返回修改</a>
<a style="display: none;" href="javascript:" class="btn92s" id="qr_submit1" shape="rect">确认</a>
</div>
</div>
</div>
</div>
<!-- 提交订单核对车票信息弹出层 end -->
<!-- 交易提示框 start  -->
<div id="transforNotice_id" style="display: none; margin-left: 30%; margin-top: 30%;"><div class="mark"></div>
<div class="up-box" id="content_transforNotice_id"><div class="up-box-hd" id="up-box-hd_id"><!--  <a id="closeTranforDialog_id" style="display: none;" href="javascript:">关闭</a>-->
 
 
                提示
 
 
 
            </div>
<div class="up-box-bd"><div class="up-con clearfix"><span class="icon i-work" id="iamge_status_id"></span>
<div class="r-txt" id="orderResultInfo_id"><!--  信息提示 -->
</div>
</div>
<div class="lay-btn" id="lay-btn_id"><!-- <a href="javascript:" id="qr_closeTranforDialog_id" style="display: none;" class="btn92s">确认</a> -->
</div>
</div>
</div>
</div>
<!-- 无验证码用户未登录弹出登录层 -->
<!-- 无验证码用户未登录弹出登录层 -->
<!-- 用户未登录弹出登录层 -->
<div id="relogin" style="display: none; z-index: 100px;margin: 0px auto 110px;"><div class="mark"></div>
<div class="up-box up-box-login" id="content"><div class="up-box-hd">请登录<a id="relogin_close" href="javascript:" shape="rect">关闭</a>
</div>
<form id="loginForm" method="get" enctype="application/x-www-form-urlencoded"><div class="up-box-bd"><div class="login"><ul><li><span class="formCont" style="float: left;"><span class="label">登录名：</span>
<input id="username" name="loginUserDTO.user_name" type="text" class="inptxt w200" tabindex="1" />
</span>
</li>
<li><span class="formCont" style="float: left;"><span class="label">密码：</span>
<input id="password" name="userDTO.password" type="password" class="inptxt w200" tabindex="2" />
<a href="javascript:" id="forget_my_password_id" shape="rect">忘记用户名/密码？</a>
</span>
</li>
<li id="mypasscode1" data-code_type="login" data-touclick-type="inside" data-page-identity="leftTicket-login" style="display: none"><!--要引入的验证码标签 -->
<script>var targettype=['Z','Z'];var targetdiv=['mypasscode1','mypasscode2'];var targetelement=['','other'];</script>
<script src="/otn/resources/js/newpasscode/new.js" xml:space="preserve"></script>
</li>
<!--
                        //inside: class="dl  captchaButton leftTicket-login-button-inside"
                        //float: class="dl  captchaButton captchaFloatButton leftTicket-login-button-float"
                        -->
<li class="dl  captchaButton leftTicket-login-button-float" data-touclick-name="" style="margin-top:6px"><a href="javascript:" class="btn200s" id="loginSubAsyn" tabindex="4" shape="rect">登录</a>
</li>
<li class="zc"><a href="/otn/regist/init" class="btn200" shape="rect">快速注册</a>
</li>
<li class="txt" style="height:4px"></li>
<li style="margin-top: -4px;"><span><h2 style="height: 25px;line-height: 25px;font-size: 14px;">温馨提示：</h2>
</span>
</li>
<li style="margin-top: -12px;line-height: 20px;color: #666666"><span>1、12306.cn网站每日06:00~23:00提供服务</span>
</li>
<li style="margin-top: -12px;line-height: 20px;color: #666666"><span>2、在12306.cn网站购票、改签和退票须不晚于开车前30分钟；办理“变更到站”业务时，请不晚于开车前48小时。</span>
</li>
</ul>
</div>
</div>
</form>
</div>
</div>
<!-- 用户未登录弹出层 end -->
<form id="_es_hiddenform" method="post" enctype="application/x-www-form-urlencoded"><input type="hidden" name="_json_att" value="" />
</form>
<div class="station" style="display:none;" id="train_stop"><b></b>
<div class="station-info" id="stationinfo"></div>
<div class="station-hd"><span class="zx">站序</span>
<span class="zm">站名</span>
<span class="dzsj">到站时间</span>
<span class="cfsj">出发时间</span>
<span class="tlsj">停留时间</span>
<a class="close" title="关闭" href="##" onclick="closeTrainStop()" shape="rect"></a>
</div>
<div class="station-bd"><table><tbody id="train_table"></tbody>
</table>
</div>
</div>
<div id="floatTable" class="t-list" style="display: none;width: 1188px;"><table><tr class="th"><th width="90" rowspan="1" colspan="1">车次</th>
<th width="100" rowspan="1" colspan="1"><div class="two-line"><span>出发站</span>
<br clear="none" />
<span>到达站</span>
</div>
</th>
<th width="82" rowspan="1" colspan="1"><div class="two-line" id="floatstartendtime"></div>
</th>
<th width="82" rowspan="1" colspan="1"><span class="b3" id="other_span_lishi">历时</span>
</th>
<th width="66" rowspan="1" colspan="1">商务座<br clear="none" />
特等座</th>
<!-- <th width="49">特等座</th> -->
<th width="66" rowspan="1" colspan="1">一等座</th>
<th width="66" rowspan="1" colspan="1">二等座</th>
<th width="66" rowspan="1" colspan="1">高级<br clear="none" />
软卧</th>
<th width="66" rowspan="1" colspan="1">软卧<br clear="none" />
一等卧</th>
<th width="66" rowspan="1" colspan="1">动卧</th>
<th width="66" rowspan="1" colspan="1">硬卧<br clear="none" />
二等卧</th>
<th width="66" rowspan="1" colspan="1">软座</th>
<th width="66" rowspan="1" colspan="1">硬座</th>
<th width="66" rowspan="1" colspan="1">无座</th>
<th width="66" rowspan="1" colspan="1">其它</th>
<th class="last" rowspan="1" colspan="1">备注</th>
</tr>
</table>
</div>
<div class="station" style="display:none;" id="train_div_"><b></b>
<div class="station-info" id="train_span_"><span class="item1">T69</span>
<span class="item2">北京南<em>--></em>
乌鲁木齐</span>
<span class="item3">特快</span>
<span class="item4">空调</span>
</div>
<div class="station-hd"><span class="zx">站序</span>
<span class="zm">站名</span>
<span class="dzsj">到站时间</span>
<span class="cfsj">出发时间</span>
<span class="tlsj">停留时间</span>
<a class="close" title="关闭" href="javascript:" onclick="myStopStation.close()"></a>
</div>
<div class="station-bd"><table><tbody id="train_table_"></tbody>
</table>
</div>
</div>
<div class="up-box w600" style="display: none;" id="confirmG1234"><div class="up-box-hd">继续预定<a id="close_conifrmdialog_G1234" href="javascript:" shape="rect">关闭</a>
</div>
<div class="up-box-bd"><div class="up-con clearfix"><span class="icon i-opt"></span>
<div class="r-txt"><div class="tit">您购买的G1234次列车需在到达“天津西”站后换乘，车厢号、席位号不变，是否继续购票？</div>
</div>
</div>
<div class="lay-btn"><a id="cancel_dialog_G1234" href="javascript:" class="btn92" shape="rect">取消</a>
<a href="javascript:" class="btn92s" id="goto_integration_G1234" shape="rect">继续</a>
</div>
</div>
</div>
<div class="up-box" id="notifysession" style="display: none;"><div class="up-box-hd">温馨提示<a href="#nogo" id="close_notifysession" shape="rect">关闭</a>
</div>
<div class="up-box-bd"><div class="up-con clearfix"><span class="icon i-win"></span>
<div class="r-txt"><div class="tit">本次登录成功！该用户已在其他地点登录，前次登录将被强制退出！</div>
</div>
</div>
<div class="lay-btn"><a href="#" class="btn92s" id="goto_notifysession" shape="rect">确定</a>
</div>
</div>
</div>
<div class="up-box w600" style="display: none;" id="confirmChangeStudentToAdult"><div class="up-box-hd">选择乘车人<a id="close_conifrmdialog_student_to_adult" href="javascript:" shape="rect">关闭</a>
</div>
<div class="up-box-bd"><div class="up-con clearfix"><span class="icon i-opt"></span>
<div class="r-txt"><div class="tit" id="conifrmdialog_student_to_adult_context">当前选择的优先席别有不支持学生票的，是否选择购买成人票？</div>
</div>
</div>
<div class="lay-btn"><a id="cancel_dialog_student_to_adult" href="javascript:" class="btn92" shape="rect">否</a>
<a href="javascript:" class="btn92s" id="goto_student_to_adult" shape="rect">是</a>
</div>
</div>
</div>
<!-- 优先车次开始 -->
<div id="yxtraindiv" class="quick-box sel-rank" style="display:none;width: 485px;"><div class="quick-box-hd"><a id="yxtrain_close" href="javascript:void(0);" shape="rect">关闭</a>
<div class="inp-wrap"><input id="yxtraininput" type="text" class="inp-txt" placeholder="请输入车次" />
<a href="javascript:void(0);" id="yxtrain_a_close" class="del" shape="rect"></a>
</div>
 
            选择车次（最多选择5个车次）
    </div>
<div class="first-train-list"><ul id="yxtrain_code"></ul>
<div id="yxtrain_loading" class="train-loading"><img src="/otn/resources/images/loading.gif" alt="" />
</div>
<div id="yxtrain_empty" class="train-empty">没有查询到车次</div>
<div id="yxTrain_page" class="train-page" style="display: none;"></div>
</div>
</div>
<!-- 优先车次结束 -->
<div class="mask" style="display: none;"></div>
<div style="display: none;" class="modal-login"><div class="modal-login-tit"><h2>您尚未登录</h2>
<a href="javascript:;" class="close" shape="rect"><i class="icon icon-close"></i>
</a>
</div>
<!--  仅显示账户登录添加样式login-box-account，验证码隐藏添加样式 login-box-account-nocode -->
<div class="login-box"><ul class="login-hd"><li class="login-hd-code active"><a href="javascript:;" shape="rect">扫码登录</a>
</li>
<li class="login-hd-account"><a href="javascript:;" shape="rect">账号登录</a>
</li>
</ul>
<div class="login-bd"><!-- 扫码登录 -->
<div class="login-code" style="display: none;"><div id="J-login-code-loading" class="login-code-loading" style="display: none;"><img src="../resources//images/loading.gif" />
</div>
<div id="J-login-code-con" class="login-code-con"><div class="login-code-main"><div class="code-pic"><img id="J-qrImg" />
<div id="J-code-error-mask" style="display: none;" class="code-error-mask"></div>
<div id="J-code-error" style="display: none;" class="code-error"><p>二维码已失效</p>
<a href="javascript:;" class="btn btn-primary" shape="rect">刷新</a>
</div>
</div>
<div class="code-tips"><img src="../resources/images/code-tips.png" alt="" />
</div>
</div>
<div class="login-code-txt">打开<span class="txt-primary">12306手机APP</span>
  扫描二维码</div>
<div class="login-code-txt"><a href="https://kyfw.12306.cn/otn/regist/init" class="txt-primary" shape="rect">注册12306账号</a>
</div>
</div>
<div id="J-login-code-success" class="login-code-con login-code-success hide"><img src="../resources/images/login-success.png" alt="" />
<h3>扫描成功！</h3>
<p>请勿刷新页面，在手机上确认登录！</p>
</div>
<ul class="login-code-ft"><li><i class="icon icon-scan"></i>
扫一扫登录</li>
<li><i class="icon icon-quick"></i>
更快</li>
<li class="last"><i class="icon icon-safe"></i>
更安全</li>
</ul>
</div>
<!-- 账号登录 -->
<div class="login-account" style="display: none;"><div class="login-item"><label for="user" class="item-label"><i class="icon icon-user"></i>
</label>
<input type="text" class="input" id="J-userName" placeholder="用户名／邮箱／手机号" />
</div>
<div class="login-item"><label for="pwd" class="item-label"><i class="icon icon-pwd"></i>
</label>
<input type="password" class="input" id="J-password" placeholder="密码" />
</div>
<div class="login-pwd-code"><!-- 验证码区域 -->
<div style="border: 0; width: 300px; height: 188px; margin: 0 10px;" class="touclick-wrapper lgcode-2018"><div class="lgcode-error" style="display: none;"></div>
<div class="lgcode-success" style="display: none;"></div>
<div class="lgcode-refresh"></div>
<div id="J-loginImgArea" class="loginImg"><img id="J-loginImg" class="imgCode" alt="" src="" style="display: inline;" />
</div>
<div class="lgcode-loading" style="display: none;"><img src="../resources/images/loading.gif" alt="" style="display: none;" />
</div>
<div id="J-passCodeCoin"></div>
</div>
</div>
<div class="login-error" id="J-login-error"><i class="icon icon-plaint-fill"></i>
<span>用户名或密码输入错误</span>
</div>
<div class="login-btn"><a id="J-login" href="javascript:;" class="btn btn-primary form-block" shape="rect">立即登录</a>
</div>
<div class="login-txt"><a href="https://kyfw.12306.cn/otn/regist/init" class="txt-primary" shape="rect">注册12306账号</a>
| <a href="https://kyfw.12306.cn/otn/forgetPassword/initforgetMyPassword" class="txt-lighter" shape="rect">忘记密码？</a>
</div>
</div>
</div>
<div class="login-ft"><p>1、12306.cn网站每日06:00~23:00提供服务。</p>
<p>2、在12306.cn网站购票、改签和退票须不晚于开车前30分钟；办理“变更到站”业务时，请不晚于开车前48小时。</p>
</div>
<div id="login_control_offline" name="login_control_mask" class="panel-tooltip left panel-tooltip-login" style="bottom: 150px; left: 390px;display: none;"><a name="login_control_close" href="javascript:void(0);" class="tooltip-close" shape="rect"><i class="icon icon-close"></i>
</a>
<div class="tooltip-arw"></div>
<div class="tooltip-txt tooltips-login-con"><div class="tooltips-login-side"><img src="/otn/resources/images/download.png" alt="" />
</div>
<div class="tooltips-login-main"><h3 class="tooltips-login-tit"><i class="icon icon-plaint-fill txt-danger"></i>
身份核验提醒</h3>
<p class="tooltips-login-txt">您的身份信息有问题，请使用12306APP进行人脸核验。</p>
</div>
</div>
</div>
<div id="login_control_app" name="login_control_mask" class="panel-tooltip left panel-tooltip-login" style="bottom: 150px; left: 390px;display: none;"><a name="login_control_close" href="javascript:void(0);" class="tooltip-close" shape="rect"><i class="icon icon-close"></i>
</a>
<div class="tooltip-arw"></div>
<div class="tooltip-txt tooltips-login-con"><div class="tooltips-login-side"><img src="/otn/resources/images/login/counter.png" alt="" />
</div>
<div class="tooltips-login-main"><h3 class="tooltips-login-tit"><i class="icon icon-plaint-fill txt-danger"></i>
身份核验提醒</h3>
<p class="tooltips-login-txt">您的身份信息有问题，需到线下窗口进行身份核验，才能进行登录。</p>
</div>
</div>
</div>
<div id="login_control_msg" name="login_control_mask" class="panel-tooltip left panel-tooltip-login" style="bottom: 150px; left: 390px;display: none;"><a name="login_control_close" href="javascript:void(0);" class="tooltip-close" shape="rect"><i class="icon icon-close"></i>
</a>
<div class="tooltip-arw"></div>
<div class="tooltip-txt tooltips-login-con"><h3 class="tooltips-login-tit"><i class="icon icon-plaint-fill txt-danger"></i>
手机验证提醒</h3>
<p id="login_control_mobile" class="tooltips-login-txt">请用尾号2753手机号发短信666到12306。</p>
<div class="tooltips-login-search"><input maxlength="6" id="up_msg_code" type="text" class="input" />
<a id="login_control_submit" href="javascript:void(0);" class="btn btn-primary" shape="rect">确定</a>
<div style="display: none;" id="login_control_error" class="tips-info-txt"><i class="icon icon-plaint-fill txt-error"></i>
验证码错误</div>
</div>
</div>
</div>
</div>
</div>
<!-- 购物车 -->
<div style="display: none;" class="buy-cart"><div class="cart-hd"><span class="num">0</span>
</div>
<div class="cart-bd" style="display: none;"><div class="cart-bd-top"><h3><span id="hbTrainDate">候补购票需求列表</span>
<a id="hbClear" href="javascript:void(0)" shape="rect">[清空]</a>
</h3>
<a href="javascript:void(0)" class="close" shape="rect">×</a>
</div>
<div class="cart-bd-con"><ul class="cart-tlist"></ul>
</div>
<div class="cart-bd-ft"><p class="cart-ft-tips">1、候补订单需求中可包含2个相邻乘车日期，每个乘车日期可包含2个不同“车次+席别”的组合需求。</p>
<p class="cart-ft-tips">2、“当前待兑现单数”是已经完成支付，等待兑现的候补订单数量。</p>
<a id="hbSubmit" href="javascript:void(0)" class="btn72 fr" shape="rect">添加乘客</a>
</div>
</div>
</div>
</body>
</html>
<script type="text/javascript" src="/otn/resources/js/framework/station_name.js?station_version=1.9100" xml:space="preserve"></script>
<script type="text/javascript" src="/otn/resources/js/framework/favorite_name.js" xml:space="preserve"></script>
<script type="text/javascript" src="/otn/resources/merged/queryLeftTicket_end_js.js?scriptVersion=1.9140" xml:space="preserve"></script>
<!--  <link utils:merger="queryLeftTicket_css" th:href="${#httpServletRequest.contextPath}+'/resources/js/rich/calender_double/dhtmlxcalendar.css'"
    href="../../../resources/js/rich/calender_double/dhtmlxcalendar.css" rel="stylesheet"></link>   
<link utils:merger="queryLeftTicket_css" th:href="${#httpServletRequest.contextPath}+'/resources/js/rich/calender_double/skins/dhtmlxcalendar_dhx_skyblue.css'"
    href="../../../resources/js/rich/calender_double/skins/dhtmlxcalendar_dhx_skyblue.css" rel="stylesheet"></link>   
<script utils:merger="queryLeftTicket_js" th:src="${#httpServletRequest.contextPath}+'/resources/js/rich/calender_double/dhtmlxcalendar.js'"
    type="text/javascript" src="../../../resources/js/rich/calendar/dhtmlxcalendar.js"></script>
<script utils:merger="queryLeftTicket_js" th:src="${#httpServletRequest.contextPath}+'/resources/js/rich/calender_double/dhtmlxcalendar_double.js'"
    type="text/javascript" src="../../../resources/js/rich/calender_double/dhtmlxcalendar_double.js"></script>-->
<script xml:space="preserve">
    /*<![CDATA[*/
    //为了国际化，需要定义后台获取的字符串
    $.views.helpers({
        buttonText : function() {
            return '\u9884\u8BA2';
        }
    });
    $.views.helpers({
        isNum : function(value) {
            //alert(value);
            return parseInt(value);
        }
    });
    $.views.helpers({
        changeLiShi : function(value) {
            if (value.substring(0,1) == "0") {
                if (value.substring(1,2) == "0") {
                    if (value.substring(3,4) == "0") {
                        value = value.substring(4,5) + "分";
                    } else {
                        value = value.substring(3,5) + "分";
                    }
                } else {
                    value = value.substring(1,2) + "小时" + value.substring(3,5) + "分";
                }
            } else {
                if (value.substring(3,5) == "00") {
                    value = value.substring(0,2) + "小时";
                } else {
                    value = value.substring(0,2) + "小时" + value.substring(3,5) + "分";;
                }
            }
            return value;
        }
    });
    $.views.helpers({
        changeArriveDate : function(value1, value2) {
            value1 = value1.replace(":", "");
            value2 = value2.replace(":", "");
            hour_value = Number(value1.substring(0,2)) + Number(value2.substring(0,2));
            min_value = Number(value1.substring(2,4)) + Number(value2.substring(2,4));
            if (min_value >= 60) {
                hour_value = hour_value + 1;
            }
            if (hour_value >= 24 && hour_value < 48) {
                return "次日";
            } else if(hour_value >= 48 && hour_value < 72) {
                return "两日";
            } else if(hour_value >= 72) {
                return "三日";
            } else {
                return "当日";
            }
        }
    });
    var from_station = '';
    var from_station_name = '';
    var to_station = '';
    var to_station_name = '';
    var trainDate = '2019-05-18';
    var backTrainDate = '2019-05-18';
    var page_show_flag = null;
    var purposeCodeFromIndex = null;
    var roundReferTime = null;
    var studentComPerArr=['2019-06-01','2019-09-30','2019-12-01','2019-12-31','2019-01-01','2019-03-31'];
    var studentMindate='2019-05-18';
    var studentMaxdate='2019-06-16';
    var otherMindate = '2019-05-18';
    var otherMaxdate = '2019-06-16';
    // 日期范围传参
    //var init_train_no = null;
    var init_minPeriod = '2019-05-18';
    var init_maxPeriod = '2019-06-16';
    //var init_train_date = null;
    //var init_back_train_date = null;
    var back_train_date = null;
    // 客运首页进入传参
    //var index_from_station = null;
    var index_to_station = null;
    //var index_from_station_name = null;
    //var index_to_station_name = null;
    var index_train_date = null;
    //var index_back_train_date = null;
    //var index_tour_flag = null;
    // 学生票传参，用于判断
    var stu_start_train_date = '2019-06-01 00:00:00&2019-12-01 00:00:00&2019-01-01 00:00:00';
    var stu_end_tain_date = '2019-09-30 00:00:00&2019-12-31 00:00:00&2019-03-31 00:00:00';
    var stu_buy_date = '2019-05-18&2019-06-16';
    var other_buy_date = '2019-05-18&2019-06-16';
    // 从确认乘客信息页面返回至余票查询页面传参
    //var step_tour_flag = null;
    //var step_from_station = null;
    //var step_from_station_name = null;
    //var step_to_station = null;
    //var step_to_station_name = null;
    //var step_train_date = null
    //var step_back_train_date = null
    // 从订单确认页面预订返程返回至余票查询页面传参
    //var fc_from_station = null;
    //var fc_from_station_name = null;
    //var fc_to_station = null;
    //var fc_to_station_name = null;
    //var fc_train_date = null
    //var fc_back_train_date = null;
    //var fc_tour_flag = null;
    // 改签
    //var gc_from_station = null;
    //var gc_from_station_name = null;
    //var gc_to_station = null;
    //var gc_to_station_name = null;
    //var gc_train_date = null
    //var gc_back_train_date = null;
    //var gc_tour_flag = null;
    // 旅程类型传参，用于判断跳转
    var train_tour_flag = 'other';
    var tour_flag='';
    var dateArr =['05-18','05-19','05-20','05-21','05-22','05-23','05-24','05-25','05-26','05-27','05-28','05-29','05-30','05-31','06-01','06-02','06-03','06-04','06-05','06-06','06-07','06-08','06-09','06-10','06-11','06-12','06-13','06-14','06-15','06-16'];
    var fullDateArr =['2019-05-18','2019-05-19','2019-05-20','2019-05-21','2019-05-22','2019-05-23','2019-05-24','2019-05-25','2019-05-26','2019-05-27','2019-05-28','2019-05-29','2019-05-30','2019-05-31','2019-06-01','2019-06-02','2019-06-03','2019-06-04','2019-06-05','2019-06-06','2019-06-07','2019-06-08','2019-06-09','2019-06-10','2019-06-11','2019-06-12','2019-06-13','2019-06-14','2019-06-15','2019-06-16'];
    var otherDateArr = ['2019-05-18','2019-05-19','2019-05-20','2019-05-21','2019-05-22','2019-05-23','2019-05-24','2019-05-25','2019-05-26','2019-05-27','2019-05-28','2019-05-29','2019-05-30','2019-05-31','2019-06-01','2019-06-02','2019-06-03','2019-06-04','2019-06-05','2019-06-06','2019-06-07','2019-06-08','2019-06-09','2019-06-10','2019-06-11','2019-06-12','2019-06-13','2019-06-14','2019-06-15','2019-06-16'];
    var ClickWho =''
    var isstudentDate=true
    var isInMaintenanceHours = false;
    var isSuperLogin = false;
    //快捷购票添加
    var passengerAll=null;
    var passengerChecked=[];//已选常用联系人
    var xbChecked=[];//已选席别
    var rqChecked=[];//已选日期
    var ccSelected=[];//已选车次
 
    var autoSearchTime=5000;
    var noticeContent = null;
 
    var isSaveQueryLog='N';
 
    var other_control=30;
    var stu_control=30;
    var isDwTicketResign='N';
    var DW_TRAINS=['D4805','D4807','D4831','D901','D902','D903','D904','D905','D906','D907','D908','D909','D910','D915','D921','D922','D923','D924','D927','D928','D931','D932','D934','D933','D935','D936','D937','D938','D965','D925','D926','D941','D942','D943','D944'];
    var canChangeToStation=null;
    var if_show_pass_code_login = 'Y';
    var intervalTime=null;
    var queryOrderWaitTimeInterval='3000';
    var canChooseSeats=null;
    var choose_Seats=null;
    var canChooseBeds=null;
    var isCanChooseMid=null;
 
    var hainan_limit_from_telcode=',BFQ,UFQ,FZQ,HMQ,KLQ,PFQ,UQQ,KGQ,LIQ,MHQ,QZQ,QYQ,JUQ,SEQ,WEQ,YUQ,CTQ,FJQ,PYQ,WNQ,ACQ,TWQ,VUQ,BWQ,KEQ,SRQ,';
    var hainan_limit_to_telcode=',BFQ,UFQ,FZQ,HMQ,KLQ,PFQ,UQQ,KGQ,LIQ,MHQ,QZQ,QYQ,JUQ,SEQ,WEQ,YUQ,CTQ,FJQ,PYQ,WNQ,ACQ,TWQ,VUQ,BWQ,KEQ,SRQ,';
    var hainan_limit_start_traindate='2019-05-28';
    var hainan_limit_msg='';
 
    var is_uam_login='Y';
 
    /*]]>*/
</script>
<script id="queryPriceTemplate" type="text/x-jsrender" xml:space="preserve"><!--
    <td colspan="4"></td>
    {{if  A9 != null && P != null}}
        <td width="46" align="center"></td>
    {{else}}
        {{if  A9 != null}}
            <td width="46" align="center" class="p-num">{{>A9}}</td>
        {{else}}
            {{if P != null}}
                <td width="46" align="center" class="p-num">{{>P}}</td>
            {{else}}
                <td width="46" align="center"></td>
            {{/if}}
        {{/if}}
    {{/if}}
 
    {{if M != null}}
    <td width="46" align="center" class="p-num">{{>M}}</td>
    {{else}}
    <td width="46" align="center"></td>
    {{/if}}
 
    {{if O != null}}
    <td width="46" align="center" class="p-num">{{>O}}</td>
    {{else}}
    <td width="46" align="center"></td>
    {{/if}}
 
    {{if A6 != null}}
    <td width="46" align="center" class="p-num">{{>A6}}</td>
    {{else}}
    <td width="46" align="center"></td>
    {{/if}}
 
 
    {{if A4 != null}}
    <td width="46" align="center" class="p-num">{{>A4}}</td>
    {{else AI != null}}
            <td width="46" align="center" class="p-num">{{>AI}}</td>
    {{else}}
    <td width="46" align="center"></td>
    {{/if}}
 
    {{if F != null}}
    <td width="46" align="center" class="p-num">{{>F}}</td>
    {{else}}
    <td width="46" align="center"></td>
    {{/if}}
    {{if A3 != null}}
    <td width="46" align="center" class="p-num">{{>A3}}</td>
    {{else AJ != null}}
            <td width="46" align="center" class="p-num">{{>AJ}}</td>
    {{else}}
    <td width="46" align="center"></td>
    {{/if}}
     {{if A2 != null}}
    <td width="46" align="center" class="p-num">{{>A2}}</td>
    {{else}}
    <td width="46" align="center"></td>
    {{/if}}
    {{if A1 != null}}
    <td width="46" align="center" class="p-num">{{>A1}}
    </td>
    {{else}}
    <td width="46" align="center"></td>
    {{/if}}
    {{if WZ != null}}
    <td width="46" align="center" class="p-num">{{>WZ}}
    </td>
    {{else}}
    <td width="46" align="center"></td>
    {{/if}}
{{if MIN!=null}}
    <td width="51" align="center">
        <div class="sleeper" id="sleeper-price_{{>train_no}}">
        <p class="p-num">{{>MIN}}</p>
        <div class="tp-list" id="tp-list-price_{{>train_no}}" style="display:none;">
        <b></b>
        <ul>
        {{for OT}}
            <li>{{>#data}}</li>
        {{/for}}
        </ul>
        </div>
        </div>
    </td>
{{else}}
<td width="46" align="center"></td>
{{/if}}   
<td align="center" width="78" class="no-br">{{>}}</td>
-->
</script>
<script id="autoSubCheckTicketInfoTemplate" type="text/x-jsrender" xml:space="preserve"><tr><td align="center" rowspan="1" colspan="1">{{:#index+1}}</td>
<td rowspan="1" colspan="1">{{>seat_type_name}}</td>
<td rowspan="1" colspan="1">{{>ticket_type_name}}</td>
<td rowspan="1" colspan="1">{{>name}}</td>
<td rowspan="1" colspan="1">{{>id_type_name}}</td>
<td rowspan="1" colspan="1">{{>id_no}}</td>
<td rowspan="1" colspan="1">{{>phone_no}}</td>
</tr>
</script>
<script id="autoSubCheckTicketInfoTemplate_chooseBeds" type="text/x-jsrender" xml:space="preserve"><!--
<tr>
    <td align="center" >{{:#index+1}}</td>
 
    <td>{{>seat_type_name}}</td>
 
 
    {{if "3" == seat_type}}
        <td>
            <select style="height: 27px;FONT-SIZE: 12px;FONT-FAMILY: '宋体','Verdana';BACKGROUND-COLOR: #FFFFF0;color: #FB7403;MARGIN-LEFT: 3px;" id="ticketype_{{:#index}}">
                 <option value="{{>seat_type}}#{{>ticket_type}}#{{>name}}#{{>id_no}}_0" selected="selected">不限</option>
                <option value="{{>seat_type}}#{{>ticket_type}}#{{>name}}#{{>id_no}}_3">上铺 </option>
                <option value="{{>seat_type}}#{{>ticket_type}}#{{>name}}#{{>id_no}}_2">中铺 </option>
                <option value="{{>seat_type}}#{{>ticket_type}}#{{>name}}#{{>id_no}}_1">下铺 </option>
            </select>
        </td>
    {{else "4" == seat_type}}
        <td>
            <select style="height: 27px;FONT-SIZE: 12px;FONT-FAMILY: '宋体','Verdana';BACKGROUND-COLOR: #FFFFF0;color: #FB7403;MARGIN-LEFT: 3px;"  id="ticketype_{{:#index}}">
                 <option value="{{>seat_type}}#{{>ticket_type}}#{{>name}}#{{>id_no}}_0" selected="selected">不限</option>
                <option value="{{>seat_type}}#{{>ticket_type}}#{{>name}}#{{>id_no}}_3">上铺 </option>
                <option value="{{>seat_type}}#{{>ticket_type}}#{{>name}}#{{>id_no}}_1">下铺 </option>
            </select>
        </td>   
    {{else}}
        <td></td>   
    {{/if}}
 
 
 
    <td>{{>ticket_type_name}}</td>
 
    <td>{{>name}}</td>
 
    <td>{{>id_type_name}}</td>
 
    <td>{{>id_no}}</td>
 
    <td>{{>phone_no}}</td>
 
</tr>
-->
</script>
<script id="autoSubTicketTitTemplate" type="text/x-jsrender" xml:space="preserve"><strong class="mr5">{{>date}}（{{>week}}）</strong>
<strong class="ml5">{{>station_train_code}}</strong>
次<strong class="ml5">{{>from_station}}</strong>
站
    <strong>（{{>start_time}}开）—{{>to_station}}</strong>
站<strong>（{{>arrive_time}}到）</strong>
</script>
<script id="fromStationNameTemplate" type="text/x-jsrender" xml:space="preserve"><!--
    <li><input type="checkbox" class="check" name="cc_from_station" value="{{>value}}" id="cc_from_station_{{>value}}_check"></input><label class="cursor"  for="cc_from_station_{{>value}}_check" id="cc_from_station_{{>value}}">{{>value}}</label></li>
-->
</script>
<script id="toStationNameTemplate" type="text/x-jsrender" xml:space="preserve"><!--
    <li><input type="checkbox" class="check" name="cc_to_station" value="{{>value}}" id="cc_to_station_{{>value}}_check"></input><label class="cursor"  for="cc_to_station_{{>value}}_check" id="cc_to_station_{{>value}}">{{>value}}</label></li>
-->
</script>
<script id="seatTypeTemplate" type="text/x-jsrender" xml:space="preserve"><!--
    <li><input type="checkbox" class="check" value="{{>key}}" name="cc_seat_type" id="cc_seat_type_{{>key}}_check"></input><label class="cursor" for="cc_seat_type_{{>key}}_check" id="cc_seat_type_{{>key}}">{{>value}}</label></li>
-->
</script>
<script id="stationinfoTemplate" type="text/x-jsrender" xml:space="preserve"><!--
<span class="item1">{{>key}}</span><span class="item2">{{>key}}<em>\-\-\></em>{{>key}}</span><span class="item3">{{>key}}</span><span class="item4">{{>key}}</span>
-->
</script>
<!-- 农历日历 -->
<link href="/otn/resources/css/calendarNew.css" rel="stylesheet" />
<script type="text/javascript" src="/otn/resources/js/framework/data.jcalendar.js" xml:space="preserve"></script>
<script type="text/javascript" src="/otn/resources/js/framework/jquery.SuperSlide.js" xml:space="preserve"></script>
<script type="text/javascript" xml:space="preserve">
(function ($) {
    $(document).ready(function() {
        $('.login-code-main').hover(function(){
          $('.login-code-main .code-pic').stop().animate({
            'left' : 0
          },300,function(){
            $('.login-code-main .code-tips').show()
          })
        },function(){
          $('.login-code-main .code-tips').hide();
          $('.login-code-main .code-pic').stop().animate({
            'left' : '80px'
          },300)
        })
 
        $('.modal-login').hide();
        $('.mask').hide();
 
        // 关闭弹出框
        $('.modal-login .close').on('click', function() {
            $('.modal-login').hide();
            $('.mask').hide();           
            $.popup_clearInterval();
        })
 
    });
})(jQuery);
</script>
 
```

 

# /otn/leftTicket/query

## 输入

```
GET /otn/leftTicket/query?leftTicketDTO.train_date=2019-05-25&leftTicketDTO.from_station=HGH&leftTicketDTO.to_station=NGH&purpose_codes=ADULT HTTP/1.1
Host: kyfw.12306.cn
Connection: keep-alive
Cache-Control: no-cache
Accept: */*
X-Requested-With: XMLHttpRequest
If-Modified-Since: 0
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.157 Safari/537.36
Referer: https://kyfw.12306.cn/otn/leftTicket/init?random=1558182574261
Accept-Encoding: gzip, deflate, br
Accept-Language: zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,ja;q=0.6
Cookie: JSESSIONID=17D2A5B49CB312109D036040D8EF5154; tk=c9g0-ECRWXRzrVzAM9mty3IEo020ratnKtn-76pLPh4ij1110; _jc_save_toStation=%u5B81%u6CE2%2CNGH; _jc_save_wfdc_flag=dc; BIGipServerotn=619708938.64545.0000; RAIL_EXPIRATION=1558445401115; RAIL_DEVICEID=ojOchhXouyQKkRIDOIOEYE223_WcKcaOuF-_z82P-CYHNuKQOQA6fkynsTMigwJkqEHRabHNmpVRc0I8wVMQioy8eY2wYFbmATsvNP5SRPVofNqBITahBMUmcv5zPO3WcdwpO4jr6MtgbmqT1knkYn0qBbUShMDp; BIGipServerpool_passport=351076874.50215.0000; route=6f50b51faa11b987e576cdb301e545c4; _jc_save_toDate=2019-05-18; _jc_save_fromDate=2019-05-25; _jc_save_fromStation=%u676D%u5DDE%2CHGH
```

## 输出

```
{
    "data": {
        "flag": "1",
        "map": {
            "HGH": "杭州东",
            "HZH": "杭州",
            "NGH": "宁波"
        },
        "result": ["FGGZDAssbQFZnwi2yZzdYT2Tc88aE9KxcSbaWKnuPcvKiWi%2FIlxa3V7%2FEcISJCoVuPsk1AkoLnyh%0AFuo0PzbjxL62FfbdkHDDHW3zSSuOVPgo8FPskeN0iv%2FR25ZF%2B3sbq8xbyjhupkvuOjDYKym7GQUV%0Aieay1NiCs9zm125U4gDFpvO7HlePCaf6thwtSJ2sKaOelgbQ3VK7AQb6QJjnmcaQ%2BFtCvqDKLraB%0AH4UhQOPb9k8AVL63EzuMEON2iNYo04el0O7q7%2FnsgLxWdpNzx3JJz%2FHtDFAw%2FOA2Bv5uqgvHvG7h%0AdiaOAQ%3D%3D|预订|53000K849902|K8499|FYH|NGH|HZH|NGH|02:46|05:45|02:59|Y|tXk87aPcgo9DY%2B2tB4setkxnEGagbTn0hW2fMJ5EEEpCf%2Fk8zbKE%2FSfwa2I%3D|20190524|3|H2|09|12|0|0||||11|||有||10|有|||||10401030|1413|0|0|null", "fodPabGWaFSkmzscyJUasb7UXU%2BjfLNKE004IiK0MYHCIE1Z1GEWqkTcSzULXh8loDxLf0JxnMEC%0AO8LKzsuNdc77HzMFegdXBTSg2ksQW71jvp%2FSerCRQN7tPo7vpyhSgbPyVnxvkDVZDxCRkKELSzrK%0AFuNyG%2BpcWgC8%2FtcQ7P7fnBhBHciDGwT%2FEkiqoD3x15uxN8u8CTkKjq1ouNUDbP1iutlrY7K9VZzz%0AfJL0A4x807F%2BGlnF0DHU%2BMx5kvs3INdmOeGQiZJe7v7v1Oub5JvozX297I%2BSjv9s%2FzZrETv9STn7%0ANPH2uA%3D%3D|预订|85000K104201|K1039|LZJ|NGH|HZH|NGH|04:45|07:58|03:13|Y|JQ%2BUCap4d5Mp48mEmA7P6W1%2BHOwDOCH%2FvcITQDxmpVCpOUM3RXcPHSAo814%3D|20190523|3|J1|26|29|0|0||||无|||无||6|有|||||10401030|1413|1|0|null", "%2FShVnKertcpZmhtKB1PvJV0740BtUfdgz0cd%2BNoF8d07a%2Fwr3TbMos95ovZ5W9bryCd6YgfKTmZ6%0AEfiUbHObXfr1fqqDAU5vsRCPhhEB3w%2FZzomBNpQFhG1YsIv9P3z%2FDSm8TPSQ1Rne43j7OYMjwXIo%0AVKkgFNpt4eU4zB93eN5z9Y%2FaDBDr64XnHY1vyVY1O2l4Sdyxa0YTuuEyevWZVMeMNuSKLOkQsxuy%0AJmz0HqbckWwVjikRxMJbZdacl3EA5zVHO39iKpDzMx%2FwSPfhNEfRheMa1sbPdsQ5Xtv0U7g%3D|预订|53000K8563A5|K8563|BZH|NGH|HGH|NGH|05:15|07:28|02:13|Y|YDAiLi9GaT6bGLpRa3X4G9%2FMBnkdpMfB9Q9xYRxgU6b6eq1R|20190524|3|H6|07|09|0|0|||||||有||有|有|||||101030|113|0|0|null", "OUJYO4W4sU4T3s0PC84lKLoGX4nEHkHFcPwnetpofbWpufv2pw2DYclZO0WnJhJoM3eLZL%2BzSuqk%0ALxSYJNuHQaEXQTU9MSXKHPRL918CY1jp0hgBUTpfqcbjMoXbFf4J5%2BqgZ%2Bg7p9B%2FQcVkgDIrYSj6%0AWpzKQ3rXW5rdX2fcbfISvKOce84ReIB1KKrnC6MbAlLwdrYVUj%2Bz%2Ft2AWFgtCwYkSe46FwnxSxAN%0A8dF2fpQg13u3QjVCrOgoMgMnwtwJRiEGXcbN4orr4yBxm6jnNn%2BkE7gXZ09mS9%2FSAAX%2FF3kC%2F5eC%0AbsznMg%3D%3D|预订|39000K143703|K1437|LON|NGH|HZH|NGH|05:20|09:05|03:45|Y|MFF5N3KoDfzdHZVZC7yWgODxId3ugBqGgnKiGXoGU5qkX336qLgZsY11n3g%3D|20190524|3|N7|13|16|0|0||||4|||无||有|8|||||10403010|1431|0|0|null", "MirRe5Drrhe7jyy52HFjr1%2FRMa4sTufDl6c%2BubsYJTpa9v5LUtRcQfL30YZnEtLA%2FRPMs%2Fweo9k%2F%0A19EeRFW16vOExe1jK7NvhbbjB5HWO9Kz7TZ3t9dQANA1I4mK878eDALQJjGiFddH6d1CDFNorKh1%0A%2F5JwqL0FafI91pu3TjRb0h38MjM5AnMzh8d0UaxDS%2BDeg5xNCsZpjT4zavakXhx0GCuaY6nE%2BCVV%0AQpRNzjjohRtEUN6GffWxWlpDdVulKnTcGF3qS9bPRQJZ0eG8sBUIDtQgB6h5IU7G0sv0TLkHWbR1%0A7JIcJGZUEsg%3D|预订|56000G765960|G7659|HGH|VRH|HGH|NGH|06:33|07:45|01:12|Y|eioKyhP0RHIMuhY%2BiNWp5GT4w1MfSOyzRC6gEKccPMJGzu67KdcTLJzdVMc%3D|20190525|3|H3|01|06|1|0|||||||有||||有|有|有||O090M0O0|O9MO|1|0|null", "3Yd5tmTHnldsd1Rw%2F%2B13Y5j2whiXdgiNP8uuinj4jtSMN%2BrBK%2BsiWqYLPtuFjsNDwMzQplz9wftu%0AuEOBH6OwgVyFRqrzHHRcaTtTyvXeIMA7SqY%2FVfGehf9sTLQ1xy6jGpkF8OFeLYvd2wu9sprQkcUm%0A1gIfllD0lB%2BnlAZefNqptfMoVUmr8p3wMoY4RrwEXmpM%2BS4O3JwkXGuwxcL4XB5T0S1yy2lJj02%2B%0A1TaCTUEQxnAfOf7oZmFf7XZGcUYGA2dN10pjYSqEzeCFEyU8s3spL59rhVKUO5Cl50MtyFrQf0mn%0AxWiuH68xJGs%3D|预订|5l000G754162|G7541|AOH|TZH|HGH|NGH|06:54|07:50|00:56|Y|2yqwLQL51ulLgz2i9Aw%2FehpCLVAg%2FYnnjjmW4njfZiwBYEK1e3Hkm%2F6NJ58%3D|20190525|3|H2|03|05|1|0|||||||无||||有|9|9||O090M0O0|O9MO|1|0|null", "VPaacwHYY%2Fi1ACkyPHQH%2BxLKQ3kZQhA0MU7NgN9E%2BTkv%2B6rn6TQ1qwKN1HRmHoX8l4hARn1fthkV%0AQTtvcyoTMCwGvnyTgTihNMFqzbeDl%2BIq1VBB8fVTWc39w1SwUQ%2FjOfJjGuOtxSNBlQvu7ORHD4fw%0AGvpJXtZrzgD5nkohE6Wslyf6ExHaUofR5Cwkseb8S1mAWnXPyFfhUeb4wHkl1%2Fo7VpXw0FEN2aBV%0A7WBVz2N7dgeErKsbO8mI60U%2FQK97sImEoD3tfHcsrwJuJ0n2AqzkJ28%2FVV9AU0Y6oe%2FnJN3U6%2Bjz%0Am%2Fn8rA%3D%3D|预订|1100000K750D|K75|CCT|NGH|HGH|NGH|07:04|09:27|02:23|Y|bdIOmP%2F47RRwaongF%2F11j660DPVwKizjdiTr5tvwF2wNvfCcBV2X2e2ahSI%3D|20190523|3|T3|41|44|0|0||||4|||有||有|无|||||10401030|1413|0|0|null", "tdADTW567sajOZ336wzP0ET8mrio7BTFWm8KKGgvRMsIN2Q46XdpCWHjYmfr3rJ1aeF8gRHtK%2BkL%0A5C1ead7xENA7%2FONs0BAXMzTQO3ixrwMjXncu6hs3cCzHIRo4lX7GSBqE3V61BRrss%2B%2Btkcr841ht%0AZWv0b3InlFGF6jVtsTCY%2FbYNB0i3GardWINEdY2rW%2FXsfbI5rTZXReaa%2BVFzHiEs%2Fn9XzPXZQO6p%0A7qJXneBUX1yV3bZVZ6QPXmEJXFMo27FPZ%2FfT1aXEXWM1irxk3%2BsaDP6sMP6nRchjJYOd%2FRA%3D|预订|56000D323170|D3231|HGH|XKS|HGH|NGH|07:16|08:29|01:13|Y|kaIO6fJcMiXqjRk4vusFpvi9axQh7BtBdeWxa0V81iIHSW23|20190525|3|H3|01|05|1|0|||||||无||||有|有|||O0O0M0|OOM|0|0|null", "rGUILeWI%2FDQ%2Bjgvak19VtL6W%2FdnCRSDg1vhQkzlnJ4lYDiF13MqqctTfj5CkKSit7IIiZ3ZSzhxE%0Av8N%2BT0m5zTf0V%2FipMWoCo89KcJxTQJwMYZXdrKk9g1qpA3wIxjae%2F5uuh9VpYIE6DmdyB22Ps9Dv%0A%2Bd37iLGGcc8rtYP2Z%2FNkUQEAZJHH9HByoU73mNwGosuAblL%2BY9t%2BRxnB9htKcnUC1MDN9yNE0kOk%0AnCaYRu389XTu7X2l%2FAm7mp8lXh7B1x6G%2F8at%2B9PI2kzzzQ3wc9N06OGieT4cSXSDrxLljlk%3D|预订|56000D3111C0|D3111|HGH|IOQ|HGH|NGH|07:33|08:44|01:11|Y|9H8um0d%2FRB7BZeHzrJ5nn7lXEJiXC%2Bhcx8zJkpXf%2FfPr8Cdc|20190525|3|H3|01|04|1|0|||||||有||||有|有|||O0M0O0|OMO|0|0|null", "|预订|5l000D314550|D3145|AOH|GZG|HGH|NGH|07:43|08:59|01:16|N|vs8kajYDN0ThEiT0PDvU%2Bhbdar0S2MmmQuIOb82grVPsOE3B|20190525|3|H2|04|08|1|0|||||||无||||无|无|||O0M0O0|OMO|0|0|null", "i5zTNUAMaHVmsAKigOgo3mZIn6eU7%2BgHM%2FeXD%2Bn38RGXScMZwwSfTkRFJRE53d8Lsz9p0Igccgfk%0AHTO4GaElNjq4PPC29XL67yrChuBhusfObkYjxsCksm8g9TLeAcnel%2BpHCEj95IF7L%2BWEaqpL4waM%0A2m1PJkxwTSo5D4d%2Fw2zgL%2BcmdEFqhFevj0BiOmTPmJ3hzhnEiCLY6R%2BZBiJsuyLW2ljWgS%2F9SMhG%0AN6Vjz4CvJFPNE%2FVIoCOwfQW2UGUj6%2FULiXSqCw85%2FOrQuBL961O7pdjK2UmScUWmC3Kwmro%2BfU2F%0AMuzGXg%3D%3D|预订|57000K12180E|K1219|NCG|NGH|HZH|NGH|07:55|10:34|02:39|Y|lBnG2Eeoy6dVhGYXKbDcZUIeTTjXmhHYZZgKCx11uuIxWdTnB8HbwBecosM%3D|20190524|3|G1|12|14|0|0||||8|||有||有|有|||||10403010|1431|0|0|null", "T94pzyApO8cjwQp%2BoYXjyGRsw755jJiLkNx6KyVriEG4Jm9Kun1hQiwhwLpaq9AD5XFIcZCEQWYA%0AUqeEoynNGaumzRUpnEn%2BtEaP0c5BZfNjF59HyQjHP9xDBe66DIv%2BAz7SNURrnos%2B2DvDcOmYEuwW%0ARnVwVlEQxP9d2uv6BSS2fkYcf8hlbhuWjr4fALNLv%2BJDZFym83%2BUQuxG0388mjY%2FdSQpoF7opHL1%0A7%2BivuxFwvgIyhMNNgeJ7cKwxUPJztnCzQGWrbQeSGtwex4dgESAAYUDjYc7MGNIgf4%2FlvBswZcmk%0AVR91eicp%2BJI%3D|预订|5l000G750166|G7501|AOH|CEH|HGH|NGH|07:58|08:53|00:55|Y|JftSgRNyJ9HxF0Gu%2BPixM0Yfrim9r3BJayCIsGSsdJQYzdqfFB%2FVvI87OiU%3D|20190525|3|HZ|05|07|1|0|||||||无||||有|有|12||O090O0M0|O9OM|1|0|null", "hsDlC8ZSh8OF8JorXZ1%2BzUmxykWJ%2FC4qQ9sYRUKbnwAj15WWqf624wVchqUogqc%2BxFMBgWpxRieW%0A%2Bok4%2Fb%2BnomwFPeoL4%2Fn5Z%2Fcnw8Yf97ieVta4P30COpab0E%2FqtSt8A%2FVrYvHNHKrlOom%2BoPpfjXIm%0Av0avBtDzaOabHLKs7ykqm%2FJZhvJr2jLGYtnzVvNUawh8xTfhf%2BMbEa1X9PVyBO6EiKwT34zHCgEO%0AoLUFAG%2B9zovDORHF8mWqnlMau2GHe%2BDXJkb0h2NeUtu4uySpihFNXas3DPUEyL3aonc9ZYtUWI79%0AmP%2FKqfJRefc%3D|预订|5l000G754341|G7543|AOH|VRH|HGH|NGH|08:08|09:11|01:03|Y|%2B2r2joNjBDiFB5s0YTuCeV3W38fFQSfJUCJcEqTQSlJvNqNCwpGB2UNL4%2BI%3D|20190525|3|HY|03|06|1|0|||||||无||||有|5|8||O090M0O0|O9MO|1|0|null", "kqhWZSk3yemik3PmusTkF8B8yT7Ki0AuNEXlak1x%2BigF9bVR8A4BhI6Ug%2F%2BY4n8jdpK%2B1ZMiiZLC%0AuaZG1BLdtvTOWeiXPr5yGFZmi7aqxdHwBrFpGiHeEm9CRpHYVXNjkbUEJ1KimVXX%2BLaAfrYPsIr%2F%0AzYocHDxdKVv7mUnVkHxOitzyQjQ92H149528XMYdmrNoW6YkwC%2FVBdXn4vA%2ByEw01sKGaPyP4kS5%0ANQ6INvqyHxs%2BE%2FLwqgvzK8hqJQh51VmtePFrN8uot61BgiYlCpZs7GrOYL81%2BFaELVKgj2c%3D|预订|5l0000D37980|D379|AOH|XKS|HGH|NGH|08:13|09:16|01:03|Y|Q0Gc9F%2Fh3uA1NYWlsau9qZhK8rPUFaAGeCQKXCYGMJx0uE6d|20190525|3|H2|04|07|1|0|||||||无||||有|有|||O0O0M0|OOM|0|0|null", "|预订|380000T32806|T325|ZZF|NGH|HZH|NGH|08:16|11:47|03:31|N|yDe7iPaQgTKz8BurxhlPyMrDPD8whLC%2B561ooUMj98JixAwPj3HYFtEISjc%3D|20190524|3|F2|12|16|0|0||||无|||无||无|无|||||10401030|1413|0|0|null", "DoTrENRFbgTKIv%2B0aM8AOxt4lV3hVI%2BJ4On0Zur7rHBtPRx5OQ%2BksVqJKSTloCY1si0R23rlSWaw%0A5QoMcPFczqJtyYRfMabJnAJkPn1eUGtFl6LXOOBMjnbmRa%2BnPi9MJScjlPZWQx6cYffbki%2Fldje%2F%0AcTX5L8A96qmXhElwdXKpHpKWrnpQ1p%2FBiOvPPeRzWG8dfz1tUp8yYPVvs0ma0TvoTmw2xwiL4%2BKx%0AyGrG3ldQpMoYgn25Z9LDGfq6q6j8Qq%2FyBLV0Cs9Z6SX03SF4XZyhAyNrVxOR9gPmbecvXS4%3D|预订|56000D330710|D3307|HGH|SHS|HGH|NGH|08:19|09:33|01:14|Y|SUPMgJ6VhZAyS%2BYRfpz%2FZU0IA8jY2MJNBlbP%2BDGGhjRnckq0|20190525|3|H2|01|05|1|0|||||||有||||有|5|||O0O0M0|OOM|0|0|null", "UPKua24LZI1bauVbrI6c%2Bkta79xlwlBT407uSlX8Wj0nzePC1aXgo0sD8cdRpt6%2BjH1gYGP8LKHu%0AoO6hucU7Tl8xYq12YUC2%2FVzANzpaZWM8D03AACeFEknj2i%2F96EEJcqxTsR9hfI5jvSIjFNBLSpsJ%0AwFMJepr5A5KZU8CMM3KTOSkknRIRPxIE3IdsYqzebPdsWbHRzjXa7qaSI69sWI%2B3QYNryTgJ78mw%0AES6wF76lA0A7o666P2PhObaSjKViOBwpEJFN6qZDeoCInyE1tnR0CFImOTDR6nh85jAeok3mul0h%0Ao5C0Kg%3D%3D|预订|470000T13505|T135|JNK|NGH|HGH|NGH|08:24|11:12|02:48|Y|mNRfLVeOh8fwwkj8v1QsgSkf79IE%2BB%2BKknTd3SKff%2FdsTZGLyqYB8SZ2Hpo%3D|20190524|3|KA|17|21|0|0||||有|||无||有|有|||||10401030|1413|0|0|null", "UtTh2cJwtXWbozLvxVAE4sqTILJT5u8W0jDCJWV%2BvyFsKeqsnfAS8Z%2BYfUHBhh341aA4RwBy3C%2BF%0A%2BzFUyIC2b%2F%2F336hpRAzGymXN1TWYAOMpknc07vVD%2FwTjqNXa8hlyOppfutciO0mY4HzrrMepBbfs%0AgCDryq5%2F%2BUHyrbNIxNgdMcIEIC9CX%2BZoQUR0P2nmrDc5mNt3WdQTmuirjSv7AYn%2FEtSBtD0KwOJ4%0A3w%2BgG68nAysae%2FaNcMrCBH0HTgBZ0cRG0GK05h40mWa5RKCD6U15z8DMWC1o5bV8%2BmP9sG0%3D|预订|5l000D313160|D3131|AOH|LYS|HGH|NGH|08:42|09:46|01:04|Y|6Y8wqois9cpfJ35oywbyKYy40L5EwX7FFOYjai84khXb9vU1|20190525|3|H2|04|07|1|0|||||||无||||有|18|||O0O0M0|OOM|0|0|null", "1jOtTjvM6KcnU2%2FsBtZNCs2eUEMU0HwZMMdCcLAiEkS3hHVE4tKRVTfABeow0nFsPCNu%2BNAABuvi%0AWslVRYG6Od48J8d9RPc9w2JMc0Vlh%2B0p%2Bhmw0JN7CFEpJ24GLVaVNiaUMMjOAUD4Ba2hZhrpzysV%0ApwhsdOp8%2FiuV5RFlzIGoMPQ98MioQmLulLQQ%2F7uF9%2FoT43oEhPNhujlpNHa7Dp3CkJ751CWPbvgQ%0AchEjfzpYADsz%2BiktkGguLWpd5XSuYJM4EKLdVLf6%2FqXuvrz3o%2FyxB6Pxyx8gW4ptUOM7xdGHz0f7%0AjePgQ33Are4%3D|预订|55000G750300|G7503|SZH|TZH|HGH|NGH|08:59|09:52|00:53|Y|7AXOEG%2Bu%2FWLjVgND6rkYSNqEAAx6ZVh5eWFPMCKkamZ2%2FDTPBPA%2FUiDjDIg%3D|20190525|3|H1|06|08|1|0|||||||无||||有|无|4||O090M0O0|O9MO|0|0|null", "kyRHph6cOFJAHJ5HDgbQip%2Bjdm8o9Qh%2B59jwxAdWxOwDcEP%2Frbm72jXKmHV42Q1%2BCyE3sBOexg7V%0ACs%2FY95YcNCZ1gQspBVlPN8VKPsXHbumK2V5AClDJfLnZBsAYRWLZTfoo44v%2BjPJAw4R5nPDSNtDo%0ARr88mpGNQMwXhRzKySq5WocR5vf%2B10KbOLNQ4Tp6pCsmBxx6xIIhD9llkjVK3rOrv6kg2pX03jU2%0AphaSuX8CcRUCy78ZUdB14IPcI8PoH5KL18vIcpaerTJ4ykSRcYzUPykMKJsEyqUGMvhGTDA%3D|预订|5l000D228750|D2287|AOH|IOQ|HGH|NGH|09:09|10:13|01:04|Y|TQ0zRQS05gi%2Bunh3BnmvGvZkbv%2F6m%2FLldb4IWNC7OMGtJ9sd|20190525|3|H2|04|07|1|0|||||||无||||无|20|||O0M0O0|OMO|0|0|null", "okUOS%2B6OJNLJJTOssJ4DydNnG%2Bk4GrRTr14chslbs5Yny4hTTR%2Fb3fnF9fPlwxziIRMeFqWeTuMM%0AdQXbBI1jsbGEQ2891Stkm%2FDl9KCtnLrf%2F8QeHbdXmdykqRC8eq6cawBWJ6LfGwD4632IgZkZp4%2FX%0AIeja8c93ENkJHI5K%2B0c58PfAc7TjS2O%2FUYC1K%2BuRWJLoZP1%2Bn7OHQ3XZCnRxLMmhThZDO2qHkilR%0A59FI0Hd45osTJWFbJ1UgEH9lzjY%2BTpY9veqdrLWfAR4XmJm4CLXsYUNUzkuWTGyIe%2BxsDoGKgrnA%0AGagueKauY7I%3D|预订|5l000G754940|G7549|AOH|VRH|HGH|NGH|09:14|10:18|01:04|Y|Y%2F1W4x5cSbPUZGRQG0kdktK6pGCnSYsqqB7YKK9%2Fbw4ZyKvNiTWlslbnuWw%3D|20190525|3|HY|04|07|1|0|||||||无||||有|2|无||O090O0M0|O9OM|1|0|null", "FzJtlv26aahTaPcz%2FC%2Bb9Sl1wmVoUQlC7ywXcPuy1cZFpsJAnfHrQLjBj6eZfINTEvrBAyLL4Sco%0AZhHJeRvPaY0RW%2Bk8Ea4%2Be7iEK7IhCpXOX%2BI0cXuWTVNOfSmwKJ%2FlYqyXrT2qK96G5reJrfuwtJSq%0AETxxYQc%2BQyjW5qgQwToC%2FSNNqwe8osZiUbuWupupLqQ7FmESNoQ1kOy23TG0Azx4dkGShwALIL3U%0A1azeaTeRVNQl7xLRFckGex0OxSW%2BhnXlWsCI7jDWbBtoXbQKI8%2FuhppgGaGn8Hw%2BDxnmvKXcScbq%0AM1gqMVGGUdY%3D|预订|5l000G768940|G7689|NKH|CEH|HGH|NGH|09:25|10:29|01:04|Y|hR2x6CSvS0io7zIs1pLDIklga6w54bBnAO77oRMkh0QLLwtL4hqRzLuaY%2F0%3D|20190525|3|H2|05|08|1|0|||||||无||||有|20|无||O090M0O0|O9MO|1|0|null", "gwF0h7uQXaYY15RDCtkTd3KI5ISj6ePMQovXyY2as5CzuCztDqw0ML7dlEhFLqImfbdVxExjydjT%0AXTKBZUTOl1oBXOxp7Z3W5npqSZ876fMv1U70xzFrnrkzBgoCBidHH7SoSAFPxX2v5ZC3lDnBvaJY%0AN2akMrzutHwEhbyWe1zKq2KtBOpUjK5g5Wh1n4RcElalN3RiOA3J5SuJ%2Fax4I%2Fk1Yrkjq95uYz7Q%0AVHhrwUY1sPacTQje32zMBc8sheMb%2B72G%2F8aw8Yo1QFlPqW9Q9H4o2MIocMmRgrUkZevXbZU%3D|预订|5l000D3201A0|D3201|AOH|XKS|HGH|NGH|09:31|10:41|01:10|Y|HWYlZKrBKT77amwWNHjMB%2F2zE80UYmja3a6wbdkgriIgH8Py|20190525|3|H3|04|08|1|0|||||||4||||无|无|||O0M0O0|OMO|0|0|null", "ydAp3DVqzRmt0nVCGUphKGVyaDyjNfUAiOSUeZIGbNktxWap14C0b2XehpNyCdxEjExJ7QJ8it%2B2%0A23cN%2F1RPfrprBEmyTgNJz06uxIiJAei16uCuZXWtyKi%2Fc53IHq8w%2BG4FcU2G9HzAbnZEPsTRMT6H%0A8nNFKqMpKRomP24tUslai99Uufj0hJPRL2LvnTUByzUJcfamF7NRRtj2EC8SM2tA6PYT7Ipp2RH3%0ACZowGUIG%2Bcz19KEdGNigzWSFtYC1PTOSDTzlaLtp4hd6riG6mI0GLbPZOgQHaKumIeo7qYo%3D|预订|5l000D329541|D3295|NKH|LYS|HGH|NGH|09:39|10:54|01:15|Y|lOk90n4NI0zwG%2FCvHHQJaWIPCaCBj0z9QvJJlaBUvrSiI0eS|20190525|3|HY|08|12|1|0|||||||无||||有|有|||O0M0O0|OMO|0|0|null", "|5月23日<br/>8点起售|5l000G766540|G7665|UUH|VRH|HGH|NGH|09:44|10:48|01:04|IS_TIME_NOT_BUY|3S00FU0TJ9O6TqstGwoCV9266tcxpYpWSq1%2FRVHPH6OFUYe%2BMXToI85Mi34%3D|20190525|3|HY|08|11|1|0|||||||*||||*|*|*||O090M0O0|O9MO|1|0|null", "dB1SGt8QmuuHijQQ3SlKaKmO1oMzlmdpQyJgMPOo1%2BumRQ6Ss%2Bs9mXG3X7PH0EsgLxfKf2AArSDC%0Ac1BF7KrJQRzHckTUYK72GpEzTG%2FyWGko48LQqwwlW840ec0g7aqpKs7GaEc09HVPWV5LlwKqNzB%2B%0AieqOvvO5tkTruDWia5x6yiJjDUTjr6V5WCgm9RBInl6Xs4GcIBbFtBw0Sti0bfoFXMrShIbQGbSF%0AZc7lSJ40fzl%2Fhi%2BTwGfDJAw%2FezQj41m2LyQGWbMJVpy%2BPaWBftmyVsZUysWSnz5F1TTiOzutPf0I%0AjJ2wzqrpbIc%3D|预订|5l000G750503|G7505|NKH|NGH|HGH|NGH|09:58|10:59|01:01|Y|3zGn9HvViQFbOUkcy%2BdjA3b7fpcgYrZ2kV5b%2BAODZdiulZWayqB0sDXg5h8%3D|20190525|3|H3|09|12|1|0|||||||无||||有|有|7||O090M0O0|O9MO|0|0|null", "7OqZsKs34ZmLIFe8XiEtaR6FqYKmwdhfE%2Fluij0tPyRPDNU0%2BEx0y9uW9TIUyEMcw55TWEnIissY%0ARZxdv4%2FMMBWKwr5t1Pr%2B38Aec06MG3rqoceH%2B6b9ncl4eyvIxkT2Ekwtw8m0gImug5IKfywCGHoN%0AgRMLPCpzk4RWlYIbtXHtM1gy0%2BlVySgDTqn4qKGf6z5NZ5HTRgarN62oQZfxq07rKhDidWhefweP%0ADoEHWAlarDTpHxeksXGXP2Fz4NyGisNT4MR1r%2B5UPFWMkCkLwperT78VlsA2byRCicygMOI%3D|预订|54000D312530|D3125|NJH|IOQ|HGH|NGH|10:14|11:18|01:04|Y|%2FsxYrn6kRM9HfJ7SDFN0VolcvqHBE7I251AAzaBxfcVMSLWt|20190525|3|HZ|11|14|1|0|||||||无||||1|5|||O0M0O0|OMO|0|0|null", "LMVn8CdkfWVfNBmfT5RWhtma4XEbzw34Pzfc7mRXSBFDpFWSM3OprKtSO2%2Bbo7sZzljmUcVgBIiG%0Ar%2BLzHRLPD2kNwlBg8jF86OQ16xwrCKXx0yrgqBo1nqJs%2BFtcOg9qLUHUsynFkxMASz3rxACjwkde%0Ag%2F8Q6XTqhS46tBx2kczshwN6XMlrcn5GBp8SE85WRFqHhF4yW4xglnwcnC6EyOgqQg6%2B4RcjXk45%0AwBf4NSeco%2FUjGjqPtn0%2Fd8bfxLvO3iyIgs9VfrEqwj0MAE7uX8zuh3F6Sld%2FVmHZnG%2FH7x4%3D|预订|5l000D228521|D2285|AOH|IOQ|HGH|NGH|10:20|11:23|01:03|Y|JnkS8c%2BAje3cAtcWmpULe3xCMHviWMFk94jWIV%2FGMEDMKJYl|20190525|3|H2|05|08|1|0|||||||无||||无|10|||O0M0O0|OMO|0|0|null", "XjXf%2F6jbIZirI4SbWXZe0FDlCTSmnyGNGYAJq7FAF7MQj0mUqd5ZVwgmWMl6ylE7aNR9ns%2Ba6NO7%0ANi%2BjVBWnk2Ifip823oUqK43xT60kXQQHeAn%2FlulE6DERh3KZPVe%2B%2F8WmPWgMkVxfJX%2Bn1Mk8MrcO%0AGSbpE6saS9ejIoiOalZS748ZYRa53AZB0m%2FBNAH6Lj2ZGYpGst22XmWKV4bSKUBvdsonizG%2FE6j0%0AJ3T5lwyMJ1UTRxDC3eTLLsVVkY5K1QJro828Q%2FYGk3bWh1pOJu9Y4LYmEpveXwX%2BeTjZvpa%2B9W0Y%0AE2wbtb5XpOI%3D|预订|5l000G761140|G7611|UUH|NGH|HGH|NGH|10:28|11:27|00:59|Y|YVv4mT1R9WFhgwjRti1EKRChi8WKoaPL7V6GLSMORLrTbTWCFBWQWg3Cyj4%3D|20190525|3|H2|11|14|1|0|||||||无||||有|有|11||O090M0O0|O9MO|1|0|null", "7aMLK2VhI%2Bz9Gnwp%2FagFYyfqjdSfK43HXakr8Gzx2LTQDIGuXYAgzQjK4C2UKXD3GdWGvekTydkT%0AUUkWAqbKF9gPBNh8edfP4E0OqUxcGsADSrKdeyQLVWdaR4tA38KtbWwnUQCED%2BpatlTXNFR9QRIx%0A8f2SGUBrfKGq5xcJzioggKCXZmyxrMac31RUxMvLiwOKY6oAPyFoIDgqeuaW0Twey3GwEnUukhO4%0AeE7O2OF57zkzj0XRKf73URII9vQGVPXmGpkI4CM8jRCTJrNTSSbUruP0842hvBQS%2FvQ70N4a9hLg%0A9Neb3ymFPKs%3D|预订|5l000G758107|G7581|NKH|VRH|HGH|NGH|10:36|11:33|00:57|Y|nbmoVCCjk5HnCVhhlZqFq%2Fx5kDoYAaytrzjJETMKYzUVKVZ16hgv%2BL1U%2FIQ%3D|20190525|3|H3|13|15|1|0|||||||无||||有|有|6||O090M0O0|O9MO|1|0|null", "71gKxqFZZtXGxDuzkHCQ%2B5wLDlUDWvwK0vfWmjr8Ong9G0cEo2t1aiXPzeTuaEXA1C%2BlCTGX%2Fr1y%0AQYWCgWLcAnZgHgcW9YfVOdq3LPKgJUPtxgyEg9ABQ47z%2Ff8eX8WOZMLujAigpxd7NiCzm3qxUYKq%0AOwwtGJmCg7EtOZc18f1HIG4Q1E59HJ2zBYFqwvnsfBaDdCNDXti7g4fiHGN84JxHtSqa4ErorOjQ%0ARMRSfy%2BF2vL03ErpQ1pD5Qdr0I9qOaDvI3Whyj5Ipu7%2FZFq4edmwIXi0CVe8baicW0BMrZY%3D|预订|5l000D3205C1|D3205|AOH|XKS|HGH|NGH|10:41|11:53|01:12|Y|zbsaEisHzcn3O%2FaFjtfLjVWZs31qJoLOLDKDRV%2F2K26rW6ZY|20190525|3|H6|03|07|1|0|||||||9||||9|3|||O0M0O0|OMO|0|0|null", "2Mb%2FMkICWKQd6Zixz4CeOqUX3rnnGl%2F97N3%2FfGzkWGB2IH9cFPdSwxMboJ4i2mkMZoV7ZfzSh3uL%0A9R%2BJBJaAppvCxY0rhubrgExBEzRNPd5YGmasBQhx94GRxF35fhoWrTS5VMYm7h51AScS9018G%2FUZ%0A83ywNm0x0Fa3%2Bka02sAp72r838jKvncE0kk5ui4tKhH5fjEu5TKv4EN4aOwDZrW%2BPlsuC0Q2oS%2Bg%0AXAs%2B5e05UH9NN%2FQlEFlITDomOHwHf4bS0CBt%2BHy%2BKmQyCH8njlaUXWxgpRL1B7uar4FucjwTPw2y%0AFvBIOF%2FmM2U%3D|预订|53000G764840|G7645|HFH|CEH|HGH|NGH|10:47|11:41|00:54|Y|Z6jthag%2By7rerCb7kTViSqh2vigQuMuk5EhXrmJqJpZ5tOAHgS1XNKlSo3c%3D|20190525|3|H2|09|11|1|0|||||||无||||有|有|无||O090M0O0|O9MO|0|0|null", "0NLnM6he9vBARarggKwGdg1v5BeM6ZTafrW8xbkLMZswnL5TCyRqDfiHci5FFYgyM757kGeM6Qsc%0Aors5zJ1pJKZEc7q6F3zF6fyWdfVnVjZ%2BrM7aB2aQ%2FR2%2FwILPH0%2B1FZQ6nnksPbb4PJWWNk8k%2BzW0%0AG%2FUzFYo21ppBy9esXZ9TX9D%2FyjY6yvaa4Felqtta85zCW9xgesWHjCfbo9p8s0LElsl%2Bhp7mIDaF%0AUH5lrx1JIal%2FD8gQhHDpX8e50wKgtPK7RorBVosGQRis6fB%2FDbsAVK%2Ba3UB7fvrcqp1FK49k3KOO%0AnJY1EX6P8Jk%3D|预订|5l000G758741|G7587|NKH|VRH|HGH|NGH|10:58|11:59|01:01|Y|e6RNTQGCSnLJMRfiVLM%2Bek4FY4G%2BthG4opG%2FzB5JaIP6L%2BbBhcni2aVIOqw%3D|20190525|3|H2|09|12|1|0|||||||无||||有|有|无||O090M0O0|O9MO|0|0|null", "KLtM572kaUJjes648LW5Ik2mbA9YJ9ZZ8%2BktFXI%2BFRVkig%2FWZndOGru9dljbQmWLr51Xqwnkphcb%0ADB5%2Bb48cBZeKBmOowY7FN9hzp%2Ftctwf6%2B1MOvq6cwsaLY0n2zdYjVyOllO2ZsFWaOdizOAfkCDZ0%0A4XKm0BTHntfQjLPHTgFNCVcLc0xLF3UnJG7E6CgKd4ll2V6NSZRoB60uX3OkSQxwlSm3a16Mi5GH%0AzuUywtoWKTctZiJsxN87JvoECDuI%2F%2FifgYcuEqVixrqWef%2B6DPQFsIe5aiojxkBdDw4q5rE1X3Gi%0AJl2%2BqSANo%2BQ%3D|预订|5l000G750750|G7507|NKH|NGH|HGH|NGH|11:08|12:08|01:00|Y|Aiscas%2B6aOdD%2F2CMND5Hnd12dGd18zMhKz3gWHEGowbr4M1uLHxnFFQexL4%3D|20190525|3|H6|09|12|1|0|||||||无||||有|2|7||O090O0M0|O9OM|0|0|null", "NkPu5ex1WLFuXU1Uw8F8n6UhBV8ulPe9%2Bzc%2BLWmvU%2F9UD4G%2B2RvqtUikO3sl6JcgevruNZjkQ7TM%0AtWO40PhwzWorWPiSBgKQBVa0uY8tXwOw6u%2B5Ig3%2FWyJJkhZ5rzRW9D6FpJTwX8X5SUmhqiFmoKGa%0A%2Fl6d%2FYXo38tRiftNzfVeyql97kg1zPzc48Cq1X3I9bTI4NER5Iwt0lxPExjVO35aCFYuHb%2FECW3p%0Ab1pucSQHxYzrqdR4C7MGYmcANn1C8t7m0uWoAEStmDd5wHVkzL4zTnQ6lOlsuPbq5vi2agM%3D|预订|39000D219802|D2195|HKN|NGH|HGH|NGH|11:18|12:15|00:57|Y|IUAZCKAR6E7DJhBAeVmpLUPhRSt1UqB1kBnc%2BBsZN6Q1oNm7|20190525|3|N2|10|12|1|0|||||||无||||有|8|||O0O0M0|OOM|0|0|null", "yXjw%2F45CfLLHME%2Fa%2FYQbKUeCzBLW1AlBgY8UJEy1b66KljMC6YYlUMDUEycXnKX7EHEyvZMu%2FutL%0ATVVDgDc2wuF9yUZw4XXWj0W3X7c0nb%2FLUGLUKsn2fOUb9p7i28jeQ3B9Px31BVxC%2Bg8Chm%2Be%2F7GO%0AJCorGegcbZQX0tEtud4FG5Q7BLIW%2Fst5B%2B8AEVTzzaeaL8tPgq6XGb9e%2BAT15q%2BaJ7WDoILfWE%2FF%0A9d3nlFwdmKFzUnzBqPa%2BOXcpG2x0x%2FBx4MWr5mh6NG2UHvxZsJ8%2F9r9QU1zVQqDDkQc5FDM%3D|预订|5l000D3107F0|D3107|AOH|IOQ|HGH|NGH|11:25|12:22|00:57|Y|cabkGRMWbG3h4gPEGSzHuhB6jp0wIGwkfEqQLcPtYZN7pkIg|20190525|3|H6|06|08|1|0|||||||无||||3|有|||O0M0O0|OMO|0|0|null", "BX0Is7x1Z6Lkr4672QSNPtaXfubCeIEDLZJkzetWT0nlObUGosGhfeyPkXPLDbfZNSVnLFLYxvTs%0A76KQVMc0qjyb4PpWbGwtaixGk5%2FGRak1%2F5%2FeXJDtcQzhmiTsL8JsvMDHD2bi4lbu4ENuEGHUJtv%2F%0AHw7cxc3DjWKsGv%2F0sfykWM5Rpq3%2F47ja0CmphKiRProYRjN0ljr9WPp034HoUpz9ru4lEUNKi4DZ%0Awp5wfJPzwYfOCC0Uk6mQ2d4I01kE3Uyq3VL%2BUuw%2FSaFf0sMfrNELf9apBh29QGDAhyCNqYrG2%2BhM%0Aj5VqOA%3D%3D|预订|410000K4680K|K465|XAY|NGH|HZH|NGH|11:33|14:41|03:08|Y|ts%2Fhdkm143I569NltuVXS9RPVmOTihmI%2Fl9I6GM%2BIsiOGc8%2FwBWNi%2FZLF0c%3D|20190524|3|Y2|16|19|0|0||||10|||无||有|有|||||10401030|1413|1|0|null", "%2BNsCGiXKW1C6T5qrtvFhtoHSXxoioRRW3zLKJ6Q%2F%2F9DQZurTCca1ygSWOX2LAcUVdwgu%2BZbjR%2FSP%0AXuDk1MO9aA09y5uI630srsAIFKC7fGA8iqOvdQ3HeHQL7x7aBcN8P0ibnLqOZ6HmGK9VIFbYuD0b%0AFDK5tCRyliPPuaIDs9c0fT3VadpqUF2FfjZCcgOUMBW9fNjWMLMbaAsmmEO7TaPp1hdPs5u3jy9L%0ATdI%2BV3Xw6ZTIblz%2F679ULhahSMLn%2BlvJuPnSRrcUwDcEKg6Pd7K3oLNAk%2FI4znHoEAAvyyY%3D|预订|54000D228150|D2281|NJH|IOQ|HGH|NGH|11:35|12:32|00:57|Y|RGlaHpaqqt9ANHq9EbebLlqGb40ug4D3woRzEKQOlzFG3Ewi|20190525|3|H1|12|14|1|0|||||||无||||有|有|||O0O0M0|OOM|0|0|null", "%2F%2B6HOBkv4ZFkVmHE9ulJhV9O9EILXhIaDpuXF3GoI%2BvhNHfZHSlKfr%2Fmx6%2BDuRhUzEOhp2CSYmQH%0AjzM5a3M2gz4DkRDbtYUf4KdOqOlIr8ItrXnjQuuonJBt1W43ulTZFcZkffW2ltat1Pp74CK0tXWx%0AOMkZXVgYEtHdejvexfNA%2BJCpDpw6dj9IHJnGBSqqYeSOX1zc7ChgTh7fcrEuQ7d8E0PUC5zpor1X%0AjAokbytiATUIpPewx2zD0Se2qFEr0P1lklBqns0f8u3mqrxT7So2Tp2vrvrfDk29IgWYxkisZfcm%0AMVE2P4%2F1Lfo%3D|预订|5l000G758961|G7589|UUH|NGH|HGH|NGH|11:43|12:37|00:54|Y|PzPLKT2L7OWIg%2Bgi4iXhj6NYGOwgeCIw8xMsFmgVif7N%2FbpNRp%2BeCTtR3Ww%3D|20190525|3|H6|15|17|1|0|||||||无||||10|7|无||O090M0O0|O9MO|0|0|null", "UoFHuER5im14f6HsrHCtRO3GXXlZJX8xNSV5uAy5OCyT9q3h4CCmRZESDa3Tqoa9znUDIgB1AIqy%0A6%2BoxYlxp1sn1PvCxJhG2SJj%2BlgFrchCeR8vytx1UbGtgZ3n4QiPfT%2F%2Ftg0fdybtx7SBd52w6bIWu%0A1nN7S2UcCAnknqjslIvo%2F6uivUgrc%2FYp3wNrPJghsfUyY9mfLbSUeS9OCGg3Z0bRypnhHQH%2BnBrm%0AmDPBl5gHeoKs4jb1t8wryGFMUMjKshLX%2B38odBK8nVdUSJzHK13sui6O8ossFtecfwoS35U%3D|预订|5i000G768440|G7681|ENH|VRH|HGH|NGH|11:48|12:58|01:10|Y|ck98c5YzIT%2FMz7HG3zoIii9ymVFtQcEqQROjS4hV5fHuxe25|20190525|3|H2|08|11|1|0|||||||无||||17|10|||O0M0O0|OMO|0|0|null", "9oTdRsQ5eWPRivKQivyJ4iRwpltHexLAvXyLT90C9GBgVDhc95zXvuzF0JtYoWTMYh2rrTmzmbRc%0ApOcw7B9KwkEibK2hRVRw%2FgBnPCxenX9f5%2BCoiJCLIaYTjmHnRsEgMag1umf0hQXzPSHKEJvb8T4z%0A4pUQAvcCW1rrSnC6rGassPOuaNykUbFTwdV7RnFisHm3v5VtLPSnHRS%2FLDxEnRrnha6sBNcPa47U%0Ag7vWSlG0r%2FP%2FfHRyEkRUpdLW4h0jzQ6TwBQ9q9ExqYWgnCpfEY0sDSBnxZ3APmFkgzGnwTQ%3D|预订|4700000G630A|G63|JNK|VRH|HGH|NGH|11:56|12:48|00:52|Y|CRGkkPpROpQxJKOzC90NfdMwlOh3mzy4HeOrjq88bt88A33x|20190525|3|KA|12|14|1|0|||||||||||有|无|1||O0M090|OM9|0|0|null", "En%2F2ie%2Fdap%2FzZzR7BmMJRiV4qTLHs41C%2FbV2H0NXLFRtiYCMYxfoPxQpkqMLkWD%2FetVdZ8gAr796%0ATsBCwizNlklEOqIn4KwYLvHeZOEYZXbFXv%2Fm023aZqbaI1%2Fxs%2BGIoHdlfLPjn%2B%2BT6e344PyizQ34%0AMDdZ5%2BeLcATEiRbSd0TymkGZxeOIeiW9etznxCvhmjLYas4RGIML3AFQnWSFeheO%2Fn1ozxCv3a0%2B%0ANeOym6zTPOeYH6iYg4ett8C%2FjVruhAUnQXPnX0iY%2BZiuCwnk3cXJJ2BCs6HZKJwXMJ2nNfkeXxJB%0ANUlmvQ%3D%3D|预订|400000K42804|K425|LYF|NGH|HZH|NGH|11:57|15:15|03:18|Y|EKu6zhuoeeIauedrI%2F0j3TCNM0oNqtGAdDBtwme7O%2BoTDr66TDo5UIen7zw%3D|20190524|3|F2|21|25|0|0||||无|||4||无|无|||||10401030|1413|1|0|null", "1t%2F02wsIjkkYf0PszIhm%2BHCRrAvkq%2Fj1YCyq8RgNJqIsSLbISc2lBeRMRY4Lcp%2BI4totPM%2FHtgyf%0Ajru2JIEbW34XFKESZIs3j8L0BSq3tndAdAEVVwMly5D6aCwPpWsNhV0NCocGC22WPTRs3b4dymh3%0AcCAPdio1im6FQfuAYwXobqWHVFVyYnM6IwVTQRBnX9Y%2B8%2B3coz%2FH6gBU7pjNutJmgtuz58quUgGo%0AjKONELCcjo0AljE0iN50Xe%2BdDeb1au1OABfcS9doRneUh31IoWAirPUd6iwxDhotWGR35kgsAZQg%0ARFrulxHP94U%3D|预订|5l000G750902|G7509|AOH|NGH|HGH|NGH|12:00|12:53|00:53|Y|Qy1m9n5ZdKqPG2Aq08id5ofCxlxTkkGR10uEiaRL4nAHJBO%2BX4dJkgBHwlM%3D|20190525|3|H3|04|06|1|0|||||||无||||有|有|无||O090M0O0|O9MO|0|0|null", "CgQ43ugJpgJ3U7jDn6WlaEXKB1jb5BKn%2FOtlrbPaG6q0GCaLPzFVhsNbmwO81IUxfQF9Qk%2B6aznp%0ACd19jTtNhZjIX%2BeP1RCPTc7uxLVim4qRCmrcCZZ1novcTgUv%2FM7tzM7nUQHEaRrcrbTb5C3%2Bmir%2B%0AkgXGXfHDKm2%2BOfirHl%2FRMfi%2B34Ka2Jct%2B0FP0n2Pm3U84hYtTVUtDKIxRii3LotgXEXs9m6%2Bl6Zy%0ApzcFbhNEfX8BC9bEnIGyP6GdWWu%2FUw1LXTiLZEfgMc9UrBpjrQE1iM%2BZUzdZU4Sr5wdJMylU9Y2u%0AvRMlKB9LFZo%3D|预订|5l000G759907|G7599|UUH|CEH|HGH|NGH|12:05|13:05|01:00|Y|3Tw0cZojlZHIMZPa3FzkPTvXy3km8KNhiHUqbAQfZMkN8i1MkAZ5%2FJZLBG0%3D|20190525|3|H2|12|15|1|0|||||||无||||有|有|8||O090M0O0|O9MO|0|0|null", "jTOHukd7M9my%2FYP%2BKwdBk450f%2FiHIucNXzyXGpX6XB50aLAEQ38S90IUdyFgBRIuSV7L8Q1IkdXe%0AnaShNhxU%2FTU8oKIp8OvisTXJVCimxExUPVQi3CFaVdDS6AOieKBA5mC9Fwn0ji%2FasMtqr7v3KMCo%0ATpKFMOprLgYYO9cGiDGSRnoJ3ZkmcBgxQgkfgmKZ8bz0fUc41p2MOybUGEv9YDXoZG3N%2FLY%2BaDka%0AJX4%2FdRGD%2Fh7OA%2By6fmqx7gCgvqs%2FcZ8dq1qzMdRnMdc8Yia48p77XBK01n%2BlNDC5xaG8v98%3D|预订|56000D316511|D3165|HGH|LYS|HGH|NGH|12:09|13:13|01:04|Y|6k7ZQtqXMRaGBrbnvQaACWSS3Bc6Y35GkflzPYOOm43qMApd|20190525|3|H1|01|04|1|0|||||||无||||有|有|||O0M0O0|OMO|0|0|null", "bpepAGvL8mDTcNMe5WZk2D9ZtGvJOGffrrC2OX4tszpCZttMDWlxbfNIGPNyMeF9XVJaqAVYRGM6%0A6MNtINwagDY3y5XZf02H%2B5yRXLeUwnihT3R0aQOkCPPK517ZVsqKFx2QC08z30hSyqxgBQYShDCm%0AYqeJzRAOUxcv0HEi2aijejeGChiBbhcyTc4ZISWRktCDigYEOk1Fs2SXmq89anYWlR1p5MjgxAYE%0AU1cf1Vj9oXptQijgNm31k2aEvn50lZHLKl4qVb8Zsi9SGtL8JkBwOKEevVYl0yEy%2BfHAfD4%3D|预订|54000D3135A2|D3135|NJH|GZG|HGH|NGH|12:15|13:18|01:03|Y|DkOFRjaaURQck28vQUZzvGT%2BjBJlwhvpLaPP%2FcHUaBTW11EV|20190525|3|H2|15|18|1|0|||||||无||||有|有|||O0M0O0|OMO|0|0|null", "8r0Grpi8IQ4ObtUNT3e24ESeq8Ki037QaiCXrPuPRA9YthgirCokb98x9vngtk7SLD9T2sZj%2F5f1%0Ahm02rvC6q5clyuoZmJYafIZiqIysDjriRXsIXsJvUeKuZLbq9LVmBPNopfhpSylsDiQkmBmjMpwY%0Anu93NU6rRRnTSR9gb%2BgF%2F9u1IqPbjvMkr4v6BnNaewV7cKwxEGzBYlolE4HTf69U5tzZBhJopZB6%0AlLj%2FhyEOS7S6yhEhJOpTaVQNvq%2FNSC95m27FU%2BPdJokpgNrLjSulxHiLBR48rfQZSHHQLBE%3D|预订|2500000G510P|G51|TXP|NGH|HGH|NGH|12:25|13:24|00:59|Y|aPVj%2B31ya%2FFgB3Qe6tnEvLyPZLxqksEFtvlxZPf23J97FUKy|20190525|3|P2|10|13|1|0|||||||||||有|4|无||O090M0|O9M|0|0|null", "NgsmQXHAFfPvmTP%2FNXgwdxuVD038Cuim%2B9vXrslLBhoyDa1FLrG1PVyeHeTeiUeZLhXjAuoxDFn%2B%0AB1pZwZW6Y%2BASKyM4ysO%2FzECEEvJWfU%2BTS8ap0J6%2BZrV0p9BfnZLmXOHak00okbOd4cpURRkDROeA%0A7zzC7xtroeIeThzi62EM7vYS8OfcrCyo5kUVho8SDoOd0PyxyI%2Fs1DmI1jcPB1cvh2%2FI8GPaaBAX%0Ae3c7P0LwRm1T1h10mdl5tQweR%2B8EMD1iTeh5%2Fh%2Fmg7lrC74qz%2B1N8PPOD07PS8nkINzANlQ%3D|预订|5l000D228380|D2283|AOH|IOQ|HGH|NGH|12:29|13:32|01:03|Y|3aEubPAgrxXq3pmhlpxXv9pps1NMvzf23iGGgYt%2FGLi9jQFY|20190525|3|H2|04|07|1|0|||||||无||||有|有|||O0M0O0|OMO|0|0|null", "euiYQy6alzcDbu3vRLKqkLqM3vi6VF58J%2B70%2BnNJm8rnEauKej6igGgj1ro7rFiu6kCxWJQXXcqJ%0AuWytD2S4LoxUCEnf69iSq%2F5zl2xP35YZiCa2g3R4Dl3DQ456fEv6hKOmlASZIosdZu92ZoCn%2Bw00%0AuuwP02TB1rWooG1muJYuI5Ent7WBXZv%2FTKykGNDTXAS62FgQdEduiShAme8ckeMYk03%2FZ51AfglD%0A0euAr44vzX03jUvrqirEz5um68ny06%2FVnb2GJ1ib2Y08EG6HMRu1yHNbnghapG1NzA8uZv%2FuerwU%0AbXywjd0RlMU%3D|预订|5l000G753704|G7537|AOH|CEH|HGH|NGH|12:34|13:36|01:02|Y|eAeljYKPrm7So7S8pYDJWkyTEbFb8iOvtYFf4O1ocePn6ShkzPL%2BTH6sbKQ%3D|20190525|3|H3|04|07|1|0|||||||无||||有|有|13||O090O0M0|O9OM|0|0|null", "Ue%2FchsiRvYqy7WoOPiqZIFIvmgDCOPAKOVls9YiAwx6hcUzKvIDN1xMCvFng4vb3AL0btaIp881W%0AZ%2BymP9Kjn759NvoSNoKunkq0Jg5xE3y2OAIsoPuJd4tdYON34JJA4Wqgn%2BT1966DPs6V7s2ZZgqu%0AM%2BtAXym1ltuIsWLK4Ra1sC9Blfnk0VIT9V0aGsEIEz76MfbSDnSGljP%2BQ5VN8%2B5txzTb%2FdvrwqJi%0AFh3K5W5hae8ArxfA8h26OpjiOpP8BDMWDRXpv3WNgYGeLDlfSSAXvLxrusHTEPIL78o%2FIXs%3D|预订|38000G196403|G1961|ZAF|NGH|HGH|NGH|12:40|13:42|01:02|Y|dVlsHHRBndfw0s%2FadLRhqXteY1AcPgeJQEtTQNg7jTE8U1AS|20190525|3|F1|14|17|1|0|||||||||||有|4|1||O0M090|OM9|1|0|null", "Tu%2BSnhnqLgtr1icNyYaW7mZ0ZANGVEVBwRn1l4wq3G7Iiqe3%2F277lyK9gQ%2FsL%2FE9dg6oRhT9kHdp%0AsrpwQoclXpoBZCVLW5Z9BiMc5ABQm9IzHLu938ccglDPkErq%2BKrw8WNWU3jNPRmmO51L5e3FIxH3%0AeAZaJKoJ%2FdpyAE6K6DhN6K4guWCGLdmz2s2nn1iwgquFtUqHLBMpwH4lTDLMvlPXskWd7%2FdABKLr%0A29sLs7%2BTA9SNSl9XINXARHBSz2ItoQ1ASRAgdNb9UY%2F6NkkDVei%2B5hIidN4v4VpJITFtaozDa%2FpO%0ARXxWVWD%2BwG4%3D|预订|5l000G751132|G7511|AOH|VRH|HGH|NGH|12:57|13:50|00:53|Y|5fEnlmvjDfY3Yr9JMq2hDt3MS%2BIcW9oneQIkPfaRIh%2Bl8V7UkXAs%2Bczlz7c%3D|20190525|3|H3|02|04|1|0|||||||无||||有|11|无||O090O0M0|O9OM|0|0|null", "uxTejZrAWO2PCcT62iDbFujD41wqLqXA6M5NolVWesEcp0q4n7mfXTCpMpOdxCr77pwldKT9lxXE%0AtmoinNKMT08Gix8JM54wcK6CGbuEMLQ1070MlwVWkBkHlfZgjPTzD%2BfvQ197qSBJnwbBNDdmAbhd%0Aq5pgX3Kbf3%2BhpzZQqpWxBTebzv1ymU%2BKaBQyb0u%2BxGBWddlOpXWdE9MpITTUHIENZA4YOovBSy0e%0ACCLAgq%2B1z3vTxiLeM4btw1lHxzIzrrxJREL438gc8kmGuGHZy4xqY2LNJ3q9666fG7J1QghFswFm%0ABBQmXMLuxVM%3D|预订|5l000G167330|G1673|AOH|XKS|HGH|NGH|13:02|14:15|01:13|Y|8g0yFqUfcqVL3qEsDgqWMUND%2BZxxyKPKnGArkBb2TYPNVr6BKQW5viB6Gds%3D|20190525|3|H1|04|07|1|0||||||无|||||有|14|无||O090M0P0|O9MP|0|0|null", "tNMsTAb3%2FgQOkYXbFyf1JbfavK0PI4mR7%2FAb%2Bb6%2Fl5KwIIbRVb%2F4%2BVJLSD74lp9ZnfoKzUTQ8NWO%0ADS1t03EG6RtWAwu23TWM8H8yrf8qR85bpvaHu8FTrtNJUq0W1yv2TUBubxiqv3qAIaJ5nvfRxFDI%0AsVqxKiGoFzfNXxx%2F%2Bl2OLjJ5uDGFz6gRhggkI7srgOGFrNUKk63hRBYyoEa9%2FAQr4caoqpzvMz6P%0AaJ8Boa1x6KTuslV3nzxaBaF8YALgsqSEwtKATcU4SWhUTEsl3s96TAMysUmovF2IVEhJF6A%3D|预订|2400000G570E|G57|VNP|NGH|HGH|NGH|13:07|14:09|01:02|Y|yXrvgxCDPDG%2Fxuafl9yOOJ3cefAlDTo2%2BC%2FgbeOK5WiM59l6|20190525|3|P3|11|14|1|0|||||||||||有|20|无||O0M090|OM9|0|0|null", "kLUrEFYnAmYHbbGyXnXcmlz0mU2fdNkmy1SIDSk88HVEIAexzrnnpVsPyRhhxcyN97a2gXd%2BjmFz%0A3HQQrmP1qrOa6nTI7ooPpPXAgzhrQY%2BXY7dnltTZWvgOMi%2Fa42G2i%2FQ7HAwBb813BTMv%2BXSyASCb%0AZc87Ruxe5bKYqOjus3hgfk95kpbuoqshKp37xIFwQnVH0%2F%2BPB%2B9rMahYqADXcUYQkFxkh3AJ5Q01%0ArxP91Wvv%2BnxqF%2FTYFK7y9sZxoiCT9zIhT%2BUdqgVd%2FOTS5YOLw%2FawDc2k1D6ZH%2FQxz0vBP7Y%3D|预订|5l000D329131|D3291|AOH|LYS|HGH|NGH|13:18|14:27|01:09|Y|8yqRDPLTR%2FyYIljsDjJ3Fb2S2ZK0TC3m9thAmQ8U3XGWmdR7|20190525|3|H6|04|08|1|0|||||||无||||有|19|||O0M0O0|OMO|0|0|null", "|5月23日<br/>8点起售|53000G766971|G7669|HOH|VRH|HGH|NGH|13:52|14:50|00:58|IS_TIME_NOT_BUY|ygFmNjU2of8%2FUge2E9YLIDxXPlVZyZfiupXoKw07V5JqlI49bnbJsX9E6KM%3D|20190525|3|H3|09|12|1|0|||||||*||||*|*|*||O090O0M0|O9OM|0|0|null", "TS16BhQOwSLwW1JwzdZpMQtxNnE%2FYoppy2aR3AalR0tHrgbeV1W0qMUjCLEW0e4sQBElLVgQeqC4%0AvLDSvdGuw338W7MwXB0hhXKlZ79khwlWca%2FRY1NH9pY9CALBORj3Opli%2F%2BXUz9GGS%2FgoLnmMsngl%0AUCSUJ2tgrq4sqtGhAmT6qvR4SPQq5yqrMhJsXjjHM%2Bq1hwkEDJUCp4jn6CNO2tTCsjkpray1j21%2F%0A0n35BJUZUjJdPf6OBE5cMJvajDQr274kyQPNkr8OWTcWXdl%2F67XMQkge3MjUeP9XbaJAxqCDmY8o%0AGiDSAA%3D%3D|预订|630000K2100G|K211|GZQ|NGH|HZH|NGH|14:00|16:45|02:45|Y|Q%2F8E%2BK%2FjUWvvLJ8gYNfqqKFDXdxUWmaVM8zGI6f3cGteARm9EFUnUXObpN0%3D|20190524|3|Q6|13|17|0|0||||4|||有||有|有|||||10401030|1413|0|0|null", "jcnCEWm%2Bj0XyxUpcZ2K5UhCQ2kdWOL4ggcklZJu2oaGgSPQhN2Ee4w83OETCg9ZA1DwvLEF8v5vd%0Ab5JMRXecdpmyakVwzlsqQpg808LFEJdSG6FQi1AT2m74NDOXojYVeCLeINBa6NvWbcRlYS06c765%0A8nFASL7Nhl2tCnJSkOhY%2FrNRyP5Ulf5rBwgfdWt8YaBHHEWQfdEjIrIBVuohWW%2F7r%2BPBbhkxgBJI%0AdKssoL90a7whYsohHokNJLaKkgg9tHxnTrg3WioPEtORacQxD%2FdTmrdavY2RgcGqh7Hl4N0%3D|预订|4e0000G5840A|G581|WHN|NGH|HGH|NGH|14:01|15:03|01:02|Y|EAkMrDs3O%2BQ3d6awrmAr%2FETguWnXU7XGWnWXgBCGyBYJv9Tq|20190525|3|N7|09|12|1|0|||||||||||有|4|无||O0M090|OM9|0|0|null", "PMNtznMlQGCgke5399Q5RhUX%2BYd6kSEm1iiUtUxfKhXG%2FdVhlebgxfHImVg6M80%2FrVrqjEpI2vXP%0ARNZx8Zrdcttp72QL1g4ngUA8yZGR56Dagf3fHhd1E3efxw4mLhl5IA99aBZvRRQeskW%2BEBFBkayn%0AtsX9OwuepzmDUb3eIhgRVqiJxDWDUexPXsmVurW8BDIYP%2Bcm8Ht557Rf0%2BMazBau6hHOEjHrSN46%0AOX5HwGEqKcTQuPIE9Dfh0CtpAlYKBLqCAF2iUVa7ObREyxvy6y%2BIzbOW5DgqFDpbf8G90LI%3D|预订|2400000G550I|G55|VNP|FZS|HGH|NGH|14:06|14:55|00:49|Y|z2QDRJDqXP22sWW6oC8C49vEex7yTn%2BHp5V1DlliB4hSlb1i|20190525|3|P4|09|10|1|0|||||||||||无|无|1||O090M0|O9M|0|0|null", "xDs0NXdS598S1SFN3kwERZdUtFiojlP45cpvZOPh5kJqF6Xb2Zpfq6J4W83DDMeJ5mu6Ogu66IkU%0ARmBFltiHg1e%2BVqmDmbyhgid7SNm76%2F5jeEr%2BwZY73fPvNkUe8QBUpa%2BkBlDlhfrjwwTm8b42yQ7a%0AVfPtx%2BjSIyEmkoS7supdQzshvbrbu2apxdk%2BKdz9db%2BDGvUF7UZhGhAsom%2FeDOvPmlb6777LhGXJ%0A3RQX%2Fnfl38ciRdxnDIz3WZuxpLLk56%2BkQ%2BDq4uj2VWMbR1iJ%2BrAvkCDFKNzL3d%2Ba5jnsnqpK7ib9%0AY9gtVVrk8hU%3D|预订|5i000G759810|G7595|ENH|NGH|HGH|NGH|14:14|15:09|00:55|Y|RXM8%2BnbCH4Tf7nRg1FGj7J15Ty2nQSItWidG7e1oy4lLpZhGh9QgTz5Lh0E%3D|20190525|3|H2|10|12|1|0|||||||无||||有|10|6||O090O0M0|O9OM|0|0|null", "P2WurP2B%2FZy8DYlPCSlHsFoYRoLPFqOr%2FutOrXjMS4ImkO2UNTcaWbgDhgTezc%2F%2BAM%2BFhOABT2Z%2F%0AWujd75eF0U2yr7IEDA1DqorqceP46mpBr9GA6ZpbuyWnzkRFH0FZc0e3TnEfyVEKFPQW4DNTfMcx%0AqCIk%2B%2B4zndsxZzAqeXCkpjMoYXhBMvuZxgHdWPQsH2RLkaHsntL7NM%2Fhm6Z0d3QM4n8MOivfG7Tf%0A53JTNg9pDP8PyFn%2BOXBtr83Wf95RXbZGbGdcygtRD%2FYK3AhHu5hTonaJCm2IeewgGTNDXYc%3D|预订|54000D314130|D3141|NJH|LYS|HGH|NGH|14:23|15:26|01:03|Y|6Fif%2FLDAXuAbU2ONNT8UTuVTPwl8k6VyDd4ZtvpPfptH%2BXlr|20190525|3|H2|10|13|1|0|||||||无||||有|有|||O0M0O0|OMO|0|0|null", "4l%2FSipKVLnlnsd3u%2BE0rw0CwjeqjvpLNoXvM57FDxUmFHMYKH0mH1IzH57pV8UmTvxYUDvgjvFgX%0AFAuQiiiOSfBboWqDpEPlBGuwZIkfn8NWmSiVMskZnkas1TCnYagXUnTJs7g8pP4IFOCyAqrEbl%2FC%0A9zOYlbaw5ATEktIaDx97gU%2FjkHc6OS0kdmDH0oVdAqhPEX4gCZ39OZjqdaHzcqLQW1JdQJ7vx9xU%0AiwWXf1PRwNb02Y1uxoCnncI2xYlTFSqxyzDS%2FXXGS1X9HeoactJG%2FHdMtD4JDbWQSF8pl4M%3D|预订|56000D323320|D3233|HGH|XMS|HGH|NGH|14:37|15:35|00:58|Y|YnP4n8r6%2F1YvdGplf0X0bcHz2GWXq5FdfSUuhB%2Bir42ZbkF6|20190525|3|H6|01|03|1|0|||||||有||||有|17|||O0M0O0|OMO|0|0|null", "Sf6IguoUb61dTyuZQwRArC5qmmqJZVWvvS7nOZlOEtHBSfn71g8F0tNUn6wLwQYJx7sYqZrEy%2BCX%0A1l8VFYvAQGKy1Jc%2BQoet7i2igzzTbMv%2BIET9l%2F1CBe3giYZWd6F%2Bw1%2BdqxCDfKK6xj4fn%2FskpJAe%0AWeojWSS2onTirJcdnYY0lyXZxSB23hB8%2F7RYPRenYtKC6NM08p%2B0SxGARGcG%2BnOVJywuaBUlyV82%0AJLLaaCNiafdWQ2bD9w%2Bo9S5e1dZzdcpyXia7H8Yd8quOWZoBqn75IZEsUrrlyTEUtG7t7xE%3D|预订|6c000G143405|G1431|CWQ|NGH|HGH|NGH|14:42|15:41|00:59|Y|RgC2ZyfZsC6fJqRXuFiKMfAv2v7%2Bz1mvJzHihxHc5P20qNo6|20190525|3|Q7|11|14|1|0||||||7|||||13|20|||O0M0P0|OMP|0|0|null", "EAvZnHMMQG40fM0XYC34S7l3KBMnvUDXBYhboVjaERUbBHsXgaraSOuMh9OH1Mf2glvpataRs%2BwQ%0A9tcOA8ePb1hR4WtGpRM%2BoP6fqF%2B37cCAV2rwfAQQrDa5YTq%2Bs7yAI7l%2Bct8fEq0OZjZ16t%2B33Sxg%0AQV14MrWrgIAAeKE8emabKjUOwNsB8o%2F2iGBrYGC50PAbANrqDlpMOwyDQKGwDQQn9r%2Ffa%2FR2DMzH%0Akrwalc%2FuyqNel3r7qM%2B0zjpL821pIeNgOxUPJb2xYDrJ904u37rvrPvxcz9%2B1BM6EnBo9vM%3D|预订|6c000G234803|G2345|CWQ|NGH|HGH|NGH|14:48|16:14|01:26|Y|JKgrm7kOcXsHeKBvyPg%2Bxda%2FLNj8mjVVLB5IQARSEO7T7p8m|20190525|3|Q7|12|17|1|0|||||||||||17|无|5||O0M090|OM9|0|0|null", "yGmdV0aT%2BQkl%2B14k6V9tLuByCEMwZAc9qHMQtdg9F6qJ%2FYSIY9LAQ2%2Fyw02lymKJ0L5G9b47bfPo%0Ah6J8jmUD9P7a2Rg4euPa6E29pYn7K3L1KUFxegM1PIjHEn94NXUKTpmjnClQ1SHGPXmdlakxpZ4E%0A9zpWEXzIG0t4O6Pw3G9WZlXRBqjSIS%2F2ah8WCXAcH396pTHlVgvkGKZuRBdzss3RYs2MAfcBxW8u%0AU0s12fYHQfQpQZh3myAFGSK%2FP%2Bvd2vM2FeAVr5s168PXszFhDag9IQuqfZfBTbomjP4vFNIxX%2BT3%0A%2Bojc8juZyaQ%3D|预订|5l000G751570|G7515|AOH|NGH|HGH|NGH|15:06|15:55|00:49|Y|mOvDI%2F67HvoVbB9RyCqKpNzGqCkixKflk1x4Mzj%2Ft1TZlsWvMEFZTrjDIz8%3D|20190525|3|H3|04|05|1|0|||||||无||||有|有|17||O090M0O0|O9MO|0|0|null", "f52fJHvcFnOZWHPV9Ui37rsjB%2BHUjX5x57A4h9j1%2FBzV8qmWnV90IPrPbjK68xPBzyxKrEPG%2Bdu7%0A0LXurWYMEtKED%2F6FLpzVxYASyp8sQktwB%2BaS26XRtgsa9Ezx25aBJaY8SlQ83x3FsABdTT%2FsUjRZ%0AEGf38hn6QA96Z8oG4E5MW7PHJgi5YKePNnkNwQKscdMm3uXRSS4%2FIIos4U6LuO%2BmMrBtSYZ0iy8o%0AIK4GZT6De4BZd3Z8uaVRQ79RHqM7rrVgG0DRPXqilkn4z7q%2FG0o9cGHfjGFVWMC6YeF0%2FtQSJcno%0AGeaZ33buM8E%3D|预订|5l000G753980|G7539|AOH|CEH|HGH|NGH|15:16|16:09|00:53|Y|DhQ99ShQdf2CojPI85Vm7us1ZxCqXUJq0rjnLutzAmoDnGTR47zvsYxTZYs%3D|20190525|3|H2|04|06|1|0|||||||无||||有|有|无||O090O0M0|O9OM|0|0|null", "LFCVjuELsya10Eks%2BCbSMeywajyXe5BnepULe1Mrm5ykBTEfCbZJ7v8xJZvpNZnwaZP%2B6enSq8wt%0Aox1BAgQnzGHig%2F2PZnn%2BnQ0qHVqH3J%2BwmAZhMR5SXJ%2F7f82w2brBW9ES7jBuxuCblorh1XCMG4fe%0Awaz9yememfrOIu02T78fmX8cIBmK6pIs%2FZ6rQAz7FonO8NuMF30S4khha84AfiDLg0dA02KuFFgR%0AbSqfYLVeRfyIeKbOlwclN9zJ5BIUtLBm7cC8PMpupLYTYdwC1UJbM8ZD8BTnAY1K4YQqkiwQfLkk%0A0mLFqGXWA5A%3D|预订|53000G757832|G7575|UAH|VRH|HGH|NGH|15:21|16:25|01:04|Y|PG8UzyXB8jfdc3zZN2eZ4Bh6VjWvzpuYXCHe7xno0gOW22bu5zlNx2aCEyE%3D|20190525|3|H3|12|15|1|0|||||||无||||有|无|无||O090O0M0|O9OM|0|0|null", "HH94Q8sPpBGb5S21Z5z0RV6mYDlyJxUo2s4Vqp%2B%2BqBmK5RKl4W47gtOAHVr4A%2BGcVOOfi8Fbd9AF%0AuXUgZ%2F4MSp1aKYu15gLp7MfutiSIO%2FRzczCeczGfeU3KwM7NHc2Gh4sAwOp2CymS3l7ujGfcd4lX%0AxQ7hw%2FLWy1CE3jlR0YTLLIEW%2BQ4HLu6F13pis0rqvh7X5WsEm15i1%2FaYE0aIfClqJDkvVMG7D3Yb%0AiGCZIYrc3ACqJnDoZvymsBuC26JvOB2QwOnbahcz4KzhYcYGpZmqdURvOCNtnwWjD3ZGAXxiezld%0AsxxtyLOEBKU%3D|预订|5l000G760951|G7609|NKH|NGH|HGH|NGH|15:26|16:20|00:54|Y|QuqNnfMijtEdgg0uKgr6Ex3wPFB1%2F3m3hdJUDs8JcJN761pVjcnlls7pehk%3D|20190525|3|H6|06|08|1|0|||||||无||||有|有|5||O090M0O0|O9MO|0|0|null", "Yd9OapLVg3CqWwICM0jCGzBDkdWSPp5wigVZ7esbpJx0n5gT3Mmi12Ub4we%2ByUQ8zjkX7OLwtWk9%0ADnbWcIpdNMHKK9iNqDBAYaiX8Z4%2B1au2jxqQ%2BK3Ku1E%2BmXNljbEcuiZZv1dPI7LfxgcFH%2BghhUcx%0AgI2havMb4dxIvrxRrCCnwoBK2og4GoYhPhNeR6PRqZEb0gshTKQlJI1AxRPD6761%2BJ7bT1gnaIDh%0A3rYjrJ%2Bp3iBi2kGPC3v8kC6UIwj3sr4AWiHj1ol%2FFdtq5RwljP1YY9f9AWEKDVx6WOyVpWyZcB%2Fv%0AE53IStpSJpw%3D|预订|56000G756730|G7567|HGH|VRH|HGH|NGH|15:37|16:30|00:53|Y|YMur5iBNheu2qY8cllJMJZvUz00bIs%2FuCzlf92Lkp8DCcDUvy%2Fw8yQ3xTqA%3D|20190525|3|H6|01|03|1|0|||||||无||||有|有|有||O090O0M0|O9OM|0|0|null", "Qz%2BDACD0V4%2FdkW6vDd7A%2BDB3%2ByR7sd1ijMFSeK2cfJZgGDiimRzIbeBx%2FRxAfXzLEjtnL%2B5Jwxw4%0AgDAjkBkg0piLgSq6rTNakU%2FDPuYQ1A335DJNi30OFo6CVCoUQuyfFTMIhetqkPf0PcvFfNWc3GD2%0Atp%2BCZrS8bgR05hDY6%2F9F5RUyaN1WPwEWUPBndZUrQ7XSAdIDN9wyobJ%2FoddH1AmbeqfI%2FqsVs2ky%0AX%2BVa8H4t02NWI%2Fkp%2BRUOPiLyfU90ed2sQDLZo9%2BMMB9E%2FE7T2clQ28qGgKCmW7mdoT5dJ%2F0%3D|预订|54000G758350|G7583|CZH|NGH|HGH|NGH|15:43|16:36|00:53|Y|EDNFotemsskSma%2FLyRIGCpFzA1ghID3kgdr4tk3kX2yZr2ii|20190525|3|H6|08|10|1|0|||||||无||||有|有|||O0M0O0|OMO|0|0|null", "H%2BLunqyH7u4hs3IvsHFN1EdI6hZTXAjKElUUn5ldLomyXX%2F2KSnV99IPCwQjr6et3ZJLJOOhp%2FaL%0AWRirZ4iy4yvN6qndPzIVI2YG8jV2aDSucbHTvBVj%2BiB0HAPH%2Bx%2BIJGIyUreSWGF6zgCCUBN3vM0G%0AQyxB%2F64cP8pz7GjG%2BkaMS42v5sAwBssK2m8Z5CJP4lmn44wNIpXYrTMMGCAHkwaJi9y%2Fgvp1hF9h%0A5hoarC0LFpMWrzCC4LROqsKensX28WKgBoTmxHfeJ5O3p9IqLjDpEOWfE7o%2FOinT1ymsE7MSudNq%0Ag0WbHKbYNDs%3D|预订|5l000G751750|G7517|AOH|NGH|HGH|NGH|15:51|16:51|01:00|Y|z4oyArSQ1Oy8%2BGRBxU%2FCOilDdDyHZwdxrG%2FKPtNzUm44t2wbi4YbBt7WOkw%3D|20190525|3|H6|02|05|1|0|||||||无||||有|有|无||O090M0O0|O9MO|0|0|null", "IKLE79nyUxpqcF7K7ZQ%2Fzv67%2FbHrY1G%2FFHuRMIPJXeCrdaqOx5DP0AToivATaZP1H3%2FPq8i65vHR%0A0OYqm16J%2B1b8%2FfHk%2BKqrACUrKpErLmnp8ND%2FS3rmI67nZI9bWCd4aVakKMsF5Siw3XT5oeMdKTHt%0A5CADuaIeKFbbCL4wj8OLfhSDc%2BxAcyESKTe4WwnVPZhDe32yPSKkZWpbLXhyUb08ZPPfmH5N4HbB%0Ayj0UvxZrPgIBISrMyBtDUO63wB2LkaRL3sUuIVJS7nmn4bdN2p1jLQ2r785ZgtzEc3kdB3s%3D|预订|56000D321770|D3217|HGH|XKS|HGH|NGH|15:54|17:03|01:09|Y|Hk9Ysa%2BYX5ojTqpIIuRuWWFk6Nsupn7Wv5oqGT%2B%2FUC%2BPwGgI|20190525|3|H2|01|04|1|0|||||||有||||有|17|||O0M0O0|OMO|0|0|null", "vd8cIZIY4v%2F%2BE5RT5gCPcXGKwQFp9eP%2BnEtT2z90x6wiSNuAM1fPB2wUjw29fE0ctSzis5x6eV3C%0A565zuCUCjliDaShxebbZ%2FNGL8CWH8blHzxLrTO2qCWIbvcDK6tAS9t6S7%2BxUmd9yJWA%2FlWtOSZ1U%0AKnn19q0GA5zcIlY6vAVMNd6ojp%2B%2B%2BM1ixUE%2FFNvRhlm9atcWGzhtX%2FUc2CGneeYIy37UfhaOb9Dc%0A3t%2FvRJBRbA5EPYHB2ppncKCQoAjwA3L%2FeF1%2Bj0sQ1zLq8vFsGofLfPBSGr%2Fo8it7EuhUyLQgbNlR%0AWPWlVdKzi14%3D|预订|5i000G767632|G7673|ENH|NGH|HGH|NGH|16:09|17:09|01:00|Y|lbpJZ22yXm%2FjyJGfiN5LUIdxZWZ%2F6xv6lhyO8BzKVYNPXj34hybXWq%2BTmt8%3D|20190525|3|H6|09|12|1|0|||||||无||||有|有|无||O090O0M0|O9OM|0|0|null", "qLvIE%2BnVKz2Un28ct0kbqgESjhndRo7DpiHILjg3gqKoeh5IjUZUw9tlNNih4jr9qUpEM8kTstr0%0A0gjpxxnhYxWtRtMh3XRY37Erao2JVhQQJKZDhDKyzJbXU2LvHmGvf0anZmvJhmZZNFO6vIm3L88n%0AP2JewcYHPJV0MtJczV43r1p4fXj%2BbcWsdjjieAujiE1P3NrFmYwkXdUfiY6u%2BEm9U1Fn0TpeRO2B%0A7aV%2FXiEOG7ylu6R2ls0IDE5UnTc9qo%2BFWC6zvQRT4BAzrjGzRlxUd7c9dRurLXPiRVaXjC0%3D|预订|5l0000D38190|D381|AOH|PTS|HGH|NGH|16:19|17:18|00:59|Y|Iv2vIZOgEXmMuJTe7D%2BpyMy%2FVAoLlJb4sBzWNrKF%2BMd9X4AW|20190525|3|H3|06|08|1|0|||||||无||||有|有|||O0M0O0|OMO|0|0|null", "AgaWf%2FaQbI4YHySI8qutFXg9SDRHSxBhJnkF0BwcwaOtM7o25DTm18SyYFucNsz8tpt6mQ7Dls%2Bj%0Ac2Yw2EEjyeBf3oCf98N1YK8V0Nn2ogSwyVF7luN09mK%2B9r31Kv6IXw%2FEdynjualXiGeO6Y3HBeW9%0ARMmvnGpDBTgyH33lH6W%2BLDLIGPVvUekqCidztJKAuowRbMWqMN134m6eOsDYxS2RZGjyno0uPK92%0A3tHGezXTIYEyQ1XbjXZ6umK4C7dAthDz7YyX88CWR0gqWRurV%2BMzH2iWrKYQhK9eZzifMYI%3D|预订|56000D316901|D3169|HGH|FYS|HGH|NGH|16:24|17:29|01:05|Y|tamNoX%2F9Fw9jJpGsSLKoIk8uGS8oKDbPUjf7xnLnnWIzHugE|20190525|3|H6|01|04|1|0|||||||无||||有|有|||O0O0M0|OOM|0|0|null", "|预订|5l000D310182|D3101|AOH|FZS|HGH|NGH|16:30|17:44|01:14|N|vs8kajYDN0ThEiT0PDvU%2Bhbdar0S2MmmQuIOb82grVPsOE3B|20190525|3|H3|05|09|1|0|||||||无||||无|无|||O0M0O0|OMO|0|0|null", "bYCc6QHhtwGu5E6%2FOxv%2BU%2BHYOK2JqEshYykZUkjh4ODYJfYO5qdlhCNz2VVthnZz%2F7Z3z8UXYVJh%0AEyqLVi65XD0D4tybjuSWdid0OsbU%2FXQMrAyoKxPS0JigJMSvRAEJF6UeFIZ8mYbCgNVe11q6GZxc%0AAJxtKypKYko7YwheljMW5PoRs9M5hpdOexntDkdHaGnj%2BDju98pPKDGZMnt1%2BZXqidCr8zOEQc%2FZ%0ArdLJiZzzem3gWXpI34g5xs9k2zfarpPOriVj8O3coP45IUXBdT2FnAoCPJH0|预订|4f000G18960A|G1893|EAY|VRH|HGH|NGH|16:37|17:38|01:01|Y|m9n6CrzbiZJEKiNpdaXvYwnyOdg1zmsQ|20190525|3|Y2|19|22|1|0|||||||||||有|无|||O0M0|OM|0|0|null", "|预订|5l000G754550|G7545|AOH|VRH|HGH|NGH|16:50|17:50|01:00|N|3S00FU0TJ9O6TqstGwoCV9266tcxpYpWSq1%2FRVHPH6OFUYe%2BMXToI85Mi34%3D|20190525|3|H6|04|07|1|0|||||||无||||无|无|无||O090M0O0|O9MO|0|0|null", "a03kQJGTwB2RSIbTLetoSvOoSSu20JCuLvFQYEgYFFDILfuDLCCeFO6pwcZld2Z2l18xx6UuPYW8%0A7WuWLLvef1Ud6%2BXm4mD4rQxK1HBB8jaHwr9aoomuPMrfcOGlrpk3BQn15v%2BVbAr8ghMAzyhqJ%2FjP%0A%2BOZ23jRq5CA2czWfCAhEGonG%2FTjUmNBlPknSTTWS5YZvgnPmSB0vijN7nR1YcPr4a%2B3X%2BvLpVak9%0AZteAkftXzzjegmB1XyFKTWJfAKxboSAWXAKekQpMpsQVv3aIc1hB3NB1dN4tylwqvQdNVD4Q%2BcWl%0A2C%2FwCBKvHOA%3D|预订|5l000G751961|G7519|AOH|NGH|HGH|NGH|16:55|17:55|01:00|Y|ChrhjnTWPCywze0O%2BkCH55yqdCYl2Nmbpg180BdSnnW20nCcvSRMaczYq5k%3D|20190525|3|H3|04|07|1|0|||||||无||||有|14|5||O090M0O0|O9MO|0|0|null", "0I4eNI9oyfiBEfYNzQVq17uAhtQI%2B%2BEqeNuKvwPNMHwJqFGPWNUA4WSXRCSeuK0oOTjqw89fWIuC%0AD%2FPWlz7BIb0fyXAhvD7LZwb%2Ftqb4w9kWEjRTH9%2FNTBPzNdSWv%2F%2F4B0EIBbY5vfpQxQDItlmAmUOX%0AEb7vh%2B%2FolZzXKTOp8vodAmExhaakRLilfBPfcSYW6uo8ipPB7%2BeXWy1%2BCA9dNGrfuoFtnG50OiGx%0AKFyFJkiKUS6O%2Bw7f6jujsJUhTMK0WY%2FrNG7j%2F1lgGRFhk5fpkPagbD%2F9%2BprTzfXccWIKaJg%3D|预订|5l000D310362|D3103|AOH|FYS|HGH|NGH|17:00|18:09|01:09|Y|uzpbhRlkMb1519p9%2FZ7xTNuGGXqj92EE3Urm7AKa3bi3q6Pe|20190525|3|H3|04|08|1|0|||||||无||||有|有|||O0M0O0|OMO|0|0|null", "paBeYvWWHrH5PHNaWHB3DOqYPmjVuDTSDoq%2Fl17aQLBFimCwR0H%2FRWS%2FNMjmLnaXxJyxfI7rBRWt%0Agk2W%2BGIBUXzVNKPfhFgIgAh9Q%2BfUQQF8X48TJnKj26NlgRi4PAzOmxkaM2ySjkEUj7PZ5KNGlD1i%0AGLkqQRdGeDVmaBCn3rZHr4asdvOVWQSs452w%2FBDkamCEulNlnLmd8EZs74ETU4leiL1oFMeCi9Ad%0AlNeHc1U1ni5V4pY6r0aiQz%2FJrx0m%2F6HsewgrMcBIeJ0EuOFxaxiTMNxZnh05AX2CjZhJGwE%3D|预订|53000G757131|G7571|HOH|VRH|HGH|NGH|17:15|18:15|01:00|Y|m1lOVN7kWm60Jl3Kpr8KoX78WrxqaTNOW44MvwCfbu6eTVD8|20190525|3|H2|14|17|1|0|||||||无||||有|有|||O0M0O0|OMO|0|0|null", "tBL0V6j18CBT4Xi3nTXbQLLY6Q8pnOZ4SzlXawkanCK9T0cEndKIYRF9UuK2zI0UwhVZqPDu7mo2%0A8mkISHq2EjTHM8PBWU4vxmbZrHvL3bE3DS7NsvPCKhGsOtfrFZIoRdFXdn4iWxjlZJWM6uv033Dy%0AQzIrvlh4OhTJbvQPbbEdDo0B%2FvZ6zuw%2FFpEEgxGCGadIS3m1xn9HMwG1NWV4mGn3yB8%2BW6lbqZhN%0Asjb6v1TmgWrr%2Bfp9LIZIAtkM%2FHvGGVKQMFeAnGbbhRXP1Xq7FTRZLbCOwyGBUCjjzxkfuF8Uijna%0A0pFVjKae07w%3D|预订|5i000G748800|G7485|ENH|ARH|HGH|NGH|17:21|18:22|01:01|Y|dTzu%2FOQ2Ddy1tmqNHyDj%2BkjIG3q7R5h%2FNExmoaTHwY916eMDREoYQaLD81Y%3D|20190525|3|H1|04|07|1|0|||||||无||||有|11|3||O090O0M0|O9OM|0|0|null", "E7x2gS24r5%2FoEVT0ah4LIRe%2BzaZlf2vsVn9tEkn65CZBKCzqPljIp33vPv4Iey0iFhB5ILlh5QFK%0Af2FJsH0IfxNXbIvaKuW8AZzRQqkshaLdFLUGSIQYye75g3fg5R1bQJoyIZx1L%2Fi90JKls%2BivXvcS%0ApBCFyOpOb%2FL1hSFIWHgJ1kUm2yKTGh%2B%2FZh8sAeFIUdf%2FsshQsGxvA5rS1XiVfCxoBwNChLJioS2z%0AAUG562JwM6AGwXpiKfP4%2FYfncax9eizZ0KQUIaeiuD2iwNfpIIxGss8ENmNJm4JTBGyycb4%3D|预订|390000G5920A|G589|HKN|VRH|HGH|NGH|17:26|18:27|01:01|Y|62H%2FmAenCiSAMUHiGxksrYhXE6eKol0%2Fcmlb%2BVPpLNpHLZxg|20190525|3|N3|13|16|1|0|||||||||||无|2|无||O0M090|OM9|0|0|null", "LCtdK74dl5Hzpnw6cjxWxnqGQaovvApPde8tvzWmj9R4tewFMdXx6Afyzi3dKJV51cFAxoZJseoN%0A5rlOCCioWv%2BJBcDEJj2zuhK80g0oHmNBwHKf5hwStAIZLkyiHusE1tIk%2FMMS8kPP6vBXIKrxH5zQ%0AsLll83PomUHq63SvwU8Re7ghZSr7tJjXUGZ90L6S6owbnyVQ3f7Hl%2BR4VR9wPxcnmK2jKZekbjtG%0AjgDDlzKmM6llGu4FYDgqQAc%2BvAtDATDztSsUyyXRrCe0lVZlz5cxlYEMgnOlsmXuhUkeAfZ78ULw%0AmjgAK9%2FXOqE%3D|预订|52000G748400|G7481|NYH|VRH|HGH|NGH|17:31|18:50|01:19|Y|wmKwlDMKCakvhN1gt%2BYd5ejaZlKTKggy5dzQFA0V5U%2Bu0cpWTr5uycLrCCs%3D|20190525|3|H1|07|11|1|0|||||||无||||有|2|2||O090O0M0|O9OM|1|0|null", "Kq558SQKSWBde94xFGFR9LZBJHiLwBJyl8orY1lg6GMIFy%2B7fPg%2BDZY%2BTWTjbRp8sd5ST5YXuoWi%0APRm5htC%2F7Hai0UlxRjXV54qACsk35B7M%2FJwgtORYlYq9iW4AA1jpxytapODLu8%2FOT48%2FYThWGxHP%0A5U%2FT8tSwKhxNJ6hQU7O%2FxEqX%2BVmTnqHPx1Gmxrypq%2FcbACnkASCG%2FY6iTEIhLDHTNg7xIAquqXK9%0AmMDumAva5a7PWF5s3iDhCidcvBlysTOwCKUlT1Ki6bFdCJ3ZlKhkAcbUGsMuEM4F638R%2Bhg%3D|预订|12000G12220A|G1223|SBT|NGH|HGH|NGH|17:44|18:38|00:54|Y|pWVeUD5tKJ%2B0BdNgF1GhsUG%2B72gHr%2BFSgeDtQ0HURrO%2F3aNN|20190525|3|T1|17|19|1|0|||||||||||有|1|无||O0M090|OM9|0|0|null", "ks9UyX8V%2FkoMosyqJWS8IngrELz4mfvwIL7nj0WO58J2Icmn8xBpdoJdMfV1SmU%2FIu6yw2tLT%2Feo%0AWFryOqozchBPHXbQ%2F9iGUpxaXA2vuWzo5of1WSyXTXFCNnpiVpszKuJUDOcFUK34zrMOtxp6ql75%0ATyDRGkmvD8I63RfpN6bn8mWTLSvzMTPiuiXmJrJ9uYaqPUZFj6jtcbJ6odBVoGbjg7cpnA6S%2BQcz%0AEt8pETh5Zzo2cZ70FDa9%2BaEA6r44zfb8CyxyVoxLZ6i9z7Pm0YenYogBwGaM90bCXB5MLr6mVx4S%0A0ndbH%2FXRuec%3D|预订|5l000G752180|G7521|AOH|VRH|HGH|NGH|17:55|18:55|01:00|Y|%2BslkeSxFtbTfkcG4LndETl0KaVL8rNyWJEwNIjDLmuIN2kPwi2dOXGK3fZk%3D|20190525|3|H1|05|08|1|0|||||||无||||有|有|11||O090M0O0|O9MO|1|0|null", "tkL8Y7WARzYni%2F46Pm5%2FoJ%2FlEF6OAyo9IknanRLCJneWUgVnbwi3lOSlzmKdCHsYn6IxuXxewoLb%0AVWPOOt3zDd3Tk7lpQwVsVR7Zp3fS2hr%2BFGgDKLGCLU%2BTkY1CFBmbqco9XlXtoW9yjCBgZ1h1e35Y%0AnEBaUcJxFWEDL9JJrKXA5VSmFKEVuMn0GF%2BRs4efcz%2FVFGlcz7o86a611ENPRpIgk5kRs14A3Lxg%0AUZyKB4XHM5oCxzF8pjd66OTdMRgpRyZOE13NEVeLI5DC40ASK5fXtkpiYWb4IGZfFW%2FLe3I%3D|预订|78000G233410|G2331|KQW|NHH|HGH|NGH|18:05|19:05|01:00|Y|5cnWzZbeWZtxbuPsuksyz%2BsVOWKYZJO7UNtEHKfj7WSVJ%2Be%2B|20190525|3|W3|22|25|1|0|||||||||||有|19|10||O0M090|OM9|0|0|null", "IxiQxGA26CmzDJDXgX%2BjEZwZ8%2F1JPr27SFamCeXtLcf%2FrnCOTSFBSrgEtloTGm4Z7CrulMIWfqyu%0AmoMHXbcAuRL9VlC74tjlQWswnDuprxaSSj4dp7edy%2BsMCIJ%2BJnBqIBNDfGITicYxxgb5olUcKtg9%0AxJYlqAz5OwcPPHeDvNm1GRRoWvr9%2B8BsD6BrJj4rP21AH%2FxqXSGVW0LppPDqpbNxY6r8QgsIoyZ9%0AC2nGr8BGEjN2X1TABtGGnNmVIoo2nYabHjEpOWIBbUtkErqrucgfefhxDNB%2BtGVQkC%2BJunw%3D|预订|54000G758561|G7585|CZH|VRH|HGH|NGH|18:16|19:17|01:01|Y|elifCO8PeOjA7dxrQ6IABqFCCOaxclsE7SdLr2gZTcUwPVQm|20190525|3|H2|08|11|1|0|||||||无||||有|有|||O0M0O0|OMO|0|0|null", "y%2BeTuz7I22d%2BpYQv9JPJ47%2Bpb3b2VFiQAZWDAHp5aV3RiPkZW4y5XQhoqDoTiHCiA%2ByqttQIB2pf%0AP%2Bdz9AnHFpvZy2R3ffyd2vb3Al4myxMSoUUVcFCjvKFknZbCM1d0XyEMdG7ZYNMXe7aX96qO9gpm%0Aza%2FhqaFMdm5mdrfzBPp6%2FoZPKfw4sE4Fi21J2UOYWWll8v8fCLT3mEqXrlVkRi%2FPaWGvTTHSw6B3%0AIYTHCdm4KjsLTxW17SyV5NQ21AQ0WQwm%2F1d%2B%2BMSPmgtL7Y1Zv8oPGuBLAEjKsYfp2OHe5tf8ZLti%0AbxztPEAdacY%3D|预订|5i000G768024|G7677|ENH|VRH|HGH|NGH|18:30|19:30|01:00|Y|lzv37a7fOR4Hr6RmofZ3m52A1Lwj7foA%2BHbnu0suQxRaM15OqR7uMu%2F%2BfRg%3D|20190525|3|H3|07|10|1|0|||||||无||||有|有|9||O090O0M0|O9OM|0|0|null", "%2B%2Fs%2BfNPaQWSlZw7Ty7cb0sLijPfN40yIBZXodehT3P2KbHh6CXQpgQNmqTfTGrc4KNk033%2BkpXsx%0ADXMzdF6qltArD0AmFs80OtvYiBp%2Fa8Z2NlcS%2Bzmk8q%2FkAM3wwgDat3iwB6Q%2BJRTmoxka31wucifD%0ALergSu5hbebdJczJjSjdQT1thc5tCeT94GljAbCQrCbDdfljJiaIHz7wiZV6jtTRtOQkPrrmf4ag%0AQ2QEMtOgsI9n4Xcx8bKppLqf3m2BOFS04LVzq%2FvC692529H1zAHIOGuGF5I%2FmF8BYBO6yk0%3D|预订|240000G1670B|G167|VNP|VRH|HGH|NGH|18:41|19:40|00:59|Y|Jx9rgpIOujp4qpeQRAlUbyG66QJEj4Y8HouqukKeyaGiduih|20190525|3|P3|11|14|1|0|||||||||||有|无|无||O0M090|OM9|0|0|null", "KWjaqrbbMOX1Yxo5pNfrZJcGZcE%2Bf%2BykyCTpdb604vEwwQIedmD%2FO1YRWudOc3Dr5W31sFZdaCPZ%0AxKHfSyM4%2BZvHyrrN9zyidqdt7SyHz%2Fn1D5gjgbU%2FXf4TfvbSTypx9xqLDjmgbNwwkLoVhvYGLDcq%0AeBajQkabE2igMQMo6zXW8MAAhSdMXZi7W8k8xdJ6YjiubCJOLo8leZlEmgaQK%2Fm3WI1fVeAz0lMx%0AyNwhQ%2BwZA711o7aEKMQ%2BhbEVogXQ7HdOK6b%2F3h3acRD7Vf76bWQfsl4Q9bYW8C6oVHVziYnITn8K%0A3nSB3viL8Yc%3D|预订|5l000G75250E|G7525|AOH|VRH|HGH|NGH|19:03|20:03|01:00|Y|N5IihkmA7S00oV%2B4YR79sikE0Mc3LUZJZ6uXGwsxrrtg6rMGs6dGB96ZNJg%3D|20190525|3|H3|04|07|1|0|||||||无||||有|10|3||O090M0O0|O9MO|0|0|null", "DHQcJStrLvJgQZeq8cI8%2BaNHfAFvHqZ8NF9mrRE8oQoCFju2Iheiq%2BK7mNw%2Bd56R6%2BrUzXDc5JbT%0AXfK4vvdiFCrRBjeG8CQq4Va%2F1KrUiTM7w4WHdfwI4nDGnGjuFKFNzvdqZxDtilH95CJd%2BBohKCZi%0AmCBAAYCxXhIWg4JYonKpmS1%2FSz3I96oXjq%2FtsFJVScWI7bLwT1Mk3vj%2FNU8f5Ej%2FmfgbMufvBVtP%0Aijb50X85yjDJtDV2izgfHbHgamC6zpU74aiRXJuISRN1AWK37zl2JyN6pKcN4JpHM7IIbKk5JEiC%0A%2FnC3sBZlEh4%3D|预订|5i000G766441|G7661|ENH|CEH|HGH|NGH|19:09|20:12|01:03|Y|8ad0HWf9T2sq2LTlMuSrr6zhrLW4JzDLqa0Bff%2FiG%2FHbLfzeQlt%2FShn7otg%3D|20190525|3|H6|09|12|1|0|||||||有||||有|有|11||O090M0O0|O9MO|0|0|null", "reh9o8ZsoaaLbcXAN8YSGhKNTC%2Fk4EhL9%2FAt%2BORP3eHhfTCjZPxbw7wJiNmAai0nj9kd0vk6qHIs%0Ajq2Tjqxj4i5GvUGHTOHZ1xcWriS9tYZ9yGj9CNaTb9YN6%2FXA93kGeZ1e%2Fp%2BPxNYcld3mGj3nEW4s%0AtGaABzgssFD0Z73%2FyDjVAhqu6NlV6kN09sxecw0B0cUyn63Kum%2F24RPCnL4YZK9lS1%2F1J5rpf11V%0AOs6NLrr54aQZmIYpClq92zBDczbo6hcMdOJRdwMpo4EOkjJSv1097zC5D7BvCcZG8efdO%2Bg%3D|预订|770000D65805|D655|CUW|NGH|HGH|NGH|19:19|20:39|01:20|Y|D%2Be4vDwFvbLJVq%2FfJFeqiwe6nAC37KC1B0mzAYxo4LLPH3XN|20190525|3|W2|18|22|1|0|||||||无||||有|14|||O0M0O0|OMO|0|0|null", "%2BA%2BY6dpy04tSBOtQGU9Wd8MVrsv3JesyUEL5HBvUTA4Xqz6BL2CIxsYhHNiCwvv5W9EkIVZRAOX4%0ASSmAYN3h2de4MArHYcUhSsW%2FfZbp9%2BXFt8aPXY2%2FyBOMkjkjJ%2FQmKQbLb1rqWMjSOHiCbepR89Ck%0AdCWboOBPfbNzzRBTT5ylQKmKmqeAqALe1EPAXD9R%2FD4UwlWwQKw6ARwhKSm1imZRHs%2BsA%2B2dS5lC%0AXMjpu2FXUvGfGX7yz6cv4TtK38LUUivO4ez7ydZhM2GBfYKy7JrLT0hKWR1Df6DTsGfkxKk%3D|预订|2400000G590B|G59|VNP|NGH|HGH|NGH|19:32|20:31|00:59|Y|7X8udfKcOo%2BNTDXjn4V80Vk%2FO4tthyNco1u9uj0PXHLGKWRi|20190525|3|P4|10|13|1|0|||||||||||3|无|3||O0M090|OM9|0|0|null", "jAY98kchiLY3U4kwx84l8H9XUvj5Z82Co2sGP36UGi4krkCk9zsguu7Q4cpilfzWiHagn%2B8G91fP%0APoqfOEo5%2FV5KTlWObf1MVSHKK8Iyl%2FhMCkfEB%2FmSiMThg2UiOIgZQYZjsIkNtSGIMAylsRUPXZUy%0AsMKK%2BgmE%2B%2FfGquKIqrhzIQb2HQP6T%2F4WpNNnEowrRWpVETY0PGLReTIJwxv1QngvNBZr6bQscWKk%0ADuj5jJRaj%2FSlfC%2BIEZou8CCM7aAibf25IwKd8676avfzG7uSCMYlOvo5nk%2Bfk5R%2BaAMsh7QhCi%2Bk%0AVOhVctddv44%3D|预订|5l000G753503|G7535|AOH|VRH|HGH|NGH|20:05|20:58|00:53|Y|63%2FIzc9QD83sOzXhX8OEjgWJWHu78Wl8EGqPDbRBX70D0iRL%2B%2FUXfMzxzJ8%3D|20190525|3|H2|03|05|1|0|||||||无||||有|有|15||O090M0O0|O9MO|1|0|null", "wNWcfrvDwImYH95%2FP00cidpx4Sc%2BZmAJeB9LjyXTRE68XrGxk%2FqCG%2B6Pfgi%2BGiFgvZ3d8nSCp3tt%0An11DE%2B%2BNASmoZmWm9hLkUbUH9v4E%2FmJhLPTmoOkAtGnReP8ojFSLN9R6NNLKEtHEvuNaSFErPn2t%0AWG3%2FVd5S8uS3rsRZkJdHMfairjn5qCv0YIRtTP8dFD9X6TR1Y3AUPaUdo3WgOvqgDSQ21nVx86rJ%0AZTuo21JafTmqHaW8%2FcqmfpgNcOMfkOPBBd6ZwtBxix4yt1btVbfUBbix9c%2FMy4%2FpK%2BvNxc%2Bt%2BZq8%0Az5ZqWr0Ocsw%3D|预订|5l000G756160|G7561|AOH|VRH|HGH|NGH|20:15|21:09|00:54|Y|5JS95diETGwCXiB5nPz%2BUBQjcANUcw2DvWtYI603EcSRNy9VSBlIQFvzIM8%3D|20190525|3|H3|03|05|1|0|||||||无||||有|有|有||O090O0M0|O9OM|0|0|null", "3pqcEBL5rnffIhOBMOE%2Fe2GPAGEbMCe3ExWDnL0bcCkEgaBKklQbwjJfGRLTmld%2F9oDJZKo2MMlD%0AhSHP31gITvOGu0cMHNp8XBUd4jFh9GGBtwKgWY5OsDWzaK1NdtjAxbS5l%2BllKMHxrZI3iLBTmXxS%0A%2Fh%2Ba0tfh9rIA0zvb0TL7UJueMOc5o3NCDvuVeiVu9n%2F4bBtG2OUOpFSUyc%2B4YTG6BOyPBOY2zlHQ%0AGoAIQiI%2B7HSzRBwTu0d4GIlmmjBSn7KFB0xQsI5ffWcakxWqLP4YZwMVeJHlBLTmcXCXogU%3D|预订|6c000G141809|G1415|CWQ|NGH|HGH|NGH|20:20|21:14|00:54|Y|z2UzvSm5q3m7GYLLbmyqumH31mJkgUxu9fUdxB2MCWS3BJJM|20190525|3|Q7|09|11|1|0|||||||||||有|9|4||O0M090|OM9|0|0|null", "9u6MkasRR91tu5WgLc%2FcvMoAIO5Hkhx%2B0cclobJWbM6qp%2BeboAEU8OPQaf2zIZcgaLsQY0PtJNmi%0A4gtvzBoEsIzlgQKYsx53TzYLhN3w7v0yIa%2B03HpMlKnkEBfPD4GxH31GtmM515vE1xqnD2ePBWd%2B%0AJu6wLaolNHlAg74b1dru4n1dhU5pPN1i5SHDz3i%2FogGf12SPhZV2QWWuZWuPPqzEYgTin%2FD7%2FfCg%0ADV%2FmXHFUtUppsibYSqEplm%2F335hQnElsaRrJFzS24MfLzj8IBPpbdIX9vCILv83GpTv6vFX0mcFy%0AbjJgagtR6gM%3D|预订|56000G756900|G7569|HGH|TZH|HGH|NGH|20:25|21:19|00:54|Y|B7uEgDgjHsNSW7%2FlGRaH8ne3digazT7A4o7syUiPNP8CYDtNfY4PYWn88EU%3D|20190525|3|H1|01|03|1|0|||||||无||||有|有|有||O090M0O0|O9MO|1|0|null", "Xo%2BQuXxi75TM2wwzpI0Wb%2B5zMs5DF%2BxevAJVpfpVHxS31S30Xbw0BHZRGBlDB137jMpXbJc1CiPG%0ADq6WwnWRrKgTdxsmVOnptBis79Bzqod%2FHUFkjNL0JFIuFcZV%2B4YVpY5gukdffcdBsU1gQN1HfFrk%0A0xdxWrwjEYRgtoenyf4FIFGq%2BsHv2wj0%2BU2s043tEiFXnWupd7EEjF00NQZK3j53llr2ZmN8ne%2BG%0AoFSiqaTQyWrapBnNJ%2FS1zlKaTQcJalvGEBjCeaczBY%2BgmpwxlrAEr%2FHi8Ep7yakA64hUvkP%2BeuzD%0A7q5nYXqIGK8%3D|预订|5l000G755760|G7557|AOH|OQH|HGH|NGH|20:34|21:32|00:58|Y|hW%2BBcvOacH7KSG34mOOLUl5BCUJ0fUH4BuhW36xbP5Ngaoxh9bjEXzFMTf8%3D|20190525|3|H1|04|06|1|0|||||||无||||有|有|有||O090O0M0|O9OM|1|0|null", "zfs%2FeL5FdlIMiazj9HrgpwwDIucJoBhp4Yna9JiY%2FoOJvlRftMDNId9J9VIi6xiewftdfND1iu7N%0AvqyNlqDOxbO6XbT4imf2LmVNJqW%2FuZad6%2Bwzs01CbZP3d0FitWALXblb07MVWzBpUlPGYTYJLNVN%0ApPp%2BK0%2Bm5QEphsOQIpMiSi3x5H36RS%2Fjr0gfaM6xri2%2FE%2FlxvuKTfs1TLaA2NsLti7kkBT4%2FYwGq%0Aspk5AqLsx11oYkIbEEutg%2F3pmcrbYWkGt1%2Fz8xMI4YR9x%2F5ze9maxghCgPqljWq%2BtA6a7djwIDaJ%0AmbZQItwLi3A%3D|预订|5l000G763960|G7639|NKH|NGH|HGH|NGH|20:40|21:27|00:47|Y|qb3jit2nJo%2FI5784Vq68zn3ADEyPJYdPPp4yCqVHvJ3NbgyWME4qiT7C%2B2c%3D|20190525|3|H1|06|07|1|0|||||||无||||有|16|10||O090M0O0|O9MO|0|0|null", "YpvSDmmhj7pJuYknnUXtqkUWEMxtjgECl8RuNbSzHka9sEuyeGRbk4G%2BEd246j%2Fb9TwrZVO8W8po%0A2h%2B9CIHqeyT2PypFdQVC7lJxOKGI6uAOQEvMH%2BzngioQDwaRSubAAWIhiY3ymRBBISO%2FnaaWkZDJ%0AlrPs%2F5kIE6oRZEUdrQaJ9MqZSKrXKd6PdEdEXDC2i2t7e44pNvVqkuImXC%2FLNjmhOcsAJzBWQJ64%0AqLyth5yrE24RrZA5aee7zKohIrIJlmoa%2BJcLPBLfzACS3d0SMXH0UHa9K0j%2BOjJ6FiLx%2FAk%3D|预订|38000G186807|G1865|ZAF|NGH|HGH|NGH|20:49|21:45|00:56|Y|OKIp6REoDmHUQQ0f%2FhoVNl6qEu%2Bw6JNVqB7d6j6zspjChypT|20190525|3|F2|12|14|1|0|||||||||||有|11|无||O0M090|OM9|0|0|null", "9lGTxNXV10wePjp1vawEpV2T8t2s9vfnVicCOHRdMohwDpPZ%2BfNwgbQTu2b765vuw5NTtsdrm%2BKM%0AB1Ogi%2BIVeqBAoJ3gWG1Mrt4EghqeqpDgjCuJze206Wk5Eph1I2eiXskX%2FJH7sFUWgPaISr6rsGN5%0AzbncsYQC2Obc95%2FZUNiqfVMNpe%2B%2FqmwWau6DOumfRJ7ekyY9V%2FhcApI2b9EHxszkKPbmtjH38Qwm%0Aey1ITD89cbhJx%2F584xQuOVQLIuKGQegBnBRy6kolczxw87HlfvmYDe5gMWi%2Fg7sNGGKjqQo%3D|预订|5l0000D94190|D941|AOH|ZHQ|HGH|NGH|20:55|21:54|00:59|Y|29NQKhC7L%2BqKlSeglN9Mt5nSs7hbI4YSbbrUJDPq6yu7Tkm2|20190525|3|H6|02|03|1|0||无|||||||||4|||无|A0F0O0|AFO|0|0|null", "hSco6GwPK0YwkFoZ6seaLc%2FNdsustO7UwJy%2Be3pRbVMW4FqqpU3HSWfSguFZP1t4A1WwDgsl6%2FQd%0AGgf8ERv3pltIdicSypZULyRSNSDWxJbgmciGHrk7mpNDkSi0W70gVpnNNgr9MY1132W9CffkAfLS%0AQxHlXFE6Cg52cPIk2AUl3F0l7jT1phEsBh0PPz3COBHdQNVApCeUd4UqHkR4QbZytAhvD4RZpREi%0AkVNaR1hkNe2V1Cfx017T3k6wpuT%2Br3jL5v2%2BtduJv8mk%2FyozZVbAVYwfp4Zg%2BtonlhIIsyk%3D|预订|5l0000D931D0|D931|AOH|ZWQ|HGH|NGH|21:00|21:59|00:59|Y|UU00cuNtd4iovGfRBhZbokmbWb24TWDqJQulZ82u69V60I0Q|20190525|3|H6|02|03|1|0||无|||||||||3|||无|A0O0F0|AOF|0|0|null", "eEcmdUi9vqTTQ5MF8FCNCnnZYOZugogWsAzeQV%2F4n2xGc2Yh2fCnqisnTkx705Ht8PlNT02pyB15%0AsNDGbPgLr2tIABO2n%2BUD8sXJw7d5tbONdWOJIFLz2aK3kUAFUL0exKF18OKXl9XE6RuKuhncagKk%0AO25vQph3kKH8ZCESLcndPV9VsYMJ3G3mFFJva6LigKJOS%2BkwEah%2BQVaNuvgqlnazmNb0eVjZDwKt%0AA%2B6CsBWBq8SP9qS6FHo1Zg08tdjajdRmdPGHblNFg4B11zyliDl5loKORxMJ%2FrY6g6PR6sk%3D|预订|5l0000D93522|D935|AOH|IZQ|HGH|NGH|21:05|22:04|00:59|Y|Yk48G17AH9a1votANIltVPVYiF1FArPf6nM3smxQLzHPZlNG|20190525|3|H6|02|03|1|0||无|||||||||6|||无|A0O0F0|AOF|0|0|null", "e5YTtBckMqsDlzNkYJcKb%2FkQ1N148nWQxln%2B5yAOGZVXGOJWV0loqXeMy2ntTFN6bc%2Fayase6%2FRI%0Af8Guo1hmhwXAk1SdI2qpo%2FaixqVE0AIBUVA3x6rHSfhWmqHf8Y0wJPauBMPIUtjJdW6KrGYpU5Zo%0AeWp8yinJB3x%2FCmvuzMq7g9L1Barba3boGCcLlf1XDfNXeet0qyKuGgMx487aEDeUR6nzunM%2FRn4v%0A4yU6WQOwnawGy8EShSTQy9wEk88Aowl2kixtmyhcIuXMbmL5kEgAAIc%3D|预订|550000D90570|D905|SHH|IOQ|HGH|NGH|21:10|22:09|00:59|Y|alABdjRZ7Gl69FrtIAF4PafPxPKi3WHX|20190525|3|H2|03|04|1|0|||||||||||1|||有|O0F0|OF|0|0|null", "dxAIG6J%2FuVS8cuPhPoMZvYwyM8mjNbjxz%2Bw%2Fr83nA6%2FgEt9Zjstl2E7I52tkXBVDWPxIsVS%2BzYQb%0AKyOHi%2FHBc2nmEBKtIW%2FdnEP7bphJtDqngnAJu6l7uwBNnA04anCF%2FaSwW%2F%2FiRcOS0GM1hN3ztPcM%0ApxF11c7JPp7S5ex2ETUf4b2T2j6AqaCrUgAcKFqZKlVre7SaouWZNZEtsGxuhwMQlNqLFn%2FBk3aJ%0AMqfw8yNwpeph8w6wFttS%2BJ1lzQcHDyVdi0UVCl%2BO%2By497gidj0viVOknI37MVWTJd3jTmehtqEPG%0A7Q22hfytqh8%3D|预订|5l000G752780|G7527|AOH|NHH|HGH|NGH|21:24|22:21|00:57|Y|aKhUCgIDVGUv%2FwBvOD6T8cCoK7MZEfoI0ouj46ofsha1Izz6jbOd%2FTZ4pAQ%3D|20190525|3|H3|04|06|1|0|||||||无||||有|15|3||O090O0M0|O9OM|0|0|null", "Lp%2BPfFEf6tCYDPu7%2BgxlfTcXG73qeOzGlTQ2S4tlpTvIBByFB34tewDnckH2%2FvVgrCmE57OS7vdj%0Axo9uNxcxA1Ta7ntHtIkmXFDml5Szk80vuWxuecp%2F9sVPDrJUUDJaIZxg%2BCHiUAKlxiYX%2FgDfvG8Z%0A2Zw71DrhWPEmA5Y2%2FvU8FZM9DWVxkeLVKP2MMJP2j9r0dx1mhxXit7okkt7ivW%2FEKxTKJY1kZlQB%0AZGoSpCbUIK4dmZmZxU%2FtMVKN2znla7PLrmvGc0kuLRFMD89lOj5GoNuaA%2B5D7OJ8zxc0zYkv6U1f%0A6%2B0ss14z9GY%3D|预订|5l000G752940|G7529|AOH|NGH|HGH|NGH|21:48|22:58|01:10|Y|1Wc4L9P6wP1pDXWAz%2BG0rkZZ2qAVi7DwhfPCFHTHF6Ra0vPT%2B5v%2Bw4q42Eo%3D|20190525|3|H2|05|09|1|0|||||||无||||有|17|7||O090M0O0|O9MO|0|0|null"]
    },
    "httpstatus": 200,
    "messages": "",
    "status": true
}
```

# /otn/passcodeNew/getPassCodeNew

## 输入

```
GET /otn/passcodeNew/getPassCodeNew?module=passenger&rand=randp&0.2515081346887966 HTTP/1.1
Host: kyfw.12306.cn
Connection: keep-alive
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.157 Safari/537.36
Accept: image/webp,image/apng,image/*,*/*;q=0.8
Referer: https://kyfw.12306.cn/otn/leftTicket/init?random=1558182574261
Accept-Encoding: gzip, deflate, br
Accept-Language: zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,ja;q=0.6
Cookie: JSESSIONID=17D2A5B49CB312109D036040D8EF5154; tk=c9g0-ECRWXRzrVzAM9mty3IEo020ratnKtn-76pLPh4ij1110; _jc_save_toStation=%u5B81%u6CE2%2CNGH; _jc_save_wfdc_flag=dc; BIGipServerotn=619708938.64545.0000; RAIL_EXPIRATION=1558445401115; RAIL_DEVICEID=ojOchhXouyQKkRIDOIOEYE223_WcKcaOuF-_z82P-CYHNuKQOQA6fkynsTMigwJkqEHRabHNmpVRc0I8wVMQioy8eY2wYFbmATsvNP5SRPVofNqBITahBMUmcv5zPO3WcdwpO4jr6MtgbmqT1knkYn0qBbUShMDp; BIGipServerpool_passport=351076874.50215.0000; route=6f50b51faa11b987e576cdb301e545c4; _jc_save_toDate=2019-05-18; _jc_save_fromDate=2019-05-25; _jc_save_fromStation=%u676D%u5DDE%2CHGH
```

## 输出

# /otn/login/checkUser

## 输入

```
POST /otn/login/checkUser HTTP/1.1
Host: kyfw.12306.cn
Connection: keep-alive
Content-Length: 10
Cache-Control: no-cache
Origin: https://kyfw.12306.cn
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.157 Safari/537.36
Content-Type: application/x-www-form-urlencoded; charset=UTF-8
Accept: */*
X-Requested-With: XMLHttpRequest
If-Modified-Since: 0
Referer: https://kyfw.12306.cn/otn/leftTicket/init?random=1558182574261
Accept-Encoding: gzip, deflate, br
Accept-Language: zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,ja;q=0.6
Cookie: JSESSIONID=17D2A5B49CB312109D036040D8EF5154; tk=c9g0-ECRWXRzrVzAM9mty3IEo020ratnKtn-76pLPh4ij1110; _jc_save_toStation=%u5B81%u6CE2%2CNGH; _jc_save_wfdc_flag=dc; BIGipServerotn=619708938.64545.0000; RAIL_EXPIRATION=1558445401115; RAIL_DEVICEID=ojOchhXouyQKkRIDOIOEYE223_WcKcaOuF-_z82P-CYHNuKQOQA6fkynsTMigwJkqEHRabHNmpVRc0I8wVMQioy8eY2wYFbmATsvNP5SRPVofNqBITahBMUmcv5zPO3WcdwpO4jr6MtgbmqT1knkYn0qBbUShMDp; BIGipServerpool_passport=351076874.50215.0000; route=6f50b51faa11b987e576cdb301e545c4; _jc_save_toDate=2019-05-18; _jc_save_fromDate=2019-05-25; _jc_save_fromStation=%u676D%u5DDE%2CHGH
 
_json_att=
```

## 输出

```
{
    "validateMessagesShowId": "_validatorMessage",
    "status": true,
    "httpstatus": 200,
    "data": {
        "flag": true
    },
    "messages": [],
    "validateMessages": {}
}
```

# /otn/leftTicket/submitOrderRequest

## 输入

```
POST /otn/leftTicket/submitOrderRequest HTTP/1.1
Host: kyfw.12306.cn
Connection: keep-alive
Content-Length: 493
Accept: */*
Origin: https://kyfw.12306.cn
X-Requested-With: XMLHttpRequest
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.157 Safari/537.36
Content-Type: application/x-www-form-urlencoded; charset=UTF-8
Referer: https://kyfw.12306.cn/otn/leftTicket/init?random=1558182574261
Accept-Encoding: gzip, deflate, br
Accept-Language: zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,ja;q=0.6
Cookie: JSESSIONID=17D2A5B49CB312109D036040D8EF5154; tk=c9g0-ECRWXRzrVzAM9mty3IEo020ratnKtn-76pLPh4ij1110; _jc_save_toStation=%u5B81%u6CE2%2CNGH; _jc_save_wfdc_flag=dc; BIGipServerotn=619708938.64545.0000; RAIL_EXPIRATION=1558445401115; RAIL_DEVICEID=ojOchhXouyQKkRIDOIOEYE223_WcKcaOuF-_z82P-CYHNuKQOQA6fkynsTMigwJkqEHRabHNmpVRc0I8wVMQioy8eY2wYFbmATsvNP5SRPVofNqBITahBMUmcv5zPO3WcdwpO4jr6MtgbmqT1knkYn0qBbUShMDp; BIGipServerpool_passport=351076874.50215.0000; route=6f50b51faa11b987e576cdb301e545c4; _jc_save_toDate=2019-05-18; _jc_save_fromDate=2019-05-25; _jc_save_fromStation=%u676D%u5DDE%2CHGH
 
secretStr=reh9o8ZsoaaLbcXAN8YSGhKNTC%2Fk4EhL9%2FAt%2BORP3eHhfTCjZPxbw7wJiNmAai0nj9kd0vk6qHIs%0Ajq2Tjqxj4i5GvUGHTOHZ1xcWriS9tYZ9yGj9CNaTb9YN6%2FXA93kGeZ1e%2Fp%2BPxNYcld3mGj3nEW4s%0AtGaABzgssFD0Z73%2FyDjVAhqu6NlV6kN09sxecw0B0cUyn63Kum%2F24RPCnL4YZK9lS1%2F1J5rpf11V%0AOs6NLrr54aQZmIYpClq92zBDczbo6hcMdOJRdwMpo4EOkjJSv1097zC5D7BvCcZG8efdO%2Bg%3D&train_date=2019-05-25&back_train_date=2019-05-18&tour_flag=dc&purpose_codes=ADULT&query_from_station_name=杭州&query_to_station_name=宁波&undefined
```

## 输出

```
{
    "validateMessagesShowId": "_validatorMessage",
    "status": true,
    "httpstatus": 200,
    "data": "N",
    "messages": [],
    "validateMessages": {}
}
```

# /otn/confirmPassenger/initDc

## 输入

```
POST /otn/confirmPassenger/initDc HTTP/1.1
Host: kyfw.12306.cn
Connection: keep-alive
Content-Length: 10
Cache-Control: max-age=0
Origin: https://kyfw.12306.cn
Upgrade-Insecure-Requests: 1
Content-Type: application/x-www-form-urlencoded
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.157 Safari/537.36
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3
Referer: https://kyfw.12306.cn/otn/leftTicket/init?random=1558182574261
Accept-Encoding: gzip, deflate, br
Accept-Language: zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,ja;q=0.6
Cookie: JSESSIONID=17D2A5B49CB312109D036040D8EF5154; tk=c9g0-ECRWXRzrVzAM9mty3IEo020ratnKtn-76pLPh4ij1110; _jc_save_toStation=%u5B81%u6CE2%2CNGH; _jc_save_wfdc_flag=dc; BIGipServerotn=619708938.64545.0000; RAIL_EXPIRATION=1558445401115; RAIL_DEVICEID=ojOchhXouyQKkRIDOIOEYE223_WcKcaOuF-_z82P-CYHNuKQOQA6fkynsTMigwJkqEHRabHNmpVRc0I8wVMQioy8eY2wYFbmATsvNP5SRPVofNqBITahBMUmcv5zPO3WcdwpO4jr6MtgbmqT1knkYn0qBbUShMDp; BIGipServerpool_passport=351076874.50215.0000; route=6f50b51faa11b987e576cdb301e545c4; _jc_save_toDate=2019-05-18; _jc_save_fromDate=2019-05-25; _jc_save_fromStation=%u676D%u5DDE%2CHGH
 
_json_att=
```

## 输出

```
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>中国铁路12306</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="/otn/resources/css/validation.css" rel="stylesheet" />
<link href="/otn/resources/merged/common_css.css?cssVersion=1.9051" rel="stylesheet" />
<link rel="icon" href="/otn/resources/images/ots/favicon.ico" type="image/x-icon" />
<link rel="shortcut icon" href="/otn/resources/images/ots/favicon.ico" type="image/x-icon" />
<script>
/*<![CDATA[*/
var ctx='/otn/';
var globalRepeatSubmitToken = '6d946b88192ceddadccb285f84a74a2b';
var global_lang = 'zh_CN';
var sessionInit = '\u5468\u9756\u5CF0';
var isShowNotice = null;
var CLeftTicketUrl = null;
var isTestFlow = null;
var isMobileCheck = null;
var passport_appId = null;
var passport_login = null;
var passport_captcha = null;
var passport_authuam = null;
var passport_captcha_check = null;
var passport_authclient = null;
var passport_loginPage = null;
var passport_okPage = null;
 var passport_proxy_captcha =  null;
/*]]>*/
</script>
<script src="/otn/resources/merged/common_js.js?scriptVersion=1.9140" type="text/javascript"></script>
<!-- js i18n -->
<!-- jquery validation i18n -->
<!-- head and footer -->
<script src="/otn/HttpZF/GetJS" type="text/javascript"></script>
<link href="/otn/resources/merged/passengerInfo_css.css?cssVersion=1.9051" rel="stylesheet" />
<script type="text/javascript" src="/otn/resources/merged/passengerInfo_js.js?scriptVersion=1.9140" xml:space="preserve"></script>
</head>
<script src="/otn/dynamicJs/odvnonu" type="text/javascript" xml:space="preserve"></script>
<script xml:space="preserve">
 
/*<![CDATA[*/
var id_type_code = '1';
var isDw='N';
var checkTrain=null;
var isLimitTran='N';
var CHANGETSFLAG=null;
var canInsurance=true;
var queryOrderWaitTimeInterval='3000';
var canChooseSeats=null;
var choose_Seats=null;
var canChooseBeds=null;
var isCanChooseMid=null;
var trms_train_flag=null;
var trmsDetail=null;
var trmsDetailAll=null;
var price_info_trms=null;
/*]]>*/
</script>
<body id="body_id"><div id="dialog_fczk" style="display: none;"><div class="mark"></div>
<div class="up-box w600"><div class="up-box-hd">温馨提示<a href="javascript:" id="dialog_fczk_close" shape="rect">关闭</a>
</div>
<div class="up-box-bd"><div class="up-con clearfix"><span class="icon i-opt"></span>
<div class="r-txt"><div class="tit">购买往返优惠票的旅客，不得单独办理往程车票的退票业务。是否继续?</div>
</div>
</div>
<div class="lay-btn"><a href="javascript:" id="dialog_fczk_cancel" class="btn92" shape="rect">取消</a>
<a href="javascript:" id="dialog_fczk_ok" class="btn92s" shape="rect">确认</a>
</div>
</div>
</div>
</div>
<div id="dialog_smoker" style="display: none;"><div class="mark"></div>
<div class="up-box w600"><div class="up-box-hd">温馨提示<a href="javascript:" id="dialog_smoker_close" shape="rect">关闭</a>
</div>
<div class="up-box-bd"><div class="up-con clearfix"><span class="icon i-opt"></span>
<div class="r-txt"><div class="tit" id="dialog_smoker_msg"></div>
</div>
</div>
<div class="lay-btn"><a href="javascript:" id="dialog_smoker_cancel" class="btn92" shape="rect">取消</a>
<a href="javascript:" id="dialog_smoker_ok" class="btn92s" shape="rect">确定</a>
</div>
</div>
</div>
</div>
<div id="dialog_xsertcj" style="display: none;"><div class="mark"></div>
<div class="up-box w600"><div class="up-box-hd">温馨提示<a href="javascript:" id="dialog_xsertcj_close" shape="rect">关闭</a>
</div>
<div class="up-box-bd"><div class="up-con clearfix"><span class="icon i-opt"></span>
<div class="r-txt"><div class="tit" id="dialog_xsertcj_msg"></div>
</div>
</div>
<div class="lay-btn"><a href="javascript:" id="dialog_xsertcj_cancel" class="btn92" shape="rect">取消</a>
<a href="javascript:" id="dialog_xsertcj_ok" class="btn92s" shape="rect">确认</a>
</div>
</div>
</div>
</div>
<div id="trms_dg" style="display: none;"><div class="mark"></div>
<div class="up-box w600"><div class="up-box-hd">温馨提示<a href="javascript:" id="trms_dg_close" shape="rect">关闭</a>
</div>
<div class="up-box-bd"><div class="up-con clearfix"><span class="icon i-opt"></span>
<div class="r-txt"><div class="tit" id="trms_dg_msg"></div>
</div>
</div>
<div class="lay-btn"><a href="javascript:" id="trms_dg_cancel" class="btn92" shape="rect">取消</a>
<a href="javascript:" id="trms_dg_ok" class="btn92s" shape="rect">确认</a>
</div>
</div>
</div>
</div>
<div id="dialog_add" style="display: none;"><div class="mark"></div>
<div class="up-box" style="width:640px;"><div class="up-box-hd">新增乘客<a href="javascript:" id="dialog_add_close" shape="rect">关闭</a>
</div>
<div class="up-box-bd" style="padding:15px 10px;border:1px solid #298CCE;"><table class="per-ticket" style="margin-left:0px;"><tr><th style="text-align:center;" rowspan="1" colspan="1">票种</th>
<th style="text-align:center;" rowspan="1" colspan="1">姓名</th>
<th style="text-align:center;" rowspan="1" colspan="1">证件类型</th>
<th style="text-align:center;" rowspan="1" colspan="1">证件号码</th>
<th style="text-align:center;" rowspan="1" colspan="1">国家/地区</th>
</tr>
<tbody id="showaddpassenger"><tr><td rowspan="1" colspan="1"><select id="ptypeselect"></select>
</td>
<td rowspan="1" colspan="1"><div><input id="pname_value" class="inptxt w110" type="text" />
</div>
</td>
<td rowspan="1" colspan="1"><select id="typeselect" class="w110"></select>
</td>
<td rowspan="1" colspan="1"><input id="pidno_value" class="inptxt w160" value="" type="text" />
</td>
<td rowspan="1" colspan="1"><select id="pcountry_value" class="w160"><option value="CN"><span>中国CHINA</span>
</option>
<option value="US"><span>美国UNITEDSTATES</span>
</option>
<option value="AF"><span>阿富汗AFGHANISTANA</span>
</option>
<option value="AL"><span>阿尔巴尼亚ALBANIA</span>
</option>
<option value="DZ"><span>阿尔及利亚ALGERIA</span>
</option>
<option value="AD"><span>安道尔ANDORRA</span>
</option>
<option value="AO"><span>安哥拉ANGOLA</span>
</option>
<option value="AG"><span>安提瓜和巴布达ANTIGUABARBUDA</span>
</option>
<option value="AE"><span>阿拉伯联合酋长国ARAB</span>
</option>
<option value="AR"><span>阿根廷ARGENTINA</span>
</option>
<option value="AM"><span>亚美尼亚ARMENIA</span>
</option>
<option value="AW"><span>阿鲁巴ARUBA</span>
</option>
<option value="AU"><span>澳大利亚AUSTRALIA</span>
</option>
<option value="AT"><span>奥地利AUSTRIA</span>
</option>
<option value="AZ"><span>阿塞拜疆共和国AZERBAIJAN</span>
</option>
<option value="BS"><span>巴哈马BAHAMAS</span>
</option>
<option value="BH"><span>巴林BAHRAIN</span>
</option>
<option value="BD"><span>孟加拉国BANGLADESH</span>
</option>
<option value="BB"><span>巴巴多斯BARBADOS</span>
</option>
<option value="BY"><span>白俄罗斯BELARUS</span>
</option>
<option value="BE"><span>比利时BELGIUM</span>
</option>
<option value="BZ"><span>伯里兹BELIZE</span>
</option>
<option value="BZ"><span>伯利兹BELIZE</span>
</option>
<option value="BJ"><span>贝宁BENIN</span>
</option>
<option value="BT"><span>不丹BHUTAN</span>
</option>
<option value="BO"><span>玻利维亚BOLIVIA</span>
</option>
<option value="BA"><span>波斯尼亚和黑塞哥维那BOSNIA</span>
</option>
<option value="BW"><span>博茨瓦纳BOTSWANA</span>
</option>
<option value="BR"><span>巴西BRAZIL</span>
</option>
<option value="BG"><span>保加利亚BULGARIA</span>
</option>
<option value="BF"><span>布基纳法索BURKINAFASO</span>
</option>
<option value="BI"><span>布隆迪BURUNDI</span>
</option>
<option value="BN"><span>文莱BruneiDarussalam</span>
</option>
<option value="KH"><span>柬埔寨CAMBODIA</span>
</option>
<option value="CM"><span>喀麦隆CAMEROON</span>
</option>
<option value="CA"><span>加拿大CANADA</span>
</option>
<option value="KY"><span>佛得角CAPEVERDE</span>
</option>
<option value="TD"><span>乍得CHAD</span>
</option>
<option value="CL"><span>智利CHILE</span>
</option>
<option value="CO"><span>哥伦比亚COLOMBIA</span>
</option>
<option value="KM"><span>科摩罗COMOROS</span>
</option>
<option value="CG"><span>刚果（布）CONGO</span>
</option>
<option value="CK"><span>库克群岛COOKISLANDS</span>
</option>
<option value="CI"><span>科特迪瓦COTEDLVOIRE</span>
</option>
<option value="HR"><span>克罗地亚CROATIA</span>
</option>
<option value="CU"><span>古巴共和国CUBA</span>
</option>
<option value="CY"><span>塞浦路斯CYPRUS</span>
</option>
<option value="CZ"><span>捷克共和国CZECHREPUBLIC</span>
</option>
<option value="CF"><span>中非共和国Central Africa Republic</span>
</option>
<option value="CRC"><span>哥斯达黎加CostaRica</span>
</option>
<option value="CD"><span>刚果（金）DEMOCRATIC REPUBLIC OF CONGO</span>
</option>
<option value="YD"><span>也门民主人民共和国DEMOCRATICYEMEN</span>
</option>
<option value="DK"><span>丹麦DENMARK</span>
</option>
<option value="DJ"><span>吉布提DJIBOUTI</span>
</option>
<option value="DM"><span>多米尼克DOMINICA</span>
</option>
<option value="DO"><span>多米尼加DOMINICAN REPUBLIC</span>
</option>
<option value="EC"><span>厄瓜多尔ECUADOR</span>
</option>
<option value="EG"><span>埃及EGYPT</span>
</option>
<option value="EV"><span>萨尔瓦多EL SALVADOR</span>
</option>
<option value="GQ"><span>赤道几内亚EQUATORIALGUINEA</span>
</option>
<option value="ER"><span>厄立特里亚ERITREA</span>
</option>
<option value="EE"><span>爱沙尼亚ESTONIA</span>
</option>
<option value="ET"><span>埃塞俄比亚ETHIOPIA</span>
</option>
<option value="FJ"><span>斐济FIJI</span>
</option>
<option value="FI"><span>芬兰FINLAND</span>
</option>
<option value="FR"><span>法国FRANCE</span>
</option>
<option value="GA"><span>加蓬GABON</span>
</option>
<option value="GM"><span>冈比亚GAMBIA</span>
</option>
<option value="CE"><span>格鲁吉亚GEORGIA</span>
</option>
<option value="DE"><span>德国GERMANY</span>
</option>
<option value="GH"><span>加纳GHANA</span>
</option>
<option value="GR"><span>希腊GREECE</span>
</option>
<option value="GL"><span>格林纳达GRENADA</span>
</option>
<option value="GN"><span>几内亚GUINEA</span>
</option>
<option value="GW"><span>几内亚比绍GUINEA-BISSAU</span>
</option>
<option value="GW"><span>几内亚比绍GUINEABISSAU</span>
</option>
<option value="GY"><span>圭亚那GUYANA</span>
</option>
<option value="GT"><span>危地马拉Guatemala</span>
</option>
<option value="HT"><span>海地HAITI</span>
</option>
<option value="NL"><span>荷兰HOLLAND</span>
</option>
<option value="HN"><span>洪都拉斯HONDURAS</span>
</option>
<option value="HU"><span>匈牙利HUNGARY</span>
</option>
<option value="IS"><span>冰岛ICELAND</span>
</option>
<option value="IN"><span>印度INDIA</span>
</option>
<option value="ID"><span>印度尼西亚INDONESIA</span>
</option>
<option value="IR"><span>伊朗IRAN</span>
</option>
<option value="IQ"><span>伊拉克IRAQ</span>
</option>
<option value="IE"><span>爱尔兰IRELAND</span>
</option>
<option value="IL"><span>以色列ISRAEL</span>
</option>
<option value="IT"><span>意大利ITALY</span>
</option>
<option value="JM"><span>牙买加JAMAICA</span>
</option>
<option value="JP"><span>日本JAPAN</span>
</option>
<option value="JO"><span>约旦JORDAN</span>
</option>
<option value="KZ"><span>哈萨克斯坦KAZAKHSTAN</span>
</option>
<option value="KE"><span>肯尼亚KENYA</span>
</option>
<option value="KG"><span>吉尔吉斯共和国KIRGIZSTAN</span>
</option>
<option value="KI"><span>基里巴斯KIRIBATI</span>
</option>
<option value="KR"><span>韩国KOREA</span>
</option>
<option value="KW"><span>科威特KUWAIT</span>
</option>
<option value="DPR"><span>朝鲜Korea</span>
</option>
<option value="LA"><span>老挝LAOS</span>
</option>
<option value="LV"><span>拉脱维亚LATVIA</span>
</option>
<option value="LB"><span>黎巴嫩LEBANON</span>
</option>
<option value="LS"><span>莱索托LESOTHO</span>
</option>
<option value="LR"><span>利比里亚LIBERIA</span>
</option>
<option value="LY"><span>利比亚LIBYA</span>
</option>
<option value="LI"><span>列支敦士登LIECHTENSTEIN</span>
</option>
<option value="LT"><span>立陶宛LITHUANIA</span>
</option>
<option value="LU"><span>卢森堡LUXEMBOURG</span>
</option>
<option value="MK"><span>马其顿MACEDONIA</span>
</option>
<option value="MG"><span>马达加斯加MADAGASCAR</span>
</option>
<option value="MW"><span>马拉维MALAWI</span>
</option>
<option value="MY"><span>马来西亚MALAYSIA</span>
</option>
<option value="MV"><span>马尔代夫MALDIVES</span>
</option>
<option value="ML"><span>马里MALI</span>
</option>
<option value="MT"><span>马耳他MALTA</span>
</option>
<option value="MH"><span>马绍尔群岛MARSHALL ISLANDS</span>
</option>
<option value="MR"><span>毛里塔尼亚MAURITANIA</span>
</option>
<option value="MU"><span>毛里求斯MAURITIUS</span>
</option>
<option value="MX"><span>墨西哥MEXICO</span>
</option>
<option value="FM"><span>密克罗尼西亚联邦MICRONESIA</span>
</option>
<option value="MD"><span>摩尔多瓦MOLDOVA</span>
</option>
<option value="MC"><span>摩纳哥MONACO</span>
</option>
<option value="MN"><span>蒙古MONGOLIA</span>
</option>
<option value="ME"><span>黑山MONTENEGRO</span>
</option>
<option value="MA"><span>摩洛哥MOROCCO</span>
</option>
<option value="MZ"><span>莫桑比克MOZAMBIQUE</span>
</option>
<option value="MM"><span>缅甸MYANMAR</span>
</option>
<option value="NA"><span>纳米比亚NAMIBIA</span>
</option>
<option value="NR"><span>瑙鲁NAURU</span>
</option>
<option value="NP"><span>尼泊尔NEPAL</span>
</option>
<option value="NZ"><span>新西兰NEWZEALAND</span>
</option>
<option value="NI"><span>尼加拉瓜NICARAGUA</span>
</option>
<option value="NE"><span>尼日尔NIGER</span>
</option>
<option value="NG"><span>尼日利亚NIGERIA</span>
</option>
<option value="NO"><span>挪威NORWAY</span>
</option>
<option value="OM"><span>阿曼OMAN</span>
</option>
<option value="PK"><span>巴基斯坦PAKISTAN</span>
</option>
<option value="PW"><span>帕劳PALAU</span>
</option>
<option value="BL"><span>巴勒斯坦PALESTINE</span>
</option>
<option value="PA"><span>巴拿马PANAMA</span>
</option>
<option value="PG"><span>巴布亚新几内亚PAPUANEWGUINEA</span>
</option>
<option value="PY"><span>巴拉圭PARAGUAY</span>
</option>
<option value="PE"><span>秘鲁PERU</span>
</option>
<option value="PH"><span>菲律宾PHILIPPINES</span>
</option>
<option value="PL"><span>波兰POLAND</span>
</option>
<option value="PT"><span>葡萄牙PORTUGAL</span>
</option>
<option value="PR"><span>波多黎各PUERTO RICO</span>
</option>
<option value="QA"><span>卡塔尔QATAR</span>
</option>
<option value="RO"><span>罗马尼亚ROMANIA</span>
</option>
<option value="RU"><span>俄罗斯RUSSIA</span>
</option>
<option value="RW"><span>卢旺达RWANDA</span>
</option>
<option value="KNA"><span>圣基茨和尼维斯SAINT KITTS</span>
</option>
<option value="VC"><span>圣文森特和格林纳丁斯SAINT VINCENT AND THE GRENADIN</span>
</option>
<option value="LC"><span>圣卢西亚SAINTLUCIA</span>
</option>
<option value="WS"><span>美属萨摩亚SAMOA</span>
</option>
<option value="SM"><span>圣马力诺SANMARINO</span>
</option>
<option value="ST"><span>圣多美和普林西比SAOTOMEPRINCIPE</span>
</option>
<option value="SA"><span>沙特阿拉伯SAUDIARABIA</span>
</option>
<option value="SN"><span>塞内加尔SENEGAL</span>
</option>
<option value="CS"><span>塞尔维亚SERBIA</span>
</option>
<option value="SC"><span>塞舌尔SEYCHELLES</span>
</option>
<option value="SL"><span>塞拉利昂SIERRALEONE</span>
</option>
<option value="SG"><span>新加坡SINGAPORE</span>
</option>
<option value="SK"><span>斯洛伐克SLOVAKIA</span>
</option>
<option value="SK"><span>斯洛伐克共和国SLOVAKREPUBLIC</span>
</option>
<option value="SI"><span>斯洛文尼亚SLOVENIA</span>
</option>
<option value="SB"><span>所罗门群岛SOLOMON ISLANDS</span>
</option>
<option value="SO"><span>索马里SOMALI</span>
</option>
<option value="SO"><span>索马里SOMALIA</span>
</option>
<option value="ZA"><span>南非SOUTHAFRICA</span>
</option>
<option value="ES"><span>西班牙SPAIN</span>
</option>
<option value="LK"><span>斯里兰卡SRILANKA</span>
</option>
<option value="SD"><span>苏丹SUDAN</span>
</option>
<option value="SR"><span>苏里南SURINAM</span>
</option>
<option value="SZ"><span>斯威士兰SWAZILAND</span>
</option>
<option value="SE"><span>瑞典SWEDEN</span>
</option>
<option value="CH"><span>瑞士SWITZERLAND</span>
</option>
<option value="SY"><span>叙利亚SYRIA</span>
</option>
<option value="TJ"><span>塔吉克斯坦TAJIKISTAN</span>
</option>
<option value="TZ"><span>坦桑尼亚TANZANIA</span>
</option>
<option value="TH"><span>泰国THAILAND</span>
</option>
<option value="SS"><span>南苏丹共和国THE REPBLIC OF SOUTH SUDAN</span>
</option>
<option value="UGA"><span>乌干达THE REPUBLIC OF UGANDA</span>
</option>
<option value="TL"><span>东帝汶TIMOR</span>
</option>
<option value="TG"><span>多哥TOGO</span>
</option>
<option value="TO"><span>汤加TONGA</span>
</option>
<option value="TT"><span>特立尼达和多巴哥TRINIDADANDTOBAGO</span>
</option>
<option value="TN"><span>突尼斯TUNISIA</span>
</option>
<option value="TR"><span>土耳其TURKEY</span>
</option>
<option value="TM"><span>土库曼斯坦TURKMENISTAN</span>
</option>
<option value="UKR"><span>乌克兰UKRAINE</span>
</option>
<option value="GB"><span>英国UNITED KINGDOM</span>
</option>
<option value="UZB"><span>乌兹别克斯坦UZBEKISTAN</span>
</option>
<option value="UY"><span>乌拉圭Uruguay</span>
</option>
<option value="VU"><span>瓦努阿图VANUATU</span>
</option>
<option value="VA"><span>梵蒂冈VATICAN</span>
</option>
<option value="VIE"><span>越南VIETNAM</span>
</option>
<option value="VE"><span>委内瑞拉Venezuela</span>
</option>
<option value="ZM"><span>赞比亚ZAMBIA</span>
</option>
<option value="ZW"><span>津巴布韦ZIMBABWE</span>
</option>
</select>
</td>
</tr>
<tr id="error_tr" style="display: none;"><td colspan="5" rowspan="1"><span class="txt-wrong" id="error_for_nameandidno" style=""></span>
</td>
</tr>
</tbody>
</table>
<div class="lay-btn"><a href="javascript:" id="dialog_add_cancel" class="btn92" shape="rect">取消</a>
<a href="javascript:" id="dialog_add_ok" class="btn92s" shape="rect">确认</a>
</div>
</div>
</div>
</div>
<div id="dialog_update" style="display: none;"><div class="mark"></div>
<div class="up-box" style="width:640px;"><div class="up-box-hd">修改乘客信息<a href="javascript:" id="dialog_update_close" shape="rect">关闭</a>
</div>
<div class="up-box-bd" style="padding:15px 10px;border:1px solid #298CCE;"><table class="per-ticket" style="margin-left:0px;"><tr><th style="text-align:center;" rowspan="1" colspan="1">票种</th>
<th style="text-align:center;" rowspan="1" colspan="1">姓名</th>
<th style="text-align:center;" rowspan="1" colspan="1">证件类型</th>
<th style="text-align:center;" rowspan="1" colspan="1">证件号码</th>
<th style="text-align:center;" rowspan="1" colspan="1">国家/地区</th>
</tr>
<tbody id="showaddpassenger_update"><tr><td rowspan="1" colspan="1"><select id="ptypeselect_update"></select>
</td>
<td rowspan="1" colspan="1"><div><input id="pname_update_value" class="inptxt w110" type="text" />
</div>
</td>
<td rowspan="1" colspan="1"><select id="typeselect_update"></select>
</td>
<td rowspan="1" colspan="1"><input id="pidno_update_value" class="inptxt w160" value="" type="text" />
</td>
<td rowspan="1" colspan="1"><select id="pcountry_udpate_value" class="w160"><option value="CN"><span>中国CHINA</span>
</option>
<option value="US"><span>美国UNITEDSTATES</span>
</option>
<option value="AF"><span>阿富汗AFGHANISTANA</span>
</option>
<option value="AL"><span>阿尔巴尼亚ALBANIA</span>
</option>
<option value="DZ"><span>阿尔及利亚ALGERIA</span>
</option>
<option value="AD"><span>安道尔ANDORRA</span>
</option>
<option value="AO"><span>安哥拉ANGOLA</span>
</option>
<option value="AG"><span>安提瓜和巴布达ANTIGUABARBUDA</span>
</option>
<option value="AE"><span>阿拉伯联合酋长国ARAB</span>
</option>
<option value="AR"><span>阿根廷ARGENTINA</span>
</option>
<option value="AM"><span>亚美尼亚ARMENIA</span>
</option>
<option value="AW"><span>阿鲁巴ARUBA</span>
</option>
<option value="AU"><span>澳大利亚AUSTRALIA</span>
</option>
<option value="AT"><span>奥地利AUSTRIA</span>
</option>
<option value="AZ"><span>阿塞拜疆共和国AZERBAIJAN</span>
</option>
<option value="BS"><span>巴哈马BAHAMAS</span>
</option>
<option value="BH"><span>巴林BAHRAIN</span>
</option>
<option value="BD"><span>孟加拉国BANGLADESH</span>
</option>
<option value="BB"><span>巴巴多斯BARBADOS</span>
</option>
<option value="BY"><span>白俄罗斯BELARUS</span>
</option>
<option value="BE"><span>比利时BELGIUM</span>
</option>
<option value="BZ"><span>伯里兹BELIZE</span>
</option>
<option value="BZ"><span>伯利兹BELIZE</span>
</option>
<option value="BJ"><span>贝宁BENIN</span>
</option>
<option value="BT"><span>不丹BHUTAN</span>
</option>
<option value="BO"><span>玻利维亚BOLIVIA</span>
</option>
<option value="BA"><span>波斯尼亚和黑塞哥维那BOSNIA</span>
</option>
<option value="BW"><span>博茨瓦纳BOTSWANA</span>
</option>
<option value="BR"><span>巴西BRAZIL</span>
</option>
<option value="BG"><span>保加利亚BULGARIA</span>
</option>
<option value="BF"><span>布基纳法索BURKINAFASO</span>
</option>
<option value="BI"><span>布隆迪BURUNDI</span>
</option>
<option value="BN"><span>文莱BruneiDarussalam</span>
</option>
<option value="KH"><span>柬埔寨CAMBODIA</span>
</option>
<option value="CM"><span>喀麦隆CAMEROON</span>
</option>
<option value="CA"><span>加拿大CANADA</span>
</option>
<option value="KY"><span>佛得角CAPEVERDE</span>
</option>
<option value="TD"><span>乍得CHAD</span>
</option>
<option value="CL"><span>智利CHILE</span>
</option>
<option value="CO"><span>哥伦比亚COLOMBIA</span>
</option>
<option value="KM"><span>科摩罗COMOROS</span>
</option>
<option value="CG"><span>刚果（布）CONGO</span>
</option>
<option value="CK"><span>库克群岛COOKISLANDS</span>
</option>
<option value="CI"><span>科特迪瓦COTEDLVOIRE</span>
</option>
<option value="HR"><span>克罗地亚CROATIA</span>
</option>
<option value="CU"><span>古巴共和国CUBA</span>
</option>
<option value="CY"><span>塞浦路斯CYPRUS</span>
</option>
<option value="CZ"><span>捷克共和国CZECHREPUBLIC</span>
</option>
<option value="CF"><span>中非共和国Central Africa Republic</span>
</option>
<option value="CRC"><span>哥斯达黎加CostaRica</span>
</option>
<option value="CD"><span>刚果（金）DEMOCRATIC REPUBLIC OF CONGO</span>
</option>
<option value="YD"><span>也门民主人民共和国DEMOCRATICYEMEN</span>
</option>
<option value="DK"><span>丹麦DENMARK</span>
</option>
<option value="DJ"><span>吉布提DJIBOUTI</span>
</option>
<option value="DM"><span>多米尼克DOMINICA</span>
</option>
<option value="DO"><span>多米尼加DOMINICAN REPUBLIC</span>
</option>
<option value="EC"><span>厄瓜多尔ECUADOR</span>
</option>
<option value="EG"><span>埃及EGYPT</span>
</option>
<option value="EV"><span>萨尔瓦多EL SALVADOR</span>
</option>
<option value="GQ"><span>赤道几内亚EQUATORIALGUINEA</span>
</option>
<option value="ER"><span>厄立特里亚ERITREA</span>
</option>
<option value="EE"><span>爱沙尼亚ESTONIA</span>
</option>
<option value="ET"><span>埃塞俄比亚ETHIOPIA</span>
</option>
<option value="FJ"><span>斐济FIJI</span>
</option>
<option value="FI"><span>芬兰FINLAND</span>
</option>
<option value="FR"><span>法国FRANCE</span>
</option>
<option value="GA"><span>加蓬GABON</span>
</option>
<option value="GM"><span>冈比亚GAMBIA</span>
</option>
<option value="CE"><span>格鲁吉亚GEORGIA</span>
</option>
<option value="DE"><span>德国GERMANY</span>
</option>
<option value="GH"><span>加纳GHANA</span>
</option>
<option value="GR"><span>希腊GREECE</span>
</option>
<option value="GL"><span>格林纳达GRENADA</span>
</option>
<option value="GN"><span>几内亚GUINEA</span>
</option>
<option value="GW"><span>几内亚比绍GUINEA-BISSAU</span>
</option>
<option value="GW"><span>几内亚比绍GUINEABISSAU</span>
</option>
<option value="GY"><span>圭亚那GUYANA</span>
</option>
<option value="GT"><span>危地马拉Guatemala</span>
</option>
<option value="HT"><span>海地HAITI</span>
</option>
<option value="NL"><span>荷兰HOLLAND</span>
</option>
<option value="HN"><span>洪都拉斯HONDURAS</span>
</option>
<option value="HU"><span>匈牙利HUNGARY</span>
</option>
<option value="IS"><span>冰岛ICELAND</span>
</option>
<option value="IN"><span>印度INDIA</span>
</option>
<option value="ID"><span>印度尼西亚INDONESIA</span>
</option>
<option value="IR"><span>伊朗IRAN</span>
</option>
<option value="IQ"><span>伊拉克IRAQ</span>
</option>
<option value="IE"><span>爱尔兰IRELAND</span>
</option>
<option value="IL"><span>以色列ISRAEL</span>
</option>
<option value="IT"><span>意大利ITALY</span>
</option>
<option value="JM"><span>牙买加JAMAICA</span>
</option>
<option value="JP"><span>日本JAPAN</span>
</option>
<option value="JO"><span>约旦JORDAN</span>
</option>
<option value="KZ"><span>哈萨克斯坦KAZAKHSTAN</span>
</option>
<option value="KE"><span>肯尼亚KENYA</span>
</option>
<option value="KG"><span>吉尔吉斯共和国KIRGIZSTAN</span>
</option>
<option value="KI"><span>基里巴斯KIRIBATI</span>
</option>
<option value="KR"><span>韩国KOREA</span>
</option>
<option value="KW"><span>科威特KUWAIT</span>
</option>
<option value="DPR"><span>朝鲜Korea</span>
</option>
<option value="LA"><span>老挝LAOS</span>
</option>
<option value="LV"><span>拉脱维亚LATVIA</span>
</option>
<option value="LB"><span>黎巴嫩LEBANON</span>
</option>
<option value="LS"><span>莱索托LESOTHO</span>
</option>
<option value="LR"><span>利比里亚LIBERIA</span>
</option>
<option value="LY"><span>利比亚LIBYA</span>
</option>
<option value="LI"><span>列支敦士登LIECHTENSTEIN</span>
</option>
<option value="LT"><span>立陶宛LITHUANIA</span>
</option>
<option value="LU"><span>卢森堡LUXEMBOURG</span>
</option>
<option value="MK"><span>马其顿MACEDONIA</span>
</option>
<option value="MG"><span>马达加斯加MADAGASCAR</span>
</option>
<option value="MW"><span>马拉维MALAWI</span>
</option>
<option value="MY"><span>马来西亚MALAYSIA</span>
</option>
<option value="MV"><span>马尔代夫MALDIVES</span>
</option>
<option value="ML"><span>马里MALI</span>
</option>
<option value="MT"><span>马耳他MALTA</span>
</option>
<option value="MH"><span>马绍尔群岛MARSHALL ISLANDS</span>
</option>
<option value="MR"><span>毛里塔尼亚MAURITANIA</span>
</option>
<option value="MU"><span>毛里求斯MAURITIUS</span>
</option>
<option value="MX"><span>墨西哥MEXICO</span>
</option>
<option value="FM"><span>密克罗尼西亚联邦MICRONESIA</span>
</option>
<option value="MD"><span>摩尔多瓦MOLDOVA</span>
</option>
<option value="MC"><span>摩纳哥MONACO</span>
</option>
<option value="MN"><span>蒙古MONGOLIA</span>
</option>
<option value="ME"><span>黑山MONTENEGRO</span>
</option>
<option value="MA"><span>摩洛哥MOROCCO</span>
</option>
<option value="MZ"><span>莫桑比克MOZAMBIQUE</span>
</option>
<option value="MM"><span>缅甸MYANMAR</span>
</option>
<option value="NA"><span>纳米比亚NAMIBIA</span>
</option>
<option value="NR"><span>瑙鲁NAURU</span>
</option>
<option value="NP"><span>尼泊尔NEPAL</span>
</option>
<option value="NZ"><span>新西兰NEWZEALAND</span>
</option>
<option value="NI"><span>尼加拉瓜NICARAGUA</span>
</option>
<option value="NE"><span>尼日尔NIGER</span>
</option>
<option value="NG"><span>尼日利亚NIGERIA</span>
</option>
<option value="NO"><span>挪威NORWAY</span>
</option>
<option value="OM"><span>阿曼OMAN</span>
</option>
<option value="PK"><span>巴基斯坦PAKISTAN</span>
</option>
<option value="PW"><span>帕劳PALAU</span>
</option>
<option value="BL"><span>巴勒斯坦PALESTINE</span>
</option>
<option value="PA"><span>巴拿马PANAMA</span>
</option>
<option value="PG"><span>巴布亚新几内亚PAPUANEWGUINEA</span>
</option>
<option value="PY"><span>巴拉圭PARAGUAY</span>
</option>
<option value="PE"><span>秘鲁PERU</span>
</option>
<option value="PH"><span>菲律宾PHILIPPINES</span>
</option>
<option value="PL"><span>波兰POLAND</span>
</option>
<option value="PT"><span>葡萄牙PORTUGAL</span>
</option>
<option value="PR"><span>波多黎各PUERTO RICO</span>
</option>
<option value="QA"><span>卡塔尔QATAR</span>
</option>
<option value="RO"><span>罗马尼亚ROMANIA</span>
</option>
<option value="RU"><span>俄罗斯RUSSIA</span>
</option>
<option value="RW"><span>卢旺达RWANDA</span>
</option>
<option value="KNA"><span>圣基茨和尼维斯SAINT KITTS</span>
</option>
<option value="VC"><span>圣文森特和格林纳丁斯SAINT VINCENT AND THE GRENADIN</span>
</option>
<option value="LC"><span>圣卢西亚SAINTLUCIA</span>
</option>
<option value="WS"><span>美属萨摩亚SAMOA</span>
</option>
<option value="SM"><span>圣马力诺SANMARINO</span>
</option>
<option value="ST"><span>圣多美和普林西比SAOTOMEPRINCIPE</span>
</option>
<option value="SA"><span>沙特阿拉伯SAUDIARABIA</span>
</option>
<option value="SN"><span>塞内加尔SENEGAL</span>
</option>
<option value="CS"><span>塞尔维亚SERBIA</span>
</option>
<option value="SC"><span>塞舌尔SEYCHELLES</span>
</option>
<option value="SL"><span>塞拉利昂SIERRALEONE</span>
</option>
<option value="SG"><span>新加坡SINGAPORE</span>
</option>
<option value="SK"><span>斯洛伐克SLOVAKIA</span>
</option>
<option value="SK"><span>斯洛伐克共和国SLOVAKREPUBLIC</span>
</option>
<option value="SI"><span>斯洛文尼亚SLOVENIA</span>
</option>
<option value="SB"><span>所罗门群岛SOLOMON ISLANDS</span>
</option>
<option value="SO"><span>索马里SOMALI</span>
</option>
<option value="SO"><span>索马里SOMALIA</span>
</option>
<option value="ZA"><span>南非SOUTHAFRICA</span>
</option>
<option value="ES"><span>西班牙SPAIN</span>
</option>
<option value="LK"><span>斯里兰卡SRILANKA</span>
</option>
<option value="SD"><span>苏丹SUDAN</span>
</option>
<option value="SR"><span>苏里南SURINAM</span>
</option>
<option value="SZ"><span>斯威士兰SWAZILAND</span>
</option>
<option value="SE"><span>瑞典SWEDEN</span>
</option>
<option value="CH"><span>瑞士SWITZERLAND</span>
</option>
<option value="SY"><span>叙利亚SYRIA</span>
</option>
<option value="TJ"><span>塔吉克斯坦TAJIKISTAN</span>
</option>
<option value="TZ"><span>坦桑尼亚TANZANIA</span>
</option>
<option value="TH"><span>泰国THAILAND</span>
</option>
<option value="SS"><span>南苏丹共和国THE REPBLIC OF SOUTH SUDAN</span>
</option>
<option value="UGA"><span>乌干达THE REPUBLIC OF UGANDA</span>
</option>
<option value="TL"><span>东帝汶TIMOR</span>
</option>
<option value="TG"><span>多哥TOGO</span>
</option>
<option value="TO"><span>汤加TONGA</span>
</option>
<option value="TT"><span>特立尼达和多巴哥TRINIDADANDTOBAGO</span>
</option>
<option value="TN"><span>突尼斯TUNISIA</span>
</option>
<option value="TR"><span>土耳其TURKEY</span>
</option>
<option value="TM"><span>土库曼斯坦TURKMENISTAN</span>
</option>
<option value="UKR"><span>乌克兰UKRAINE</span>
</option>
<option value="GB"><span>英国UNITED KINGDOM</span>
</option>
<option value="UZB"><span>乌兹别克斯坦UZBEKISTAN</span>
</option>
<option value="UY"><span>乌拉圭Uruguay</span>
</option>
<option value="VU"><span>瓦努阿图VANUATU</span>
</option>
<option value="VA"><span>梵蒂冈VATICAN</span>
</option>
<option value="VIE"><span>越南VIETNAM</span>
</option>
<option value="VE"><span>委内瑞拉Venezuela</span>
</option>
<option value="ZM"><span>赞比亚ZAMBIA</span>
</option>
<option value="ZW"><span>津巴布韦ZIMBABWE</span>
</option>
</select>
</td>
</tr>
<tr id="error_update_tr" style="display: none;"><td colspan="5" rowspan="1"><span class="txt-wrong" id="error_for_update_nameandidno" style=""></span>
</td>
</tr>
</tbody>
</table>
<div class="lay-btn"><a href="javascript:" id="dialog_update_cancel" class="btn92" shape="rect">取消</a>
<a href="javascript:" id="dialog_update_ok" class="btn92s" shape="rect">确认</a>
</div>
</div>
</div>
</div>
<div id="608_complain" style="display: none;"><div class="mark"></div>
<div class="up-box" style="width:640px;"><div class="up-box-hd">举报告知确认书<a href="javascript:" id="608_complain_close" shape="rect">关闭</a>
</div>
<div class="up-box-bd" style="padding:15px 10px;border:1px solid #298CCE;"><table class="per-ticket" style="margin-left:0px;"><tr><td rowspan="1" colspan="1">举报人姓名：<strong id="608_name" style="font-size:20px"></strong>
</td>
<td rowspan="1" colspan="1">联系电话：<strong id="608_tel" style="font-size:20px"></strong>
</td>
</tr>
<tr><td colspan="2" rowspan="1">身份证件号码：<strong id="608_card" style="font-size:20px"></strong>
</td>
</tr>
<tr></tr>
<tr><td colspan="2" rowspan="1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;本人确认举报身份信息被他人冒用购买<strong id="ticketInfo" style="font-size:20px"></strong>
次车票。本人承诺本次举报及购票所提交的身份信息属实，并对虚假举报后果负责。</td>
</tr>
<tr><td colspan="2" rowspan="1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;铁路部门郑重提醒，将在车站和列车对该车票进行重点查验。根据国务院颁布的《铁路安全管理条例》，对该车票所记载身份信息与所持身份证件或者真实身份不符的持票人，铁路部门将拒绝其进站乘车。同时，公安机关将依法调查。</td>
</tr>
<tr><td colspan="2" rowspan="1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;铁路部门将对您的举报信息保密，谢谢您的合作！</td>
</tr>
</table>
<div class="lay-btn"><a href="javascript:" id="608_complain_cancel" class="btn92" shape="rect">取消</a>
<a href="javascript:" id="608_complain_ok" class="btn92s" shape="rect">确认举报</a>
</div>
</div>
</div>
</div>
<div id="608_check" style="display: none;"><div class="mark"></div>
<div class="up-box"><div class="up-box-hd">温馨提示<a href="javascript:" id="608_check_close" shape="rect">关闭</a>
</div>
<div class="up-box-bd"><div class="up-con clearfix"><span class="icon i-opt"></span>
<div class="r-txt"><div class="tit" id="608_check_msg"></div>
<div class="tit" style="color:#FB7403">是否举报？</div>
</div>
</div>
<div class="lay-btn"><a href="javascript:" id="608_check_cancel" class="btn92" shape="rect">取消</a>
<a href="javascript:" id="608_check_ok" class="btn92s" shape="rect">网上举报</a>
</div>
</div>
</div>
</div>
<!--header start-->
<div class="header"><div class="wrapper"><!-- 头部内容 -->
<div class="header-con"><h1 class="logo"><a name="g_href" data-type="1" data-href="index.html" data-redirect="Y" href="javascript:;">中国铁路12306</a>
</h1>
<div class="header-right"><!-- 搜索条 -->
<div class="header-search"><div class="search-bd"><input type="password" value="" style="display:none" />
<input type="text" class="search-input" id="search-input" value="" auto-complete="new-password" placeholder="搜索车票/餐饮/常旅客/相关规章" />
<!-- 搜索提示 -->
<div class="search-down"><a href="javascript:;" class="close">关闭</a>
<ul class="search-down-list"></ul>
<!-- 热门推荐 -->
<!-- <div class="search-down-hot">
                            <h3 class="search-hot-tit">热门推荐</h3>
                            <div class="search-hot-key"><a href="#">车站</a><a href="#">进站乘车</a><a href="#">互联网购票</a></div>
                        </div> -->
</div>
<!-- 搜索历史 -->
<div class="search-history"><a href="javascript:;" class="history-clear">清除</a>
<h3 class="search-history-tit">搜索历史</h3>
<ul class="search-history-list"></ul>
</div>
</div>
<a class="search-btn" href="javascript:;"><i class="icon icon-search"></i>
</a>
</div>
<!-- 右侧菜单 -->
<ul class="header-menu"><li class="menu-item menu-nav"><a name="g_href" data-type="2" data-href="view/index.html" data-redirect="Y" href="javascript:;" class="menu-nav-hd">我的12306
                            <i class="caret"></i>
</a>
<ul class="menu-nav-bd"><li><a style="color: #333;" name="g_href" data-type="2" data-href="view/train_order.html" data-redirect="Y" href="javascript:;">火车票订单</a>
</li>
<li><a style="color: #333;" name="g_href" data-type="2" data-href="view/lineUp_order.html" data-redirect="Y" href="javascript:;">候补订单</a>
</li>
<li><a style="color: #333;" name="g_href" data-type="2" data-href="view/personal_travel.html" data-redirect="Y" href="javascript:;">我的行程</a>
</li>
<li class="nav-line"></li>
<li><a style="color: #333;" name="g_href" data-type="10" data-href="queryMyOrder.html" data-redirect="Y" href="javascript:;">我的餐饮•特产</a>
</li>
<li><a style="color: #333;" name="g_href" data-type="2" data-href="view/my_insurance.html" data-redirect="Y" href="javascript:;">我的保险</a>
</li>
<li><a style="color: #333;" name="g_href" data-type="3" data-href="welcome.html" data-redirect="Y" href="javascript:;">我的会员</a>
</li>
<li class="nav-line"></li>
<li><a style="color: #333;" name="g_href" data-type="2" data-href="view/information.html" data-redirect="Y" href="javascript:;">查看个人信息</a>
</li>
<li><a style="color: #333;" name="g_href" data-type="2" data-href="view/userSecurity.html" data-redirect="Y" href="javascript:;">账户安全</a>
</li>
<li class="nav-line"></li>
<li><a style="color: #333;" name="g_href" data-type="2" data-href="view/passengers.html" data-redirect="Y" href="javascript:;">常用联系人</a>
</li>
<li><a style="color: #333;" name="g_href" data-type="2" data-href="view/address_init.html" data-redirect="Y" href="javascript:;">车票快递地址</a>
</li>
<li class="nav-line"></li>
<li><a style="color: #333;" name="g_href" data-type="2" data-href="view/icentre_serviceQuery.html" data-redirect="Y" href="javascript:;">温馨服务查询</a>
</li>
</ul>
</li>
<li class="menu-item menu-line">|</li>
<li id="J-header-logout" class="menu-item menu-login">
                        您好，<a id="login_user" name="g_href" data-type="2" data-href="view/index.html" data-redirect="Y" href="javascript:;" class="colorA" style="margin-left:-0.5px;"><span style="width:50px;">周靖峰</span>
</a>
<span class="txt-primary"></span>
&nbsp;|&nbsp;<a name="g_href" data-type="2" data-href="login/loginOut" data-redirect="Y" href="javascript:;">退出</a>
</li>
</ul>
</div>
</div>
</div>
<!-- 导航 -->
<div class="nav-box"><ul class="nav"><li class="nav-item nav-item-w1"><a name="g_href" data-type="1" data-href="index.html" data-redirect="Y" href="javascript:;" class="nav-hd">首页</a>
</li>
<li class="nav-item nav-item-w1"><a href="javascript:void(0)" class="nav-hd">车票
                    <i class="icon icon-down"></i>
</a>
<div class="nav-bd"><div class="nav-bd-item nav-col2"><h3 class="nav-tit">购买</h3>
<ul class="nav-con"><li><a name="g_href" data-type="2" data-href="leftTicket/init?linktypeid=dc" data-redirect="Y" href="javascript:;">单程</a>
</li>
<li><a name="g_href" data-type="2" data-href="leftTicket/init?linktypeid=wf" data-redirect="Y" href="javascript:;">往返</a>
</li>
<li><a name="g_href" data-type="2" data-href="lcQuery/init" data-redirect="Y" href="javascript:;">接续换乘</a>
</li>
<li></li>
</ul>
</div>
<div class="nav-bd-item nav-col2"><h3 class="nav-tit">变更</h3>
<ul class="nav-con"><li><a name="g_href" data-type="2" data-href="view/train_order.html?type=2" data-param="typefilt=4" data-redirect="Y" href="javascript:;">退票</a>
</li>
<li><a name="g_href" data-type="2" data-href="view/train_order.html?type=2" data-param="typefilt=2" data-redirect="Y" href="javascript:;">改签</a>
</li>
<li><a name="g_href" data-type="2" data-href="view/train_order.html?type=2" data-param="typefilt=3" data-redirect="Y" href="javascript:;">变更到站</a>
</li>
<li></li>
</ul>
</div>
<div class="nav-bd-item nav-col2"><h3 class="nav-tit border-none">更多</h3>
<ul class="nav-con"><li><a name="g_href" data-type="1" data-href="view/ticket/zt_card.html" data-redirect="Y" href="javascript:;">中铁银通卡</a>
</li>
<li class="border-none"><a name="g_href" data-type="1" data-href="view/ticket/through_train.html" data-redirect="Y" href="javascript:;">广九直通车</a>
</li>
<li><a name="g_href" data-type="1" data-href="view/ticket/railway.html" data-redirect="Y" href="javascript:;">市郊快速铁路</a>
</li>
<li><a name="g_href" data-type="1" data-href="view/ticket/international_train.html" data-redirect="Y" href="javascript:;">国际列车</a>
</li>
</ul>
</div>
</div>
</li>
<li class="nav-item "><a href="javascript:void(0)" class="nav-hd ">团购服务
                    <i class="icon icon-down "></i>
</a>
<div class="nav-bd "><div class="nav-bd-item nav-col6 "><ul class="nav-con "><li><a name="g_href" data-type="1" data-href="view/group/group_management.html?type=1" data-redirect="Y" href="javascript:;">务工人员</a>
</li>
<li><a name="g_href" data-type="1" data-href="view/group/group_management.html?type=2" data-redirect="Y" href="javascript:;">学生团体</a>
</li>
</ul>
</div>
</div>
</li>
<li class="nav-item "><a href="javascript:void(0) " class="nav-hd ">会员服务
                    <i class="icon icon-down "></i>
</a>
<div class="nav-bd "><div class="nav-bd-item nav-col6"><ul class="nav-con "><li><a name="g_href" data-type="3" data-href="index.html" data-redirect="Y" href="javascript:;">会员管理</a>
</li>
<li><a name="g_href" data-type="3" data-href="index.html" data-redirect="Y" href="javascript:;">积分账户</a>
</li>
<li><a name="g_href" data-type="3" data-href="index.html" data-redirect="Y" href="javascript:;">积分兑换</a>
</li>
<li><a name="g_href" data-type="3" data-href="index.html" data-redirect="Y" href="javascript:;">会员专享</a>
</li>
<li class="border-none "><a name="g_href" data-type="3" data-href="welcome.html" data-redirect="Y" href="javascript:;">会员中心</a>
</li>
</ul>
</div>
</div>
</li>
<li class="nav-item "><a href="javascript:void(0) " class="nav-hd ">站车服务
                    <i class="icon icon-down "></i>
</a>
<div class="nav-bd "><div class="nav-bd-item nav-col4 "><ul class="nav-con "><li><a name="g_href" data-type="2" data-href="view/icentre_qxyyInfo.html" data-redirect="Y" href="javascript:;">重点旅客预约</a>
</li>
<li><a name="g_href" data-type="1" data-href="view/station/hand.html" data-redirect="Y" href="javascript:;">便民托运</a>
</li>
<li><a name="g_href" data-type="1" data-href="view/station/shared_Car.html" data-redirect="Y" href="javascript:;">共享汽车</a>
</li>
<li><a name="g_href" data-type="4" data-href="czyd_2143/" data-redirect="Y" href="javascript:;">车站引导</a>
</li>
<li><a name="g_href" data-type="2" data-href="view/icentre_lostInfo.html" data-redirect="Y" href="javascript:;">遗失物品查找</a>
</li>
<li><a name="g_href" data-type="1" data-href="view/station/train_intro.html" data-redirect="Y" href="javascript:;">动车组介绍</a>
</li>
<li><a name="g_href" data-type="1" data-href="view/station/custom_PickUp.html" data-redirect="Y" href="javascript:;">定制接送</a>
</li>
<li><a name="g_href" data-type="4" data-href="zcfc_2548/" data-redirect="Y" href="javascript:;">站车风采</a>
</li>
</ul>
</div>
</div>
</li>
<li class="nav-item "><a href="javascript:void(0) " class="nav-hd ">商旅服务
                    <i class="icon icon-down "></i>
</a>
<div class="nav-bd "><div class="nav-bd-item nav-col6 "><ul class="nav-con "><li><a name="g_href" data-type="10" data-href="index.html" data-redirect="Y" href="javascript:;">餐饮•特产</a>
</li>
<li><a name="g_href" data-type="5" data-href="" data-redirect="Y" href="javascript:;">旅游</a>
</li>
<li><a name="g_href" data-type="2" data-href="view/my_insurance.html" data-redirect="Y" href="javascript:;">保险</a>
</li>
</ul>
</div>
</div>
</li>
<li class="nav-item "><a href="javascript:void(0) " class="nav-hd ">出行指南
                    <i class="icon icon-down "></i>
</a>
<div class="nav-bd "><div class="nav-bd-item nav-col2 "><h3 class="nav-tit ">常见问题</h3>
<ul class="nav-con "><li><a name="g_href" data-type="2" data-href="gonggao/ticketType.html" data-redirect="Y" href="javascript:;">车票</a>
</li>
<li><a name="g_href" data-type="2" data-href="gonggao/ticketWindow.html" data-redirect="Y" href="javascript:;">购票</a>
</li>
<li><a name="g_href" data-type="2" data-href="gonggao/windowEndorse.html" data-redirect="Y" href="javascript:;">改签、变更到站</a>
</li>
<li><a name="g_href" data-type="2" data-href="gonggao/windowRefund.html" data-redirect="Y" href="javascript:;">退票</a>
</li>
<li><a name="g_href" data-type="2" data-href="gonggao/help.html" data-redirect="Y" href="javascript:;" class="txt-lighter">更多>></a>
</li>
<li></li>
</ul>
</div>
<div class="nav-bd-item nav-col2 "><h3 class="nav-tit ">旅客须知</h3>
<ul class="nav-con "><li><a name="g_href" data-type="2" data-href="gonggao/usersNeedToKnow.html?linktypeid=txt" data-redirect="Y" href="javascript:;">铁路电子客票</a>
</li>
<li><a name="g_href" data-type="2" data-href="gonggao/saleTicketMeans.html?linktypeid=means5" data-redirect="Y" href="javascript:;">身份核验</a>
</li>
<li><a name="g_href" data-type="2" data-href="gonggao/help.html" data-redirect="Y" href="javascript:;" class="txt-lighter">更多>></a>
</li>
<li></li>
</ul>
</div>
<div class="nav-bd-item nav-col2 "><h3 class="nav-tit border-none ">相关章程</h3>
<ul class="nav-con "><li><a name="g_href" data-type="2" data-href="gonggao/saleTicketMeans.html?linktypeid=means1" data-redirect="Y" href="javascript:;">铁路互联网售票暂行办法</a>
</li>
<li class="border-none "><a name="g_href" data-type="2" data-href="gonggao/saleTicketMeans.html?linktypeid=means2" data-redirect="Y" href="javascript:;">铁路旅客运输规程</a>
</li>
<li style="text-overflow: ellipsis;white-space: nowrap;"><a name="g_href" data-type="2" data-href="gonggao/saleTicketMeans.html?linktypeid=means6" data-redirect="Y" href="javascript:;">铁路进站乘车禁止和限制携带品公告</a>
</li>
<li class="border-none" style="text-overflow: ellipsis;white-space: nowrap;"><a name="g_href" data-type="2" data-href="gonggao/saleTicketMeans.html?linktypeid=means7" data-redirect="Y" href="javascript:;">广深港高速铁路跨境旅客运输组织规则</a>
</li>
<li><a name="g_href" data-type="2" data-href="gonggao/help.html" data-redirect="Y" href="javascript:;" class="txt-lighter">更多>></a>
</li>
<li></li>
</ul>
</div>
</div>
</li>
<li class="nav-item last "><a href="javascript:void(0) " class="nav-hd ">信息查询
                    <i class="icon icon-down "></i>
</a>
<div class="nav-bd "><div class="nav-bd-item nav-col5 "><h3 class="nav-tit border-none ">常用查询</h3>
<ul class="nav-con "><li><a name="g_href" data-type="2" data-href="zwdch/init" data-redirect="Y" href="javascript:;">正晚点</a>
</li>
<li><a name="g_href" data-type="2" data-href="queryTrainInfo/init" data-redirect="Y" href="javascript:;">时刻表</a>
</li>
<li><a name="g_href" data-type="2" data-href="leftTicketPrice/initPublicPrice" data-redirect="Y" href="javascript:;">公布票价</a>
</li>
<li><a name="g_href" data-type="1" data-href="view/infos/ticket_check.html" data-redirect="Y" href="javascript:;">检票口</a>
</li>
<li><a name="g_href" data-type="1" data-href="view/infos/sale_time.html" data-redirect="Y" href="javascript:;">起售时间</a>
</li>
<li><a name="g_href" data-href="https://forecast.lytq.com/pc.html" data-redirect="N" href="javascript:;">天气</a>
</li>
<li><a name="g_href" data-type="1" data-href="view/infos/jiaotong.html" data-redirect="Y" href="javascript:;">交通查询</a>
</li>
<li><a name="g_href" data-type="2" data-href="queryAgencySellTicket/init" data-redirect="Y" href="javascript:;">代售点</a>
</li>
<li><a name="g_href" data-type="1" data-href="view/infos/service_number.html" data-redirect="Y" href="javascript:;">客服电话</a>
</li>
<li></li>
</ul>
</div>
<div class="nav-bd-item "><ul class="nav-con nav-con-pt"><li class="border-none"><a name="g_href" data-type="1" data-href="index.html#index_ads" data-redirect="Y" href="javascript:;">最新发布</a>
</li>
<li class="border-none"><a name="g_href" data-type="6" data-href="queryDishonest/init" data-redirect="Y" href="javascript:;">信用信息</a>
</li>
</ul>
</div>
</div>
</li>
</ul>
</div>
</div>
<!--header end-->
<!--页面主体  开始-->
<div class="content"><!--列车信息 开始-->
<div class="layout t-info"><div class="lay-hd">
                列车信息<span class="small">（以下余票信息仅供参考）</span>
</div>
<div class="lay-bd"><p class="t-tit" id="ticket_tit_id"></p>
<p class="t-con" id="ticket_con_id"></p>
<p style="color: #3177BF;">
                    *显示的卧铺票价均为上铺票价，供您参考。具体票价以您确认支付时实际购买的铺别票价为准。
                </p>
</div>
</div>
<!--列车信息 结束-->
<!--改签原票信息 开始-->
<!--改签原票信息 结束-->
<!--多级票价信息 开始-->
<div style="display: none;"><input style="display: none;" type="checkbox" id="fczk" />
</div>
<!--乘客信息 开始-->
<div class="layout person"><div class="lay-hd">
                乘客信息<span class="small" id="psInfo">（填写说明）</span>
<div class="s-box"><input id="quickQueryPassenger_id" type="text" value="输入乘客姓名" class="txt" />
<input id="submit_quickQueryPassenger" type="submit" class="sub" />
</div>
</div>
<div class="lay-bd"><div class="per-sel"><div class="item clearfix"><h2 class="srr" id="dg_passenger_image_id" title="受让人" style="display: none;">受让人</h2>
<ul id="dj_passenger_id"></ul>
</div>
<div class="item clearfix"><h2 class="cy" id="normal_passenger_image_id" title="常用联系人" style="display: none;">常用联系人</h2>
<ul id="normal_passenger_id"></ul>
<div class="btn-all" style="display: none;" id="btnAll"><a id="show_more_passenger_id" title="展开" href="javascript:" style="display: none;" shape="rect"><label id="gd">更多</label>
<b></b>
</a>
</div>
</div>
</div>
<table class="per-ticket"><tr><th width="28" rowspan="1" colspan="1">序号</th>
<th rowspan="1" colspan="1">票种</th>
<th rowspan="1" colspan="1">席别 </th>
<th rowspan="1" colspan="1">姓名</th>
<th rowspan="1" colspan="1">证件类型</th>
<th rowspan="1" colspan="1">证件号码</th>
<th rowspan="1" colspan="1">手机号码</th>
<!--
                        <th><input type="checkbox" class="check" id="selected_ticket_passenger_all"
                            onclick="javascript:selectedTicketPassengerAll(this,true);" checked="checked" />全部</th>
                        -->
<th width="70" rowspan="1" colspan="1"></th>
<th width="30" rowspan="1" colspan="1"></th>
</tr>
<tbody id="ticketInfo_id"></tbody>
</table>
<div><img src="/otn/resources/images/ins_ad2.png" alt="" />
</div>
</div>
</div>
<!--
        //inside: class="lay-btn captchaButton passengerInfo-inside"
        //float: class="lay-btn captchaButton captchaFloatButton passengerInfo-float"
         -->
<!--乘客信息 结束-->
<div class="lay-btn"><a id="preStep_id" href="javascript:" class="btn92" shape="rect">上一步</a>
<a id="submitOrder_id" href="javascript:" class="btn92s" shape="rect">提交订单</a>
</div>
<div class="lay-btn captchaButton passengerInfo-inside" data-touclick-name=""></div>
<div class="tips-txt"><h2>温馨提示：</h2>
<P>1. 一张有效身份证件同一乘车日期同一车次只能购买一张车票，高铁动卧列车除外。</P>
<P>2. 购票时可使用的有效身份证件包括：中华人民共和国居民身份证、港澳居民来往内地通行证、台湾居民来往大陆通行证和按规定可使用的有效护照。</P>
<P>3. 购买儿童票时，乘车儿童有有效身份证件的，请填写本人有效身份证件信息。乘车儿童没有有效身份证件的，应使用同行成年人的有效身份证件信息；购票时不受第一条限制，但购票后、开车前须办理换票手续方可进站乘车。</P>
<P>
                4. 购买学生票时，须在<a href="../view/passengers.html" shape="rect">我的常用联系人</a>
中登记乘车人的学生详细信息。学生票乘车时间限为每年的暑假6月1日至9月30日、寒假12月1日至3月31日。购票后、开车前，须办理换票手续方可进站乘车。换票时，新生凭录取通知书，毕业生凭学校书面证明，其他凭学生优惠卡。
 
            </P>
<P>5.
                购买残疾军人（伤残警察）优待票的，须在购票后、开车前办理换票手续方可进站乘车。换票时，不符合规定的减价优待条件，没有有效"中华人民共和国残疾军人证"或"中华人民共和国伤残人民警察证"的，不予换票，所购车票按规定办理退票手续。</P>
<P><strong>6.购买铁路乘意险的注册用户年龄须在18周岁以上，使用非中国居民身份证注册的用户如购买铁路乘意险，须在<a href="../view/information.html" shape="rect">我的12306——个人信息</a>
如实填写“出生日期”。</strong>
</P>
<P><strong>7.父母为未成年子女投保，须在<a href="../view/passengers.html" shape="rect">我的常用联系人</a>
登记未成年子女的有效身份证件信息。</strong>
</P>
<P>8.未尽事宜详见《铁路旅客运输规程》等有关规定和车站公告。</P>
</div>
</div>
<!--页面主体  结束-->
<!--页面底部  开始-->
<div class="footer"><div class="footer-con wrapper"><div class="foot-links" style="margin-right:20px;"><h2 class="foot-con-tit">友情链接</h2>
<ul class="foot-links-list"><li><a name="g_href" data-href="http://www.china-railway.com.cn/" data-redirect="N" href="javascript:;" data-target="_blank"><img src="/otn/resources/images/12306_index/link01.png" alt="" />
</a>
</li>
<li><a name="g_href" data-href="http://www.china-ric.com/" data-redirect="N" href="javascript:;" data-target="_blank"><img src="/otn/resources/images/12306_index/link02.png" alt="" />
</a>
</li>
<li><a name="g_href" data-href="http://www.95306.cn/" data-redirect="N" href="javascript:;" data-target="_blank"><img src="/otn/resources/images/12306_index/link03.png" alt="" />
</a>
</li>
<li><a name="g_href" data-href="http://www.cre.cn/" data-redirect="N" href="javascript:;" data-target="_blank"><img src="/otn/resources/images/12306_index/link04.png" alt="" />
</a>
</li>
</ul>
</div>
<ul class="foot-code"><li style="width: 140px;"><h2 class="foot-con-tit">中国铁路官方微信</h2>
<div class="code-pic"><img src="/otn/resources/images/zgtlwb.png" class="code-pic" alt="" />
</div>
</li>
<li style="width: 140px;"><h2 class="foot-con-tit">中国铁路官方微博</h2>
<div class="code-pic"><img src="/otn/resources/images/zgtlwx.png" class="code-pic" alt="" />
</div>
</li>
<li style="width: 110px;"><h2 class="foot-con-tit">12306 公众号</h2>
<div class="code-pic"><img src="/otn/resources/images/public.png" class="code-pic" alt="" />
</div>
</li>
<li style="width: 110px;"><h2 class="foot-con-tit">铁路12306</h2>
<div class="code-pic"><img src="/otn/resources/images/download.png" class="code-pic" alt="" />
<div class="code-tips">官方APP下载，目前铁路未授权其他网站或APP开展类似服务内容，敬请广大用户注意。</div>
</div>
</li>
</ul>
</div>
<div class="footer-txt"><p><span class="mr">版权所有©2008-2019</span>
<span>中国铁道科学研究院集团有限公司</span>
</p>
<p><span class="mr">京ICP备05020493号-4</span>
<span class="mr">|</span>
<span>京ICP证150437号</span>
</p>
</div>
</div>
<!--页面底部  结束-->
<!-- 提交订单核对车票信息弹出层 start -->
<div id="checkticketinfo_id" style="display: none; margin-left: 30%; margin-top: 30%;"><div class="mark"></div>
<div class="up-box w664" id="content_checkticketinfo_id"><div class="up-box-hd"><!-- <a id="close_checkticketdialog_id" href="javascript:">关闭</a> -->
 
 
                请核对以下信息
 
 
 
            </div>
<div class="up-box-bd ticket-check"><div class="info2" id="check_ticket_tit_id"><strong class="mr5">2013-03-02（周日）</strong>
<strong class="mr5">D315</strong>
动车<strong class="ml5">北京南</strong>
站<strong>（08:22开）—上海虹桥</strong>
站（16:55到）
 
                </div>
<table class="table-a"><tr><th width="28" rowspan="1" colspan="1">序号</th>
<th rowspan="1" colspan="1">席别</th>
<th id="bed_show" style="display: none;" rowspan="1" colspan="1">铺别</th>
<th rowspan="1" colspan="1">票种</th>
<th rowspan="1" colspan="1">姓名</th>
<th rowspan="1" colspan="1">证件类型</th>
<th rowspan="1" colspan="1">证件号码</th>
<th rowspan="1" colspan="1">手机号码</th>
</tr>
<tbody id="check_ticketInfo_id"></tbody>
</table>
<p style="color: #3177BF;" id="notice_1_id"><!--   注：1.系统将随机为您申请席位，暂不支持自选席位。-->
</p>
<div class="seat-sel seat-sel-round" id="id-seat-sel" style="display: none;"><div class="seat-sel-hd"><div class="tips-xz">选座喽</div>
 
                        已选座<span id="selectNo">1/4</span>
</div>
<div class="seat-sel-bd"><!-- 第一排 -->
<div class="sel-item" id="yideng1" style="display: none;"><!-- 一等座-->
<div class="txt">窗</div>
<ul class="seat-list"><li><a href="javascript:" id="1A" shape="rect">A</a>
</li>
<li><a href="javascript:" id="1C" shape="rect">C</a>
</li>
</ul>
<div class="txt">过道</div>
<ul class="seat-list"><li><a href="javascript:" id="1D" shape="rect">D</a>
</li>
<li><a href="javascript:" id="1F" shape="rect">F</a>
</li>
</ul>
<div class="txt txt-last">窗</div>
</div>
<div class="sel-item" id="erdeng1" style="display: none;"><!-- 二等座-->
<div class="txt">窗</div>
<ul class="seat-list"><li><a href="javascript:" id="1A" shape="rect">A</a>
</li>
<li><a href="javascript:" id="1B" shape="rect">B</a>
</li>
<li><a href="javascript:" id="1C" shape="rect">C</a>
</li>
</ul>
<div class="txt">过道</div>
<ul class="seat-list"><li><a href="javascript:" id="1D" shape="rect">D</a>
</li>
<li><a href="javascript:" id="1F" shape="rect">F</a>
</li>
</ul>
<div class="txt txt-last">窗</div>
</div>
<div class="sel-item" id="tedeng1" style="display: none;"><!-- 特等座-->
<div class="txt">窗</div>
<ul class="seat-list"><li><a href="javascript:" id="1A" shape="rect">A</a>
</li>
<li><a href="javascript:" id="1C" shape="rect">C</a>
</li>
</ul>
<div class="txt">过道</div>
<ul class="seat-list"><li><a href="javascript:" id="1F" shape="rect">F</a>
</li>
</ul>
<div class="txt txt-last">窗</div>
</div>
<!-- 第二排 -->
<div class="sel-item" id="yideng2" style="display: none;"><!-- 一等座-->
<div class="txt">窗</div>
<ul class="seat-list"><li><a href="javascript:" id="2A" shape="rect">A</a>
</li>
<li><a href="javascript:" id="2C" shape="rect">C</a>
</li>
</ul>
<div class="txt">过道</div>
<ul class="seat-list"><li><a href="javascript:" id="2D" shape="rect">D</a>
</li>
<li><a href="javascript:" id="2F" shape="rect">F</a>
</li>
</ul>
<div class="txt txt-last">窗</div>
</div>
<div class="sel-item" id="erdeng2" style="display: none;"><!-- 二等座-->
<div class="txt">窗</div>
<ul class="seat-list"><li><a href="javascript:" id="2A" shape="rect">A</a>
</li>
<li><a href="javascript:" id="2B" shape="rect">B</a>
</li>
<li><a href="javascript:" id="2C" shape="rect">C</a>
</li>
</ul>
<div class="txt">过道</div>
<ul class="seat-list"><li><a href="javascript:" id="2D" shape="rect">D</a>
</li>
<li><a href="javascript:" id="2F" shape="rect">F</a>
</li>
</ul>
<div class="txt txt-last">窗</div>
</div>
<div class="sel-item" id="tedeng2" style="display: none;"><!-- 特等座-->
<div class="txt">窗</div>
<ul class="seat-list"><li><a href="javascript:" id="2A" shape="rect">A</a>
</li>
<li><a href="javascript:" id="2C" shape="rect">C</a>
</li>
</ul>
<div class="txt">过道</div>
<ul class="seat-list"><li><a href="javascript:" id="2F" shape="rect">F</a>
</li>
</ul>
<div class="txt txt-last">窗</div>
</div>
</div>
</div>
<div class="seat-sel seat-sel-round" id="id-bed-sel" style="display: none;"><div class="seat-sel-hd"><div class="tips-xz">选铺喽</div>
 
                            已选铺<span id="selectBedNo">1/4</span>
</div>
<div class="seat-sel-bd"><div class="sel-item"><div class="bed-yw">硬卧</div>
<div class="bed-item"><div class="txt">下铺</div>
<div class="number-control-mini"><a href="javascript:" class="num-reduce" onclick="javascript:numSet(&#39;reduce&#39;,&#39;x_no&#39;);" shape="rect">-</a>
<span class="num" id="x_no">0</span>
<a href="javascript:" class="num-increase" onclick="javascript:numSet(&#39;add&#39;,&#39;x_no&#39;);" shape="rect">+</a>
</div>
</div>
<div class="bed-item" style="display: none;" id="mid_bed"><div class="txt">中铺</div>
<div class="number-control-mini"><a href="javascript:" class="num-reduce" onclick="javascript:numSet(&#39;reduce&#39;,&#39;z_no&#39;);" shape="rect">-</a>
<span class="num" id="z_no">0</span>
<a href="javascript:" class="num-increase" onclick="javascript:numSet(&#39;add&#39;,&#39;z_no&#39;);" shape="rect">+</a>
</div>
</div>
<div class="bed-item"><div class="txt">上铺</div>
<div class="number-control-mini"><a href="javascript:" class="num-reduce" onclick="javascript:numSet(&#39;reduce&#39;,&#39;s_no&#39;);" shape="rect">-</a>
<span class="num" id="s_no">0</span>
<a href="javascript:" class="num-increase" onclick="javascript:numSet(&#39;add&#39;,&#39;s_no&#39;);" shape="rect">+</a>
</div>
</div>
</div>
</div>
</div>
<p style="color: #FF0000;" id="notice_2_id"><!--  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2.根据现行规定，外国人在购买进西藏火车票时，须出示西藏自治区外事办公室或旅游局、商务厅的批准函（电），或者出示中国内地司局级接待单位出具的、已征得自治区上述部门同意的证明信函。台湾同胞赴藏从事旅游、商务活动，须事先向西藏自治区旅游局或商务厅提出申请，购买进藏火车票时须出示有关批准函。-->
</p>
<p style="color: #FF0000;" id="notice_3_id"><!--  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2.按现行规定，学生票购票区间必须与学生证上的乘车区间一致，否则车站将不予换票。-->
</p>
<p style="color:#3177BF;" id="notice_4_id"><!--  *购买铁路乘意险的注册用户年龄须在18周岁以上，使用非中国居民身份证注册的用户如购买铁路乘意险，须在<a th:href="@{../modifyUser/initQueryUserInfo}" href="/otsweb/modifyUser/initQueryUserInfo">“我的12306—个人信息”</a>如实填写“出生日期”。<br />
                     *父母为未成年子女投保，须在<a th:href="@{../view/passengers.html}" href="/otsweb/passengers/init">我的常用联系人</a>登记未成年子女的有效身份证件信息。   -->
</p>
<p style="color: #FF0000;" id="notice_5_id"><!--  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;改签或变更到站后的车票乘车日期在春运期间的，退票时一律按开车时间前不足24小时标准核收退票费。-->
</p>
<p id="sy_ticket_num_id"><!--  尊敬的旅客，本次列车您选择的席别尚有余票<strong>1135</strong>张，无座<strong>840</strong>张。特此提醒。<br /> 请确认信息是否正确。如正确请点击“确定”，系统将为您随机分配席位。-->
</p>
<div class="yzm" style="display: none;"><form id="randCodeForm_id" onsubmit="javascript:return false;" method="get" enctype="application/x-www-form-urlencoded"><ul><div id="mypasscode1" data-code_type="passenger" data-touclick-type="inside"><script>var targettype=['Z'];var targetdiv=['mypasscode1'];var targetelement=[''];</script>
<script src="/otn/resources/js/newpasscode/new.js" xml:space="preserve"></script>
</div>
</ul>
</form>
</div>
<div class="lay-btn" id="confirmDiv"><a id="back_edit_id" href="javascript:" class="btn92" shape="rect">返回修改</a>
<a href="javascript:" class="btn92s" id="qr_submit_id" shape="rect">确认</a>
</div>
</div>
</div>
</div>
<!-- 提交订单核对车票信息弹出层 end -->
<!-- 交易提示框 start  -->
<div id="transforNotice_id" style="display: none; margin-left: 30%; margin-top: 30%;"><div class="mark"></div>
<div class="up-box" id="content_transforNotice_id"><div class="up-box-hd" id="up-box-hd_id"><!--  <a id="closeTranforDialog_id" style="display: none;" href="javascript:">关闭</a>-->
 
 
                提示
 
 
 
            </div>
<div class="up-box-bd"><div class="up-con clearfix"><span class="icon i-work" id="iamge_status_id"></span>
<div class="r-txt" id="orderResultInfo_id"><!--  信息提示 -->
</div>
</div>
<div class="lay-btn" id="lay-btn_id"><!-- <a href="javascript:" id="qr_closeTranforDialog_id" style="display: none;" class="btn92s">确认</a> -->
</div>
</div>
</div>
</div>
<!--说明文字 start -->
<div class="srr-tips"><ul><li>请按乘车时所使用的有效身份证件准确、完整填写乘车填写乘车人姓名和证件号码。</li>
<li>如姓名中包含生僻字，可输入汉语拼音代替。<br clear="none" />
例如“李鵢”可输入“李shen”
            </li>
</ul>
</div>
<!--说明文字 end -->
<!--积分支付 提示信息 start -->
<div class="srr-tips"><ul><li>请按乘车时所使用的有效身份证件准确、完整填写乘车人姓名和证件号码。</li>
<li>如姓名中包含生僻字，可输入汉语拼音代替。<br clear="none" />
例如“李燊”可输入“李shen”
            </li>
<li>如您准备使用积分支付票款，请选择本人或受让人作为乘车人。</li>
<li>不支持网银和积分混合支付</li>
</ul>
</div>
<!--积分支付 提示信息 end -->
<!-- 交易提示框 end  -->
<form id="_es_hiddenform" method="post" enctype="application/x-www-form-urlencoded"><input type="hidden" name="_json_att" value="" />
</form>
</body>
</html>
<!-- 页面js模块 -->
<script xml:space="preserve">
 
/*<![CDATA[*/
 
           //common data
           var can_add = 'Y';
           var member_tourFlag = 'dc';
             var IsStudentDate=false;
           var init_seatTypes=[{'end_station_name':null,'end_time':null,'id':'M','start_station_name':null,'start_time':null,'value':'\u4E00\u7B49\u5EA7'},{'end_station_name':null,'end_time':null,'id':'O','start_station_name':null,'start_time':null,'value':'\u4E8C\u7B49\u5EA7'}];
 
           var defaultTicketTypes=[{'end_station_name':null,'end_time':null,'id':'1','start_station_name':null,'start_time':null,'value':'\u6210\u4EBA\u7968'},{'end_station_name':null,'end_time':null,'id':'2','start_station_name':null,'start_time':null,'value':'\u513F\u7AE5\u7968'},{'end_station_name':null,'end_time':null,'id':'3','start_station_name':null,'start_time':null,'value':'\u5B66\u751F\u7968'},{'end_station_name':null,'end_time':null,'id':'4','start_station_name':null,'start_time':null,'value':'\u6B8B\u519B\u7968'}];
 
           var init_cardTypes=[{'end_station_name':null,'end_time':null,'id':'1','start_station_name':null,'start_time':null,'value':'\u4E2D\u56FD\u5C45\u6C11\u8EAB\u4EFD\u8BC1'},{'end_station_name':null,'end_time':null,'id':'C','start_station_name':null,'start_time':null,'value':'\u6E2F\u6FB3\u5C45\u6C11\u6765\u5F80\u5185\u5730\u901A\u884C\u8BC1'},{'end_station_name':null,'end_time':null,'id':'G','start_station_name':null,'start_time':null,'value':'\u53F0\u6E7E\u5C45\u6C11\u6765\u5F80\u5927\u9646\u901A\u884C\u8BC1'},{'end_station_name':null,'end_time':null,'id':'B','start_station_name':null,'start_time':null,'value':'\u62A4\u7167'},{'end_station_name':null,'end_time':null,'id':'H','start_station_name':null,'start_time':null,'value':'\u5916\u56FD\u4EBA\u6C38\u4E45\u5C45\u7559\u8EAB\u4EFD\u8BC1'}];
 
           var ticket_seat_codeMap={'3':[{'end_station_name':null,'end_time':null,'id':'O','start_station_name':null,'start_time':null,'value':'\u4E8C\u7B49\u5EA7'}],'2':[{'end_station_name':null,'end_time':null,'id':'M','start_station_name':null,'start_time':null,'value':'\u4E00\u7B49\u5EA7'},{'end_station_name':null,'end_time':null,'id':'O','start_station_name':null,'start_time':null,'value':'\u4E8C\u7B49\u5EA7'}],'1':[{'end_station_name':null,'end_time':null,'id':'M','start_station_name':null,'start_time':null,'value':'\u4E00\u7B49\u5EA7'},{'end_station_name':null,'end_time':null,'id':'O','start_station_name':null,'start_time':null,'value':'\u4E8C\u7B49\u5EA7'}],'4':[{'end_station_name':null,'end_time':null,'id':'M','start_station_name':null,'start_time':null,'value':'\u4E00\u7B49\u5EA7'},{'end_station_name':null,'end_time':null,'id':'O','start_station_name':null,'start_time':null,'value':'\u4E8C\u7B49\u5EA7'}]};
 
           var ticketInfoForPassengerForm={'cardTypes':[{'end_station_name':null,'end_time':null,'id':'1','start_station_name':null,'start_time':null,'value':'\u4E2D\u56FD\u5C45\u6C11\u8EAB\u4EFD\u8BC1'},{'end_station_name':null,'end_time':null,'id':'C','start_station_name':null,'start_time':null,'value':'\u6E2F\u6FB3\u5C45\u6C11\u6765\u5F80\u5185\u5730\u901A\u884C\u8BC1'},{'end_station_name':null,'end_time':null,'id':'G','start_station_name':null,'start_time':null,'value':'\u53F0\u6E7E\u5C45\u6C11\u6765\u5F80\u5927\u9646\u901A\u884C\u8BC1'},{'end_station_name':null,'end_time':null,'id':'B','start_station_name':null,'start_time':null,'value':'\u62A4\u7167'},{'end_station_name':null,'end_time':null,'id':'H','start_station_name':null,'start_time':null,'value':'\u5916\u56FD\u4EBA\u6C38\u4E45\u5C45\u7559\u8EAB\u4EFD\u8BC1'}],'isAsync':'1','key_check_isChange':'6EA22D0407A1115A91DD5C4BD6F07AE5ECF33A7794E22EC55AD1DBAC','leftDetails':['\u4E00\u7B49\u5EA7(87.00\u5143)14\u5F20\u7968','\u4E8C\u7B49\u5EA7(54.00\u5143)\u6709\u7968','\u65E0\u5EA7(54.00\u5143)\u65E0\u7968'],'leftTicketStr':'D%2Be4vDwFvbLJVq%2FfJFeqiwe6nAC37KC1B0mzAYxo4LLPH3XN','limitBuySeatTicketDTO':{'seat_type_codes':[{'end_station_name':null,'end_time':null,'id':'M','start_station_name':null,'start_time':null,'value':'\u4E00\u7B49\u5EA7'},{'end_station_name':null,'end_time':null,'id':'O','start_station_name':null,'start_time':null,'value':'\u4E8C\u7B49\u5EA7'}],'ticket_seat_codeMap':{'3':[{'end_station_name':null,'end_time':null,'id':'O','start_station_name':null,'start_time':null,'value':'\u4E8C\u7B49\u5EA7'}],'2':[{'end_station_name':null,'end_time':null,'id':'M','start_station_name':null,'start_time':null,'value':'\u4E00\u7B49\u5EA7'},{'end_station_name':null,'end_time':null,'id':'O','start_station_name':null,'start_time':null,'value':'\u4E8C\u7B49\u5EA7'}],'1':[{'end_station_name':null,'end_time':null,'id':'M','start_station_name':null,'start_time':null,'value':'\u4E00\u7B49\u5EA7'},{'end_station_name':null,'end_time':null,'id':'O','start_station_name':null,'start_time':null,'value':'\u4E8C\u7B49\u5EA7'}],'4':[{'end_station_name':null,'end_time':null,'id':'M','start_station_name':null,'start_time':null,'value':'\u4E00\u7B49\u5EA7'},{'end_station_name':null,'end_time':null,'id':'O','start_station_name':null,'start_time':null,'value':'\u4E8C\u7B49\u5EA7'}]},'ticket_type_codes':[{'end_station_name':null,'end_time':null,'id':'1','start_station_name':null,'start_time':null,'value':'\u6210\u4EBA\u7968'},{'end_station_name':null,'end_time':null,'id':'2','start_station_name':null,'start_time':null,'value':'\u513F\u7AE5\u7968'},{'end_station_name':null,'end_time':null,'id':'3','start_station_name':null,'start_time':null,'value':'\u5B66\u751F\u7968'},{'end_station_name':null,'end_time':null,'id':'4','start_station_name':null,'start_time':null,'value':'\u6B8B\u519B\u7968'}]},'maxTicketNum':'5','orderRequestDTO':{'adult_num':0,'apply_order_no':null,'bed_level_order_num':null,'bureau_code':null,'cancel_flag':null,'card_num':null,'channel':null,'child_num':0,'choose_seat':null,'disability_num':0,'end_time':{'date':1,'day':4,'hours':20,'minutes':39,'month':0,'seconds':0,'time':45540000,'timezoneOffset':-480,'year':70},'exchange_train_flag':'0','from_station_name':'\u676D\u5DDE\u4E1C','from_station_telecode':'HGH','get_ticket_pass':null,'id_mode':'Y','isShowPassCode':null,'leftTicketGenTime':null,'order_date':null,'passengerFlag':null,'realleftTicket':null,'reqIpAddress':null,'reqTimeLeftStr':null,'reserve_flag':'A','seat_detail_type_code':null,'seat_type_code':null,'sequence_no':null,'start_time':{'date':1,'day':4,'hours':19,'minutes':19,'month':0,'seconds':0,'time':40740000,'timezoneOffset':-480,'year':70},'start_time_str':null,'station_train_code':'D655','student_num':0,'ticket_num':0,'ticket_type_order_num':null,'to_station_name':'\u5B81\u6CE2','to_station_telecode':'NGH','tour_flag':'dc','trainCodeText':null,'train_date':{'date':25,'day':6,'hours':0,'minutes':0,'month':4,'seconds':0,'time':1558713600000,'timezoneOffset':-480,'year':119},'train_date_str':null,'train_location':null,'train_no':'770000D65805','train_order':null,'varStr':null},'purpose_codes':'00','queryLeftNewDetailDTO':{'BXRZ_num':'-1','BXRZ_price':'0','BXYW_num':'-1','BXYW_price':'0','EDRZ_num':'-1','EDRZ_price':'0','EDSR_num':'-1','EDSR_price':'0','ERRB_num':'-1','ERRB_price':'0','GG_num':'-1','GG_price':'0','GR_num':'-1','GR_price':'0','HBRW_num':'-1','HBRW_price':'0','HBRZ_num':'-1','HBRZ_price':'0','HBYW_num':'-1','HBYW_price':'0','HBYZ_num':'-1','HBYZ_price':'0','RW_num':'-1','RW_price':'0','RZ_num':'-1','RZ_price':'0','SRRB_num':'-1','SRRB_price':'0','SWZ_num':'-1','SWZ_price':'0','TDRZ_num':'-1','TDRZ_price':'0','TZ_num':'-1','TZ_price':'0','WZ_num':'0','WZ_price':'00540','WZ_seat_type_code':'O','YB_num':'-1','YB_price':'0','YDRZ_num':'-1','YDRZ_price':'0','YDSR_num':'-1','YDSR_price':'0','YRRB_num':'-1','YRRB_price':'0','YW_num':'-1','YW_price':'0','YYRW_num':'-1','YYRW_price':'0','YZ_num':'-1','YZ_price':'0','ZE_num':'100','ZE_price':'00540','ZY_num':'14','ZY_price':'00870','arrive_time':'2039','control_train_day':'','controlled_train_flag':null,'controlled_train_message':null,'day_difference':null,'end_station_name':null,'end_station_telecode':null,'from_station_name':'\u676D\u5DDE\u4E1C','from_station_telecode':'HGH','is_support_card':null,'lishi':'01:20','seat_feature':'','start_station_name':null,'start_station_telecode':null,'start_time':'1919','start_train_date':'','station_train_code':'D655','to_station_name':'\u5B81\u6CE2','to_station_telecode':'NGH','train_class_name':null,'train_no':'770000D65805','train_seat_feature':'','yp_ex':''},'queryLeftTicketRequestDTO':{'arrive_time':'20:39','bigger20':'Y','exchange_train_flag':'0','from_station':'HGH','from_station_name':'\u676D\u5DDE\u4E1C','from_station_no':'18','lishi':'01:20','login_id':null,'login_mode':null,'login_site':null,'purpose_codes':'00','query_type':null,'seatTypeAndNum':null,'seat_types':'OMO','start_time':'19:19','start_time_begin':null,'start_time_end':null,'station_train_code':'D655','ticket_type':null,'to_station':'NGH','to_station_name':'\u5B81\u6CE2','to_station_no':'22','train_date':'20190525','train_flag':null,'train_headers':null,'train_no':'770000D65805','useMasterPool':true,'useWB10LimitTime':true,'usingGemfireCache':false,'ypInfoDetail':'D%2Be4vDwFvbLJVq%2FfJFeqiwe6nAC37KC1B0mzAYxo4LLPH3XN'},'tour_flag':'dc','train_location':'W2'};
 
           var orderRequestDTO={'adult_num':0,'apply_order_no':null,'bed_level_order_num':null,'bureau_code':null,'cancel_flag':null,'card_num':null,'channel':null,'child_num':0,'choose_seat':null,'disability_num':0,'end_time':{'date':1,'day':4,'hours':20,'minutes':39,'month':0,'seconds':0,'time':45540000,'timezoneOffset':-480,'year':70},'exchange_train_flag':'0','from_station_name':'\u676D\u5DDE\u4E1C','from_station_telecode':'HGH','get_ticket_pass':null,'id_mode':'Y','isShowPassCode':null,'leftTicketGenTime':null,'order_date':null,'passengerFlag':null,'realleftTicket':null,'reqIpAddress':null,'reqTimeLeftStr':null,'reserve_flag':'A','seat_detail_type_code':null,'seat_type_code':null,'sequence_no':null,'start_time':{'date':1,'day':4,'hours':19,'minutes':19,'month':0,'seconds':0,'time':40740000,'timezoneOffset':-480,'year':70},'start_time_str':null,'station_train_code':'D655','student_num':0,'ticket_num':0,'ticket_type_order_num':null,'to_station_name':'\u5B81\u6CE2','to_station_telecode':'NGH','tour_flag':'dc','trainCodeText':null,'train_date':{'date':25,'day':6,'hours':0,'minutes':0,'month':4,'seconds':0,'time':1558713600000,'timezoneOffset':-480,'year':119},'train_date_str':null,'train_location':null,'train_no':'770000D65805','train_order':null,'varStr':null};
 
           var init_limit_ticket_num='5';
 
           var oldTicketDTOs="";
 
           var goOrderDTO="";
 
           var gqComeFrom="";
 
           var transport_in_SF=false;
 
 
           if(ticketInfoForPassengerForm.tour_flag==ticket_submit_order.tour_flag.gc){
 
               oldTicketDTOs =null;
 
               gqComeFrom=null;
               transport_in_SF=null;
 
               }else if(ticketInfoForPassengerForm.tour_flag==ticket_submit_order.tour_flag.fc){
                   goOrderDTO=null;
 
                   }
 
           $.views.helpers({
               getUserName : function(name) {
                    if(name.length>3){
                       name=name.substr(0,3)+'…';
                    }
                    return name;
               }
           });
/*]]>*/
 
</script>
<script id="checkTicketInfoTemplate" type="text/x-jsrender" xml:space="preserve"><!--
 
<tr {{if tour_flag==~getTourFlagByKey('fc') || tour_flag==~getTourFlagByKey('gc')}} {{if save_status == "" }}style="display:none;"{{else}}{{/if}}{{else}}{{/if}}>
 
    <td align="center" >{{:#index+1}}</td>
 
    {{if ~isExistWZ(seat_type)}}
 
                <td class="no-seat">无座</td>
 
            {{else !~isExistWZ(seat_type)}}
 
                {{if seat_type_name.indexOf("（")>-1}}
                      <td>{{>seat_type_name.substring(0,seat_type_name.indexOf("（"))}}</td>
                {{else}}
                    <td>{{>seat_type_name}}</td>
                {{/if}}   
 
            {{else}}
 
                Original version only, without subtitles.
 
            {{/if}}
 
    <td>{{>ticket_type_name}}</td>
 
    <td title="{{>name}}">{{>~getUserName(name)}}</td>
 
    <td>{{>id_type_name}}</td>
 
    <td>{{>id_no}}</td>
 
    <td>{{>phone_no}}</td>
 
</tr>
 
-->
</script>
<script id="checkTicketInfoTemplate_choose" type="text/x-jsrender" xml:space="preserve"><!--
 
<tr {{if tour_flag==~getTourFlagByKey('fc') || tour_flag==~getTourFlagByKey('gc')}} {{if save_status == "" }}style="display:none;"{{else}}{{/if}}{{else}}{{/if}}>
 
    <td align="center" >{{:#index+1}}</td>
 
    {{if ~isExistWZ(seat_type)}}
 
            <td class="no-seat">无座</td>
 
    {{else !~isExistWZ(seat_type)}}
            {{if seat_type_name.indexOf("（")>-1}}
                <td>{{>seat_type_name.substring(0,seat_type_name.indexOf("（"))}}</td>
            {{else}}
                <td>{{>seat_type_name}}</td>
            {{/if}}   
    {{else}}
 
            Original version only, without subtitles.
 
    {{/if}}       
 
 
    {{if "3" == seat_type}}
        <td>
            <select style="height: 27px;FONT-SIZE: 12px;FONT-FAMILY: '宋体','Verdana';BACKGROUND-COLOR: #FFFFF0;color: #FB7403;MARGIN-LEFT: 3px;" id="ticketype_{{:#index}}">
                 <option value="{{>seat_type}}#{{>ticket_type}}#{{>name}}#{{>id_no}}_0" selected="selected">不限</option>
                <option value="{{>seat_type}}#{{>ticket_type}}#{{>name}}#{{>id_no}}_3">上铺 </option>
                <option value="{{>seat_type}}#{{>ticket_type}}#{{>name}}#{{>id_no}}_2">中铺 </option>
                <option value="{{>seat_type}}#{{>ticket_type}}#{{>name}}#{{>id_no}}_1">下铺 </option>
            </select>
        </td>
    {{else "4" == seat_type}}
        <td>
            <select style="height: 27px;FONT-SIZE: 12px;FONT-FAMILY: '宋体','Verdana';BACKGROUND-COLOR: #FFFFF0;color: #FB7403;MARGIN-LEFT: 3px;"  id="ticketype_{{:#index}}">
                 <option value="{{>seat_type}}#{{>ticket_type}}#{{>name}}#{{>id_no}}_0" selected="selected">不限</option>
                <option value="{{>seat_type}}#{{>ticket_type}}#{{>name}}#{{>id_no}}_3">上铺 </option>
                <option value="{{>seat_type}}#{{>ticket_type}}#{{>name}}#{{>id_no}}_1">下铺 </option>
            </select>
        </td>   
    {{else}}
        <td></td>   
    {{/if}}
 
 
    <td>{{>ticket_type_name}}</td>
 
    <td title="{{>name}}">{{>~getUserName(name)}}</td>
 
    <td>{{>id_type_name}}</td>
 
    <td>{{>id_no}}</td>
 
    <td>{{>phone_no}}</td>
 
</tr>
 
-->
</script>
<script id="ticketTitTemplate" type="text/x-jsrender" xml:space="preserve"><!--
 
<strong class="mr5">{{>date}}（{{>week}}）</strong><strong class="ml5">{{>station_train_code}}</strong>次<strong
 
                        class="ml5">{{>from_station}}</strong>站<strong>（{{>start_time}}开）—{{>to_station}}</strong>站（{{>arrive_time}}到）
 
-->
</script>
<script id="ticketConTemplate" type="text/x-jsrender" xml:space="preserve"><!--
 
<span  id="ticket_status_id"  class="{{>wp_statu ? 's2' : 's1'}}">{{>seat_type_name}}{{if ticket_price!=""}}（<span class="colorA">￥{{>ticket_price}}</span>）{{else}}{{/if}}{{>ticket_statu}}</span>
 
 
-->
</script>
<script id="djPassengerTemplate" type="text/x-jsrender" xml:space="preserve"><!--
 
<li>
<input   totalTimes="{{>total_times}}" typeFlag="{{>passenger_id_type_code}}"  id="djPassenger_{{>index_id}}"     
{{if passenger_id_type_code=="2"}}
  disabled="disabled" style="color:#999999" title="请修改身份信息"
{{else passenger_id_type_code!="B"}}
  {{if (total_times != "93") && (total_times != "95") && (total_times != "97")  && (total_times != "99")}}
     disabled="disabled" style="color:#999999" title="请修改身份信息"
  {{/if}}  
{{else}}
  {{if (total_times != "93") && (total_times != "98") && (total_times != "99") && (total_times != "91")}}
     disabled="disabled" style="color:#999999" title="请修改身份信息"
  {{/if}}  
{{/if}}
 
{{if (~getCurrentUserIdType()!=~getIdType('one'))&&(~getCurrentUserIdType()!=~getIdType('two'))}} 
  {{if (passenger_id_type_code==~getIdType('one'))||(passenger_id_type_code==~getIdType('two'))}}  disabled="disabled"
  {{else}}
  {{/if}}
{{else}}
{{/if}}    type="checkbox" class="check"   /><label
{{if passenger_id_type_code=="2"}}
  disabled="disabled" style="color:#999999" title="请修改身份信息"
{{else passenger_id_type_code!="B"}}
  {{if (total_times != "93") && (total_times != "95") && (total_times != "97")  && (total_times != "99")}}
     disabled="disabled" style="color:#999999" title="请修改身份信息"
  {{/if}}  
{{else}}
  {{if (total_times != "93") && (total_times != "98") && (total_times != "99") && (total_times != "91")}}
     disabled="disabled" style="color:#999999" title="请修改身份信息"
  {{/if}}  
{{/if}} >{{>~getSuitName(passenger_name, (passenger_type == ~getTicketType('student')?true:false))}}</label>
</li>
 
-->
</script>
<script id="normalPassengerTemplate" type="text/x-jsrender" xml:space="preserve"><!--
 
<li>
<input totalTimes="{{>total_times}}" typeFlag="{{>passenger_id_type_code}}" id="normalPassenger_{{>index_id}}"     
{{if passenger_id_type_code=="2"}}
  disabled="disabled" style="color:#999999" title="请修改身份信息"
{{else passenger_id_type_code!="B"}}
  {{if (total_times != "93") && (total_times != "95") && (total_times != "97")  && (total_times != "99")}}
     disabled="disabled" style="color:#999999" title="请修改身份信息"
  {{/if}}  
{{else}}
  {{if (total_times != "93") && (total_times != "98") && (total_times != "99")&& (total_times != "97") && (total_times != "91")}}
     disabled="disabled" style="color:#999999" title="请修改身份信息"
  {{/if}}  
{{/if}}
 
{{if (~getCurrentUserIdType()!=~getIdType('one'))&&(~getCurrentUserIdType()!=~getIdType('two'))&&(~getCurrentUserIdType()!=~getIdType('work'))}} 
  {{if (passenger_id_type_code==~getIdType('one'))||(passenger_id_type_code==~getIdType('two'))||(passenger_id_type_code==~getIdType('work'))}} 
     disabled="disabled" title="不允许为该乘车人购票"
  {{/if}}
{{/if}}    type="checkbox" class="check"   /><label
{{if passenger_id_type_code=="2"}}
  disabled="disabled" style="color:#999999" title="请修改身份信息"
{{else passenger_id_type_code!="B"}}
  {{if (total_times != "93") && (total_times != "95") && (total_times != "97") && (total_times != "99")}}
     disabled="disabled" style="color:#999999" title="请修改身份信息"
  {{/if}}  
{{else}}
  {{if (total_times != "93") && (total_times != "98") && (total_times != "99") && (total_times != "97")&& (total_times != "91")}}
     disabled="disabled" style="color:#999999" title="请修改身份信息"
  {{/if}}  
{{/if}}
{{if (~getCurrentUserIdType()!=~getIdType('one'))&&(~getCurrentUserIdType()!=~getIdType('two'))&&(~getCurrentUserIdType()!=~getIdType('work'))}} 
  {{if (passenger_id_type_code==~getIdType('one'))||(passenger_id_type_code==~getIdType('two'))||(passenger_id_type_code==~getIdType('work'))}} 
     style="color:#999999" title="不允许为该乘车人购票"
  {{else}}
  {{/if}}
{{else}}
{{/if}}>{{>~getSuitName(passenger_name, (passenger_type == ~getTicketType('student')?true:false))}}</label>
</li>
 
-->
</script>
<script id="ticketInfoTemplate" type="text/x-jsrender" xml:space="preserve"><!--
 
<tr id="tr_id_{{:#index+1}}">
                <td align="center">{{:#index+1}}</td>
 
                        <td {{if (tour_flag == ~getTourFlagByKey('gc'))||(tour_flag == ~getTourFlagByKey('fc'))}} title="不允许变更票种信息" {{else}}{{/if}}>
 
    <select id="ticketType_{{:#index+1}}" name="confirmTicketType" onchange="javascript:updateSeatTypeByeTickeType(this);" {{if (tour_flag == ~getTourFlagByKey('gc') || tour_flag ==~getTourFlagByKey('fc')) ||isAccompanyChild }} {{if isDisabled}}  disabled="disabled" style="color:#999999"{{else}}{{/if}}{{else}}{{/if}} >
 
                          {{for ticketTypes}}
 
             {{if id==#parent.parent.data.ticket_type&&(#parent.parent.parent.data.IsStudentDate==true||id!=3)}}
                <option name="ticket_type_option" value="{{>id}}" selected="selected" >{{>value}}</option>
            {{else  id!=#parent.parent.data.ticket_type||id==3}}
 
                 <option value="{{>id}}">{{>value}} </option>
 
            {{else}}
 
            {{/if}}
 
 
 
            {{else}}
 
            {{/for}}
 
</select>
 
                        </td>
 
            <td><select  onclick="javascript:stepFirValidatorTicketInfo(true);" id="seatType_{{:#index+1}}">
 
                         {{for seatTypes}}
 
             {{if id==#parent.parent.data.seat_type}}
                <option value="{{>id}}" selected="selected" >
                  {{if (null!=~seatTypePriceForSeatName(value))&&(""!=~seatTypePriceForSeatName(value))}}
                   {{>value}}（￥{{>~seatTypePriceForSeatName(value)}}）
                  {{else}}
                   {{>value}}
                  {{/if}}
                </option>
 
            {{else  id!=#parent.parent.data.seat_type}}
 
                <option value="{{>id}}" >
                  {{if (null!=~seatTypePriceForSeatName(value))&&(""!=~seatTypePriceForSeatName(value))}}
                   {{>value}}（￥{{>~seatTypePriceForSeatName(value)}}）
                  {{else}}
                   {{>value}}
                  {{/if}}
                </option>
 
            {{else}}
 
                Original version only, without subtitles.
 
            {{/if}}
 
 
 
            {{else}}
 
            {{/for}}
 
             </select>
 
                         </td>
 
                        <td {{if (tour_flag == ~getTourFlagByKey('gc'))||(tour_flag == ~getTourFlagByKey('fc'))}}title="不允许变更乘车人信息"{{else}}{{/if}}><div class="pos-rel"><input onkeyup="javascript:elemOnkeyupNotice(this);"  id="passenger_name_{{:#index+1}}" class="inptxt w110" value="{{>name}}"   {{if isDisabled || ~isCanAdd()=="N" ||(#data.ticket_type==2)}}  disabled="disabled" title="不允许变更乘车人信息"  {{else}} {{/if}}  size="12" maxlength="20"/><div class="w110-focus" id="passenger_name_{{:#index+1}}_notice"></div></div></td>
 
 
                        <td {{if (tour_flag == ~getTourFlagByKey('gc'))||(tour_flag == ~getTourFlagByKey('fc'))}}title="不允许变更乘车人信息"{{else}}{{/if}}><select id="passenger_id_type_{{:#index+1}}"  {{if isDisabled || ~isCanAdd()=="N" ||(#data.ticket_type==2)}}  disabled="disabled" title="不允许变更乘车人信息"  style="color:#999999"  {{else}} {{/if}} >
 
                       {{for cardTypes ~id_type_name=id_type_name}}
 
{{if id == #parent.parent.data.id_type}}
 
                <option value="{{>id}}" selected="selected" >{{if ~id_type_name ne ''}} {{>~id_type_name}} {{else}} {{>value}} {{/if}}</option>
 
            {{else  id!=#parent.parent.data.id_type}}
 
                 <option value="{{>id}}">{{>value}}</option>
 
            {{else}}
 
            {{/if}}
 
 
 
           {{else}}
 
           {{/for}}
 
        </select>
 
             </td>
 
<td {{if (tour_flag == ~getTourFlagByKey('gc'))||(tour_flag == ~getTourFlagByKey('fc'))}} title="不允许变更乘车人信息"{{else}}{{/if}}><div class="pos-rel"><input onkeyup="javascript:elemOnkeyupNotice(this);"  id="passenger_id_no_{{:#index+1}}" class="inptxt w160" value="{{>id_no}}"   {{if isDisabled || ~isCanAdd()=="N" ||(#data.ticket_type==2)}}  disabled="disabled" title="不允许变更乘车人信息"   {{else}} {{/if}}   size="20" maxlength="35"/><div class="w160-focus" id="passenger_id_no_{{:#index+1}}_notice"></div></div></td>
 
                        <td {{if (tour_flag == ~getTourFlagByKey('gc'))||(tour_flag == ~getTourFlagByKey('fc'))}} title="不允许变更乘车人信息"{{else}}{{/if}}><div class="pos-rel"><input  onkeyup="javascript:elemOnkeyupNotice(this);" id="phone_no_{{:#index+1}}" class="inptxt w110" value="{{>phone_no=='null'?'':phone_no}}"   {{if isDisabled || ~isCanAdd()=="N" ||(#data.ticket_type==2)}} title="不允许变更乘车人信息"  disabled="disabled"   {{else}} {{/if}}  size="11" maxlength="20"  /><div class="w160-focus" id="phone_no_{{:#index+1}}_notice"></div></div></td>
 
 
 
{{if tour_flag == ~getTourFlagByKey('gc') }}
<td>
    <input id="save_{{:#parent.index+1}}" onclick="javascript:updateAllCheckBox()" type="checkbox" class="check"  {{>#parent.data.save_status}}    />
     {{if ~isChangeStation() }}
                变更到站
     {{else}}
               改签
     {{/if}}
 
</td>
            {{else  tour_flag==~getTourFlagByKey('fc')}}
<td>
            <input id="save_{{:#parent.index+1}}" onclick="javascript:updateAllCheckBox()" type="checkbox" class="check"  {{>#parent.data.save_status}} />
 
                返程
</td>
            {{else}}
 
 
            {{else}}
 
            {{/if}}
{{if (tour_flag ==  ~getTourFlagByKey('dc')  || tour_flag  == ~getTourFlagByKey('wc')) && (#data.id_no!="") && (#data.ticket_type==1|| #data.ticket_type==4) }}
    <td title="添加儿童票">
        <a href="javascript:" onClick="javascript:addChildPassengerInfo(this);" id="addchild_{{:#parent.index+1}}" name="addchild_{{>only_id}}">添加儿童票
        </a>
 
    </td>
{{else}}
    <td style="width:40;">
        <a href="javascript:" id="addchild_{{:#parent.index+1}}" name="addchild_{{>only_id}}"></a>
    </td>
{{/if}}
 
{{if tour_flag ==  ~getTourFlagByKey('dc')  || tour_flag  == ~getTourFlagByKey('wc') }}
 
<td {{if (tour_flag == ~getTourFlagByKey('dc'))||(tour_flag == ~getTourFlagByKey('wc'))}}title="删除常用联系人"{{else}}{{/if}}>
 
 <span    class="i-del"  onClick="javascript:delPassengerInfo(this);" id="del_{{:#parent.index+1}}_{{>only_id}}" ></span>
 
</td>
{{else}}
<td style="display:none;">
 
 <span  id="del_{{:#parent.index+1}}_{{>only_id}}" ></span>
 
</td>
{{/if}}
 
        </tr>
 
   <tr id="tr_id_{{:#index+1}}_check" class="tips"  style="display:none" >
 
                    <td colspan="1">&nbsp;</td>
 
                    <td colspan="2"><span class="txt-wrong" style="display:none" id="seatType_{{:#index+1}}_check">请输入旅客姓名</span></td>
 
                    <td colspan="2"><span class="txt-wrong" style="display:none" id="passenger_name_{{:#index+1}}_check">请输入旅客姓名</span></td>
 
                    <td colspan="1"><span class="txt-wrong" style="display:none" id="passenger_id_no_{{:#index+1}}_check">请输入旅客姓名</span></td>
 
                    <td colspan="3"><span class="txt-wrong" style="display:none" id="phone_no_{{:#index+1}}_check">请输入旅客姓名</span></td>
 
  </tr>
 
-->
</script>
<script id="ticketInfoTemplateForTrms" type="text/x-jsrender" xml:space="preserve"><!--
 
<tr id="tr_id_{{:#index+1}}">
                <td align="center">{{:#index+1}}</td>
 
                        <td {{if (tour_flag == ~getTourFlagByKey('gc'))||(tour_flag == ~getTourFlagByKey('fc'))}} title="不允许变更票种信息" {{else}}{{/if}}>
 
    <select id="ticketType_{{:#index+1}}" name="confirmTicketType" onchange="javascript:updateSeatTypeByeTickeType(this);" {{if (tour_flag == ~getTourFlagByKey('gc') || tour_flag ==~getTourFlagByKey('fc')) ||isAccompanyChild }} {{if isDisabled}}  disabled="disabled" style="color:#999999"{{else}}{{/if}}{{else}}{{/if}} >
 
                          {{for ticketTypes}}
 
             {{if id==#parent.parent.data.ticket_type&&(#parent.parent.parent.data.IsStudentDate==true||id!=3)}}
                <option name="ticket_type_option" value="{{>id}}" selected="selected" >{{>value}}</option>
            {{else  id!=#parent.parent.data.ticket_type||id==3}}
 
                 <option value="{{>id}}">{{>value}} </option>
 
            {{else}}
 
            {{/if}}
 
 
 
            {{else}}
 
            {{/for}}
 
</select>
 
                        </td>
 
            <td><div class="seat-select">
                </div>
            </td>
 
                        <td {{if (tour_flag == ~getTourFlagByKey('gc'))||(tour_flag == ~getTourFlagByKey('fc'))}}title="不允许变更乘车人信息"{{else}}{{/if}}><div class="pos-rel"><input onkeyup="javascript:elemOnkeyupNotice(this);"  id="passenger_name_{{:#index+1}}" class="inptxt w110" value="{{>name}}"   {{if isDisabled || ~isCanAdd()=="N" ||(#data.ticket_type==2)}}  disabled="disabled" title="不允许变更乘车人信息"  {{else}} {{/if}}  size="12" maxlength="20"/><div class="w110-focus" id="passenger_name_{{:#index+1}}_notice"></div></div></td>
 
 
                        <td {{if (tour_flag == ~getTourFlagByKey('gc'))||(tour_flag == ~getTourFlagByKey('fc'))}}title="不允许变更乘车人信息"{{else}}{{/if}}><select id="passenger_id_type_{{:#index+1}}"  {{if isDisabled || ~isCanAdd()=="N" ||(#data.ticket_type==2)}}  disabled="disabled" title="不允许变更乘车人信息"  style="color:#999999"  {{else}} {{/if}} >
 
                       {{for cardTypes ~id_type_name=id_type_name}}
 
{{if id == #parent.parent.data.id_type}}
 
                <option value="{{>id}}" selected="selected" >{{if ~id_type_name ne ''}} {{>~id_type_name}} {{else}} {{>value}} {{/if}}</option>
 
            {{else  id!=#parent.parent.data.id_type}}
 
                 <option value="{{>id}}">{{>value}}</option>
 
            {{else}}
 
            {{/if}}
 
 
 
           {{else}}
 
           {{/for}}
 
        </select>
 
             </td>
 
<td {{if (tour_flag == ~getTourFlagByKey('gc'))||(tour_flag == ~getTourFlagByKey('fc'))}} title="不允许变更乘车人信息"{{else}}{{/if}}><div class="pos-rel"><input onkeyup="javascript:elemOnkeyupNotice(this);"  id="passenger_id_no_{{:#index+1}}" class="inptxt w160" value="{{>id_no}}"   {{if isDisabled || ~isCanAdd()=="N" ||(#data.ticket_type==2)}}  disabled="disabled" title="不允许变更乘车人信息"   {{else}} {{/if}}   size="20" maxlength="35"/><div class="w160-focus" id="passenger_id_no_{{:#index+1}}_notice"></div></div></td>
 
                        <td {{if (tour_flag == ~getTourFlagByKey('gc'))||(tour_flag == ~getTourFlagByKey('fc'))}} title="不允许变更乘车人信息"{{else}}{{/if}}><div class="pos-rel"><input  onkeyup="javascript:elemOnkeyupNotice(this);" id="phone_no_{{:#index+1}}" class="inptxt w110" value="{{>phone_no=='null'?'':phone_no}}"   {{if isDisabled || ~isCanAdd()=="N" ||(#data.ticket_type==2)}} title="不允许变更乘车人信息"  disabled="disabled"   {{else}} {{/if}}  size="11" maxlength="20"  /><div class="w160-focus" id="phone_no_{{:#index+1}}_notice"></div></div></td>
 
 
 
{{if tour_flag == ~getTourFlagByKey('gc') }}
<td>
    <input id="save_{{:#parent.index+1}}" onclick="javascript:updateAllCheckBox()" type="checkbox" class="check"  {{>#parent.data.save_status}}    />
     {{if ~isChangeStation() }}
                变更到站
     {{else}}
               改签
     {{/if}}
 
</td>
            {{else  tour_flag==~getTourFlagByKey('fc')}}
<td>
            <input id="save_{{:#parent.index+1}}" onclick="javascript:updateAllCheckBox()" type="checkbox" class="check"  {{>#parent.data.save_status}} />
 
                返程
</td>
            {{else}}
 
 
            {{else}}
 
            {{/if}}
{{if (tour_flag ==  ~getTourFlagByKey('dc')  || tour_flag  == ~getTourFlagByKey('wc')) && (#data.id_no!="") && (#data.ticket_type==1|| #data.ticket_type==4) }}
    <td title="添加儿童票">
        <a href="javascript:" onClick="javascript:addChildPassengerInfo(this);" id="addchild_{{:#parent.index+1}}" name="addchild_{{>only_id}}">添加儿童票
        </a>
 
    </td>
{{else}}
    <td style="width:40;">
        <a href="javascript:" id="addchild_{{:#parent.index+1}}" name="addchild_{{>only_id}}"></a>
    </td>
{{/if}}
 
{{if tour_flag ==  ~getTourFlagByKey('dc')  || tour_flag  == ~getTourFlagByKey('wc') }}
 
<td {{if (tour_flag == ~getTourFlagByKey('dc'))||(tour_flag == ~getTourFlagByKey('wc'))}}title="删除常用联系人"{{else}}{{/if}}>
 
 <span    class="i-del"  onClick="javascript:delPassengerInfo(this);" id="del_{{:#parent.index+1}}_{{>only_id}}" ></span>
 
</td>
{{else}}
<td style="display:none;">
 
 <span  id="del_{{:#parent.index+1}}_{{>only_id}}" ></span>
 
</td>
{{/if}}
 
        </tr>
 
   <tr id="tr_id_{{:#index+1}}_check" class="tips"  style="display:none" >
 
                    <td colspan="1">&nbsp;</td>
 
                    <td colspan="2"><span class="txt-wrong" style="display:none" id="seatType_{{:#index+1}}_check">请输入旅客姓名</span></td>
 
                    <td colspan="2"><span class="txt-wrong" style="display:none" id="passenger_name_{{:#index+1}}_check">请输入旅客姓名</span></td>
 
                    <td colspan="1"><span class="txt-wrong" style="display:none" id="passenger_id_no_{{:#index+1}}_check">请输入旅客姓名</span></td>
 
                    <td colspan="3"><span class="txt-wrong" style="display:none" id="phone_no_{{:#index+1}}_check">请输入旅客姓名</span></td>
 
  </tr>
 
-->
</script>
<script id="oldTicketInfoForGcTemplate" type="text/x-jsrender" xml:space="preserve"><!--
<tr>
<td>{{:#index+1}}</td>
 
<td>{{>train_date}}  {{>start_time}}开<br />{{>station_train_code}}{{>from_station}}-{{>to_station}}</td>
 
<td>{{>seat_type_name}} {{>coach_name}}车厢<br />{{>seat_name}} </td>
 
<td>{{>passenger_name}}<br />{{>id_type_name}}</td>
 
<td>{{>ticket_type_name}}<br /><span class="colorA">{{>ticket_price}}元</span></td>
 
</tr>
 
-->
</script>
 
```

# /otn/confirmPassenger/getPassengerDTOs

## 输入

```
POST /otn/confirmPassenger/getPassengerDTOs HTTP/1.1
Host: kyfw.12306.cn
Connection: keep-alive
Content-Length: 63
Accept: */*
Origin: https://kyfw.12306.cn
X-Requested-With: XMLHttpRequest
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.157 Safari/537.36
Content-Type: application/x-www-form-urlencoded; charset=UTF-8
Referer: https://kyfw.12306.cn/otn/confirmPassenger/initDc
Accept-Encoding: gzip, deflate, br
Accept-Language: zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,ja;q=0.6
Cookie: JSESSIONID=17D2A5B49CB312109D036040D8EF5154; tk=c9g0-ECRWXRzrVzAM9mty3IEo020ratnKtn-76pLPh4ij1110; _jc_save_toStation=%u5B81%u6CE2%2CNGH; _jc_save_wfdc_flag=dc; BIGipServerotn=619708938.64545.0000; RAIL_EXPIRATION=1558445401115; RAIL_DEVICEID=ojOchhXouyQKkRIDOIOEYE223_WcKcaOuF-_z82P-CYHNuKQOQA6fkynsTMigwJkqEHRabHNmpVRc0I8wVMQioy8eY2wYFbmATsvNP5SRPVofNqBITahBMUmcv5zPO3WcdwpO4jr6MtgbmqT1knkYn0qBbUShMDp; BIGipServerpool_passport=351076874.50215.0000; route=6f50b51faa11b987e576cdb301e545c4; _jc_save_toDate=2019-05-18; _jc_save_fromDate=2019-05-25; _jc_save_fromStation=%u676D%u5DDE%2CHGH
 
_json_att=&REPEAT_SUBMIT_TOKEN=6d946b88192ceddadccb285f84a74a2b
```

 

## 输出

```
{
    "validateMessagesShowId": "_validatorMessage",
    "status": true,
    "httpstatus": 200,
    "data": {
        "notify_for_gat": "",
        "isExist": true,
        "exMsg": "",
        "two_isOpenClick": ["93", "95", "97", "99"],
        "other_isOpenClick": ["91", "93", "98", "99", "95", "97"],
        "normal_passengers": [{
            "code": "5",
            "passenger_name": "周靖峰",
            "sex_code": "M",
            "sex_name": "男",
            "born_date": "1990-08-15 00:00:00",
            "country_code": "CN",
            "passenger_id_type_code": "1",
            "passenger_id_type_name": "中国居民身份证",
            "passenger_id_no": "330205199008150338",
            "passenger_type": "1",
            "passenger_flag": "0",
            "passenger_type_name": "成人",
            "mobile_no": "15158037019",
            "phone_no": "",
            "email": "zhoujingfeng0338@sina.com",
            "address": "",
            "postalcode": "",
            "first_letter": "",
            "recordCount": "6",
            "total_times": "99",
            "index_id": "0",
            "gat_born_date": "",
            "gat_valid_date_start": "",
            "gat_valid_date_end": "",
            "gat_version": ""
        }, {
            "code": "1",
            "passenger_name": "冯林林",
            "sex_code": "M",
            "sex_name": "男",
            "born_date": "1991-04-23 00:00:00",
            "country_code": "CN",
            "passenger_id_type_code": "1",
            "passenger_id_type_name": "中国居民身份证",
            "passenger_id_no": "33900519910423511X",
            "passenger_type": "1",
            "passenger_flag": "0",
            "passenger_type_name": "成人",
            "mobile_no": "",
            "phone_no": "",
            "email": "",
            "address": "",
            "postalcode": "",
            "first_letter": "FLL",
            "recordCount": "6",
            "total_times": "99",
            "index_id": "1",
            "gat_born_date": "",
            "gat_valid_date_start": "",
            "gat_valid_date_end": "",
            "gat_version": ""
        }, {
            "code": "2",
            "passenger_name": "孙卫玉",
            "sex_code": "F",
            "sex_name": "女",
            "born_date": "1966-05-18 00:00:00",
            "country_code": "CN",
            "passenger_id_type_code": "1",
            "passenger_id_type_name": "中国居民身份证",
            "passenger_id_no": "330205196605183943",
            "passenger_type": "1",
            "passenger_flag": "0",
            "passenger_type_name": "成人",
            "mobile_no": "15558283911",
            "phone_no": "",
            "email": "",
            "address": "",
            "postalcode": "",
            "first_letter": "SWY",
            "recordCount": "6",
            "total_times": "99",
            "index_id": "2",
            "gat_born_date": "",
            "gat_valid_date_start": "",
            "gat_valid_date_end": "",
            "gat_version": ""
        }, {
            "code": "3",
            "passenger_name": "唐媛媛",
            "sex_code": "F",
            "sex_name": "女",
            "born_date": "1970-01-01 00:00:00",
            "country_code": "CN",
            "passenger_id_type_code": "1",
            "passenger_id_type_name": "中国居民身份证",
            "passenger_id_no": "340823199006252522",
            "passenger_type": "1",
            "passenger_flag": "0",
            "passenger_type_name": "成人",
            "mobile_no": "",
            "phone_no": "",
            "email": "",
            "address": "",
            "postalcode": "",
            "first_letter": "TYY",
            "recordCount": "6",
            "total_times": "99",
            "index_id": "3",
            "gat_born_date": "",
            "gat_valid_date_start": "",
            "gat_valid_date_end": "",
            "gat_version": ""
        }, {
            "code": "4",
            "passenger_name": "王保霞",
            "sex_code": "F",
            "sex_name": "女",
            "born_date": "1970-01-01 00:00:00",
            "country_code": "CN",
            "passenger_id_type_code": "1",
            "passenger_id_type_name": "中国居民身份证",
            "passenger_id_no": "340827199008241064",
            "passenger_type": "1",
            "passenger_flag": "0",
            "passenger_type_name": "成人",
            "mobile_no": "",
            "phone_no": "",
            "email": "",
            "address": "",
            "postalcode": "",
            "first_letter": "WBX",
            "recordCount": "6",
            "total_times": "99",
            "index_id": "4",
            "gat_born_date": "",
            "gat_valid_date_start": "",
            "gat_valid_date_end": "",
            "gat_version": ""
        }, {
            "code": "6",
            "passenger_name": "周信德",
            "sex_code": "",
            "born_date": "2018-08-29 00:00:00",
            "country_code": "CN",
            "passenger_id_type_code": "1",
            "passenger_id_type_name": "中国居民身份证",
            "passenger_id_no": "330205196307190010",
            "passenger_type": "1",
            "passenger_flag": "0",
            "passenger_type_name": "成人",
            "mobile_no": "",
            "phone_no": "",
            "email": "",
            "address": "",
            "postalcode": "",
            "first_letter": "ZXD",
            "recordCount": "6",
            "total_times": "95",
            "index_id": "5",
            "gat_born_date": "",
            "gat_valid_date_start": "",
            "gat_valid_date_end": "",
            "gat_version": ""
        }],
        "dj_passengers": []
    },
    "messages": [],
    "validateMessages": {}
}
```

# /otn/confirmPassenger/checkOrderInfo

## 输入

```
POST /otn/confirmPassenger/checkOrderInfo HTTP/1.1
Host: kyfw.12306.cn
Connection: keep-alive
Content-Length: 341
Accept: application/json, text/javascript, */*; q=0.01
Origin: https://kyfw.12306.cn
X-Requested-With: XMLHttpRequest
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.157 Safari/537.36
Content-Type: application/x-www-form-urlencoded; charset=UTF-8
Referer: https://kyfw.12306.cn/otn/confirmPassenger/initDc
Accept-Encoding: gzip, deflate, br
Accept-Language: zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,ja;q=0.6
Cookie: JSESSIONID=17D2A5B49CB312109D036040D8EF5154; tk=c9g0-ECRWXRzrVzAM9mty3IEo020ratnKtn-76pLPh4ij1110; _jc_save_toStation=%u5B81%u6CE2%2CNGH; _jc_save_wfdc_flag=dc; BIGipServerotn=619708938.64545.0000; RAIL_EXPIRATION=1558445401115; RAIL_DEVICEID=ojOchhXouyQKkRIDOIOEYE223_WcKcaOuF-_z82P-CYHNuKQOQA6fkynsTMigwJkqEHRabHNmpVRc0I8wVMQioy8eY2wYFbmATsvNP5SRPVofNqBITahBMUmcv5zPO3WcdwpO4jr6MtgbmqT1knkYn0qBbUShMDp; BIGipServerpool_passport=351076874.50215.0000; route=6f50b51faa11b987e576cdb301e545c4; _jc_save_toDate=2019-05-18; _jc_save_fromDate=2019-05-25; _jc_save_fromStation=%u676D%u5DDE%2CHGH
 
cancel_flag=2&bed_level_order_num=000000000000000000000000000000&passengerTicketStr=O%2C0%2C1%2C%E5%91%A8%E9%9D%96%E5%B3%B0%2C1%2C330205199008150338%2C15158037019%2CN&oldPassengerStr=%E5%91%A8%E9%9D%96%E5%B3%B0%2C1%2C330205199008150338%2C1_&tour_flag=dc&randCode=&whatsSelect=1&_json_att=&REPEAT_SUBMIT_TOKEN=6d946b88192ceddadccb285f84a74a2b
```

 

## 输出

```
{
    "validateMessagesShowId": "_validatorMessage",
    "status": true,
    "httpstatus": 200,
    "data": {
        "ifShowPassCode": "N",
        "canChooseBeds": "N",
        "canChooseSeats": "Y",
        "choose_Seats": "OM",
        "isCanChooseMid": "N",
        "ifShowPassCodeTime": "1",
        "submitStatus": true,
        "smokeStr": ""
    },
    "messages": [],
    "validateMessages": {}
}
```

# /otn/confirmPassenger/getQueueCount

## 输入

```
POST /otn/confirmPassenger/getQueueCount HTTP/1.1
Host: kyfw.12306.cn
Connection: keep-alive
Content-Length: 375
Accept: application/json, text/javascript, */*; q=0.01
Origin: https://kyfw.12306.cn
X-Requested-With: XMLHttpRequest
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.157 Safari/537.36
Content-Type: application/x-www-form-urlencoded; charset=UTF-8
Referer: https://kyfw.12306.cn/otn/confirmPassenger/initDc
Accept-Encoding: gzip, deflate, br
Accept-Language: zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,ja;q=0.6
Cookie: JSESSIONID=17D2A5B49CB312109D036040D8EF5154; tk=c9g0-ECRWXRzrVzAM9mty3IEo020ratnKtn-76pLPh4ij1110; _jc_save_toStation=%u5B81%u6CE2%2CNGH; _jc_save_wfdc_flag=dc; BIGipServerotn=619708938.64545.0000; RAIL_EXPIRATION=1558445401115; RAIL_DEVICEID=ojOchhXouyQKkRIDOIOEYE223_WcKcaOuF-_z82P-CYHNuKQOQA6fkynsTMigwJkqEHRabHNmpVRc0I8wVMQioy8eY2wYFbmATsvNP5SRPVofNqBITahBMUmcv5zPO3WcdwpO4jr6MtgbmqT1knkYn0qBbUShMDp; BIGipServerpool_passport=351076874.50215.0000; route=6f50b51faa11b987e576cdb301e545c4; _jc_save_toDate=2019-05-18; _jc_save_fromDate=2019-05-25; _jc_save_fromStation=%u676D%u5DDE%2CHGH
 
train_date=Sat+May+25+2019+00%3A00%3A00+GMT%2B0800+(%E4%B8%AD%E5%9B%BD%E6%A0%87%E5%87%86%E6%97%B6%E9%97%B4)&train_no=770000D65805&stationTrainCode=D655&seatType=O&fromStationTelecode=HGH&toStationTelecode=NGH&leftTicket=D%252Be4vDwFvbLJVq%252FfJFeqiwe6nAC37KC1B0mzAYxo4LLPH3XN&purpose_codes=00&train_location=W2&_json_att=&REPEAT_SUBMIT_TOKEN=6d946b88192ceddadccb285f84a74a2b
```

 

## 输出

```
{
    "validateMessagesShowId": "_validatorMessage",
    "status": true,
    "httpstatus": 200,
    "data": {
        "count": "3",
        "ticket": "310,0",
        "op_2": "false",
        "countT": "0",
        "op_1": "true"
    },
    "messages": [],
    "validateMessages": {}
}
```

# /otn/confirmPassenger/confirmSingleForQueue

## 输入

```
POST /otn/confirmPassenger/confirmSingleForQueue HTTP/1.1
Host: kyfw.12306.cn
Connection: keep-alive
Content-Length: 500
Accept: application/json, text/javascript, */*; q=0.01
Origin: https://kyfw.12306.cn
X-Requested-With: XMLHttpRequest
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.157 Safari/537.36
Content-Type: application/x-www-form-urlencoded; charset=UTF-8
Referer: https://kyfw.12306.cn/otn/confirmPassenger/initDc
Accept-Encoding: gzip, deflate, br
Accept-Language: zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,ja;q=0.6
Cookie: JSESSIONID=17D2A5B49CB312109D036040D8EF5154; tk=c9g0-ECRWXRzrVzAM9mty3IEo020ratnKtn-76pLPh4ij1110; _jc_save_toStation=%u5B81%u6CE2%2CNGH; _jc_save_wfdc_flag=dc; BIGipServerotn=619708938.64545.0000; RAIL_EXPIRATION=1558445401115; RAIL_DEVICEID=ojOchhXouyQKkRIDOIOEYE223_WcKcaOuF-_z82P-CYHNuKQOQA6fkynsTMigwJkqEHRabHNmpVRc0I8wVMQioy8eY2wYFbmATsvNP5SRPVofNqBITahBMUmcv5zPO3WcdwpO4jr6MtgbmqT1knkYn0qBbUShMDp; BIGipServerpool_passport=351076874.50215.0000; route=6f50b51faa11b987e576cdb301e545c4; _jc_save_toDate=2019-05-18; _jc_save_fromDate=2019-05-25; _jc_save_fromStation=%u676D%u5DDE%2CHGH
 
passengerTicketStr=O%2C0%2C1%2C%E5%91%A8%E9%9D%96%E5%B3%B0%2C1%2C330205199008150338%2C15158037019%2CN&oldPassengerStr=%E5%91%A8%E9%9D%96%E5%B3%B0%2C1%2C330205199008150338%2C1_&randCode=&purpose_codes=00&key_check_isChange=6EA22D0407A1115A91DD5C4BD6F07AE5ECF33A7794E22EC55AD1DBAC&leftTicketStr=D%252Be4vDwFvbLJVq%252FfJFeqiwe6nAC37KC1B0mzAYxo4LLPH3XN&train_location=W2&choose_seats=1F&seatDetailType=000&whatsSelect=1&roomType=00&dwAll=N&_json_att=&REPEAT_SUBMIT_TOKEN=6d946b88192ceddadccb285f84a74a2b
```

 

## 输出

```
{
    "validateMessagesShowId": "_validatorMessage",
    "status": true,
    "httpstatus": 200,
    "data": {
        "submitStatus": true
    },
    "messages": [],
    "validateMessages": {}
}
```

# /otn/confirmPassenger/queryOrderWaitTime

## 输入

```
GET /otn/confirmPassenger/queryOrderWaitTime?random=1558182616304&tourFlag=dc&_json_att=&REPEAT_SUBMIT_TOKEN=6d946b88192ceddadccb285f84a74a2b HTTP/1.1
Host: kyfw.12306.cn
Connection: keep-alive
Accept: application/json, text/javascript, */*; q=0.01
X-Requested-With: XMLHttpRequest
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.157 Safari/537.36
Referer: https://kyfw.12306.cn/otn/confirmPassenger/initDc
Accept-Encoding: gzip, deflate, br
Accept-Language: zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,ja;q=0.6
Cookie: JSESSIONID=17D2A5B49CB312109D036040D8EF5154; tk=c9g0-ECRWXRzrVzAM9mty3IEo020ratnKtn-76pLPh4ij1110; _jc_save_toStation=%u5B81%u6CE2%2CNGH; _jc_save_wfdc_flag=dc; BIGipServerotn=619708938.64545.0000; RAIL_EXPIRATION=1558445401115; RAIL_DEVICEID=ojOchhXouyQKkRIDOIOEYE223_WcKcaOuF-_z82P-CYHNuKQOQA6fkynsTMigwJkqEHRabHNmpVRc0I8wVMQioy8eY2wYFbmATsvNP5SRPVofNqBITahBMUmcv5zPO3WcdwpO4jr6MtgbmqT1knkYn0qBbUShMDp; BIGipServerpool_passport=351076874.50215.0000; route=6f50b51faa11b987e576cdb301e545c4; _jc_save_toDate=2019-05-18; _jc_save_fromDate=2019-05-25; _jc_save_fromStation=%u676D%u5DDE%2CHGH
 
 
```

 

## 输出

```
{
    "validateMessagesShowId": "_validatorMessage",
    "status": true,
    "httpstatus": 200,
    "data": {
        "queryOrderWaitTimeStatus": true,
        "count": 0,
        "waitTime": 75,
        "requestId": 6535491582148718991,
        "waitCount": 815,
        "tourFlag": "dc",
        "orderId": null
    },
    "messages": [],
    "validateMessages": {}
}
```

# /otn/confirmPassenger/resultOrderForDcQueue

## 输入

```
POST /otn/confirmPassenger/resultOrderForDcQueue HTTP/1.1
Host: kyfw.12306.cn
Connection: keep-alive
Content-Length: 91
Accept: application/json, text/javascript, */*; q=0.01
Origin: https://kyfw.12306.cn
X-Requested-With: XMLHttpRequest
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.157 Safari/537.36
Content-Type: application/x-www-form-urlencoded; charset=UTF-8
Referer: https://kyfw.12306.cn/otn/confirmPassenger/initDc
Accept-Encoding: gzip, deflate, br
Accept-Language: zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,ja;q=0.6
Cookie: JSESSIONID=17D2A5B49CB312109D036040D8EF5154; tk=c9g0-ECRWXRzrVzAM9mty3IEo020ratnKtn-76pLPh4ij1110; _jc_save_toStation=%u5B81%u6CE2%2CNGH; _jc_save_wfdc_flag=dc; BIGipServerotn=619708938.64545.0000; RAIL_EXPIRATION=1558445401115; RAIL_DEVICEID=ojOchhXouyQKkRIDOIOEYE223_WcKcaOuF-_z82P-CYHNuKQOQA6fkynsTMigwJkqEHRabHNmpVRc0I8wVMQioy8eY2wYFbmATsvNP5SRPVofNqBITahBMUmcv5zPO3WcdwpO4jr6MtgbmqT1knkYn0qBbUShMDp; BIGipServerpool_passport=351076874.50215.0000; route=6f50b51faa11b987e576cdb301e545c4; _jc_save_toDate=2019-05-18; _jc_save_fromDate=2019-05-25; _jc_save_fromStation=%u676D%u5DDE%2CHGH
 
orderSequence_no=E899588728&_json_att=&REPEAT_SUBMIT_TOKEN=6d946b88192ceddadccb285f84a74a2b
```

 

## 输出

```
{
    "validateMessagesShowId": "_validatorMessage",
    "status": true,
    "httpstatus": 200,
    "data": {
        "submitStatus": true
    },
    "messages": [],
    "validateMessages": {}
}
```
