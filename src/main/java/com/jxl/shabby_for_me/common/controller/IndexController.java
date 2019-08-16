package com.jxl.shabby_for_me.common.controller;

import com.jxl.shabby_for_me.common.untils.JsonResult;
import com.jxl.shabby_for_me.system.entity.User;
import com.jxl.shabby_for_me.system.service.SysUserService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(ModelMap map, HttpSession session){
        User user = (User)session.getAttribute("user");
        if (user == null){
            map.addAttribute("status","请登录");
        }else {
            map.addAttribute("status","已登录");
            map.addAttribute("user",user);
        }
        //检查登录状态
        return "index";
    }
    //在已登录状态下，跳转回首页
    @RequestMapping("/login.do")
    public String toLogin(HttpSession session, ModelMap map){
        User user = (User)session.getAttribute("user");
        if (user != null){
            map.addAttribute("user",user);
            return "index";
        }
        return "login";
    }
    @RequestMapping("/register.do")
    public String toRegister(HttpSession session,ModelMap map){
        User user = (User)session.getAttribute("user");
        if (user != null){
            map.addAttribute("user",user);
            return "index";
        }
        return "login";
    }
    @RequestMapping("/menu.do")
    public String toMenu(ModelMap map,HttpSession session){
        User user = (User)session.getAttribute("user");
        if (user != null)
        {
            map.addAttribute("user",user);
        }
        return "/user/menu";
    }
    //退出登录，清空session
    @RequestMapping("/clearSession.do")
    @ResponseBody
    public String clearSession(HttpSession session){
        session.invalidate();//使session无效化
        return "/";
    }
}
