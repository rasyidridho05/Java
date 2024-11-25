
import java.util.Scanner;

public class weight {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        int w1, w2, w3, k1, k2, k3, total;

        System.out.println("Input First Weight : ");
        w1 = Input.nextInt();
        System.out.println("Input Second Weight : ");
        w2 = Input.nextInt();
        System.out.println("Input Third Weight : ");
        w3 = Input.nextInt();

        k1 = w1 / 1000;
        k2 = w2 / 1000;
        k3 = w3 / 1000;

        total = k1 + k2 + k3;
        System.out.println("Total : " + total +" Kg");

    }

}
