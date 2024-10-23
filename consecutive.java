
import java.util.Scanner;

public class consecutive {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int a, b = 100, selisih;

        System.out.println("Input : ");
        a = Input.nextInt();
        do {
            //selisih = (a % b) / (b / 10) - (a % (b * 10)) / (b / 10);
            selisih = (a % b) / (b / 10) - (a % (b / 10)) / (b / 100);
            b = b * 10;

            if (selisih < 0) {
                selisih *= -1;
                System.out.println("Selisih : "+selisih);
            }

            if (selisih > 1) {
                break;
            }
        } while ((a / b) > 10);
        System.out.println((selisih == 1) ? "true" : "false");
    }
}
