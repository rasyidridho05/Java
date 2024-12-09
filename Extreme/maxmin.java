
import java.util.ArrayList;
import java.util.Scanner;

public class maxmin {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();
        int n;

        do {
            System.out.println("Input Number : ");
            n = Input.nextInt();
            if (n != 0) {
                number.add(n);
            }
        } while (n != 0);

        int min = number.get(0);
        int max = number.get(0);

        for (int i = 0; i < number.size(); i++) {
            if (number.get(i) < min) {
                min = number.get(i);
            }
            if (number.get(i) > max) {
                max = number.get(i);
            }
        }
        for (int i = 0; i < number.size(); i++) {
            System.out.print("Value : " + number.get(i) + "\t");
        }
        System.out.println("\nMin : " + min + "\nMax : " + max);
    }
}
