package com.example.First_Projict_SpringBoot.service;

import com.example.First_Projict_SpringBoot.model.Poll;
import com.example.First_Projict_SpringBoot.reposiroty.PollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PollServicelmpl implements PollService{

    @Autowired
    private PollRepository pollRepository;



    @Override
    public void createPoll(Poll poll) {
        pollRepository.createPoll(poll);
    }

    @Override
    public void deletePollById(Integer id) {
        pollRepository.deletePollById(id);
    }




    @Override
    public void updatePoll(Poll poll) {
        pollRepository.updatePoll(poll);
    }

    @Override
    public void updatePolltTitle(Integer id, String title) {
        pollRepository.updatePollTitle(id, title);
    }

    @Override
    public void updatePollOption1(Integer id, String option1) {
        pollRepository.updatePollOption1(id, option1);
    }

    @Override
    public void updatePollOption2(Integer id, String option2) {
        pollRepository.updatePollOption2(id, option2);
    }

    @Override
    public void updatePollOption3(Integer id, String option3) {
        pollRepository.updatePollOption3(id, option3);
    }

    @Override
    public void updatePollOption4(Integer id, String option4) {
        pollRepository.updatePollOption4(id, option4);
    }

    @Override
    public Poll getPollById(Integer id) {
        return pollRepository.getPollById(id);
    }


}
