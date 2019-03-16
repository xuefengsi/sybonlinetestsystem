package com.alice.service;

import com.alice.entity.AdminInfoEntity;

public interface IAdminInfoService {
    AdminInfoEntity getAdminInfoById(String adminNumber);
}
