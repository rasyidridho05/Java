package jt;

public class oddcount {

    public static void main(String[] args) {
        int[] number = {10, 21, 33, 42, 51, 64, 79, 80};
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                count += number[i];
                System.out.print(number[i] + " ");
            }
        }
        System.out.println("\nCount : "+count);
    }
}
