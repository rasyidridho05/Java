
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int a, b = 10, total = 0;

        System.out.println("Input : ");
        a = Input.nextInt();
        do {
            {
                System.out.print((a % b) / (b / 10) + " ");
                total += (a % b) / (b / 10);
                b = b * 10;
            }
        } while ((a / b) > 0);
        System.out.println((a / (b / 10)));
        System.out.println(total + (a / (b / 10)));
    }
}
