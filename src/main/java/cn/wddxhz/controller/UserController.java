package cn.wddxhz.controller;


import cn.wddxhz.model.User;
import org.springframework.http.*;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;

@RestController
public class UserController {


    String AppId = "wx229364b9cd249db0";  // 公众平台自己的appId
    String AppSecret = "88e9347f534bdf2bbc9678b8a0d3542f";  // AppSecret
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
        response.getBody();
//        User user = new User();
//        user.setOpenid(response.openid);

        return "123";
    }
}
