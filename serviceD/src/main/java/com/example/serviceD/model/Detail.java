package com.example.serviceD.model;

import java.util.List;

public class Detail{
    
    private String id;
    private String name;
    private List<Orders> orders;

    public Detail(){

    }

    public Detail(String id, String name, List<Orders> orders){
        this.id = id;
        this.name = name;
        this.orders = orders;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public List<Orders> getOrders(){
        return orders;
    }

    public void setOrdders(List<Orders> orders){
        this.orders = orders;
    }
}