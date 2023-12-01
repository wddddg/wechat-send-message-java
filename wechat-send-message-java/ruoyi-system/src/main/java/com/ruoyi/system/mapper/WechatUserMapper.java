package com.ruoyi.system.mapper;

import com.ruoyi.common.core.domain.dto.WechatUserDTO;
import com.ruoyi.common.core.domain.entity.WechatUser;
import com.ruoyi.common.core.domain.vo.WechatUseConsumptionVO;
import com.ruoyi.common.core.domain.vo.WechatUserRechargeVO;

import java.util.List;

public interface WechatUserMapper {
    List<WechatUser> queryList(WechatUserDTO wechatUser);

    List<WechatUserRechargeVO> getWechatUserRechargeRecord(WechatUserDTO wechatUserDTO);

    List<WechatUseConsumptionVO> getWechatUserConsumptionRecord(WechatUserDTO wechatUserDTO);

    void updateWechatUser(WechatUser wechatUser);

    void updateWechatUserBalance(WechatUser wechatUser);

    WechatUser getUserInfoByOpenId(String openid);
}
