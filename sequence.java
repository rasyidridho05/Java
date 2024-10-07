
import java.util.Scanner;

public class sequence {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        double m, cm, inc;
        System.out.print("Masukan ukuran dalam Meter :");
        m = Input.nextInt();
        cm = m * 100;
        inc = m * 100 / 2.54f;
        System.out.println("Ukuran dalam Centimeter : " + cm);
        System.out.println("Ukuran dalam Inch : " + inc);

    }
}
