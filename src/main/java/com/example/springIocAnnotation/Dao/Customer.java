package com.example.springIocAnnotation.Dao;

public class Customer implements ICustomerDao{
    @Override
    public void add() {
        System.out.println("Ben CustomerDao");
    }
}
