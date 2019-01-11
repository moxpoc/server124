package com.moxpoc.server124.service;

import com.moxpoc.server124.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAll();
    Customer getById(long id);
    Customer save(Customer customer);
    void remove(long id);
}
