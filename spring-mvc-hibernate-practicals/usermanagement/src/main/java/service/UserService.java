package service;

import java.util.List;

import model.User;

public interface UserService {

	public void addUser(User user);

	public void updateUser(User user);

	public List<User> getAllUser();

	public User getUserById(int id);

	public void delete(int id);

}
