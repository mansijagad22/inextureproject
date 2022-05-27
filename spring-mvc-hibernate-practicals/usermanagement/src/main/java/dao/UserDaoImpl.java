package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import model.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub

		Session s = this.sessionFactory.getCurrentSession();
		s.persist(user);
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		Session s = this.sessionFactory.getCurrentSession();
		s.update(user);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		Session s = this.sessionFactory.getCurrentSession();
		List<User> userList = s.createQuery("from user-details").list();
		for(User u : userList) {
			System.out.println(u);
		}
		return userList;
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		Session s = this.sessionFactory.getCurrentSession();
		User u = (User) s.load(User.class, new Integer(id));
		return u;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Session s = this.sessionFactory.getCurrentSession();
		User u = (User) s.load(User.class, new Integer(id));
		if(u!=null) {
			s.delete(u);
		}
		
	}


}
