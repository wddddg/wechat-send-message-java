package com.ruoyi.system.mapper;

import com.ruoyi.common.core.domain.entity.Setmeal;
import com.ruoyi.common.enums.OperationType;
import com.ruoyi.system.annotation.AutoFill;

import java.util.List;

public interface SetmealMapper {
    List<Setmeal> queryList(Setmeal setmeal);

    @AutoFill(OperationType.INSERT)
    int insertSetmeal(Setmeal setmeal);

    @AutoFill(OperationType.UPDATE)
    int updateSetmeal(Setmeal setmeal);

    int deleteSetmeal(Long[] ids);
}
