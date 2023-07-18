package com.example.springIocAnnotation;

import com.example.springIocAnnotation.Dao.ICustomerDao;
import com.example.springIocAnnotation.Service.ICustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringIocAnnotationApplication {

	public static void main(String[] args) {
			SpringApplication.run(SpringIocAnnotationApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);


		ICustomerService customerService= context.getBean("customerService", ICustomerService.class);
		customerService.add();
	}

}
