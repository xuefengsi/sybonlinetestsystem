package com.alice.service.impl;

import com.alice.mapper.IUserAccountMapper;
import com.alice.service.IUserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IUserLoginServiceImpl implements IUserLoginService {

    @Autowired
    private IUserAccountMapper userAccountMapper;

    @Override
    public Integer verifyLoginUser(String number, String password) {
        return  userAccountMapper.verifyUserLogin(number, password);
    }
}
