package ukl_1;

import java.util.Scanner;

public class UKL_7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama[] = {"Ali", "Budi", "Dani", "Edi", "Umar"};
        String gol[] = {"Weekday", "Weekend", "Holiday"};
        String cottage[] = {"Duku", "Jeruk", "Alpukat", "Jambu Air", "Durian", "Melon", "Belimbing", "Mangga", "Kedondog", "Barrack"};
        int id, t, a, c, hari = 0;
        int person;

        System.out.print("ID Pelanggan      : ");
        id = input.nextInt();
        if (id > nama.length || id < 1) {
            System.out.println("Sorry ID can't found");
            System.exit(id);
        }
        System.out.println("Pilihan Cottage   : ");
        System.out.println("1. Duku \t 2. Jeruk \t 3. Alpukat");
        System.out.println("4. Jambu Air \t 5. Durian \t 6. Melon");
        System.out.println("7. Belimbing \t 8. Mangga \t 9. Kedondong");
        System.out.println("10. Barrack");
        System.out.print("Pilihan Anda     :");
        c = input.nextInt();
        if (c > cottage.length || c < 1) {
            System.out.println("Sorry, Cottage can't found");
            System.exit(c);
        }
        System.out.print("Person           :");
        person = input.nextInt();
        System.out.print("Waktu Check in   : ");
        a = input.nextInt();
        if (a > gol.length || a < 1) {
            System.out.println("Sorry, The check in Day can't be found");
            System.exit(a);
        }
        System.out.print("Lama menginap    : ");
        hari = input.nextInt();

        System.out.println("==========================\n");
        System.out.println("ID Pelanggan   : " + id);
        System.out.println("Nama pelanggan : " + nama[id - 1]);
        System.out.println("Cottage        : " + cottage[c - 1]);
        System.out.println("Person         : " + person);
        System.out.println("Check in       : " + gol[a - 1]);
        System.out.println("Lama menginap  : " + hari + " hari");
        System.out.println("Biaya          : " + biaya(cottage[c - 1], hari, gol[a - 1]));
    }

    static int biaya(String cottage, int hari, String gol) {
        int biaya = 0;
        int harga1 = 0, harga2 = 0, harga3 = 0;
        int person = 0;
        if (cottage.equalsIgnoreCase("Duku")) {
            System.out.println("Room            : 2 person");
            if (gol.equalsIgnoreCase("weekday")) {
                harga1 = 915000 * hari;
                System.out.println("Biaya          : " + harga1);
            } else if (gol.equalsIgnoreCase("weekend")) {
                harga2 = 1025000 * hari;
                System.out.println("Biaya          : " + harga2);
            } else if (gol.equalsIgnoreCase("holiday")) {
                harga3 = 1225000 * hari;
                System.out.println("Biaya          : " + harga3);
            }

        } else if (cottage.equalsIgnoreCase("Jeruk")) {
            System.out.println("Room           : 2 person");
            if (gol.equalsIgnoreCase("weekday")) {
                harga1 = 915000 * hari;
                System.out.println("Biaya          : " + harga1);
            } else if (gol.equalsIgnoreCase("weekend")) {
                harga2 = 1025000 * hari;
                System.out.println("Biaya          : " + harga2);
            } else if (gol.equalsIgnoreCase("holiday")) {
                harga3 = 1225000 * hari;
                System.out.println("Biaya          : " + harga3);
            }
        } else if (cottage.equalsIgnoreCase("Alpukat")) {
            System.out.println("Room           : 1 person");
            if (gol.equalsIgnoreCase("weekday")) {
                harga1 = 575000 * hari;
                System.out.println("Biaya          : " + harga1);
            } else if (gol.equalsIgnoreCase("weekend")) {
                harga2 = 695000 * hari;
                System.out.println("Biaya          : " + harga2);
            } else if (gol.equalsIgnoreCase("holiday")) {
                harga3 = 895000 * hari;
                System.out.println("Biaya          : " + harga3);
            }
        } else if (cottage.equalsIgnoreCase("Jambu Air")) {
            System.out.println("Room           : 1 person");
            if (gol.equalsIgnoreCase("weekday")) {
                harga1 = 575000 * hari;
                System.out.println("Biaya          : " + harga1);
            } else if (gol.equalsIgnoreCase("weekend")) {
                harga2 = 695000 * hari;
                System.out.println("Biaya          : " + harga2);
            } else if (gol.equalsIgnoreCase("holiday")) {
                harga3 = 895000 * hari;
                System.out.println("Biaya          : " + harga3);
            }

        } else if (cottage.equalsIgnoreCase("Durian")) {
            System.out.println("Room            : 2 person");
            if (gol.equalsIgnoreCase("weekday")) {
                harga1 = 595000 * hari;
                System.out.println("Biaya          : " + harga1);
            } else if (gol.equalsIgnoreCase("weekend")) {
                harga2 = 715000 * hari;
                System.out.println("Biaya          : " + harga2);
            } else if (gol.equalsIgnoreCase("holiday")) {
                harga3 = 915000 * hari;
                System.out.println("Biaya          : " + harga3);
            }
        } else if (cottage.equalsIgnoreCase("Melon")) {
            System.out.println("Room           : 2 person");
            if (gol.equalsIgnoreCase("weekday")) {
                harga1 = 595000 * hari;
                System.out.println("Biaya          : " + harga1);
            } else if (gol.equalsIgnoreCase("weekend")) {
                harga2 = 715000 * hari;
                System.out.println("Biaya          : " + harga2);
            } else if (gol.equalsIgnoreCase("holiday")) {
                harga3 = 915000 * hari;
                System.out.println("Biaya          : " + harga3);
            }
        } else if (cottage.equalsIgnoreCase("Belimbing")) {
            System.out.println("Room           : 2 person");
            if (gol.equalsIgnoreCase("weekday")) {
                harga1 = 495000 * hari;
                System.out.println("Biaya          : " + harga1);
            } else if (gol.equalsIgnoreCase("weekend")) {
                harga2 = 575000 * hari;
                System.out.println("Biaya          : " + harga2);
            } else if (gol.equalsIgnoreCase("holiday")) {
                harga3 = 755000 * hari;
                System.out.println("Biaya          : " + harga3);
            }
        } else if (cottage.equalsIgnoreCase("Mangga")) {
            System.out.println("Room           : 2 person");
            if (gol.equalsIgnoreCase("weekday")) {
                harga1 = 495000 * hari;
                System.out.println("Biaya          : " + harga1);
            } else if (gol.equalsIgnoreCase("weekend")) {
                harga2 = 575000 * hari;
                System.out.println("Biaya          : " + harga2);
            } else if (gol.equalsIgnoreCase("holiday")) {
                harga3 = 755000 * hari;
                System.out.println("Biaya          : " + harga3);
            }
        } else if (cottage.equalsIgnoreCase("Kedondong")) {
            System.out.println("Room           : 2 person");
            if (gol.equalsIgnoreCase("weekday")) {
                harga1 = 495000 * hari;
                System.out.println("Biaya          : " + harga1);
            } else if (gol.equalsIgnoreCase("weekend")) {
                harga2 = 575000 * hari;
                System.out.println("Biaya          : " + harga2);
            } else if (gol.equalsIgnoreCase("holiday")) {
                harga3 = 755000 * hari;
                System.out.println("Biaya          : " + harga3);
            }
        } else if (cottage.equalsIgnoreCase("Barrack")) {
            System.out.println("Room           : per person");
            if (gol.equalsIgnoreCase("weekday")) {
                harga1 = 25000 * hari * person;
                System.out.println("Biaya          : " + harga1);
            } else if (gol.equalsIgnoreCase("weekend")) {
                harga2 = 25000 * hari * person;
                System.out.println("Biaya          : " + harga2);
            } else if (gol.equalsIgnoreCase("holiday")) {
                harga3 = 35000 * hari * person;
                System.out.println("Biaya          : " + harga3);
            }

        }
        
        System.out.println("\n==========================");
        System.out.println("       Terima kasih       ");
        System.out.println("==========================");
        
        return biaya;
    }
}
