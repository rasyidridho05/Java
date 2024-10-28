package ukl_1;

public class UKL_5 {

    public static void main(String[] args) {
        int a[][] = {{3, 1, 4, 5, 6, 7}, {4, 9, 1, 2, 3, 5}, {5, 8, 2, 7, 4, 8},{1,2,3,4,5,6},{2,3,4,5,6,7}};
        int b[][] = {{6, 2, 1,4,6}, {2, 9, 7,2,3}, {4, 8, 3,5,6}, {7,5,8, 7, 6}, {6,7,7, 1, 2}, {1,2, 5, 4, 3}};
        System.out.println("Hasil A - B : ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(a[i][j] + b[j][i] + "\t");
            }
            System.out.println();
        }
    }
}
