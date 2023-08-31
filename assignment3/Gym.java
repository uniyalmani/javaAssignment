package assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class Gym {
    private int gymId;
    private String location;
    private List<Member> members;
    private List<Trainer> trainers;

    public Gym(int gymId, String location){
        this.gymId = gymId;
        this.location = location;
        this.members = new ArrayList<>();
        this.trainers = new ArrayList<>();
        
    }

    public void addMember(Member member) {
        members.add(member);
    }
    public void addTrainer(Trainer trainer) {
        trainers.add(trainer);
    }

    public int getMemberCount() {
        return members.size();
    }

    public Member getMemberWithMostTrainers() {
        Member mostTrainedMember = null;
        int maxTrainerCount = -1;

        for (Member member : members) {
            int trainerCount = member.getTrainers().size();
            if (trainerCount > maxTrainerCount) {
                maxTrainerCount = trainerCount;
                mostTrainedMember = member;
            }
        }

        return mostTrainedMember;
    }

    public static  int getMembersCountTrainedByTrainerInMultipleGyms(List<Trainer> trainers){
        Set<Member> membersSet = new HashSet<>();
        for (Trainer trainer: trainers){
            if (trainer.trainerWrkingInMultipleGym()){
                List<Member> members =  trainer.getMembers();
                for (Member member: members){
                    membersSet.add(member);
                }
            }
        }
        return membersSet.size();
    }

     

    public static Gym getMostMembersGym(List<Gym> gyms) {
        Gym mostMembersGym=null;
        int maxMemberCount = -1;
        for (Gym gym : gyms) 
        {
            int memberCount = gym.getMemberCount();
            if (memberCount > maxMemberCount) 
            {
                maxMemberCount = memberCount;
                mostMembersGym = gym;
            }
        }
    
        return mostMembersGym;
    }

}