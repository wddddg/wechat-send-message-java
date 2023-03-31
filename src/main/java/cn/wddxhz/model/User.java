package cn.wddxhz.model;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private Integer id;
    private String openid;
    private String sessionKey;
    private Integer messageCount;
    private Date createTime;
    private Date updateTime;
    private String registerIp;
    private String lastRegisterIp;
}
