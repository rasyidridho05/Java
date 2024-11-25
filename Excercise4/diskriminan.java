
import java.util.Scanner;

public class diskriminan {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Input a");
        float a = Input.nextFloat();
        System.out.println("Input b");
        float b = Input.nextFloat();
        System.out.println("Input c");
        float c = Input.nextFloat();

        float d = (b * b) - (4 * a * c);

        if (d >= 0) {
            System.out.println("Memiliki Akar Real | Nilai D : " + d);
        } else {
            System.out.println("Tidak Memiliki Akar Real | Nilai D : " + d);
        }
    }
}
