package assignment2;

public class Boat implements WaterVehicle {
    

    private String name;
    private int capacity;
    
    public Boat(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }


    public String getVehicleName(){
        return this.name;
    }

    public int  getVehicleCapacity(){
        return this.capacity;
    }

}
