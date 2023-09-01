package com.springbootassignment.practice.gymmanagementassignment.model;

import java.util.List;

public class Gym {
    private Long gymId;
    private String location;
    private List<Member> members;
    private List<Trainer> trainers;

    // Constructors, getters, setters

    public Long getGymId() {
        return gymId;
    }
}
