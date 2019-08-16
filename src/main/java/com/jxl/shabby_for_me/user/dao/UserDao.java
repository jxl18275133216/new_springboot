package com.jxl.shabby_for_me.user.dao;

import com.jxl.shabby_for_me.common.dao.BasicDao;
import com.jxl.shabby_for_me.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserDao extends BasicDao<User> {
    int findUser(
            @Param("id")int id,
            @Param("username")String username
    );
}
