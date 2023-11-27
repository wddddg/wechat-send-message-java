package com.ruoyi.system.service.impl;

import com.ruoyi.common.core.domain.dto.WechatUserDTO;
import com.ruoyi.common.core.domain.entity.Setmeal;
import com.ruoyi.common.core.domain.entity.WechatUser;
import com.ruoyi.common.core.domain.vo.WechatUserRechargeVO;
import com.ruoyi.common.core.domain.vo.WechatUserVO;
import com.ruoyi.system.mapper.WechatUserMapper;
import com.ruoyi.system.service.WechatUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WechatUserServiceImpl implements WechatUserService {

    @Autowired
    private WechatUserMapper wechatUserMapper;

    @Override
    public List<WechatUserVO> getWechatUserList(WechatUserDTO wechatUserDTO) {
        List<WechatUserVO> list = wechatUserMapper.queryList(wechatUserDTO);
        return list;
    }

    @Override
    public List<WechatUserRechargeVO> getWechatUserRechargeRecord(WechatUserDTO wechatUserDTO) {
        List<WechatUserRechargeVO> list = wechatUserMapper.getWechatUserRechargeRecord(wechatUserDTO);
        return list;
    }
}
