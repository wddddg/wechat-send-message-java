package com.ruoyi.system.service;

import com.ruoyi.common.core.domain.entity.Information;

import java.util.List;

public interface InformationService {
    List<Information> selectInformationDataList(Information information);

    void delete(Long[] ids);

    void update(Information information);
}
