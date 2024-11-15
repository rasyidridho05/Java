//Muhammad Rasyid Ridho
//103122400018

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Input Angka : ");
        int a = Input.nextInt();
        int i = Input.nextInt();
        i = i + (1-i%2);
        a = a - (1-a%2); 
        
        for (i = i; i <= a; i+=2) {
            System.out.print(i + " ");
        }
    }
}
