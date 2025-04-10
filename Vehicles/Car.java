package Vehicles;

public class Car extends Vehicle {

    private int numDoors;

    public Car(String brand, int year, int numDoors) {
        super(brand, year);
        this.numDoors = numDoors;
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started with button");
    }
    
    @Override
    public String toString() {
        return super.toString() + ", numDoors : " + numDoors;
    }

}
