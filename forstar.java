//Muhammad Rasyid Ridho
//103122400018
import java.util.Scanner;

public class forstar {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Input a : ");
        int a = Input.nextInt();
        
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println("Perulangan ke-"+i);
        // }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
