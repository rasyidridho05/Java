package library;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name, userId, userType;
    private int borrowLimit, borrowDuration;
    private List<String> borrowedBooks;

    private static final int MAX_BORROW_STUDENT = 5;
    private static final int MAX_BORROW_LECTURER = 10;
    private static final int MAX_BORROW_DEFAULT = 3;

    public User(String name, String userId, String userType) {
        this.name = name;
        this.userId = userId;
        this.userType = userType;
        this.borrowedBooks = new ArrayList<>();
    }

    public boolean canBorrow() {
        int maxBooks = switch (userType.toLowerCase()) {
            case "mahasiswa" ->
                MAX_BORROW_STUDENT;
            case "dosen" ->
                MAX_BORROW_LECTURER;
            default ->
                MAX_BORROW_DEFAULT;
        };
        return borrowedBooks.size() < maxBooks;
    }

    public void addBorrowedBook(String title) {
        if (canBorrow()) {
            borrowedBooks.add(title);
            System.out.println(name + " has borrowed the book : " + title);
        } else {
            System.out.println(name + " cannot borrow more books");
        }
    }

    public void returnBook(String title) {
        borrowedBooks.remove(title);
        System.out.println(name + "has returned the books" + title);
    }

    public String getUserId() {
        return userId;
    }

    public String getUserType() {
        return userType;
    }

    public void displayBorrowedBooks() {
        System.out.println(name + "borrowed books:" + borrowedBooks);
    }


}
