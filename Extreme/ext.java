
public class ext {

    public static void main(String[] args) {
        int number[] = {100, 80, 3, 4, 5, 6, 7, 90};
        int min = number[0];
        int max = number[0];

        for (int i = 0; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
            }
            if (number[i] > max) {
                max = number[i];
            }
        }
        System.out.println("Min : "+min);
        System.out.println("Max : "+max);
    }

}
