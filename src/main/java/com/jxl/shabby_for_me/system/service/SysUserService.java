package com.jxl.shabby_for_me.system.service;

import com.jxl.shabby_for_me.system.dao.SysDao;
import com.jxl.shabby_for_me.system.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public interface SysUserService {
    void saveObject(User user);
    void removeObject(Integer userid);
    List<User> findUserById(Integer userid);
    User findUserByName(String username,String userpwd);
    Map<String,Object> findPageObject(String username,Integer currentPage);
}
