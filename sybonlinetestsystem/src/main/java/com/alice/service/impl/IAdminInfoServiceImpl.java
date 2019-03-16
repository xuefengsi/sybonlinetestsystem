package com.alice.service.impl;

import com.alice.entity.AdminInfoEntity;
import com.alice.mapper.IAdminInfoMapper;
import com.alice.service.IAdminInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IAdminInfoServiceImpl implements IAdminInfoService {
    @Autowired
    private IAdminInfoMapper adminInfoMapper;

    @Override
    public AdminInfoEntity getAdminInfoById(String adminNumber) {
        return adminInfoMapper.getAdminInfoById(adminNumber);
    }
}
