package com.alice.controller;

import com.alice.entity.AdminInfoEntity;
import com.alice.entity.UserAccountEntity;
import com.alice.service.IAdminInfoService;
import com.alice.service.IUserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户登录接口
 */
@Controller
@RequestMapping("/login")
public class UserLoginController {

    @Autowired
    private IUserLoginService userLoginService;

    @Autowired
    private IAdminInfoService adminInfoService;

    @RequestMapping(value="/verify",method= RequestMethod.POST)
    public String verify(HttpServletRequest request, Model model) {
        String number = request.getParameter("number");
        String password = request.getParameter("password");

        UserAccountEntity userInfo = userLoginService.verifyLoginUser(number, password);
        AdminInfoEntity admin = null;

        if (userInfo != null && userInfo.getNumber() != null && !userInfo.getNumber().isEmpty())
        {
            admin = adminInfoService.getAdminInfoById(number);
        }
        else
        {
            return "admin_not_found";
        }

        model.addAttribute("admin", admin);
        return "syb_manage";
    }

}
