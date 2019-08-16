package com.jxl.shabby_for_me.user.service;

import com.jxl.shabby_for_me.user.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    int addUser(User user);
    int removeUser(User user);
    int modifyUser(User user);
    User findUser(
            @Param("id")int id,
            @Param("username")String username
    );
}
