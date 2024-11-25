
import java.util.Scanner;

public class square {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Input Side of the Rectangle : ");
        int side = Input.nextInt();

        side = side * side;

        System.out.println("Result : " + side);

    }
}
