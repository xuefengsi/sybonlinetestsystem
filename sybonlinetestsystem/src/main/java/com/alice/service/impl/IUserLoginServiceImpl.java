package com.alice.service.impl;

import com.alice.entity.UserAccountEntity;
import com.alice.mapper.IUserAccountMapper;
import com.alice.service.IUserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IUserLoginServiceImpl implements IUserLoginService {

    @Autowired
    private IUserAccountMapper userAccountMapper;

    @Override
    public UserAccountEntity verifyLoginUser(String number, String password) {
        return  userAccountMapper.verifyUserLogin(number, password);
    }
}
