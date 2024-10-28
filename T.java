/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl_1;

import java.util.Scanner;

/**
 *
 * @author rasyi
 */
public class T {
    public static void main(String[] args) {
//        input:
//        1. golongan
//        2. Id masuk & keluar
//        Kota : Dupak, Waru, Sidoarjo, Porong, Kejapanan, Gempol
        Scanner input = new Scanner(System.in);
        String kotaAwal[] = {"Dupak", "Waru", "Sidoarjo", "Porong", "Kejapanan", "Gempol"};
        String kotaTujuan[] = {" ","Waru", "Sidoarjo", "Porong", "Kejapanan", "Gempol"};
        String golKendaraan[]={"Sedan, Jeep, Pick up","Truck 2 Sumbu Roda","Truck 3 Sumbu Roda"};

        System.out.print("ID Kota Awal       : ");
        int idm = input.nextInt();
        System.out.print("ID Kota Tujuan     : ");
        int idk = input.nextInt();
        System.out.print("Golongan Kendaraan : ");
        int gol = input.nextInt();

        System.out.println("===========================");

        System.out.println("ID Kota Awal : " + kotaAwal[idm - 1]);
        System.out.println("ID kota Tujuan : " + kotaTujuan[idk - 1]);
        System.out.println("Golongan Kendaraan : " + gol +"\n Jenis Kendaraan : "+golKendaraan[gol-1]);
        System.out.println("Tarif : " + hitung(kotaAwal[idm - 1], kotaTujuan[idk - 1], gol));

    }

    static int hitung(String kotaAwal, String kotaTujuan, int gol) {
//    String gol[] = {"Sedan, Jeep, Pick Up","Truck 2 Sumbu Roda","Truck 3 Sumbu Roda"};
        int hitung =0;
        int biaya = 0;
        if (kotaAwal.equalsIgnoreCase("Dupak")) {
            if (kotaTujuan.equalsIgnoreCase("Waru")) {

                if (gol == 1) {
                    biaya = 5000;
                } else if (gol == 2) {
                    biaya = 8000;
                } else if (gol == 3) {
                    biaya = 8000;
                }
            }
        } else if (kotaAwal.equalsIgnoreCase("Waru")) {
            if (kotaTujuan.equalsIgnoreCase("Sidoarjo")) {

                if (gol == 1) {
                    biaya = 6000;
                } else if (gol == 2) {
                    biaya = 9000;
                } else if (gol == 3) {
                    biaya = 9000;
                }
            } else if (kotaTujuan.equalsIgnoreCase("Porong")) {
                if (gol == 1) {
                    biaya = 9000;
                } else if (gol == 2) {
                    biaya = 14000;
                } else if (gol == 3) {
                    biaya = 14000;
                }
            }
        } else if (kotaAwal.equalsIgnoreCase("Sidoarjo")) {
            if (kotaTujuan.equalsIgnoreCase("Waru")) {
                if (gol == 1) {
                    biaya = 6000;
                } else if (gol == 2) {
                    biaya = 9000;
                } else if (gol == 3) {
                    biaya = 9000;
                }
            } else if (kotaTujuan.equalsIgnoreCase("Porong")) {
                if (gol == 1) {
                    biaya = 5500;
                } else if (gol == 2) {
                    biaya = 8500;
                } else if (gol == 3) {
                    biaya = 8500;
                }
            }
        } else if (kotaAwal.equalsIgnoreCase("Porong")) {
            if (kotaTujuan.equalsIgnoreCase("Sidoarjo")) {
                if (gol == 1) {
                    biaya = 5500;
                } else if (gol == 2) {
                    biaya = 8500;
                } else if (gol == 3) {
                    biaya = 8500;
                }
            } else if (kotaTujuan.equalsIgnoreCase("Waru")) {
                if (gol == 1) {
                    biaya = 9000;
                } else if (gol == 2) {
                    biaya = 14000;
                } else if (gol == 3) {
                    biaya = 14000;
                }
            }
        }
    return biaya;    
    }
}
