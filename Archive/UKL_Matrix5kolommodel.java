package ukl;

public class UKL_Matrix5kolommodel {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int u = a;
        int s = a;
        System.out.println("Deret Aritmatikanya adalah");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(u + "\t");
                u = u + b;
                s = s + u;
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2 - i; j++) {
                System.out.print(u + "\t");
                u = u + b;
                s = s + u;
            }
            System.out.println();
        }
        s = s - u;
        System.out.println("Jumlah Deret Aritmatikanya adalah " + s);
    }

}
