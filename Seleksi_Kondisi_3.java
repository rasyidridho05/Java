package ukl;

import java.util.Scanner;

public class Seleksi_Kondisi_3 {
    // biaya = DSP + (SPP*bulan)
    // output :
    // 1. Id mahasiswa
    // 2. nama mahasiswa
    // 3. jalur masuk
    // 4. kategori pendapatan
    // 5. Jumlah biaya yang dikeluarkan
    // 6. alamat
    // input :
    // 1. Id mahasiswa
    // 2. Jumlah pendapatan orang tua
    // 3. Jumlah SPP yang akan di bayar

    static String kategori(int pendapatan) {
        String kategori = "";
        if (pendapatan > 10000000) {
            kategori = "C";
        } else if (pendapatan >= 200000) {
            kategori = "B";
        } else if (pendapatan < 2000000) {
            kategori = "A";
        }

        return kategori;
    }

    static int biaya(String jalur, String kategori, int bulan) {
        int biaya = 0;
        if (jalur.equalsIgnoreCase("SBMPTN")) {
            if (kategori.equalsIgnoreCase("A")) {
                biaya = 5000000 + (500000 * bulan);
            } else if (kategori.equalsIgnoreCase("B")) {
                biaya = 15000000 + (1000000 * bulan);
            } else if (kategori.equalsIgnoreCase("C")) {
                biaya = 30000000 + (2000000 * bulan);
            }

        } else if (jalur.equalsIgnoreCase("SNMPTN")) {
            if (kategori.equalsIgnoreCase("A")) {
                biaya = 7000000 + (500000 * bulan);
            } else if (kategori.equalsIgnoreCase("B")) {
                biaya = 17000000 + (1000000 * bulan);
            } else if (kategori.equalsIgnoreCase("C")) {
                biaya = 35000000 + (2000000 * bulan);
            }

        } else if (jalur.equalsIgnoreCase("Mandiri")) {
            if (kategori.equalsIgnoreCase("A")) {
                biaya = 10000000 + (1000000 * bulan);
            } else if (kategori.equalsIgnoreCase("B")) {
                biaya = 25000000 + (2000000 * bulan);
            } else if (kategori.equalsIgnoreCase("C")) {
                biaya = 50000000 + (3000000 * bulan);
            }

        }
        return biaya;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id, pendapatan = 0, bulan;
        String nama[] = {"Mira", "Nina", "Oemar", "Pena"};
        String jalur[] = {"SBMPTN", "SNMPTN", "Mandiri", "SBMPTN"};
        String alamat[] = {"Sawojajar", "Kedung Kandang", "Ijen", "Dinoyo"};

        System.out.print("ID Mahasiswa        : ");
        id = input.nextInt();
        System.out.print("Jumlah Pendapatan   : ");
        pendapatan = input.nextInt();
        System.out.print("Bulan Bayar         : ");
        bulan = input.nextInt();

        System.out.println("\n============================");

        System.out.println("ID Mahasiswa        : "+ id);
        System.out.println("Nama Mahasiswa      : "+ nama[id - 1]);
        System.out.println("Jalur masuk         : "+ jalur[id - 1]);
        System.out.println("Kategori Pendapatan : " + kategori(pendapatan));
        System.out.println("Biaya               : " + biaya(jalur[id - 1], kategori(pendapatan), bulan));
        System.out.println("Alamat              : " + alamat[id - 1]);

    }
}
