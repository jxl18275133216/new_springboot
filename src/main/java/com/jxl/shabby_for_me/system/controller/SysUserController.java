package com.jxl.shabby_for_me.system.controller;

import com.jxl.shabby_for_me.system.entity.User;
import com.jxl.shabby_for_me.system.service.SysUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class SysUserController {
    @Resource
    private SysUserService sysUserService;
    //增
    @RequestMapping("addUser.do")
    public String addUser(User user, HttpServletRequest request){
        HttpSession session = request.getSession();
        sysUserService.saveObject(user);
        session.setAttribute("user",user);
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
    //登录验证
    @RequestMapping("/findUser.do")
    @ResponseBody
    public User findUser(String username,String userpwd,HttpServletRequest request){
        User user = sysUserService.findUserByName(username,userpwd);
        HttpSession session = request.getSession();
        if(user != null){
            session.setAttribute("user",user);
            return user;
        }
        return null;
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
        List<User> users = sysUserService.findUserById(1);
        if (users != null){
            return false;
        }else{
            return true;
        }
    }
}
