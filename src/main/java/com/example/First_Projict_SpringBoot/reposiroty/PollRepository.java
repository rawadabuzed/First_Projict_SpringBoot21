package com.example.First_Projict_SpringBoot.reposiroty;

import com.example.First_Projict_SpringBoot.model.Poll;

import java.util.List;


public interface PollRepository {

    void  createPoll(Poll poll);
    void  deletePollById(Integer id);
    void  updatePoll(Poll poll);
    void  updatePollTitle(Integer id, String title);
    void  updatePollOption1(Integer id, String option1);
    void  updatePollOption2(Integer id, String option2);
    void  updatePollOption3(Integer id, String option3);
    void  updatePollOption4(Integer id, String option4);
    Poll getPollById(Integer id);


}
