
import java.util.Scanner;

public class goal {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int a, b;

        System.out.println("Input Your Goal : ");
        a = Input.nextInt();
        System.out.println("Input Enemy Goal : ");
        b = Input.nextInt();

        if (a > b) {
            System.out.println("You Win");
        } else {
            System.out.println("You Lose");
        }
    }
}
