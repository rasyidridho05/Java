
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Input N : ");
        int n = Input.nextInt();

        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0) {
                System.out.println(i + " true");
            } else {
                System.out.println(i + " false");
            }
        }
    }
}
