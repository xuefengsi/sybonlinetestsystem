package com.alice.service;

/**
 * 用户登录服务层
 */
public interface IUserLoginService {

    Integer verifyLoginUser(String number, String password);
}
