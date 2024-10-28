package ukl;

public class Tester {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int u = a;
        int s = a;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(u + "\t");
                u = u + b;
                s = s + u;
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(u + "\t");
                u = u + b;
                s = s + u;
            }
             s = s - u;
        System.out.println("" + s);

        }
     
    }

}
