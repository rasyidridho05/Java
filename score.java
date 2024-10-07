
import java.util.Scanner;

public class score {

    public static void main(String[] args) {
    // Muhammad Rasyid Ridho
    // 103122400018
        Scanner Input = new Scanner(System.in);
        int java, sql, sjsp;

        System.out.print("Input Nilai Java :");
        java = Input.nextInt();
        System.out.print("Input Nilai SQL :");
        sql = Input.nextInt();
        System.out.print("Input Nilai Servlet & JSP :");
        sjsp = Input.nextInt();

        System.out.println("Nilai Java : " + java + "\nNilai SQL : " + sql + "\nNilai Servlet & JSP : " + sjsp);
    }
}
