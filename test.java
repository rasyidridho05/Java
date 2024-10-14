//103122400018  - Muhammad Rasyid Ridho
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int hari;
        String namaHari;
        System.out.print("Hari ke :");
        hari = Input.nextInt();

        //Penggunaan SWITCH CASE
        switch (hari) {
            case 1:
                namaHari = "Senin";
                break;
            case 2:
                namaHari = "Selasa";
                break;
            case 3:
                namaHari = "Rabu";
                break;
            case 4:
                namaHari = "Kamis";
                break;
            case 5:
                namaHari = "Jumat";
                break;
            case 6:
                namaHari = "Sabtu";
                break;
            case 7:
                namaHari = "Minggu";
                break;
            default:
                namaHari = "Hari tidak valid";
                break;
        }
        System.out.println("Hari ke-" + hari + " adalah " + namaHari);


        //Penggunaan IF ELSE IF
        int x = 8;
        if (x > 10) {
            System.out.println("x lebih besar dari 10");
        }
        if (x > 5) {
            System.out.println("x lebih besar dari 5");
        } else {
            System.out.println("x tidak lebih besar dari 5");
        }
        if (x > 10) {
            System.out.println("x lebih besar dari 10");
        } else if (x > 5) {
            System.out.println("x lebih besar dari 5, tapi tidak lebih besar dari 10");
        } else if (x > 0) {
            System.out.println("x lebih besar dari 0, tapi tidak lebih besar dari 5");
        } else {
            System.out.println("x kurang dari atau sama dengan 0");
        }
    }

}

}
