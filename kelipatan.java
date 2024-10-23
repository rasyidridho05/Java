
import java.util.Scanner;

public class kelipatan {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int a;

        System.out.println("Angka : ");
        a = Input.nextInt();

        if ((a % 3 == 0)) {
            System.out.println("Kelipatan 3");
        }
        if ((a % 5 == 0)) {
            System.out.println("Kelipatan 5");
        } else {
            System.out.println("Tidak termasuk kelipatan 3 atau 5");
        }

    }
}
