
import java.util.Scanner;

public class tigabilangan {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        
        System.out.println("Bilangan 1 : ");
        int a = Input.nextInt();
        System.out.println("Bilangan 2 : ");
        int b = Input.nextInt();
        System.out.println("Bilangan 3 : ");
        int c = Input.nextInt();

        if (a >= b) {
            if (a >= c) {
                System.out.println("Bilangan Terbesar adalah A : " + a);
            } else {
                System.out.println("Bilangan Terbesar adalah C : " + c);
            }
        } else {
            if (b >= c) {
                System.out.println("Bilangan Terbesar adalah B : " + b);
            } else {
                System.out.println("Bilangan Terbesar adalah C : " + c);
            }
        }
    }
}
