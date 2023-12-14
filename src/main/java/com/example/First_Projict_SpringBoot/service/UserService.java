package com.example.First_Projict_SpringBoot.service;

import com.example.First_Projict_SpringBoot.model.User;

import java.sql.Date;
import java.time.LocalDate;

public interface UserService {

    void createUser(User user);
    void deleteUserById(Integer id);
    void updateUser(User customer);
    void updateUserFirstName(Integer id, String firstName);
    void updateUserLastName(Integer id, String lastName);
    void updateUserEmail(Integer id, String email);
    void updateUserAge(Integer id, Integer age);
    void updateUserAddress(Integer id, String address);
    void updateUserJoiningDate(Integer id, Date joiningDate);

    User getUserById(Integer id);

}
