package com.example.springIocAnnotation;

import com.example.springIocAnnotation.Dao.Customer;
import com.example.springIocAnnotation.Dao.ICustomerDao;
import com.example.springIocAnnotation.Service.CustomerService;
import com.example.springIocAnnotation.Service.ICustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("classpath:values.properties")
public class IocConfig {

    @Bean("customerDao")
    public ICustomerDao customerDao(){
        return new Customer();
    }

    @Bean("customerService")
    public ICustomerService customerService(){
        return new CustomerService(customerDao());
    }
}
