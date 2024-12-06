
import java.util.Scanner;

public class store {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int a , b, count = 0, counta = 0, countb = 0;
        double ag, ai;
        boolean stop = false;
        do {
            System.out.println("Input Goods: ");
            a = Input.nextInt();
            System.out.println("Input Income: ");
            b = Input.nextInt();
            counta += a;
            countb += b;
            
            if (a == 0 && b == 0) {
                stop = true;
            } else{
                count++;
            }
        } while (stop == false);
        
        ag = goods(counta, count);
        ai = income(countb, count);
        print(ag, ai, count);
    }

    static double goods(int counta, int count) {
        double ag = counta / count;
        return ag;
    }

    static double income(int countb, int count) {
        double ai = countb / count;
        return ai;
    }

    static void print(double ag, double ai, int count) {
        System.out.printf("Average goods that sold in %d day is : %.2f \n", count, ag);
        System.out.printf("Average income that collected in %d day is : %.2f ", count, ai);
    }
}
