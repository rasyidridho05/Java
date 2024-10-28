
import java.util.Scanner;

public class secretmessaga {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Masukan pesan anda : ");
        String message = Input.nextLine();

        if (message.length() <= 20) {
            System.out.println("" + message.charAt(0) + "" + message.charAt(4) + "" + message.charAt(8) + "" + message.charAt(12));
        } else {
            System.out.println("Pesan anda terlalu panjang");
        }
    
    }
}
