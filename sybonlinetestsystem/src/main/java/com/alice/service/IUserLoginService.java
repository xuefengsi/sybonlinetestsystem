package com.alice.service;

import com.alice.entity.UserAccountEntity;

/**
 * 用户登录服务层
 */
public interface IUserLoginService {

    UserAccountEntity verifyLoginUser(String number, String password);
}
