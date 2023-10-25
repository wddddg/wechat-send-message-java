package com.ruoyi.system.service;

import com.ruoyi.common.core.domain.entity.Setmeal;

import java.util.List;

public interface SetmealService {
    List<Setmeal> selectSetmealDataList(Setmeal setmeal);

    int insert(Setmeal setmeal);

    void update(Setmeal setmeal);

    void delete(Long[] ids);
}
