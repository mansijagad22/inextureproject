package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mysql_hibernate_project_entity.Certificate;
import mysql_hibernate_project_entity.Student;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HqlPracticalsApplication {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
//		Student student = new Student();
//		student.setFirstName("Mansi");
//		student.setLastName("P");
//		student.setBirthDate(new Date());
//		student.setCity("Canada");
//		student.setIsAdult(true);
//		student.setX(48729837);
//		
//		Certificate c = new Certificate();
//		c.setCourse("EC");
//		c.setDuration("1 months");
//		student.setCerti(c);
//		
//		
//		Transaction tx = session.beginTransaction();
//		session.save(student);
//		tx.commit();
		// HQL
		// Syntex : query 
		//
		String query = "from Student s where s.city ='Canada' and s.lastName='Jagad'";
		Query q = session.createQuery(query);
		
		// single - unique
		// multiple - list
//		q.uniqueResult()
		List<Student> list = q.list();
		for(Student stud : list) {
			System.out.println(stud.getFirstName());
		}
		
		System.out.println("______________________________________________________________________");
		
		Transaction tx = session.beginTransaction();
		
		// Delete query from database
//		Query q2 = session.createQuery("delete from Student s where s.city = :c"); // c ne variable lidhu ahiya
//		q2.setParameter("c", "Canada");
//		int r = q2.executeUpdate();
//		System.out.println("Deleted : ");
//		System.out.println(r);
//		
		// update query from database
		Query q2 = session.createQuery("update Student set city = :c where firstName= :n");
		q2.setParameter("c", "ABD");
		q2.setParameter("n", "Mansi");
		int r = q2.executeUpdate();
		System.out.println(r + "objects updated");
		
		
		// join query using hibernate to get all data for que and ans table
		Query q3 = session.createQuery("select q.question, q.queId, a.ans from Question as q INNER JOIN q.ans as a");
		List<Object []> list3 = q3.getResultList();
		for(Object [] arr : list3) {
			System.out.println(Arrays.toString(arr));
		}
		
		
		
		
		tx.commit();
		session.close();
		factory.close();
	}

}
