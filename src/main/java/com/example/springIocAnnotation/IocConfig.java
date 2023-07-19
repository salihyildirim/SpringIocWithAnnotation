package com.example.springIocAnnotation;

import com.example.springIocAnnotation.Dao.Customer;
import com.example.springIocAnnotation.Dao.ICustomerDao;
import com.example.springIocAnnotation.Service.CustomerService;
import com.example.springIocAnnotation.Service.ICustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("values.properties")
public class IocConfig {

    @Bean("customer")
    public ICustomerDao customerDao(){
        Customer customer= new Customer();
        customer.setName("salihovic");
        return customer;

    }

    @Bean("customerService")
    public ICustomerService customerService(){
        return new CustomerService(customerDao());
    }
}
