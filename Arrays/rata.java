
public class rata {

    public static void main(String[] args) {
        int[] nilai = {70, 85, 80, 90, 75};
        int total = 0;

        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }

        double rata = total / nilai.length;
        System.out.println("Rata-Rata : " + rata);
    }
}
