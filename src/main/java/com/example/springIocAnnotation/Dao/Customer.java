package com.example.springIocAnnotation.Dao;


import org.springframework.beans.factory.annotation.Value;

public class Customer implements ICustomerDao {

    @Value("${salih.name}")
    private String name;

    @Override
    public void add() {
        System.out.println("Ben CustomerDao ve name : "+getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
