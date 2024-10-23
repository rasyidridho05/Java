
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
            }
            System.out.println("Nilai X : "+ x);
            System.out.println("V Tangki : "+ t);
            System.out.println(check);

        } while (check == false);
    }
}
