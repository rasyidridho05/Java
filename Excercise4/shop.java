
import java.util.Scanner;

public class shop {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int harga = 0, counta = 0, countb = 0, countc = 0, countd = 0, counte = 0;
        boolean n = false;
        do {
            System.out.println("Do you wanna buy something?");
            System.out.println("1. Sabun Cuci Muka");
            System.out.println("2. Shampoo Bermerk");
            System.out.println("3. Sikat Gigi");
            System.out.println("4. Pepsodinel");
            System.out.println("5. Obsidian");
            System.out.println("6. Exit");
            int option = Input.nextInt();

            if (option == 1) {
                harga += 2980;
                counta++;
            } else if (option == 2) {
                countb++;
                harga += 4500;
            } else if (option == 3) {
                harga += 9980;
                countc++;
            } else if (option == 4) {
                harga += 4490;
                countd++;

            } else if (option == 5) {
                harga += 6870;
                counte++;
            } else if (option == 6) {
                n = true;
            }
             else {
                System.out.println("Input just between 1 - 5");
            }

        } while (n != true);
        System.out.println("Total Belanja : " + harga);
        System.out.println("Jumlah Sabun Cuci Muka : " + counta);
        System.out.println("Jumlah Shampoo Bermerk : " + countb);
        System.out.println("Jumlah Pepsodinel : "+ countc);
        System.out.println("Jumlah Obsidian : "+countd);
        System.out.println("Jumlah Sabun Cuci Muka : "+counte);
    }
}
