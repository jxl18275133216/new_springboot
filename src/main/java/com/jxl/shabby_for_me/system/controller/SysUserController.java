package com.jxl.shabby_for_me.system.controller;

import com.jxl.shabby_for_me.common.untils.JsonResult;
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
    /*@Resource //Resource是J2EE的注解，默认按照名称自动装备BEAN
    private SysUserService sysUserService;
    //增
    @RequestMapping("/addUser.do")
    @ResponseBody
    public JsonResult addUser(String username,String userpwd,HttpSession session){
        User user = new User();
        user.setUsername(username);
        user.setUserpwd(userpwd);
        sysUserService.saveObject(user);
        session.setAttribute("user",user);
        return new JsonResult();
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
    public JsonResult findUser(String username,String userpwd,HttpServletRequest request){
        User user = sysUserService.findUserByName(username,userpwd);
        HttpSession session = request.getSession();
        if(user != null){
            session.setAttribute("user",user);
            return new JsonResult(user);
        }
        return new JsonResult();
    }
    */
}
