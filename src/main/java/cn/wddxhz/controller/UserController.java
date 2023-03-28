package cn.wddxhz.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {


    String AppId = "";  // 公众平台自己的appId
    String AppSecret = "";  // AppSecret
    @GetMapping("/login")
    public String wxLogin(@RequestParam("code") String code) {
        String url = "https://api.weixin.qq.com/sns/jscode2session?" +
                "appid=" + AppId +
                "&secret=" + AppSecret +
                "&js_code=" + code +
                "&grant_type=authorization_code";
        return "123";
    }
}
