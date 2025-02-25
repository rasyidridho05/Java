package jt;

import java.util.Scanner;

public class inch_converter {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        double inc = 2.54, cm, in;

        System.out.print("Input length in Inch : ");
        in = Input.nextDouble();
        Input.nextLine();

            System.out.println("Inch   |  Cm");
        for (double i = 1.0; i <= in; i++) {
            cm = i * inc;
            System.out.printf("%-6.2f | %.2f%n", i, cm);
        }

    }

}
