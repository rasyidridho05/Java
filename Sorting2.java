import java.util.Random;
import java.util.Scanner;

public class Sorting2 {

    public static int[] generateInput(int jum) {
        int[] arr = new int[jum];
        Random ran = new Random();
        for (int i = 0; i < jum; i++) {
            arr[i] = ran.nextInt(jum);
        }
        return arr;
    }

    public static int[] SelectionSort(int[] input) {
        int temp;
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j] < input[j - 1]) {
                    temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                }
            }
        }
        return input;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double startTime = System.nanoTime();

        System.out.print("Masukan Jumlah Data : ");
        int JmlData = 100;
        int dataArray[] = generateInput(JmlData);

        System.out.println("Sebelum di urutkan : ");
        for (int i = 0; i < dataArray.length; i++) {
            System.out.print(dataArray[i] + ", ");
        }

        SelectionSort(dataArray);
        System.out.println("\nSetelah di urutkan : ");
        for (int i = 0; i < dataArray.length; i++) {
            System.out.print(dataArray[i] + ", ");
        }

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("");
        System.out.println("waktu :" + duration + " milisecond");
    }
}
