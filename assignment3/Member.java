package assignment3;

import java.util.ArrayList;
import java.util.List;

public class Member {
        private int memberId;
        private List<Trainer> trainers;
        private Gym gym;

        public Member(int memberId, Gym gym){
            this.memberId = memberId;
            this.trainers = new ArrayList<>();
            this.gym = gym;
        }

        public void addTrainer(Trainer trainer) {
            trainers.add(trainer);
        }

        public List<Trainer> getTrainers() {
            return trainers;
        }
}
