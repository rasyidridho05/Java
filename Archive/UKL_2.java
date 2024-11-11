package ukl_1;

public class UKL_2 {

    public static void main(String[] args) {
        int a = 12;
        int b = 8;
        int n = 22-15;
        int u = a;
        int s = a;
        System.out.println("Deret Aritmatikanya adalah");
        for (int i = 0; i < n; i++) {
            System.out.print(u+"\t");
            u = u + b;
            s = s + u;
        }
        s = s - u;
        System.out.println("Jumlah Deret Aritmatikanya adalah " + s);

    }
}
