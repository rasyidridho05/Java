//Muhammad Rasyid Ridho
//103122400018

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {

            if ((i % 2) == 0) {
                System.out.println(i + " Merupakan Bilangan Genap");
            } else {
                System.out.println(i + " Merupakan Bilangan Ganjil");
            }
        }

    }
}
