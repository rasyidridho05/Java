
import java.util.Scanner;

public class aritgeo {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Input U1");
        int u1 = Input.nextInt();
        System.out.println("Input U2");
        int u2 = Input.nextInt();
        System.out.println("Input U3");
        int u3 = Input.nextInt();

        boolean isAritmath = u2 - u1 == u3 - u2;
        boolean isGeomath = u2 / u1 == u3 / u2;

        if (isGeomath) {
            System.out.print("U1 : " + u1 + "\t");
            System.out.print("U2 : " + u2 + "\t");
            System.out.println("U3 : " + u3 + "\t");
            System.out.println("Deret Geometri");
        } else if (isAritmath) {
            System.out.print("U1 : " + u1 + "\t");
            System.out.print("U2 : " + u2 + "\t");
            System.out.println("U3 : " + u3 + "\t");
            System.out.println("Deret Aritmatika");
        } else {
            System.out.println("Bukan deret Geometri maupun Aritmatika");
        }
    }
}
