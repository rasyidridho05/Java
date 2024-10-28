package ukl;

public class UKL_1 {

    public static void main(String[] args) {
        int a = 6;
        int b = 3;
        int u = a;
        int s = a;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(u + "\t");
                u = u + b;
                s = s + u;
            }
            System.out.println();
        }
        s = s - u;
        System.out.println("Jumlah deret aritmatikanya adalah : " + s);
    }

}
