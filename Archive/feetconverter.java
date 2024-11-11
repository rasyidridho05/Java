
import java.util.Scanner;

public class feetconverter {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Long in Feet : ");
        double feet = Input.nextDouble();

        double meter = feet * 0.3048;

        System.out.println("Long in Meter : " + meter);
    }
}
