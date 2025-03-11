package tp4;

import java.text.NumberFormat;
import java.util.Locale;

public class bookMain {

    public static void main(String[] args) {
        NumberFormat formatRp = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        
        book b1 = new book("Three Kingdom", 5000, 67);
        book b2 = new book("a Pie", 8400, 82);
        
        b1.printHeader();
        b1.printInfo();
        b2.printInfo();
        
        int totalPrice = b1.getTotalPrice() + b2.getTotalPrice();
        System.out.println("==================================");
        System.out.println("Total Price: "+formatRp.format(totalPrice));
    }

}
