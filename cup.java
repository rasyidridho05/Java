
import java.util.Scanner;

public class cup {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        int n, m, x, y, c = 0;

        System.out.println("Input N");
        n = Input.nextInt();
        System.out.println("Input M");
        m = Input.nextInt();
        System.out.println("Input X");
        x = Input.nextInt();
        System.out.println("Input Y");
        y = Input.nextInt();

        while ((n - x )>= 0 && (m - y) >=0) {
            n = n - x;
            m = m - y;
            c++;
        }
        System.out.println(c);
    }
}
