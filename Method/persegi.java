
import java.util.Scanner;

public class persegi {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Input Sisi : ");
        int sisi = Input.nextInt();
        int total = persegi(sisi);
        System.out.println("Total : "+total);
    }

    static int persegi(int sisi){
        int luas = sisi*sisi;
        return luas;
    }
}
