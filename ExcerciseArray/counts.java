
import java.util.ArrayList;
import java.util.Scanner;

public class counts {

    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<Integer>();

        int count = count(data);
        System.out.println("Result : " + count);
    }

    static int count(ArrayList<Integer> data) {
        Scanner Input = new Scanner(System.in);
        int a, count = 0;
        do {
            System.out.println("Input Number : ");
            a = Input.nextInt();
            data.add(a);
        } while (a != 0);

        for (int i = 0; i < data.size(); i++) {
            count += data.get(i);
        }

        return count;
    }
}
