import java.util.Scanner;

public class nilai {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Input N : ");
        int n = Input.nextInt();
        Input.nextLine();

        nilai(n);
    }

    static void nilai (int n){
        Scanner Input = new Scanner(System.in);
        int nilai[] = new int[n];

        for (int i = 1; i <= n; i++) {
            
            System.out.println("Input Nilai : ");
            nilai[i-1] = Input.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            if (nilai[i-1] < 75) {
                System.out.printf("%d. %d %s\n", i, nilai[i-1], "Dibawah KKM");
            } else {
                System.out.printf("%d. %d %s \n", i, nilai[i-1], "Diatas KKM");
            }
        }
    }
}
