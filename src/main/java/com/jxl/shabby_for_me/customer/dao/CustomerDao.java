package com.jxl.shabby_for_me.customer.dao;

import com.jxl.shabby_for_me.common.dao.BasicDao;
import com.jxl.shabby_for_me.customer.entity.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CustomerDao extends BasicDao<Customer> {
    Customer findCustomer(
            @Param("id")int id,
            @Param("Cname")String cname
    );
}
