package Assessment;

import java.util.Scanner;

public class hop {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Input Angka :");
        int a = Input.nextInt();

        if (a >= 1 && a <= 20) {
            if (a < 10) {
                for (int j = 1; j <= a; j++) {
                    for (int i = 1; i < a; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println("Hop!");
                }
            } else {
                System.out.println("Apa?");
            }
        } else {
            System.out.println("Angka hanya bisa diinputkan 1 sampai 20");
        }
    }
}
