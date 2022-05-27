package com.example;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.entity.College;
import com.example.entity.JavaCollection;
import com.example.entity.University;
import com.sun.tools.javac.util.List;

@SpringBootApplication
public class SpringInheritanceApplication {

	public static void main(String[] args) {

		// Inherintance is defined as parent = (name of parent class id) and if the
		// value is not define in the child class it will take from parent if defined in
		// child
		// then it will take from child class
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("Beans.xml");
		University u = (University) appcontext.getBean("university");
		System.out.println(u.getSub1());
		System.out.println(u.getSub2());
		System.out.println("--------------------------");
		College c = (College) appcontext.getBean("college");
//		c.setSub4("mansi");
		System.out.println(c.getSub1());
		System.out.println(c.getSub2());
		System.out.println(c.getSub3());
		System.out.println(c.getSub4());
		System.out.println(c.getSub5());

		JavaCollection jc = (JavaCollection) appcontext.getBean("javaCollection");
		java.util.List<String> addresslist = new ArrayList<String>();
		addresslist.add("hello");
		addresslist.add("new");
		addresslist.add("world");
		
		jc.setAddresslist(addresslist);
		System.out.println(jc.getAddresslist()); 
		System.out.println(jc.getAddresslist()); // all the values which we inserted is showing here
		System.out.println(jc.getAddressSet()); // in the set it automatically removes duplicate values
		System.out.println(jc.getAddressMap());
		System.out.println(jc.getAddressProperties());
	}

}
