package com.example;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import mysql_hibernate_project_entity.Student;
public class PaginationMainClass {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Query q = session.createQuery("from Student");
		
		// implementing pagination in hibernate
		
		q.setFirstResult(1);//index for start
		q.setMaxResults(5);// elements which want in one page
		List<Student> list = q.list();
		
		for(Student st : list) {
			System.out.println(st.getId()+" : "+st.getFirstName()+" : "+st.getLastName());
		}
		
		session.close();
		factory.close();
	}
}
