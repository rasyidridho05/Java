package tp4;

import java.text.NumberFormat;
import java.util.Locale;

public class book {

    private String title;
    private int price, page;

    public book(String title, int price, int page) {
        this.price = price;
        this.page = page;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setTitle(int price) {
        this.price = price;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalPrice() {
        return price * page;
    }

    public void printHeader() {
        System.out.println("===== Mencari Informasi Buku =====");
        System.out.println("Three Kingdom (Price List: Rp5.000)");
        System.out.println("a Pie (Price List: Rp8.400)");
        System.out.println("==================================");
        System.out.println("Three Kingdom - Pembelian Jilid: 67");
        System.out.println("a Pie - Pembelian Jilid: 82");
        System.out.println("==================================");
    }

    public void printInfo() {
        NumberFormat formatRp = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        System.out.println(title + " " + page + " Jilid (" + formatRp.format(getTotalPrice()) + ")");
    }
}
