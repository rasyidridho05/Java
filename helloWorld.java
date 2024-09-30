
import java.util.Scanner;

public class helloWorld {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 15;
        int e = 20;

        System.out.println("Hello World");
        System.out.println("===========================================");
        System.out.print("B = \t");
        int b = input.nextInt();
        System.out.print("C = \t" );
        int c = input.nextInt();
        System.out.print("D = \t" );
        int d = input.nextInt();
        int hasil = a+b+c+d;
        System.out.println("Hasil A + B + C + D =" + hasil);
        System.out.println("===========================================");
        String z = "Nilai A";
        System.out.println("Total :\t" + a);
        System.out.println(z + " : " + a * a);
        if (a >= e) {
            System.out.println("Test");
        } else if (a < e) {
            System.out.println("True");
        } else {
            System.out.println("Text");
        }

        System.out.println("===========================================");

        int bornYear;
        bornYear = 2005;

        int bornMonth;
        bornMonth = 10;

        int bornDay;
        bornDay = 15;

        String date = "Born Date";
        System.out.println(date + "\t" + bornYear + "\t" + bornMonth + "\t" + bornDay);

        System.out.println("===========================================");
        int angka1 = 10;
        int angka2 = 3;

        int pembagian = angka1 / angka2;
        int modulus = angka1 % angka2;

        System.out.println("Pembagian : " + pembagian + "\t" + "Modulus :" + modulus);
    }

}
