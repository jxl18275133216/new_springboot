package com.jxl.shabby_for_me.system.service;

import com.jxl.shabby_for_me.system.dao.SysDao;
import com.jxl.shabby_for_me.system.entity.User;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public interface SysService{
    User findById(Integer userid);
    User findByName(String username);
    void saveUser(User user);
}
