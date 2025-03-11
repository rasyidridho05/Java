package library;

import java.util.PriorityQueue;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Book b1 = new Book("Java", "John Doe", "12345");
        Book b2 = new Book("Jawa", "Lohn Dio", "99910");

        User user1 = new User("Aliciaa", "S101", "Mahasiswa");
        User user2 = new User("Al", "S101", "Member");
        User user3 = new User("As", "S101", "Dosen");
        
        System.out.println("\n=== Peminjaman Buku ===");
        b1.borrowBook(user3);
        b1.borrowBook(user1);
        b1.borrowBook(user2);
        
        System.out.println("\n=== Pemesanan Buku ===");
        b2.reserveBook(user3);
        b1.reserveBook(user1);
        b1.reserveBook(user2);
        
        System.out.println("\n=== Pengembalian Buku ===");
        b2.returnBook();
        b1.returnBook();
        
        System.out.println("\n=== Information ===");
        b1.displayBookInfo();
        b2.displayBookInfo();
    }
}
