package Excercise2;

public class deathandlife {

    public static void main(String[] args) {
        long time = 3600 * 24 * 365 * 5;
        Long birth = time / 7;
        Long death = time / 13;
        Long imigrant = time / 45;
        Long current = 312032486L;
        Long total = current - death + birth + imigrant;

        System.out.println("5 Tahun : " + total);
    }
}
