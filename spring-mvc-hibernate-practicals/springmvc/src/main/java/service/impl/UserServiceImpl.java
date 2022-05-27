package service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Student;
import repository.UserDao;
import service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao dao;

    @Override
    public void createUser(String firstName, String lastName,String city,Boolean isAdult,Date birthDate) {
        Student u = new Student();
        u.setFirstName(firstName);
        u.setLastName(lastName);
        u.setCity(city);
        u.setIsAdult(isAdult);
        u.setBirthDate(birthDate);
        dao.create(u);
    }
}
