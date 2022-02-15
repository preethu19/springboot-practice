package com.example.serviceA.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

import com.example.serviceA.model.Customer;
import com.example.serviceA.service.CustomerService;


@RequestMapping("/customers")
@RestController
public class CustomerController{
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping("/all")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable String id){
        return customerService.getCustomer(id);
    }

    @PostMapping("/new")
    public Customer createCustomer(@RequestBody Customer customer){
        return customerService.create(customer);
    }

    @DeleteMapping("/{id}/delete")
    public String deleteCustomer(@PathVariable String id){
        customerService.delete(id);
        return "Customer deleted";
    }

    @PutMapping("/{id}/update")
    public Customer updateCustomer(@RequestBody Customer customer, @PathVariable String id){
        return customerService.update(customer, id);
    }

    @DeleteMapping("/delete")
    public String deleteCustomers(){
        customerService.deleteAll();
        return "All Customer data deleted";
    }
}