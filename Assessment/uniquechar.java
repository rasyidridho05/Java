package Assessment;

import java.util.Scanner;

public class uniquechar {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.print("Masukkan kata : ");
        String kata = Input.nextLine();

        boolean[] karakterTerpakai = new boolean[256]; 
        int jumlahUnik = 0;

        for (char c : kata.toCharArray()) {
            if (!karakterTerpakai[c]) {
                karakterTerpakai[c] = true;
                jumlahUnik++;
            }
        }
        System.out.println("Jumlah karakter unik: " + jumlahUnik);
    }
}

