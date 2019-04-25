package com.jxl.shabby_for_me.system.service;

import com.jxl.shabby_for_me.system.dao.SysDao;
import com.jxl.shabby_for_me.system.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public interface SysUserService {
    User findById(Integer userid);
    User findByName(String username,String userpwd);
    void insertUser(User user);
    List<User> findAllUser();
}
