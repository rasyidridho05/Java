
import java.util.Scanner;

public class day {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Input : ");
        int a = Input.nextInt();

        switch (a) {
            case 1:
            System.out.println("Minggu");
            break;
            case 2:
            System.out.println("Senin");
            break;
            case 3: 
            System.out.println("Selasa");
            break;
            case 4:
            System.out.println("Rabu");
            break;
            case 5:
            System.out.println("Kamis");
            break;
            case 6:
            System.out.println("Jumat");
            break;
            case 7:
            System.out.println("Sabtu");
            break;
        }
    }
}
