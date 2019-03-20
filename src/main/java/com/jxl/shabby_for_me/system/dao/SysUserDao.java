package com.jxl.shabby_for_me.system.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysUserDao<T> {
    int insertUser(T entity);
}
