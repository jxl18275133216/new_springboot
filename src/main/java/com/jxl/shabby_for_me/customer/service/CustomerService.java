package com.jxl.shabby_for_me.customer.service;

import com.jxl.shabby_for_me.customer.entity.Customer;
import org.springframework.stereotype.Service;

/**
 * 不需要分页查询
 * 用户需要根据id+cname进行查询，有且尽可能有一个结果
 */
@Service
public interface CustomerService {
    //增
    int addCustomer(Customer customer);
    //删
    int deleteCustomer(Customer customer);
    //改
    int updateCustomer(Customer customer);
    //查
    Customer findCustomer(Customer customer);
}
