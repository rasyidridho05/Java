
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int a, b, c, sisaA;

        System.out.println("Penumpang :");
        c = Input.nextInt();

        a = 0;
        b = 0;
        sisaA = 0;
        if (c > 0) {
            if (c / 5 != 0) {
                a = c / 5;
                sisaA = c % 5;
            } else {
                a = a + 1;
            }
            if (sisaA / 2 != 0) {
                b = sisaA % 2;
            } else {
                b = b + 1;
            }
        }
        System.out.println("Jumlah Besar " + a);
        System.out.println("Jumlah Kecil " + b);
        System.out.println("Jumlah Sisa " + sisaA);
    }
}
