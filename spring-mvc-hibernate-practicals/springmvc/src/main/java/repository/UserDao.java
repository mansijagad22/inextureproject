package repository;

import entity.Student;

public interface UserDao extends GenericDao<Student>{

	public Student loadUserByFirstName(String firstName);
}
