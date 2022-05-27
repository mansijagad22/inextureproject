package mysql_hibernate_project;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Answer1;
import entity.Question1;

public class ManyToOneMappingMainClass {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

//		// creating question
//		Question1 q = new Question1();
//
//		
//		q.setQueId(1213);
//		q.setQuestion("What new in java ? ");
//
//		// creating answer object
//		Answer1 a = new Answer1();
//		a.setAnsId(343);
//		a.setAnswer("Java is programming language");
//		a.setQue(q);
//		
//		// creating answer object
//		Answer1 a1 = new Answer1();
//		a1.setAnsId(344);
//		a1.setAnswer("Java have lambda functions");
//		a1.setQue(q);
//	
//
//		// creating answer object
//		Answer1 a2 = new Answer1();
//		a2.setAnsId(345);
//		a2.setAnswer("Java have different frameworks");
//		a2.setQue(q);
//	
//		List<Answer1> list = new ArrayList<Answer1>();
//		list.add(a);
//		list.add(a1);
//		list.add(a2);
//		
//		q.setAnswers(list);
//		
		// to save into database we need session
		Session s = factory.openSession();
//		Transaction tx = s.beginTransaction();
//		s.save(q);
//		s.save(a);
//		s.save(a1);
//		s.save(a2);
//		
//		
		// fetching values
	
		Question1 question = s.get(Question1.class, 1213);
		
//		System.out.println(question.getQuestion());
//		for(Answer1 ans : question.getAnswers()) {
//			System.out.println(ans.getAnswer());
//		}
//		
		System.out.println(question.getQueId());
		System.out.println(question.getQuestion());
		System.out.println(question.getAnswers().size());

//		tx.commit();
		s.close();

	}
}
