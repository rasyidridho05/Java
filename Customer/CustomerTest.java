package Customer;

import java.util.HashMap;
import java.util.Scanner;

public class CustomerTest {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        ICustomerBiz cb = new CustomerBiz();
        cb.initializeCustomer();

        int option;
        do {
            printMenu();
            option = MissionUtil.getUserInput();

            switch (option) {
                case 1 ->
                    cb.printAllCustomer();
                case 2 -> {
                    System.out.println("---Tambahkan Informasi Pelanggan Baru---");
                    System.out.print("Enter name\t: ");
                    String name = Input.nextLine();
                    System.out.print("Enter age\t: ");
                    int age = Input.nextInt();
                    Input.nextLine();
                    HashMap<String, String> phone = new HashMap<>();
                    System.out.print("Enter HP\t: ");
                    phone.put("HP", Input.nextLine());
                    System.out.print("Enter OFFICE\t: ");
                    phone.put("OFFICE", Input.nextLine());
                    cb.insertCustomer(name, age, phone);
                }
                case 3 -> {
                    System.out.println("---Ubah Usia Pelanggan---");
                    System.out.print("Enter customer id\t: ");
                    int number = Input.nextInt();
                    System.out.print("Enter new age\t: ");
                    int age = Input.nextInt();
                    cb.changeAge(number, age);
                }
                case 4 -> {
                    System.out.println("---Ubah Nomor Telepon Pelanggan---");
                    System.out.print("Enter customer number: ");
                    int number = Input.nextInt();
                    Input.nextLine();
                    HashMap<String, String> phone = new HashMap<>();
                    System.out.print("Enter new HP\t: ");
                    phone.put("HP", Input.nextLine());
                    System.out.print("Enter new OFFICE\t: ");
                    phone.put("OFFICE", Input.nextLine());
                    cb.changePhone(number, phone);
                }
                case 5 -> {
                    System.out.println("---Hapus Data Pelanggan---");
                    System.out.print("Enter customer number to delete: ");
                    int number = Input.nextInt();
                    cb.deleteCustomer(number);
                }
                case 9 ->
                    System.out.println("Program selesai.");
                default ->
                    System.out.println("Pilihan salah. Coba lagi.");
            }
        } while (option != 9);
    }

    public static void printMenu() {
        System.out.println("\n=== << Program Manajemen Customer >> ===");
        System.out.println("1. Lihat semua pelanggan");
        System.out.println("2. Tambah pelanggan baru");
        System.out.println("3. Ubah usia pelanggan");
        System.out.println("4. Ubah nomor telepon pelanggan");
        System.out.println("5. Hapus pelanggan");
        System.out.println("9. Keluar");
        System.out.println("=========================================");
        System.out.print("Pilih menu: ");
    }
}
