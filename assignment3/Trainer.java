package assignment3;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    
    private int trainerId;
    private List<Member> members;
    private List<Gym> gyms;

    public Trainer(int trainerId){
        this.trainerId = trainerId;
        this.members = new ArrayList<>();
        this.gyms = new ArrayList<>();
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void addGym(Gym gym) {
        gyms.add(gym);
    }

    public boolean trainerWrkingInMultipleGym(){
        return gyms.size() > 1;
    }

    public List<Member> getMembers(){
        return this.members;
    }

}
