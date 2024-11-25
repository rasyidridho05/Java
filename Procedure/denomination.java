
import java.util.Scanner;

public class denomination {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Input Uang : ");
        int uang = Input.nextInt();
        denom(uang);
    }

    static void denom(int uang) {
        int a = uang / 10000;
        uang = uang % 10000;
        int b = uang / 2000;
        uang = uang % 2000;
        int c = uang / 1000;

        System.out.println("10000 : "+a);
        System.out.println("2000 : "+b);
        System.out.println("1000 : "+c);
    }
}
