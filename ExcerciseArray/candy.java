import java.util.Arrays;
import java.util.Scanner;

public class candy {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Masukkan jumlah murid: ");
        int n = Input.nextInt();

        int[] ratings = new int[n];
        total(ratings, n);
    }

    static void total (int ratings[], int n){
        Scanner Input = new Scanner(System.in);
        System.out.println("Masukkan peringkat murid: ");
        for (int i = 0; i < n; i++) {
            ratings[i] = Input.nextInt();
        }

        int[] candies = new int[n];
        Arrays.fill(candies, 1);
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }
        
        System.out.println("Permen untuk setiap murid: " + Arrays.toString(candies));
        System.out.println("Total minimum permen : " + totalCandies);
    }
}
