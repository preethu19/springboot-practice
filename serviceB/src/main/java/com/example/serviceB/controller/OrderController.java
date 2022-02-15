package com.example.serviceB.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

import com.example.serviceB.model.Orders;
import com.example.serviceB.service.OrderService;


@RequestMapping("/orders")
@RestController
public class OrderController{
    private final OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @GetMapping("/all")
    public List<Orders> getAllOrders(){
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Orders getOrder(@PathVariable String id){
        return orderService.getOrder(id);
    }

    @PostMapping("/new")
    public Orders createOrder(@RequestBody Orders order){
        return orderService.create(order);
    }

    @DeleteMapping("/{id}/delete")
    public String deleteOrder(@PathVariable String id){
        orderService.delete(id);
        return "Order deleted";
    }

    @PutMapping("/{id}/update")
    public Orders updateOrder(@RequestBody Orders order, @PathVariable String id){
        return orderService.update(order, id);
    }

    @DeleteMapping("/delete")
    public String deleteOrders(){
        orderService.deleteAll();
        return "All Order data deleted";
    }

    @GetMapping("/getorder/{id}")
    public List<Orders> getByCustomerid(@PathVariable String id){
        return orderService.getByCustomerid(id);   
    }
}