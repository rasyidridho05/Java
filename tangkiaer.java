
import java.util.Scanner;

public class tangkiaer {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        int t, v, x = 0;
        boolean check = false;
        System.out.println("Volume Tangki :");
        t = Input.nextInt();

        do {
            System.out.println("Masukin Aer :");
            v = Input.nextInt();

            x += v;
            if (x >= t) {
                check = true;
                System.out.println("Volume Air    : " + x);
                System.out.println("Volume Tangki : " + t);
                if (x > t) {
                    System.out.println("Tangki Overload");
                }
            } else {
                System.out.println("Silakan isi air lagi.");
            }
            System.out.println("Tangki Penuh  : " + check);
        } while (check == false);
    }
}
