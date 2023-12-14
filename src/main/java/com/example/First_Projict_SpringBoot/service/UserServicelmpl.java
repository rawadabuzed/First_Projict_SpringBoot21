package com.example.First_Projict_SpringBoot.service;

import com.example.First_Projict_SpringBoot.model.User;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class UserServicelmpl implements UserService{

    @Override
    public void createUser(User user) {

    }

    @Override
    public void deleteUserById(Integer id) {

    }

    @Override
    public void updateUser(User customer) {

    }

    @Override
    public void updateUserFirstName(Integer id, String firstName) {

    }

    @Override
    public void updateUserLastName(Integer id, String lastName) {

    }

    @Override
    public void updateUserEmail(Integer id, String email) {

    }

    @Override
    public void updateUserAge(Integer id, Integer age) {

    }

    @Override
    public void updateUserAddress(Integer id, String address) {

    }

    @Override
    public void updateUserJoiningDate(Integer id, Date joiningDate) {

    }

    @Override
    public User getUserById(Integer id) {
        return null;
    }
}
