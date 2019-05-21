package com.jxl.shabby_for_me.common.dao;

public interface BasicDao<T> {
    int insertObject(T entity);
    int updateObject(T entity);
}
