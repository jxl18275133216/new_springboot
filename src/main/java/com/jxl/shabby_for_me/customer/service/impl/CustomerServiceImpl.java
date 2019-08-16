package com.jxl.shabby_for_me.customer.service.impl;

import com.jxl.shabby_for_me.customer.dao.CustomerDao;
import com.jxl.shabby_for_me.customer.entity.Customer;
import com.jxl.shabby_for_me.customer.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Resource
    private CustomerDao dao;
    @Override
    public int addCustomer(Customer customer) {
        return dao.insertObject(customer);
    }

    @Override
    public int deleteCustomer(Customer customer) {
        return dao.deleteObject(customer);
    }

    @Override
    public int updateCustomer(Customer customer) {
        return dao.updateObject(customer);
    }

    @Override
    public Customer findCustomer(Customer customer) {
        return dao.findCustomer(customer.getId(),customer.getCname());
    }
}
