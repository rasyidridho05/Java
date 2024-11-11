
package ukl;

public class UKL {

    public static void main(String[] args) {
    int a = 3;
    int b = 4;
    int na = 2;
    int nr = 6;
    int nilaiSukuX = a;
    int Jumlah = 0;
    //3,7,11,15,19
    // s = 75
    
    for(int i = na; i<=nr ;i++){
        nilaiSukuX = a+b*(i-1);
        System.out.println("Nilai Suku ke :"+i+" adalah : "+nilaiSukuX);
        Jumlah +=nilaiSukuX;
    }    
        System.out.println("=============================");
        System.out.println("Jumlah Deret Aritmatika : "+Jumlah);
    
    
    }
    
}
