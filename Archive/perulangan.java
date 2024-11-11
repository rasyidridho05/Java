//103122400018  - Muhammad Rasyid Ridho

public class perulangan {

    public static void main(String[] args) {

        int a = 2, b = 1;
        while (a <= 9) {
            if (b <= 9) {
                System.out.println(a + "*" + b + " : " + (a * b));
                b++;
            } else {
                a++;
                b = 1;
            }
        }
    }
}
