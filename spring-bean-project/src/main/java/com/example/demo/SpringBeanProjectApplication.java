package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.entity.Student;

import config.StudentConfig;

@SpringBootApplication
public class SpringBeanProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(StudentConfig.class);
		Student std = ac.getBean(Student.class);
		std.setName("hello");
		std.setId(21);
		System.out.println("-----------------------------------------------------");
//		Student student = (Student) ac.getBean("student");
		System.out.println("Got student object from application context (spring container )");
		std.getId();
		std.getName();		
	}

}


// using xml file configuration

//package com.example.demo;
//
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import com.example.demo.entity.Student;
//
//import entity.Message;
//@SpringBootApplication
//public class SpringBeanProjectApplication {
//
//	public static void main(String[] args) {
//		ApplicationContext ac = new ClassPathXmlApplicationContext(
//				"applicationContext.xml");
//		Student std = ac.getBean("student",Student.class);
//		std.setName("hello");
//		std.setId(21);
//		System.out.println("-----------------------------------------------------");
//		Student student = (Student) ac.getBean("student");
//		System.out.println("Got student object from application context (spring container )");
//		student.studentDetails();
//		
//		
//	}
//
//}

