package Vehicles;

public abstract class Vehicle {

    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public abstract void startEngine();

    public String toString() {
        return "Brand : " + brand + ", Year : " + year;
    }
}
