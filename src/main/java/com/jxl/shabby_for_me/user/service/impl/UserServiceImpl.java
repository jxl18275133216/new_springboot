package com.jxl.shabby_for_me.user.service.impl;

import com.jxl.shabby_for_me.user.dao.UserDao;
import com.jxl.shabby_for_me.user.entity.User;
import com.jxl.shabby_for_me.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao dao;
    @Override
    public int addUser(User user) {
        if (user == null ){
            return -1;
        }
        return dao.insertObject(user);
    }

    @Override
    public int modifyUser(User user) {
        return 0;
    }

    @Override
    public int removeUser(User user) {
        return 0;
    }

    @Override
    public User findUser(int id, String username) {
        return null;
    }
}
