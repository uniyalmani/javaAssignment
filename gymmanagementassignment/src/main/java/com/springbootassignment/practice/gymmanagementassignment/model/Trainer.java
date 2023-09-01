package com.springbootassignment.practice.gymmanagementassignment.model;

import java.util.List;

public class Trainer {
    private Long trainerId;
    private List<Member> members;
    private List<Gym> gyms;

    public Long getTrainerId(){
        return  trainerId;
    }
}