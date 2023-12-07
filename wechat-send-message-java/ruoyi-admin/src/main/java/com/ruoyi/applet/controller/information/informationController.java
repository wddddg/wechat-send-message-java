package com.ruoyi.applet.controller.information;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.Information;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.system.service.InformationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("appletInformation")
@RequestMapping("/applet/information")
@Api("信息管理")
public class informationController extends BaseController {


    @Autowired
    private InformationService informationService;

    @GetMapping("/list")
    @ApiOperation("查询用户信息列表")
    public TableDataInfo list(Information information)
    {
        startPage();
        List<Information> list = informationService.selectInformationDataListByUser(information);
        return getDataTable(list);
    }

    @GetMapping("/getInformationByPhone")
    @ApiOperation("查询手机号收到信息列表")
    public TableDataInfo getInformationByPhone(Information information)
    {
        startPage();
        List<Information> list = informationService.getInformationByPhone(information);
        return getDataTable(list);
    }

}
