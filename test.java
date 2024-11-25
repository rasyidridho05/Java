import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b;
        do { 
            a = inp.nextInt();
            b = inp.nextInt();
            mengurutkan(a,b);    
        } while (a!=b);


        inp.close();
    }

    static void mengurutkan(int a, int b){
        if (a > b) {
            System.out.println(b + " " + a);
        } else if(a < b){
            System.out.println(a + " " + b);
        } else{
            System.out.println("");
        }
    }
}
