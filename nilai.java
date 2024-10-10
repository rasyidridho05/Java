import java.util.Scanner;

public class nilai {
    public static void main(String[] args) {
       Scanner Input = new Scanner(System.in); 
       int nilai;

       System.out.print("Nilai : ");
       nilai = Input.nextInt();
       
       if (nilai > 89 && nilai <=100){
           System.out.println("Nilai : " + nilai + " A");
        } else if (nilai > 79 && nilai < 90) {
            System.out.println("Nilai : "+ nilai +" B");
        } else if (nilai > 69 && nilai < 80) {
            System.out.println("Nilai : "+ nilai +" C");
        } else if (nilai > 59 && nilai < 70) {
            System.out.println("Nilai : "+ nilai +" D");
        } else if (nilai >= 0 && nilai < 60) {
            System.out.println("Nilai : "+ nilai +" E");
        } else {
            System.out.println("Nilai tidak terdaftar");
        }
    }
}


//Shift + alt + panah bawah
// alt + panah atas bawah