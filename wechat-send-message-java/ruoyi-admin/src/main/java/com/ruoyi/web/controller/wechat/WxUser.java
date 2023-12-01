package com.ruoyi.web.controller.wechat;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.dto.WechatUserDTO;
import com.ruoyi.common.core.domain.entity.WechatUser;
import com.ruoyi.common.core.domain.vo.WechatUseConsumptionVO;
import com.ruoyi.common.core.domain.vo.WechatUserRechargeVO;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.system.service.WechatUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.ruoyi.common.utils.PageUtils.startPage;

@RestController("managementWechatUser")
@RequestMapping("/management/wechat-user")
@Api("微信用户管理")
public class WxUser extends BaseController {

    @Autowired
    private WechatUserService wechatUserService;



    @GetMapping("/list")
    @ApiOperation("微信用户查询")
    public TableDataInfo list(WechatUserDTO wechatUserDTO) {
        startPage();
        List<WechatUser> list = wechatUserService.getWechatUserList(wechatUserDTO);
        return getDataTable(list);
    }

    @PutMapping("/update")
    @ApiOperation("微信用户修改")
    public AjaxResult update(@RequestBody WechatUser wechatUser) {
        wechatUserService.updateWechaUser(wechatUser);
        return success();
    }

    @GetMapping("/recharge-record")
    @ApiOperation("微信用户充值记录")
    public TableDataInfo rechargeRecordList(WechatUserDTO wechatUserDTO) {
        startPage();
        List<WechatUserRechargeVO> list = wechatUserService.getWechatUserRechargeRecord(wechatUserDTO);
        return getDataTable(list);
    }

    @GetMapping("/consumption-record")
    @ApiOperation("微信用户充值记录")
    public TableDataInfo consumptionRecordList(WechatUserDTO wechatUserDTO) {
        startPage();
        List<WechatUseConsumptionVO> list = wechatUserService.getWechatUserConsumptionRecord(wechatUserDTO);
        return getDataTable(list);
    }

}
