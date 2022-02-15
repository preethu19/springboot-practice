package com.example.serviceD.model;


public class Orders{
    
    private String id;
    private String customerId;
    private String name;

    public Orders(){

    }

    public Orders(String id, String customerId, String name){
        this.id = id;
        this.customerId = customerId;
        this.name = name;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getCustomerid(){
        return customerId;
    }

    public void setCustomerid(String customerId){
        this.customerId = customerId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}