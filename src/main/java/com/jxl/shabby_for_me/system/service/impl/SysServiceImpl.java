package com.jxl.shabby_for_me.system.service.impl;

import com.jxl.shabby_for_me.system.dao.SysUserDao;
import com.jxl.shabby_for_me.system.dao.SysDao;
import com.jxl.shabby_for_me.system.entity.User;
import com.jxl.shabby_for_me.system.service.SysService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class SysServiceImpl implements SysService {
    @Resource
    private SysDao dao;
    @Resource
    private SysUserDao userDao;
    
    public User findById(Integer id){
        return dao.findById(id);
    }
    public User findByName(String str){
        return dao.findByName(str);
    }
    public void saveUser(User user){
        if (userDao == null){
            System.out.println("userDao is null");
            return;
        }
        if (user == null){
            System.out.println("用户不能为空");
        }
        userDao.insertUser(user);
        /*int i = userDao.insertUser(user);
        if (i == -1){
            System.out.println("新用户保存失败");
        }else{
            System.out.println("新用户保存成功");
        }*/
    }
}
