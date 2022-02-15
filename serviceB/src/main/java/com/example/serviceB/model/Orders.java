package com.example.serviceB.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table
public class Orders{
    
    @Id
    private String id;
    @Column
    private String customerId;
    @Column
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