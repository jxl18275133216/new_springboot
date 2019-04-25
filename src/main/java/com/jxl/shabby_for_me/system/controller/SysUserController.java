package com.jxl.shabby_for_me.system.controller;

import com.jxl.shabby_for_me.system.entity.User;
import com.jxl.shabby_for_me.system.service.SysUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class SysUserController {
    @Resource
    private SysUserService sysUserService;
    //增
    @RequestMapping("addUser.do")
    public String addUser(User user){
        sysUserService.insertUser(user);
        //return "redirect:/";
        return "/findUser.do";
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
    public User findUser(User user){
        System.out.println(user.toString());
        User newUser = sysUserService.findByName(user.getUsername(),user.getUserpwd());
        System.out.println(newUser.toString());
        return newUser;
    }
    //
    @RequestMapping("/processRegist.do")
    public String doProcessRegistUser(User user){

        return "redirect:/";
    }
    @RequestMapping("/processCheckRegist.do")
    @ResponseBody
    public boolean doCheckRegist(String username,String userpwd){
        System.out.println(username);
        User user = sysUserService.findByName(username,userpwd);
        if (user != null){
            return false;
        }else{
            return true;
        }
    }
}
