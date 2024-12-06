
import java.util.Scanner;

public class warnet {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Input n : ");
        int n = Input.nextInt();
        Input.nextLine();

        calc(n);
    }

    static void calc(int n) {
        Scanner Input = new Scanner(System.in);
        String name[] = new String[n];
        String room[] = new String[n];
        int hours[] = new int[n];
        int total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Input : ");
            String input = Input.nextLine();

            String parts[] = input.split(" ");
            name[i - 1] = parts[0];
            hours[i - 1] = Integer.parseInt(parts[1]);
            room[i - 1] = parts[2];
        }

        for (int i = 1; i <= n; i++) {
            int price = room[i - 1].equalsIgnoreCase("gaming") ? 14000 : 10000;
            int subtotal = price * hours[i - 1];
            total += subtotal;

            System.out.println("Total yang harus dibayarkan " + name[i - 1] + " dengan harga per jam " + price + " sebesar " + subtotal);
        }
        System.out.println("Total yang harus dibayarkan "+total);
    }
}
