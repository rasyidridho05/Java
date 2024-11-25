
import java.util.Random;

public class dice {

    public static void main(String[] args) {
        Random ran = new Random();

        boolean odd;
        int a = ran.nextInt(6) + 1;
        int b = ran.nextInt(6) + 1;
        int c = ran.nextInt(6) + 1;

        if ((a % 2) == 0) {
            odd = false;
            System.out.println(a + " Ganjil : " + odd);
        } else {
            odd = true;
            System.out.println(a + " Ganjil : " + odd);
        }
        if ((b % 2) == 0) {
            odd = false;
            System.out.println(b + " Ganjil : " + odd);
        } else {
            odd = true;
            System.out.println(b + " Ganjil : " + odd);
        }
        if ((c % 2) == 0) {
            odd = false;
            System.out.println(c + " Ganjil : " + odd);
        } else {
            odd = true;
            System.out.println(c + " Ganjil : " + odd);
        }
    }
}
