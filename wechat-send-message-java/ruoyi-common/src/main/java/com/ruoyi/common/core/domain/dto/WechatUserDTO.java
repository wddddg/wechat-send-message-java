package com.ruoyi.common.core.domain.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

import java.util.Date;

@Data
public class WechatUserDTO extends BaseEntity {

    //用户名
    private String name;

    //手机号
    private String phone;

    //性别
    private String sex;

    //时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

}
