package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.entity.Student;

@SpringBootApplication
public class AnnotationsProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext();
		System.out.println("beans.xml file is loaded ");
//		Student s = (Student) context.getBean("studentBean");
	}

}
