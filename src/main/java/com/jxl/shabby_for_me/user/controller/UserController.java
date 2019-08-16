package com.jxl.shabby_for_me.user.controller;

import com.jxl.shabby_for_me.common.untils.JsonResult;
import com.jxl.shabby_for_me.user.entity.User;
import com.jxl.shabby_for_me.user.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping(value = "/addUser.do",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult addUser(HttpServletRequest request){
        String username = request.getParameter("username");
        String userpwd = request.getParameter("userpwd");
        System.out.println(username+userpwd);
        User user = new User();
        user.setUsername(username);
        user.setUserpwd(userpwd);
        user.setGrade(9);
        int a = userService.addUser(user);
        if (a < 0){
            return new JsonResult(new Throwable("Add New User Error"));
        }
        return new JsonResult();
    }
}
