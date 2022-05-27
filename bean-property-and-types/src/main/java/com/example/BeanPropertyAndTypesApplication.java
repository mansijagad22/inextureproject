package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.entity.Car;
import com.example.entity.Tyre;

@SpringBootApplication
public class BeanPropertyAndTypesApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Car c = (Car) context.getBean("car");
		c.drive();
		
//		Tyre t = (Tyre) context.getBean("tyre");
		// get tyree id from xml file and we have used constuctor injection in it and we get value as defined in xml file
//		t.setBrand("MRF");
//		System.out.println(t);
		
	}

}
