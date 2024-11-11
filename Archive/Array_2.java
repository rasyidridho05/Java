package Archive;

public class Array_2 {

    public static void main(String[] args) {
        int a[][] = {{6, 3}, {4, 8}};
        int b[][] = {{1}, {2}};
        int h[][] = {{0}, {0}};
        System.out.println("Hasil A x B");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 1; j++) {
                for (int k = 0; k < 2; k++) {
                    h[i][j] = h[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println(h[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
