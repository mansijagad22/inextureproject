package service;

import java.util.List;

import javax.transaction.Transactional;

import dao.UserDao;
import model.User;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	@Transactional
	public void addUser(User user) {
		// TODO Auto-generated method stub
		this.userDao.addUser(user);
		
	}

	@Override
	@Transactional
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		this.userDao.updateUser(user);
		
	}

	@Override
	@Transactional
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return this.userDao.getAllUser();
	}

	@Override
	@Transactional
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return this.userDao.getUserById(id);
	}

	@Override
	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		this.userDao.delete(id);
		
	}
	
}
