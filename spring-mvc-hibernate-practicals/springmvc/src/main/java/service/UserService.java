package service;

import java.util.Date;

import javax.transaction.Transactional;

public interface UserService {

    @Transactional
    void createUser(String firstName, String lastName,String city,Boolean isAdult, Date birthDate);
}