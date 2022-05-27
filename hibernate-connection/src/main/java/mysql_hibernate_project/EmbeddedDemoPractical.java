package mysql_hibernate_project;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import mysql_hibernate_project_entity.Certificate;
import mysql_hibernate_project_entity.Student;

public class EmbeddedDemoPractical {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory session = cfg.buildSessionFactory();
		Student student = new Student();
		student.setFirstName("Ankit");
		student.setLastName("tiwari");
		student.setBirthDate(new Date());
		student.setCity("ABD");
		student.setIsAdult(true);
		student.setX(49837878);
		
		Certificate c = new Certificate();
		c.setCourse("DATABASE");
		c.setDuration("2 months");
		student.setCerti(c);
		
		Session s = session.openSession();
		Transaction tx = s.beginTransaction();
		s.save(student);
		tx.commit();
		session.close();
		s.close();
		
	}
}
