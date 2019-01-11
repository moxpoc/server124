package com.moxpoc.server124.service;

import com.moxpoc.server124.entity.Customer;
import com.moxpoc.server124.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository repository;

    public List<Customer> getAll() {
        return repository.findAll();
    }

    public Customer getById(long id) {
        return repository.findById(id).orElse(new Customer());
    }

    public Customer save(Customer customer) {
        return repository.saveAndFlush(customer);
    }

    public void remove(long id) {
        repository.deleteById(id);
    }
}
