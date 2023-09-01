package com.springbootassignment.practice.gymmanagementassignment.service;

import com.springbootassignment.practice.gymmanagementassignment.model.Gym;

import java.util.ArrayList;
import java.util.List;

public class GymServiceImpl implements GymService {
    private List<Gym> gyms = new ArrayList<>();


    public Gym addGym(Gym gym) {
        gyms.add(gym);
        return gym;
    }

    @Override
    public List<Gym> getAllGyms() {
        return gyms;
    }

    public Gym getGymById(Long gymId) {
        return gyms.stream()
                .filter(gym -> gym.getGymId().equals(gymId))
                .findFirst()
                .orElse(null);
    }


}