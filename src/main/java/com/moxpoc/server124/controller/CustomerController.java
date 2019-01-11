package com.moxpoc.server124.controller;

import com.moxpoc.server124.entity.Customer;
import com.moxpoc.server124.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public List<Customer> getAllCustomers(ModelMap modelMap){
        return customerService.getAll();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Customer getCustomer(@PathVariable("id") long id){
        return customerService.getById(id);
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    @ResponseBody
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void removeCustomer(@PathVariable long id){
        customerService.remove(id);
    }



}
