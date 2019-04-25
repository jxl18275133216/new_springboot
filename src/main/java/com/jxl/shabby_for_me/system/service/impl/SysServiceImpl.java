package com.jxl.shabby_for_me.system.service.impl;

import com.jxl.shabby_for_me.system.dao.SysUserDao;
import com.jxl.shabby_for_me.system.dao.SysDao;
import com.jxl.shabby_for_me.system.entity.User;
import com.jxl.shabby_for_me.system.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysServiceImpl implements SysUserService {
    @Resource
    private SysUserDao userDao;
    
    public User findById(Integer id){
        return userDao.findById(id);
    }
    public User findByName(String str1,String str2){
        return userDao.findByName(str1,str2);
    }
    public void insertUser(User user){
        if (userDao == null){
            System.out.println("userDao is null");
            return;
        }
        if (user == null){
            System.out.println("用户不能为空");
        }
        System.out.println("user:"+user.toString());
        userDao.insertUser(user);
        /*int i = userDao.insertUser(user);
        if (i == -1){
            System.out.println("新用户保存失败");
        }else{
            System.out.println("新用户保存成功");
        }*/
    }
    public List<User> findAllUser(){
       return userDao.findAll();
    }
}
