package com.ruoyi.system.mapper;

import com.ruoyi.common.core.domain.entity.Information;
import com.ruoyi.common.core.domain.entity.Setmeal;

import java.util.List;

public interface InformationMapper {
    List<Setmeal> queryList(Information information);
}
