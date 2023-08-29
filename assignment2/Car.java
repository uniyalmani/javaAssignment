package assignment2;

public class Car extends Vehicle{
    
    private  int currentGear;


    public Car(String name, int currentGear){
        super(name);
        this.currentGear = currentGear;
    }


    public void changeGear(int newGear){
         this.currentGear = newGear;
    }

    public void changeSpeed(double newSpeed, double newDirection){
        move(newSpeed,  newDirection);

        if (newSpeed <= 50){
            this.currentGear = 1;
        }
        else if (newSpeed <= 100){
            this.currentGear = 2;
        }
        else if (newSpeed <= 150){
            this.currentGear = 3;
        }
        else if (newSpeed <= 200){
            this.currentGear = 4;
        }
        else if (newSpeed <= 250){
            this.currentGear = 5;
        }
        else{
            this.currentGear = 6;
        }
    }
}
