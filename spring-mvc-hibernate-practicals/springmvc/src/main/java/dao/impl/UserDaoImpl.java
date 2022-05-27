package dao.impl;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import entity.Student;
import repository.UserDao;

@Component("userDao")
public class UserDaoImpl extends GenericDaoImpl<Student> implements UserDao {
	
	public Student loadUserByFirstName(String firstName) {
		Query query = (Query) this.em.createQuery("select u FROM Student s where s.FIRST_NAME :FIRST_NAME");
		query.setParameter("firstname", firstName);
		List<Student> users = query.getResultList();
		if (users != null && users.size() == 1) {
			return users.get(0);
		}
		return null;
	}
}
