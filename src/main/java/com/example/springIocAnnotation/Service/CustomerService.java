package com.example.springIocAnnotation.Service;

import com.example.springIocAnnotation.Dao.Customer;
import com.example.springIocAnnotation.Dao.ICustomerDao;

public class CustomerService implements ICustomerService {
    private ICustomerDao customerDao;

    //cons. inj.
    public CustomerService(ICustomerDao customerDao) {
        this.customerDao = customerDao;

    }

    @Override
    public void add() {
        this.customerDao.add();
    }
}
