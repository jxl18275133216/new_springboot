package com.jxl.shabby_for_me.system.dao;

import com.jxl.shabby_for_me.common.dao.BasicDao;
import com.jxl.shabby_for_me.system.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface SysUserDao extends BasicDao<User>{
    int getRowCount(
            @Param("username")String username);
    List<User> findPageObjects(
            @Param("username")String username,
            @Param("stratIndex")Integer startIndex,
            @Param("pageSize")Integer pageSize
    );
    User findObjectById(
            @Param("id")Integer userid
    );
    User findObjectByName(
            @Param("username")String username,
            @Param("userpwd")String userpwd
    );
}
