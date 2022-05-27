package mysql_hibernate_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Answer;
import entity.Question;

public class OneToOneMappingMainClass {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// creating question
		Question q = new Question();
		q.setQueId(4);
		q.setQuestion("What is new in java ? ");

		// creating answer object
		Answer a = new Answer();
		a.setAnsId(12);
		a.setAnswer("Java is programming language");
		q.setAns(a);

		// creating question
//		Question q1 = new Question();
//		q1.setQueId(1220);
//		q1.setQuestion("Which framework java used ? ");
//		
//		// creating answer object 
//		Answer a1 = new Answer();
//		a1.setAnsId(354);
//		a1.setAnswer("API to work with objects in java...");
//		q1.setAns(a1);
		// to save into database we need session
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();

		s.save(a);
		s.save(q);
//	s.save(q1);

//	s.save(a1);

		tx.commit();

		/// fetching values

		Question newQ = (Question) s.get(Question.class, 2);
		System.out.println(newQ.getQuestion());
		System.out.println(newQ.getQueId());
		System.out.println(newQ.getAns().getAnsId());

		s.close();
		factory.close();

	}
}
