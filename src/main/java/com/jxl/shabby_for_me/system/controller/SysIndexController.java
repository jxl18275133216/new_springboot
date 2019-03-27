package com.jxl.shabby_for_me.system.controller;

import com.jxl.shabby_for_me.system.entity.User;
import com.jxl.shabby_for_me.system.service.SysService;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
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
        if (user != null){
            username = user.getUsername();
            map.addAttribute("user",user);
        }else{
            username = "Guest";
        }
        return "index";
    }
    @RequestMapping("/regist.do")
    public String doSaveUser(ModelMap map){
        return "regist";
    }
    @RequestMapping("/login")
    public String toLogin(ModelMap map){
        return "login";
    }

    @RequestMapping(value = "/processRegist.do")
    public String doProcessRegistUser(User user,HttpSession session){
        sysService.saveUser(user);
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
