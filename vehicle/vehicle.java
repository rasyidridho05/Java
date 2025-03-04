package vehicle;

public class vehicle {
    
    private String plateNumber, vehicleType;
    private double speed;
    private int numWheels;
    
    public vehicle(String plateNumber, double speed) {
        this.plateNumber = plateNumber;
        this.speed = speed;
    }
    
    public vehicle(String plateNumber, String vehicleType, double speed, int numWheels) {
        this.numWheels = numWheels;
        this.plateNumber = plateNumber;
        this.speed = speed;
        this.vehicleType = vehicleType;
    }
    
    public String getPlateNumber() {
        return plateNumber;
    }
    
    public String getVehicleType() {
        return vehicleType;
    }
    
    public int getNumWheels() {
        return numWheels;
    }
    
    public double getSpeed() {
        return speed;
    }
    
    public double calculateTravelTime(double distance) {
        if (speed <= 0) {
            throw new IllegalArgumentException("Speed must be greater than zero");
        }
        return distance / speed;
    }
    
    public double calculateTravelTime(double distance, double customSpeed) {
        if (customSpeed <= 0) {
            throw new IllegalArgumentException("Speed must be greater than zero");
        }
        return distance / customSpeed;
    }
    
    public void print() {
        System.out.println("Plate Number\t\t\t\t: " + plateNumber + "\nSpeed\t\t\t\t\t: " + speed + "\nVehicle Type\t\t\t\t: " + vehicleType +"\nNumber of Wheels\t\t\t: "+numWheels);
        
    }
}
