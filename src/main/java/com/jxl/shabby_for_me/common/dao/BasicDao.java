package com.jxl.shabby_for_me.common.dao;

public interface BasicDao<T> {
    int insertObject(T obj);
    int deleteObject(T obj);
    int updateObject(T obj);
    Object findObject(T obj);
}
