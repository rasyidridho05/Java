package Assessment;

import java.util.Scanner;

public class sortchar {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Input Kata : ");
        String a = Input.nextLine();

        char[] b = a.toCharArray(); 
        String c = "";
        for (int i = 0; i < b.length; i++) {
            if (b[i] != ' ') {
                c += String.valueOf(b[i]);
            }

            for (int j = i + 1; j < b.length; j++) {
                if (b[i] == b[j] && b[i] != ' ') {
                    c += String.valueOf(b[j]);
                    b[j] = ' ';
                }
            }
         }
            System.out.println(c);
    }
}
