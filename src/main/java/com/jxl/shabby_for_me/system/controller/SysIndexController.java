package com.jxl.shabby_for_me.system.controller;

import com.jxl.shabby_for_me.system.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;

@Controller
public class SysIndexController {
    @RequestMapping("/")
    public String toIndex(ModelMap map){
        //加入属性，已在前端页面中获取
        return "index";
    }
    /*@RequestMapping(value = "/")
    public String toIndexWithUser(ModelMap map) {
        User user = new User();
        *//*user.setName("jxl");
        user.setAge(30);
        user.setAgent("man");*//*
        user = null;
        map.addAttribute("user",user);
        return "index.html";
    }*/
    public String toRegix(ModelMap map){
        return "Login";
    }
}
