package com.moxpoc.server124.service;

import com.moxpoc.server124.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAll();
    Order getById(long id);
    Order save(Order order);
    void remove(long id);
}
