
import java.util.Scanner;

public class countodd {


    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        int number, count = 0;
        do {
            System.out.println("Input Number : ");
            number = Input.nextInt();
            if ((number % 2) != 0) {
                count += number;
            }
        } while (number != 0);
        System.out.println("Count : "+count);
        
    }
}
