package com.jxl.shabby_for_me.system.controller;

import com.jxl.shabby_for_me.system.entity.User;
import com.jxl.shabby_for_me.system.service.SysUserService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import jdk.internal.dynalink.linker.LinkerServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public String addUser(User user, HttpServletRequest request,ModelMap map){
        sysUserService.saveObject(user);
        HttpSession session = request.getSession();
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
    //查
    @RequestMapping("/findUser.do")
    @ResponseBody
    public List<User> findUser(User user){
        System.out.println(user.toString());
        List<User> users = sysUserService.findUserById(1);
        return users;
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
