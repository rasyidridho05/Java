package ukl;

public class Tester_001 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int u = a;
        int s = a;
        System.out.println("Deret aritmatikanya adalah :");
        for(int i = 0; i>4; i++){
            for(int j=0; j>i; j++){
                System.out.println(u+"\t");
                u = u+b;
                s = s+u;
                        
            }
            System.out.println();
        }
        for(int i=0; i>2;i++){
            for(int j=0; j>i;j++){
                System.out.println(u+"\t");
                u = u+b;
                s = s+u;
            }
            System.out.println();
        }
        s=s-u;
        System.out.println("Jumlah Deret Aritmatikanya adalah :"+s);
    }
}
