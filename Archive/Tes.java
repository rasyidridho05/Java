package ukl_1;

import java.util.Scanner;

public class Tes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama[] = {"Sedan, Jip, Pick Up", "Truk dengan 2 sumbu roda", "Truk dengan 3 sumbu roda"};
        String Gol[] = {"1", "2", "3"};
        String Area1[] = {"Dupak", "Waru", "Sidoarjo", "Porong", "Kejapanan", "Gempol"};
        String Area2[] = {" ", "Waru", "Sidoarjo", "Porong", "Kejapanan", "Gempol"};
        int id, a, b;
        int biaya;

        System.out.print("golongan       : ");
        id = input.nextInt();
        if (id < 1 || id > Gol.length) {
            System.out.println("!!WRONG DATA!!");
            System.exit(id);
        }
        System.out.print("Kota Masuk     : ");
        a = input.nextInt();
        if (a < 1 || a > Area1.length) {
            System.out.println("!!WRONG DATA!!");
            System.exit(a);
        }
        System.out.print("Kota Keluar    : ");
        b = input.nextInt();
        if (b < 2 || b > Area2.length) {
            System.out.println("!!WRONG DATA!!");
            System.exit(b);
        }

        System.out.println("\n|================================================|");
        System.out.println("golongan            : " + Gol[id - 1]);
        System.out.println("jenis kendaraan     : " + nama[id - 1]);
        System.out.println("Kota Masuk          : " + Area1[a - 1]);
        System.out.println("Kota Keluar         : " + Area2[b - 1]);
        System.out.println("tarif kendaraan     : " + biaya (Area1[a - 1], Area2[b - 1], Gol[id - 1]));
    }

    static int biaya(String Area1, String Area2, int id) {
        int hitung = 0;
        int biaya = 0;
        if (Area1.equalsIgnoreCase("Dupak")) {
            if (Area2.equalsIgnoreCase("Waru")) {

                if (id == 1) {
                    biaya = 5000;
                } else if (id == 2) {
                    biaya = 8000;
                } else if (id == 3) {
                    biaya = 8000;
                }
            }
        } else if (Area1.equalsIgnoreCase("Waru")) {
            if (Area2.equalsIgnoreCase("Sidoarjo")) {

                if (id == 1) {
                    biaya = 6000;
                } else if (id == 2) {
                    biaya = 9000;
                } else if (id == 3) {
                    biaya = 9000;
                }
            } else if (Area2.equalsIgnoreCase("Porong")) {
                if (id == 1) {
                    biaya = 9000;
                } else if (id == 2) {
                    biaya = 14000;
                } else if (id == 3) {
                    biaya = 14000;
                }
            }
        } else if (Area1.equalsIgnoreCase("Sidoarjo")) {
            if (Area2.equalsIgnoreCase("Waru")) {
                if (id == 1) {
                    biaya = 6000;
                } else if (id == 2) {
                    biaya = 9000;
                } else if (id == 3) {
                    biaya = 9000;
                }
            } else if (Area2.equalsIgnoreCase("Porong")) {
                if (id == 1) {
                    biaya = 5500;
                } else if (id == 2) {
                    biaya = 8500;
                } else if (id == 3) {
                    biaya = 8500;
                }
            }
        } else if (Area1.equalsIgnoreCase("Porong")) {
            if (Area2.equalsIgnoreCase("Sidoarjo")) {
                if (id == 1) {
                    biaya = 5500;
                } else if (id == 2) {
                    biaya = 8500;
                } else if (id == 3) {
                    biaya = 8500;
                }
            } else if (Area2.equalsIgnoreCase("Waru")) {
                if (id == 1) {
                    biaya = 9000;
                } else if (id == 2) {
                    biaya = 14000;
                } else if (id == 3) {
                    biaya = 14000;
                }
            }
        }
        return biaya;
    }
}
