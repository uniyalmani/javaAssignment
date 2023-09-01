package com.springbootassignment.practice.gymmanagementassignment.service;

import com.springbootassignment.practice.gymmanagementassignment.model.Gym;

import java.util.List;

public interface GymService {
    Gym addGym(Gym gym);
    List<Gym> getAllGyms();
    // Other service methods
    Gym getGymById(Long gymId);
}