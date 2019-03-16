package com.alice.mapper;

import com.alice.entity.AdminInfoEntity;

public interface IAdminInfoMapper {
    AdminInfoEntity getAdminInfoById(String adminNumber);
}
