package com.jxl.shabby_for_me.system.controller;

import com.jxl.shabby_for_me.system.entity.User;
import com.jxl.shabby_for_me.system.service.SysUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class SysIndexController {
    @Resource
    private SysUserService sysUserService;
    @RequestMapping("/user")
    public String userMenu(){
        return "user/user";
    }
    @RequestMapping("/login.do")
    public String toLogin(ModelMap map){
        return "login";
    }
    @RequestMapping("/menu")
    public String toMenu(ModelMap map){
        return "menu";
    }

}
