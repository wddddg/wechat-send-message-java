package com.ruoyi.system.service;

import com.ruoyi.common.core.domain.dto.WechatUserDTO;
import com.ruoyi.common.core.domain.entity.WechatUser;
import com.ruoyi.common.core.domain.vo.WechatUseConsumptionVO;
import com.ruoyi.common.core.domain.vo.WechatUserRechargeVO;

import java.util.List;

public interface WechatUserService {

    List<WechatUser> getWechatUserList(WechatUserDTO wechatUserDTO);

    List<WechatUserRechargeVO> getWechatUserRechargeRecord(WechatUserDTO wechatUserDTO);

    List<WechatUseConsumptionVO> getWechatUserConsumptionRecord(WechatUserDTO wechatUserDTO);

    void updateWechaUser(WechatUser wechatUser);

    WechatUser getUserInfoByOpenId(String openid);
}
