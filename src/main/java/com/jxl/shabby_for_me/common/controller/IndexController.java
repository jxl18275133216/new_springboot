package com.jxl.shabby_for_me.common.controller;

import com.jxl.shabby_for_me.system.entity.User;
import com.jxl.shabby_for_me.system.service.SysUserService;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(ModelMap map, HttpSession session){
        User user = (User)session.getAttribute("user");
        if (user == null){
            map.addAttribute("status","请登录");
        }else {
            System.out.println(user.toString());
            map.addAttribute("status","已登录");
            map.addAttribute("user",user);
        }
        //检查登录状态
        return "index";
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
