package com.jxl.shabby_for_me.system.dao;

import com.jxl.shabby_for_me.common.dao.BasicDao;
import com.jxl.shabby_for_me.system.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysUserDao extends BasicDao<User> {

}
