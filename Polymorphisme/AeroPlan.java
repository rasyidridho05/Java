package Polymorphisme;

public class AeroPlan extends Vehicle {

    @Override
    public void fuel() {
        System.out.println("fuels");
    }

    @Override
    public void walk() {
        System.out.println("Aeroplan Flying");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        AeroPlan garuda = new AeroPlan();
        garuda.function();
        garuda.fuel();
        garuda.walk();

    }

}
