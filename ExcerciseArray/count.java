
import java.util.Scanner;

public class count {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Input N : ");
        int n = Input.nextInt();

        int ka[] = new int[n];
        int kb[] = new int[n];

        System.out.println("Input KA : ");
        for (int i = 0; i < n; i++) {
            ka[i] = Input.nextInt();
        }
        System.out.println("Input KB : ");
        for (int i = 0; i < n; i++) {
            kb[i] = Input.nextInt();
        }
        System.out.println("Input Category : \n1. Odd \n2. Even");
        int c = Input.nextInt();
        switch (c) {
            case 1:
                odd(ka, kb, n);
                break;
            case 2:
                even(ka, kb, n);
                break;
        }
    }

    static void odd(int ka[], int kb[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if ((ka[i] % 2) != 0) {
                count += ka[i];
            }
            if ((kb[i] % 2) != 0) {
                count += kb[i];
            }
        }
        System.out.println("Count Odd : " + count);
    }

    static void even(int ka[], int kb[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if ((ka[i] % 2) == 0 ) {
                count += ka[i];
            }
            if ((kb[i] % 2) == 0) {
                count +=  kb[i];
            }

        }
        System.out.println("Count Even : " + count);
    }
}
