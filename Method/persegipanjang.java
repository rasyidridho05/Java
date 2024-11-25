
import java.util.Scanner;

public class persegipanjang {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Input Panjang : ");
        int p = Input.nextInt();
        System.out.println("Input Lebar : ");
        int l = Input.nextInt();

        int luas = Luas(p, l);
        System.out.println("Luas : " + luas);

    }

    static int Luas(int p, int l) {
        int luas = p * l;
        return luas;
    }
}
