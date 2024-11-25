
import java.util.Scanner;

public class tol {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int total = 0, count = 0;
        String jk, ag;
        boolean loop = true ;

        do {
            System.out.println("---------------------");
            System.out.println("Jenis kendaraan : ");
            System.out.println("Golongan 1 [Sedan, Jip, Pickup, Truk_Kecil, Minibus, Bus] : ");
            System.out.println("Golongan 2 [Truck_Besar_1] ");
            System.out.println("Golongan 3 [Truck_Besar_2] ");
            System.out.println("Input Jenis Kendaraan atau Stop ");
            jk = Input.nextLine();
            if (jk.equalsIgnoreCase("sedan") || jk.equalsIgnoreCase("jip") || jk.equalsIgnoreCase("pickup") || jk.equalsIgnoreCase("truck_kecil") || jk.equalsIgnoreCase("minibus") || jk.equalsIgnoreCase("bus")) {
                System.out.println("Asal gerbang : ");
                System.out.println("1. KC");
                System.out.println("2. BS");
                ag = Input.nextLine();
                if (ag.equalsIgnoreCase("KC")) {
                    total += 5000;
                    count++;
                    System.out.println("Total : " + total + "\tJumlah Kendaraan : " + count);
                } else if (ag.equalsIgnoreCase("BS")) {
                    total += 6000;
                    count++;
                    System.out.println("Total : " + total + "\tJumlah Kendaraan : " + count);
                } else {
                    System.out.println("Asal gerbang tidak valid");
                }
            } else if (jk.equalsIgnoreCase("truck_besar_1")) {
                System.out.println("Asal gerbang : ");
                System.out.println("1. KC");
                System.out.println("2. BS");
                ag = Input.nextLine();
                if (ag.equalsIgnoreCase("KC")) {
                    total += 7000;
                    count++;
                    System.out.println("Total : " + total + "\tJumlah Kendaraan : " + count);
                } else if (ag.equalsIgnoreCase("BS")) {
                    total += 9000;
                    count++;
                    System.out.println("Total : " + total + "\tJumlah Kendaraan : " + count);
                } else {
                    System.out.println("Asal gerbang tidak valid");
                }
            } else if (jk.equalsIgnoreCase("truck_besar_2")) {
                System.out.println("Asal gerbang : ");
                System.out.println("1. KC");
                System.out.println("2. BS");
                ag = Input.nextLine();
                if (ag.equalsIgnoreCase("KC")) {
                    total += 8000;
                    count++;
                    System.out.println("Total : " + total + "\tJumlah Kendaraan : " + count);

                } else if (ag.equalsIgnoreCase("BS")) {
                    total += 10000;
                    count++;
                    System.out.println("Total : " + total + "\tJumlah Kendaraan : " + count);
                } else {
                    System.out.println("Asal gerbang tidak valid");
                }
            } else if (jk.equalsIgnoreCase("stop")) {
                loop = false;
            } else {
                System.out.println("Jenis kendaraan tidak valid");
            }
        } while (loop != false);
    }
}
