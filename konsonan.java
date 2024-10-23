
import java.util.Scanner;

public class konsonan {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        char huruf;

        System.out.println("Masukin Huruf : ");
        huruf = Input.next().charAt(0);

        if (huruf != 'a' && huruf != 'i' && huruf != 'u' && huruf != 'o' && huruf != 'e' ) {
            System.out.println("Konsonan");
        } else{
            System.out.println("Vokal");
        }
    }
}
