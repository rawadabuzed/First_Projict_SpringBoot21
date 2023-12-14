package com.example.First_Projict_SpringBoot.model;

public class UserPollRequest {

    private UserPoll poll;
    private User user;

    public UserPoll getPoll() {
        return poll;
    }

    public void setPoll(UserPoll poll) {
        this.poll = poll;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
