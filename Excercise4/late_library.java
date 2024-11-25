
import java.util.Scanner;

public class late_library {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Input Hari Keterlambatan : ");
        int day = Input.nextInt();

        if (day > 0 && day <= 5) {
            System.out.println("Denda : Rp." + (day * 1000));
        } else if (day <= 10) {
            System.out.println("Denda : Rp."+(day*2000));
        } else {
            System.out.println("Keanggotaan Dicabut");
        }
    }
}
