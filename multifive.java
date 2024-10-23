//103122400018  - Muhammad Rasyid Ridho

public class multifive {

    public static void main(String[] args) {
        int a = 0, b = 0;
        while (true) {
            b = b + a + 5;
            a = a + 5;
            System.out.println("+" + a + " = " + b);
            if (b >= 100) {
                break;
            }
        }
    }
}
