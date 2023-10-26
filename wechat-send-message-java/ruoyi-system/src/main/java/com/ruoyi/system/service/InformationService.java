package com.ruoyi.system.service;

import com.ruoyi.common.core.domain.entity.Information;
import com.ruoyi.common.core.domain.entity.Setmeal;

import java.util.List;

public interface InformationService {
    List<Setmeal> selectInformationDataList(Information information);
}
