package com.jxl.shabby_for_me.system.controller;

import com.jxl.shabby_for_me.system.entity.User;
import com.jxl.shabby_for_me.system.service.SysService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

@Controller
public class SysIndexController {
    @Resource
    private SysService sysService ;
    @RequestMapping("/")
    public String toIndex(ModelMap map, HttpSession session){
        User user = (User) session.getAttribute("user");
        String username = "";
        if (user == null) {
            username = "admin";
            System.out.println("session-id:"+session.getId());
        }else{
            username = user.getUsername();
        }
        map.addAttribute("username",username);
        return "index";
    }
    @RequestMapping("/regist")
    public String toRegist(ModelMap map){
        return "regist";
    }
    @RequestMapping("/login")
    public String toLogin(ModelMap map){
        return "login";
    }
}
