package com.example.First_Projict_SpringBoot.service;

import com.example.First_Projict_SpringBoot.model.Poll;
import com.example.First_Projict_SpringBoot.model.UserPoll;
import com.example.First_Projict_SpringBoot.model.UserPollRequest;
import org.springframework.stereotype.Service;

@Service
public class PollServicelmpl implements PollService{



    @Override
    public void createPoll(Poll poll) {

    }


  //if(customer.getCustomerStatus() == CustomerStatus.REGULAR){
  //      customerRepository.createCustomer(customer);
  //  }else{
  //      Integer vipCustomersCreated = customerRepository.getCustomersByStatus(CustomerStatus.VIP).size();
  //      if(vipCustomersCreated < Constants.VIP_ALLOWED){
  //          customerRepository.createCustomer(customer);
  //      }else{
  //          customer.setCustomerStatus(CustomerStatus.REGULAR);
  //          customerRepository.createCustomer(customer);
  //      }
  //  }














    @Override
    public void deletePollById(Integer id) {

    }

    @Override
    public void updatePoll(Poll poll) {

    }

    @Override
    public void updatePolltTitle(Integer id, String title) {

    }

    @Override
    public void updatePollOption1(Integer id, String option1) {

    }

    @Override
    public void updatePollOption2(Integer id, String option2) {

    }

    @Override
    public void updatePollOption3(Integer id, String option3) {

    }

    @Override
    public void updatePollOption4(Integer id, String option4) {

    }
}
