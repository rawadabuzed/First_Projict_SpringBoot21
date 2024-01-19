package com.example.First_Projict_SpringBoot.controller;

import com.example.First_Projict_SpringBoot.model.User;
import com.example.First_Projict_SpringBoot.reposiroty.UserPollRepositorylmpl;
import com.example.First_Projict_SpringBoot.service.UserPollServicelmpl;
import com.example.First_Projict_SpringBoot.service.UserServicelmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserServicelmpl userService;
    private UserPollServicelmpl userPollService;

    @PostMapping(value = "/create")
    public void createUser(@RequestBody User user){

        userService.createUser(user);

    }

    @DeleteMapping(value = "/delete")
    public void deleteUserById(@RequestParam Integer id){

        userService.deleteUserById(id);
        userPollService.deleteUserPoll(id);
    }

    @PutMapping(value = "/update_first_name")
    public void updateUserFirstName(@RequestParam Integer id,@RequestParam(value = "first_name") String firstName){

        userService.updateUserFirstName(id, firstName);

    }

    @PutMapping(value = "/update_last_name")
    public void updateUserLastName(@RequestParam Integer id,@RequestParam(value = "last_name") String lastName){

        userService.updateUserLastName(id, lastName);

    }


    @PutMapping(value = "/update_email")
    public void updateUserEmail(@RequestParam Integer id,@RequestParam String email){

        userService.updateUserEmail(id, email);

    }




    @PutMapping(value = "/update_age")
    public void updateUserAge(@RequestParam Integer id, @RequestParam Integer age){

        userService.updateUserAge(id, age);

    }


    @PutMapping(value = "/update_address")
    public void updateUserAddress(@RequestParam Integer id,@RequestParam String address){

        userService.updateUserAddress(id, address);

    }

    @GetMapping(value = "/by_id")
    public User getUserById(@RequestParam Integer id){

        return userService.getUserById(id);

    }

}
