package com.example.First_Projict_SpringBoot.service;

import com.example.First_Projict_SpringBoot.model.User;
import com.example.First_Projict_SpringBoot.model.UserStatus;
import com.example.First_Projict_SpringBoot.reposiroty.UserRepositorylmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserServicelmpl implements UserService{

    @Autowired
    private UserRepositorylmpl userRepository;


    @Override
    public void createUser(User user) {
        if (user.getUserStatus() == UserStatus.REGULAR){
            userRepository.createUser(user);
        }else {
            user.setUserStatus(UserStatus.REGULAR);
            userRepository.createUser(user);
        }
    }

    @Override
    public void deleteUserById(Integer id) {
        userRepository.deleteUserById(id);
    }

    @Override
    public void updateUser(User user) {
        userRepository.updateUser(user);
    }

    @Override
    public void updateUserFirstName(Integer id, String firstName) {
        userRepository.updateUserFirstName(id, firstName);
    }

    @Override
    public void updateUserLastName(Integer id, String lastName) {
        userRepository.updateUserLastName(id, lastName);
    }

    @Override
    public void updateUserEmail(Integer id, String email) {
        userRepository.updateUserEmail(id, email);
    }

    @Override
    public void updateUserAge(Integer id, Integer age) {
        userRepository.updateUserAge(id, age);
    }

    @Override
    public void updateUserAddress(Integer id, String address) {
        userRepository.updateUserAddress(id, address);
    }



    @Override
    public User getUserById(Integer id) {
        return userRepository.getUserById(id);
    }
}
