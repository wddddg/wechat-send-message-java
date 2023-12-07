package com.ruoyi.common.core.domain.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WechatUserVO {

    private static final long serialVersionUID = 1L;

    private Long id;

    //微信用户唯一标识
    private String openid;

    //手机号
    private String phone;

    //余额
    private double balance;

    //发送出的短信
    private Integer sendMessageNumber;

}
