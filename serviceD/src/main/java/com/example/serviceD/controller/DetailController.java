package com.example.serviceD.controller;

import java.util.List;
import java.util.Arrays;

import com.example.serviceD.model.Detail;
import com.example.serviceD.model.Orders;
import com.example.serviceD.model.Customer;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RequestMapping("/details")
@RestController
public class DetailController{

    @RequestMapping("/{id}")
    public Detail getDetails(@PathVariable String id){
        RestTemplate restTemplate = new RestTemplate();
        Customer customer = restTemplate.getForObject("http://localhost:8081/customers/" + id, Customer.class);
        Orders[] orders = restTemplate.getForObject("http://localhost:8082/orders/getorder/" + id, Orders[].class);
        List<Orders> orderList = Arrays.asList(orders);
        return new Detail(customer.getId(), customer.getName(), orderList);
    }
}