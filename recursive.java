
import java.util.Scanner;

public class recursive {

    public static int countFactorial(int n) {
        if (n == 0) {
            return 20;
        } else {
            return n;
        }
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Input N :");
        int n = Input.nextInt();

        int result = countFactorial(n);
        System.out.println("Factorial N " + n + " adalah " + result);

    }

}

