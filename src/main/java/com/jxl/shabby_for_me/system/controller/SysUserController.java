package com.jxl.shabby_for_me.system.controller;

import com.jxl.shabby_for_me.system.entity.User;
import com.jxl.shabby_for_me.system.service.SysService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class SysUserController {
    @Resource
    private SysService sysService;
    @RequestMapping("saveUser.do")
    public String addUser(User user){
        sysService.saveUser(user);
        return "redirect:/";
    }
    @RequestMapping(value = "/processRegist.do")
    public String doProcessRegistUser(){

        return "redirect:/";
    }
    @RequestMapping("/processCheckRegist.do")
    @ResponseBody
    public User doCheckRegist(HttpServletRequest request){
        String username = request.getParameter("username");
        System.out.println("username:"+username);
        User user = sysService.findByName(username);
        System.out.println(user == null);
        if (user != null){
            return user;
        }else{
            return null;
        }
    }
}
