
import java.util.Scanner;

public class hour {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int h, h1, h2, m, m1, m2;

        System.out.println("H1 :");
        h1 = Input.nextInt();
        System.out.println("M1 :");
        m1 = Input.nextInt();
        System.out.println("H2 :");
        h2 = Input.nextInt();
        System.out.println("M2 :");
        m2 = Input.nextInt();

        h = 0;
        m = 0;

        if (h1 > h2) {
            h = 12 - h1 + h2;
        } else if (h2 >= h1) {
            h = h2 - h1;
        }

        if (m1 > m2) {
            m = 60 - m1 + m2;
        } else if (m2 >= m1) {
            m = m2 - m1;
        }

        if (m > 60) {
            h = h + 1;
            m = m - 60;
        }
        if (h > 12) {
            h = h - 12;
        }

        System.out.println(h + " jam " + m + " menit ");
    }
}
