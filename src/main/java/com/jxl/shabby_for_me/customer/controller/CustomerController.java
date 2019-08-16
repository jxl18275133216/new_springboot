package com.jxl.shabby_for_me.customer.controller;

import com.jxl.shabby_for_me.common.untils.JsonResult;
import com.jxl.shabby_for_me.customer.dao.CustomerDao;
import com.jxl.shabby_for_me.customer.entity.Customer;
import com.jxl.shabby_for_me.customer.service.CustomerService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Resource
    private CustomerService customerService;

    @RequestMapping("/addUser.do")
    @ResponseBody
    public JsonResult addCustomer(String cname,String cpassword,HttpServletRequest request){
        Customer customer = new Customer();
        customer.setCname(cname);
        customer.setCpassword(cpassword);
        customer.setGrade(9);//暂时默认所有访问者都是visitor
        System.out.println("cname="+cname+";cpassword="+cpassword);
        int a = customerService.addCustomer(customer);
        HttpSession session;
        if (a < 0){
            session = request.getSession();
            session.setAttribute("Custormer",customer);
            return new JsonResult(new Throwable("Add New Customer Error!"));
        }
        return new JsonResult();
    }
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public JsonResult login(HttpServletRequest request){
        return new JsonResult();
    }
}
