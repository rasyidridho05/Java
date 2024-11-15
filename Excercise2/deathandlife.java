package Excercise2;

public class deathandlife {

    public static void main(String[] args) {
        Long birth = 157680000L/7;
        Long death = 157680000L/13;
        Long imigrant= 157680000L/45;
        Long current = 312032486L;
        Long total = current - death + birth + imigrant;

        System.out.println("5 Tahun : "+total);
    }
}
