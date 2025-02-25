package jt;

public class temperature {

    public static void main(String[] args) {
        
        System.out.println("Celsius   Fahrenheit   |   Fahrenheit   Celsius");
        System.out.println("-----------------------------------------------");

        for (int celsius = 0, fahrenheit = 20; celsius <= 98; celsius += 2, fahrenheit += 5) {
            
            double f = (9.0 / 5) * celsius + 32;
            double c = (5.0 / 9) * (fahrenheit - 32);

            System.out.printf("%-9d %-12.1f |   %-11d %.3f%n", celsius, f, fahrenheit, c);
        }
    }

}
