package com.jxl.shabby_for_me.system.dao;

import com.jxl.shabby_for_me.common.dao.BasicDao;
import com.jxl.shabby_for_me.system.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface SysUserDao{
    int insertUser(User obj);
    List<User> findAll();
    User findById(
            @Param("id")Integer userid
    );
    User findByName(
            @Param("name")String username,
            @Param("pwd")String userpwd
    );
}
