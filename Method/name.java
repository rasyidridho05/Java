
import java.util.Scanner;

public class name {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Name : ");
        String name = Input.nextLine();

        String text = name(name);
        System.out.println(text);
    }

    static String name(String name) {
        String text = "Hi " + name; 
        return text;
    }
}
