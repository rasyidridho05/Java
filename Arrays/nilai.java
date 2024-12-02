//103122400018 Muhammad Rasyid Ridho
import java.util.ArrayList;
import java.util.Scanner;

public class nilai {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        ArrayList matkul = new ArrayList();
        ArrayList nilai = new ArrayList();
        int total = 0;

        System.out.println("Input Length : ");
        int length = Input.nextInt();

        Input.nextLine();

        for (int i = 0; i < length; i++) {
            System.out.println("Input Matkul : ");
            String mata = Input.nextLine();
            matkul.add(mata);
        }

        for (int j = 0; j < length; j++) {
            System.out.println(matkul.get(j)+" : ");
            int n = Input.nextInt();
            total += n;
            nilai.add(n);
        }
        double rata = total/nilai.size();

        for (int k = 0; k < length; k++) {
            System.out.println(matkul.get(k) + " : " + nilai.get(k));
        }
        System.out.println("Rata : "+ rata);
    }
}
