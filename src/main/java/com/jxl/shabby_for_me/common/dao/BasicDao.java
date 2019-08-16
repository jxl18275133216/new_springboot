package com.jxl.shabby_for_me.common.dao;

public interface BasicDao<T> {
    //增
    int insertObject(T entity);
    //改
    int updateObject(T entity);
    //删
    int deleteObject(T entity);
}
