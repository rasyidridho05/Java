
package Vehicles;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2021, 4);
        MotorCycle motor = new MotorCycle("Yamaha", 2020, "Sport");
        
        car.startEngine();
        System.out.println(car);
        
        motor.startEngine();
        System.out.println(motor);
    }
}
