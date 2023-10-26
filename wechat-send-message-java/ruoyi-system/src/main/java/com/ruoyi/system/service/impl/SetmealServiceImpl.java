package com.ruoyi.system.service.impl;

import com.ruoyi.common.core.domain.entity.Setmeal;
import com.ruoyi.system.mapper.SetmealMapper;
import com.ruoyi.system.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SetmealServiceImpl implements SetmealService {

    @Autowired
    private SetmealMapper setmealMapper;

    @Override
    public List<Setmeal> selectSetmealDataList(Setmeal setmeal) {
        List<Setmeal> list = setmealMapper.queryList(setmeal);
        return list;
    }

    @Override
    public int insert(Setmeal setmeal) {
        int rows = setmealMapper.insertSetmeal(setmeal);
        return rows;
    }

    @Override
    public void update(Setmeal setmeal) {
        setmealMapper.updateSetmeal(setmeal);
    }

    @Override
    public void delete(Long[] ids) {
        setmealMapper.deleteSetmeal(ids);
    }
}
