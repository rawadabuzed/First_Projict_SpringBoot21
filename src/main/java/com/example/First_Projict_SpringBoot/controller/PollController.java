package com.example.First_Projict_SpringBoot.controller;


import com.example.First_Projict_SpringBoot.model.Poll;

import com.example.First_Projict_SpringBoot.service.PollServicelmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/poll")
public class PollController {



    @Autowired
    private PollServicelmpl pollService;


    @PostMapping(value = "/create")
    public void createUser(@RequestBody Poll poll){

        pollService.createPoll(poll);

    }



    @DeleteMapping(value = "/delete_title")
    public void deletePollById(@RequestParam Integer id){

        pollService.deletePollById(id);

    }


    @PutMapping(value = "/update_title")
    public void updateTitle(@RequestParam Integer id, @RequestParam String title){

        pollService.updatePolltTitle(id, title);

    }

    @PutMapping(value = "/update_option1")
    public void updateOption1(@RequestParam Integer id, @RequestParam String option1){

        pollService.updatePollOption1(id, option1);

    }
    @PutMapping(value = "/update_option2")
    public void updateOption2(@RequestParam Integer id, @RequestParam String option2){

        pollService.updatePollOption2(id, option2);

    }
    @PutMapping(value = "/update_option3")
    public void updateOption3(@RequestParam Integer id, @RequestParam String option3){

        pollService.updatePollOption3(id, option3);

    }


    @PutMapping(value = "/update_option4")
    public void updateOption4(@RequestParam Integer id, @RequestParam String option4){

        pollService.updatePollOption4(id, option4);

    }



    @GetMapping(value = "/by_id")
    public void  getPollById(@RequestParam Integer id){

    }




}
