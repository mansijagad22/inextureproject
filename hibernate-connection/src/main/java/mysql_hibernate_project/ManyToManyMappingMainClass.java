package mysql_hibernate_project;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Employee;
import entity.Project;

public class ManyToManyMappingMainClass {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Employee e1 = new Employee();
		Employee e2 = new Employee();

		e1.setEid(36);
		e1.setName("Ram");

		e2.setEid(37);
		e2.setName("Shyam");

		Project p1 = new Project();
		Project p2 = new Project();

		p1.setPid(1223);
		p1.setProjectName("Library Management System");

		p2.setPid(14242);
		p2.setProjectName("CHATBOT");

		List<Employee> emplist = new ArrayList<Employee>();
		
		List<Project> projectlist = new ArrayList<Project>();
		
		// emp list
		emplist.add(e1);
		emplist.add(e2);
	
		// project list
		projectlist.add(p1);
		projectlist.add(p2);
		
		
		
		e2.setProjects(projectlist);
		p1.setEmployees(emplist);		
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		s.save(e1);
		s.save(e2);
		s.save(p1);
		s.save(p2);
		
	
		tx.commit();
		factory.close();
		s.close();
	}
}
