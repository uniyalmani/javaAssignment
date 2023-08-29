package assignment2;

public class Vehicle {


    private String name;
    private double currentSpeed;
    private double direction;

    public Vehicle(String name){
        this.name = name;
        this.direction = 0;
        this.currentSpeed = 0;
    }
    
    public void move(double speed, double direction){
        this.currentSpeed = speed;
        this.direction = direction;
    }

    public void steer(double direction){
        this.direction += direction;
    }

    public void stop(){
        this.currentSpeed = 0;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getDirection(){
        return this.direction;
    }

    public void setDirection(double direction){
        this.direction = direction;
    }

    public double getcurrentSpeed(){
        return this.currentSpeed;
    }

    public void getcurrentSpeed(double currentSpeed){
        this.currentSpeed = currentSpeed;
    }
}
