package com.ruoyi.web.controller.setmeal;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.core.domain.entity.Setmeal;
import com.ruoyi.system.service.SetmealService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("managementSetmeal")
@RequestMapping("/setmeal")
@Api("套餐管理")
public class SetmealController extends BaseController {


    @Autowired
    private SetmealService setmealService;

    @GetMapping("/list")
    @ApiOperation("查询套餐列表")
    public TableDataInfo list(Setmeal setmeal)
    {
        startPage();
        List<Setmeal> list = setmealService.selectSetmealDataList(setmeal);
        return getDataTable(list);
    }

    @PostMapping("/add")
    @ApiOperation("新增套餐")
    public AjaxResult add(Setmeal setmeal)
    {
        setmeal.setCreateBy(getUsername());
        return toAjax(setmealService.insert(setmeal));
    }
}
