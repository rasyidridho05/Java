package tp12;

public class Book {

    private String title;
    private int pages;
    private int price;

    public Book(String title, int pages, int price) {
        this.title = title;
        this.pages = pages;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getPrice() {
        return price;
    }
}
