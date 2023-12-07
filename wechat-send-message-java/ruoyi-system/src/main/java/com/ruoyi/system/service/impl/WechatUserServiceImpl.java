package com.ruoyi.system.service.impl;

import com.ruoyi.common.core.domain.dto.WechatUserDTO;
import com.ruoyi.common.core.domain.entity.WechatUser;
import com.ruoyi.common.core.domain.vo.WechatUseConsumptionVO;
import com.ruoyi.common.core.domain.vo.WechatUserRechargeVO;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.mapper.WechatUserMapper;
import com.ruoyi.system.service.WechatUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class WechatUserServiceImpl implements WechatUserService {

    @Autowired
    private WechatUserMapper wechatUserMapper;

    @Override
    public List<WechatUser> getWechatUserList(WechatUserDTO wechatUserDTO) {
        List<WechatUser> list = wechatUserMapper.queryList(wechatUserDTO);
        return list;
    }

    @Override
    public List<WechatUserRechargeVO> getWechatUserRechargeRecord(WechatUserDTO wechatUserDTO) {
        List<WechatUserRechargeVO> list = wechatUserMapper.getWechatUserRechargeRecord(wechatUserDTO);
        return list;
    }

    @Override
    public List<WechatUseConsumptionVO> getWechatUserConsumptionRecord(WechatUserDTO wechatUserDTO) {
        List<WechatUseConsumptionVO> list = wechatUserMapper.getWechatUserConsumptionRecord(wechatUserDTO);
        return list;
    }

    @Override
    @Transactional
    public void updateWechaUser(WechatUser wechatUser) {
        wechatUserMapper.updateWechatUser(wechatUser);
        wechatUserMapper.updateWechatUserBalance(wechatUser);
    }

    @Override
    public WechatUser getUserInfoByOpenId(String openid) {
        return wechatUserMapper.getUserInfoByOpenId(openid);
    }

    @Override
    public int addNewWehcatUser(WechatUser user) {
        user.setCreateTime(DateUtils.getNowDate());
        return wechatUserMapper.addNewWehcatUser(user);
    }
}
