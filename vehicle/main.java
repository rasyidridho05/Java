package vehicle;

public class main {

    public static void main(String[] args) {
        vehicle car = new vehicle("AB1234CD", "Mercedez", 50.0, 4);
        vehicle motor = new vehicle("YH0901HI", 90.0);
        double distance = 900.0;

        car.print();
        System.out.println("Travel Time " + distance + " km\t\t\t:" + car.calculateTravelTime(distance) + " hours");
        System.out.println("Custom Speed Time Travel " + distance + " km\t:" + car.calculateTravelTime(distance, 150.0) + " hours");

        System.out.println("");

        motor.print();
        System.out.println("Travel Time " + distance + " km\t\t\t:" + motor.calculateTravelTime(distance) + "hours");
        System.out.println("Custom Speed Time Travel " + distance + " km\t:" + motor.calculateTravelTime(distance, 1000.0) + " hours");

    }
}
