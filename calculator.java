
import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;

        System.out.print("Nilai a: ");
        a = input.nextInt();
        System.out.print("Nilai b: ");
        b = input.nextInt();
        int penjumlahan = a + b;
        int pengurangan = a - b;
        int perkalian = a * b;
        int pembagian = a / b;
        int modulus = a % b;
        System.out.println("Hasil Penjumlahan a + b : " + penjumlahan);
        System.out.println("Hasil Pengurangan a - b : " + pengurangan);
        System.out.println("Hasil Perkalian a * b : " + perkalian);
        System.out.println("Hasil Pembagian a / b : " + pembagian);
        System.out.println("Hasil Modulus a % b : " + modulus);
    }
}
