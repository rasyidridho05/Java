
//103122400018
//Muhammad Rasyid Ridho
import java.util.Scanner;

public class student {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Input Nama :");
        String nama = Input.nextLine();
        System.out.println("Input No Matkul :");
        String no = Input.nextLine();
        System.out.println("Input Nilai Bahasa");
        int a = Input.nextInt();
        System.out.println("Input Nilai Inggris");
        int b = Input.nextInt();
        System.out.println("Input Nilai Matematika");
        int c = Input.nextInt();
        rata(a, b, c, nama, no);
    }

    static void rata(int a, int b, int c, String nama, String no) {
        int total = (a + b + c) / 3;
        System.out.println("Nama : " + nama + "\nNo Matkul : " + no + "\nNilai Bahasa : " + a + "\nNilai Bahasa Inggris : " + b + "\nNilai Matematika : " + c + "\nRata-Rata : " + total);

    }
}
