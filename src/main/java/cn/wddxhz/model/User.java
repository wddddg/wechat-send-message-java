package cn.wddxhz.model;

import lombok.Data;

@Data
public class User {

    private Integer id;
    private String openid;
    private String sessionKey;
    private Integer messageCount;
}
