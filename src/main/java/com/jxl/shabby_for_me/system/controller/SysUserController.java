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
@RequestMapping("/user")
public class SysUserController {
    @Resource
    private SysService sysService;
    //增
    @RequestMapping("addUser.do")
    public String addUser(User user){
        sysService.addUser(user);
        return "redirect:/";
    }
    //删
    @RequestMapping("/deleteUser.do")
    public String deleteUser(){
        return "";
    }
    //改
    @RequestMapping("/modifyUser.do")
    public String modifyUser(){
        return "";
    }
    //查
    @RequestMapping("/findUser.do")
    @ResponseBody
    public User findUser(){
        User user = new User();
        user.setUsername("jiashunhao");
        user.setId(9999);
        user.setUserpwd("123456");
        user.setLevel(0);
        return user;
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
