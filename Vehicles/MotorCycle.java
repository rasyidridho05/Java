package Vehicles;

public class MotorCycle extends Vehicle {

    private String type;

    public MotorCycle(String brand, int year, String type) {
        super(brand, year);
        this.type = type;
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine start with key");
    }

    @Override
    public String toString() {
        return super.toString() + ", Type : " + type;
    }
}
