package com.alice.controller;

import com.alice.service.IUserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 用户登录接口
 */
@Controller
@RequestMapping("/login")
public class UserLoginController {

    @Autowired
    private IUserLoginService IUserLoginService;

    @RequestMapping(value="/test",method= RequestMethod.POST)
    public String test() {
        System.out.println("调用接口成功");
        return "manage";
    }

}
