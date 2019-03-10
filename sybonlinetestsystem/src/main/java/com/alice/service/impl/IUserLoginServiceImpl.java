package com.alice.service.impl;

import com.alice.mapper.IUserAccountMapper;
import com.alice.service.IUserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IUserLoginServiceImpl implements IUserLoginService {

    @Autowired
    private IUserAccountMapper IUserAccountMapper;

    @Override
    public void verifyLoginUser(String number, String password) {
        IUserAccountMapper.verifyUserLogin(number, password);
    }
}
