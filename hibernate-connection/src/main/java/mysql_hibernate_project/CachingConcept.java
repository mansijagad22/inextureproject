package mysql_hibernate_project;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

import mysql_hibernate_project_entity.Student;

/**
 * Hello world!
 *
 */
public class CachingConcept 
{
    public static void main( String[] args ) throws IOException
    {
//        System.out.println( "Project start ");
//        Configuration cgf = new Configuration();
//        cgf.configure("hibernate.cfg.xml");
//        SessionFactory factory = cgf.buildSessionFactory();
////        System.out.println(factory.getCurrentSession());
//        Session session  = factory.openSession();
//        Student s = (Student)session.get(Student.class, 5);
////        System.out.println(s.getCity());
////        Student s1 = (Student)session.load(Student.class,5);
//        System.out.println(s);
//        System.out.println("working something.............");
//        
//        Student s1 = session.get(Student.class, 5);
//        System.out.println(s1);
//        
//        System.out.println(s.getCity());
        // create a student
//        Student s = new Student();
//        s.setFirstName("Mansi");
//        s.setLastName("Jagad");
//        s.setCity("BVN");
//        s.setIsAdult(true);
//        s.setX(6.5566);
//        s.setBirthDate(new Date());
//        
//        // for image showing 
//        FileInputStream fis = new FileInputStream("src/main/java/index.png");
//        byte[] data = new byte[fis.available()];
//        fis.read(data);
//        s.setImage(data);
//        
//        Transaction tx = session.beginTransaction();
//        session.save(s);
//        session.getTransaction().commit();

//        session.close();
//        factory.close();
    	
    	
    	// one time only in session factory data is stored
    	
    	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	
    	Session session1 = factory.openSession();
    	// first
    	    	
    	Student std =  (Student)(session1.get(Student.class, 5));
    	System.out.println(std.toString());
    	
    	session1.close();
    
    	Session session2 = factory.openSession();
    	
    	Student std2 =  (Student)(session2.get(Student.class, 5));
    	System.out.println(std2.toString());
    	
    	session2.close();
    }
}
