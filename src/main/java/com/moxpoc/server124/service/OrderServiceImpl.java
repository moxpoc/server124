package com.moxpoc.server124.service;

import com.moxpoc.server124.entity.Order;
import com.moxpoc.server124.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> getAll() {
        return repository.findAll();
    }

    public Order getById(long id) {
        return repository.findById(id).orElse(new Order());
    }

    public Order save(Order order) {
        return repository.saveAndFlush(order);
    }

    public void remove(long id) {
        repository.deleteById(id);
    }
}
