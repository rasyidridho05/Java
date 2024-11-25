
import java.util.Scanner;

public class oddeven {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Input Angka : ");
        int a = Input.nextInt();

        boolean result = check(a);

        if (result) {
            System.out.println(a + " Adalah Bilangan Genap");
        } else {
            System.out.println(a + " Adalah Bilangan Ganjil");
        }
    }

    static boolean check(int a) {
        boolean b = a % 2 == 0;
        return b;
    }
}
