
import java.util.Scanner;

public class biggest {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int a, b, c;

        System.out.println("Input a : ");
        a = Input.nextInt();
        System.out.println("Input b : ");
        b = Input.nextInt();
        System.out.println("Input c : ");
        c = Input.nextInt();

        if (a > b && a > c) {
            System.out.println("Angka Terbesar : " + a);
        } else if (b > a && b > c) {
            System.out.println("Angka Terbesar : " + b);
        } else {
            System.out.println("Angka Terbesar : "+ c);
        }
    }
}
