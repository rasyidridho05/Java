
import java.util.Scanner;

public class triangle {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Input n : ");
        int n = Input.nextInt();

        int sisi[] = new int[n * 3];

        for (int i = 0; i < n * 3; i++) {
            if (i < 3) {              
                System.out.println("Input Sisi ke " + (i + 1));
                sisi[i] = Input.nextInt();
            } else {
                System.out.println("Input Sisi ke " + (i - 2));
                sisi[i] = Input.nextInt();
            }
        }
        triangletype(sisi, n);
    }

    static void triangletype(int[] sisi, int n) {
        for (int i = 0; i < n * 3; i += 3) {
            String type;
            int a = sisi[i];
            int b = sisi[i + 1];
            int c = sisi[i + 2];

            if (a == b && b == c) {
                type = "Segitiga sama sisi";
            } else if (a == b || a == c || b == c) {
                type = "Segitiga sama kaki";
            } else {
                type = "Segitiga sembarang";
            }
            System.out.println("Segitiga ke " + (i / 3 + 1) + " adalah " + type + " | " + a + " " + b + " " + c);
        }

        // for (int j = 0; j < sisi.length; j++) {
        //     System.out.println(sisi[j]);
        // }
    }
}
