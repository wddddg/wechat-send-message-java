package com.ruoyi.web.controller.information;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.Information;
import com.ruoyi.common.core.domain.entity.Setmeal;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.system.service.InformationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.ruoyi.common.utils.PageUtils.startPage;

@RestController("managementInformation")
@RequestMapping("/management/information")
@Api("信息管理")
public class informationController extends BaseController {


    @Autowired
    private InformationService informationService;

    @GetMapping("/list")
    @ApiOperation("查询信息列表")
    public TableDataInfo list(Information information)
    {
        startPage();
        List<Information> list = informationService.selectInformationDataList(information);
        return getDataTable(list);
    }

    @PutMapping("/update")
    @ApiOperation("修改信息")
    public AjaxResult update(@RequestBody Information information) {
        informationService.update(information);
        return success();
    }


    @DeleteMapping("/{ids}")
    @ApiOperation("删除信息")
    public AjaxResult delete(@PathVariable Long[] ids)
    {
        informationService.delete(ids);
        return success();
    }

}
