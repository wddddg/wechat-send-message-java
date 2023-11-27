package com.ruoyi.system.service;

import com.ruoyi.common.core.domain.dto.WechatUserDTO;
import com.ruoyi.common.core.domain.entity.Information;
import com.ruoyi.common.core.domain.entity.Setmeal;
import com.ruoyi.common.core.domain.entity.WechatUser;
import com.ruoyi.common.core.domain.vo.WechatUserRechargeVO;
import com.ruoyi.common.core.domain.vo.WechatUserVO;

import java.util.List;

public interface WechatUserService {

    List<WechatUserVO> getWechatUserList(WechatUserDTO wechatUserDTO);

    List<WechatUserRechargeVO> getWechatUserRechargeRecord(WechatUserDTO wechatUserDTO);
}
