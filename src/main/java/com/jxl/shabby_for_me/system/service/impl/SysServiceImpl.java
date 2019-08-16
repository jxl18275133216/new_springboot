package com.jxl.shabby_for_me.system.service.impl;

import com.jxl.shabby_for_me.system.dao.SysUserDao;
import com.jxl.shabby_for_me.system.entity.User;
import com.jxl.shabby_for_me.system.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class SysServiceImpl {
    /*@Resource
    private SysUserDao userDao;
    @Override
    public void saveObject(User user){
        try{
            if(user == null){
                throw new Exception("saveObject Error:user is null");
            }
            int result =  userDao.insertObject(user);
            if(result < 0){
                throw new Exception("saveObject Error:can not save user");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void removeObject(Integer userid){

    }
    @Override
    public List<User> findUserById(Integer userid){
        return null;
    }
    @Override
    public User findUserByName(String username,String userpwd){
        return userDao.findObjectByName(username,userpwd);
    };
    @Override
    public Map<String,Object> findPageObject(String username,Integer currentPage){
        return null;
    }
    @Override
    public void modifyUserInfo(User user){
        try{
            if (user == null){
                throw new Exception("Can;t modify information:user is null");
            }
            int result = userDao.insertObjectInfo(user);
            if(result == -1){
                throw new Exception("modify information of use failed:can't modify user information");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }*/
}
