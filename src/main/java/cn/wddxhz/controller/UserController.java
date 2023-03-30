package cn.wddxhz.controller;


import cn.wddxhz.model.User;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;

@RestController
public class UserController {


    @Value("${wx.appid}")
    private String AppId = "";  // 公众平台自己的appId
    @Value("${wx.appsecret}")
    private String AppSecret = "";  // AppSecret
    @GetMapping("/login")
    public String wxLogin(@RequestParam("code") String code) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().set(1,new StringHttpMessageConverter(StandardCharsets.UTF_8));

        String url = "https://api.weixin.qq.com/sns/jscode2session?" +
                "appid=" + AppId +
                "&secret=" + AppSecret +
                "&js_code=" + code +
                "&grant_type=authorization_code";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.parseMediaType("application/json;charset=UTF-8"));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        String responseStr = response.getBody();
        JSONObject jsonObject = JSON.parseObject(responseStr);
        String accessToken = jsonObject.getString("session_key");
        String openid = jsonObject.getString("openid");



        return "123";
    }
}
