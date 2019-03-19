package com.jxl.shabby_for_me.system.service.impl;

import com.jxl.shabby_for_me.system.dao.SysDao;
import com.jxl.shabby_for_me.system.entity.User;
import com.jxl.shabby_for_me.system.service.SysService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class SysServiceImpl implements SysService {
    @Resource
    private SysDao dao;
    public User findById(Integer id){
        return dao.findById(id);
    }
    public User findByName(String str){
        return dao.findByName(str);
    }
}
