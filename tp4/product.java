package tp4;

import java.text.NumberFormat;
import java.util.Locale;

public class product {

    private String name;
    private int stock;
    private double price;

    public product(String name, int stock, double price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void print() {
        NumberFormat formatRp = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        System.out.println("Product Name : " + name);
        System.out.println("Price : " + formatRp.format(price));
        System.out.println("Stock : " + stock + " unit\n");
    }
}
