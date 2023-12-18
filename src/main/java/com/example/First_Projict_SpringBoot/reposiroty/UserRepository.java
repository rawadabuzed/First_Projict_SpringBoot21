package com.example.First_Projict_SpringBoot.reposiroty;

import com.example.First_Projict_SpringBoot.model.User;



public interface UserRepository {


    void createUser(User user);
    void deleteUserById(Integer id);
    void updateUser(User user);
    void updateUserFirstName(Integer id, String firstName);
    void updateUserLastName(Integer id, String lastName);
    void updateUserEmail(Integer id, String email);
    void updateUserAge(Integer id, Integer age);
    void updateUserAddress(Integer id, String address);


    User getUserById(Integer id);





}
