
import java.util.Scanner;

public class same {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Input N : ");
        int n = Input.nextInt();
        Input.nextLine();

        String data[] = new String[n];
        System.out.println("Input Data : ");
        for (int i = 0; i < n; i++) {
            data[i] = Input.nextLine();
        }

        check(data, n);
    }

    static void check(String data[], int n) {
        boolean check = true;
        
        for (String element : data) {
            if (!element.equals(data[0])) {
                check = false;
                break;
            }
        }
        System.out.println("Status : " + check);
    }
}
