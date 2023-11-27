package com.ruoyi.system.mapper;

import com.ruoyi.common.core.domain.dto.WechatUserDTO;
import com.ruoyi.common.core.domain.vo.WechatUserRechargeVO;
import com.ruoyi.common.core.domain.vo.WechatUserVO;

import java.util.List;

public interface WechatUserMapper {
    List<WechatUserVO> queryList(WechatUserDTO wechatUser);

    List<WechatUserRechargeVO> getWechatUserRechargeRecord(WechatUserDTO wechatUserDTO);
}
