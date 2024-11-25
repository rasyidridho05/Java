
import java.util.Scanner;

public class centerdigit {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Input 4 Digit : ");
        int digit = Input.nextInt();

        System.out.println("Center digit : ");
        int center = Input.nextInt();

        int d1 = digit / 1000;
        int d2 = (digit % 1000) / 100;
        int d3 = (digit %100) / 10;
        int d4 = digit % 10;

        System.out.println(d1 + "" + d2 + "" + center + "" + d3 + "" + d4);
    }
}
