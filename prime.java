//Muhammad Rasyid Ridho
//103122400018
import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int a, bagi = 0;

        System.out.println("Input a : ");
        a = Input.nextInt();

        for (int i = 2; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    bagi++;
                }
            }
            if (bagi <= 2) {
                System.out.println(i + " Bilangan Prima");
            } else {
                System.out.println(i + " Bukan Bilangan Prima");
            }
            bagi = 0;
        }
    }
}
