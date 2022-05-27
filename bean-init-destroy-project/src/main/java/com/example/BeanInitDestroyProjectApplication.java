package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.entity.Employee;
import com.example.entity.PanCard;
import com.example.entity.SpellChecker;
import com.example.entity.Student;
import com.example.entity.TextEditor;

@SpringBootApplication
public class BeanInitDestroyProjectApplication {

	public static void main(String[] args) {
//		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//		Student s = context.getBean(Student.class);
//		s.getMessage();
//		Student s1 = context.getBean(Student.class);
//		s1.getMessage();
//		Student s2 = context.getBean(Student.class);
//		s2.getMessage();
//		Student s3 = context.getBean(Student.class);
//		s3.getMessage();
//		Student s4 = context.getBean(Student.class);
//		s4.getMessage();
//		context.registerShutdownHook();
//		
//		
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("Beans.xml");
		TextEditor te = (TextEditor) appcontext.getBean("textEditor");
//		SpellChecker sv = (SpellChecker) appcontext.getBean("textEditor");
//		sv.setNum(1);
//		sv.setName("mansi");
		te.getSpellChecker();
//		te.setSpellChecker(sv);
		te.spellChecker();
		
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		Employee emp = appcontext.getBean("employee",Employee.class);
		System.out.println("employee id is : "+ emp.getId());
		System.out.println("employee name : "+ emp.getName());
		System.out.println("employee gender : "+ emp.getGender());
		PanCard pc = emp.getPanCard();
		
		System.out.println("--------------------------------------------------------");
		System.out.println("pan card holder namem : " +pc.getHolderName());
		System.out.println("pan no : "+pc.getPanNum());
		
		
		// for singleton scope in bean xml file init method is call once nd then we can get the msg 2 time 
		// in prototype scope in bean xml file init method is call everytime we make a new object
	}

}
