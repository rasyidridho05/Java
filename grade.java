
import java.util.Scanner;

public class grade {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int nilai;

        System.out.print("Input nilai : ");
        nilai = Input.nextInt();
        if (nilai > 89 && nilai <= 100) {
            System.out.println("Nilai : " + nilai + " A");
        } else if (nilai >= 80 && nilai < 90) {
            System.out.println("Nilai : " + nilai + " B");
        } else if (nilai >= 70 && nilai < 80) {
            System.out.println("Nilai : " + nilai + " C");
        } else if (nilai >= 60 && nilai < 70) {
            System.out.println("Nilai : " + nilai + " D");
        } else if (nilai < 60 && nilai >= 0) {
            System.out.println("Nilai" + nilai + " E");
        } else {
            System.out.println("Nilai dapat diinputkan hanya dalam range 0-100");
        }
    }

}
