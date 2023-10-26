package com.ruoyi.system.service.impl;

import com.ruoyi.common.core.domain.entity.Information;
import com.ruoyi.common.core.domain.entity.Setmeal;
import com.ruoyi.system.mapper.InformationMapper;
import com.ruoyi.system.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformationServiceImpl implements InformationService {

    @Autowired
    private InformationMapper informationMapper;

    @Override
    public List<Setmeal> selectInformationDataList(Information information) {
        List<Setmeal> list = informationMapper.queryList(information);
        return list;
    }
}
