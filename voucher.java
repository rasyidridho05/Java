
import java.util.Scanner;

public class voucher {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        int x, d1, d2, d3, d4;
        boolean diskon, cashback;

        System.out.println("Input X : ");
        x = Input.nextInt();

        d2 = (x % 1000) / 10;
        d3 = (x % 100) / 10;
        d1 = x / 1000;
        d4 = x % 10;

        if ((d2 % 2) == 0) {
            diskon = true;
            System.out.println(d2 + " Genap " + diskon);
        } else {
            diskon = false;
            System.out.println(d2 + " Ganjil " + diskon);
        }
        if (((d1 + d3) % d4) == 0) {
            cashback = true;
            System.out.println(d1 + d3 + " Adalah Kelipatan " + d4 + " Cashback : " + cashback);
        } else {
            cashback = false;
            System.out.println(d1 + "+" + d3 + " Bukan Kelipatan " + d4 + " Cashback : " + cashback);
        }
    }
}
