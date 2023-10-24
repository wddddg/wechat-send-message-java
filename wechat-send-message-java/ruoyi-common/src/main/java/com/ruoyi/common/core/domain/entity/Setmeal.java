package com.ruoyi.common.core.domain.entity;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

import java.math.BigInteger;

@Data
public class Setmeal extends BaseEntity {

    private Integer id;

    private BigInteger price;

    private Integer number;

    private String remark;

    private Integer enable;

}
