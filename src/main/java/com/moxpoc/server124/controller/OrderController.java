package com.moxpoc.server124.controller;

import com.moxpoc.server124.entity.Order;
import com.moxpoc.server124.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public List<Order> getAllOrders(ModelMap modelMap){
        return orderService.getAll();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Order getOrder(@PathVariable("id") long id){
        return orderService.getById(id);
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    @ResponseBody
    public Order saveOrder(@RequestBody Order executor){
        return orderService.save(executor);
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void removeOrder(@PathVariable long id) {orderService.remove(id);}
}
