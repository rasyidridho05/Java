
import java.util.Scanner;

public class rectangle {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int l, w;

        System.out.println("Input Long : ");
        l = Input.nextInt();
        System.out.println("Input Width : ");
        w = Input.nextInt();

        int around = 2 * (l + w);

        System.out.println("Around : " + around);

    }
}
