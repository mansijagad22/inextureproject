package com.example;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import mysql_hibernate_project_entity.Certificate;
import mysql_hibernate_project_entity.Student;

public class CriteriaExample {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
//		Student std = new Student();
//		std.setFirstName("Steve");
//		std.setLastName("Rogers");
//		std.setCity("New York");
//		std.setBirthDate(new Date());
//		std.setIsAdult(true);
//		Certificate cerificate = new Certificate();
//		cerificate.setCourse("Defending");
//		cerificate.setDuration("1 month");
//		std.setCerti(cerificate);
//		
//		s.save(std);
		
		
		Criteria c = s.createCriteria(Student.class);
//		c.add(Restrictions.eq("city", "ABD"));
//		c.add(Restrictions.eq("certi.course", "Hibernate"));
//		c.setFirstResult(3);
//		c.setMaxResults(8);
//		c.add(Restrictions.gt("id", 1));
//		c.add(Restrictions.lt("id", 4));
//		c.add(Restrictions.like("certi.course", "Management%"));
		c.add(Restrictions.ge("id", 7));
		
		List<Student> list = c.list();
		System.out.println("============================================================---------------=================================================================");
		for(Student st : list) {
			System.out.println(st);
		}
		
		s.close();
		factory.close();
	}
}
