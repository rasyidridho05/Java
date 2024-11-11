package ukl_1;

public class UKL_4 {

    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        int u = a;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4-i; j++) {
                u = u + b;
                System.out.print("*\t");
            }
            System.out.println();
        }
        for (int i = 1; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
