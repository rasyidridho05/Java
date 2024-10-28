package ukl_1;

public class UKL_6 {

    public static void main(String[] args) {
        int a[][] = {{1, 4, 9, 2}, {2, 9, 2, 3}, {1, 2, 1, 5}, {1, 2, 3, 9}};
        int b[][] = {{2, 4, 7, 7}, {2, 3, 4, 1}, {5, 1, 4, 9}, {2, 3, 4, 9}};
        int c[][] = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        System.out.println("Hasil dari A x B :");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 2; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
