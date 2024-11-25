
import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Input Luas : ");
        double luas = Input.nextDouble();

        double r = luas/(22/7);

        r = Math.sqrt(r);

        double diameter = 2*r;

        System.out.println("Diameter: "+diameter);

    }
}
