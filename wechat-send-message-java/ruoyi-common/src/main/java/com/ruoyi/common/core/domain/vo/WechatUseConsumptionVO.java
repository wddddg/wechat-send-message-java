package com.ruoyi.common.core.domain.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WechatUseConsumptionVO extends BaseEntity {

    //用户id
    private Long userId;

    //用户姓名
    private String userName;

    //用户手机号
    private String userPhone;

    //用户头像
    private String userAvatar;

    //信息id
    private String informationId;

    //信息内容
    private String informationContent;

    //信息状态
    private String informationStatus;

    //消费金额
    private double amount;

    //充值时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
}
