package big.o.notation;

import java.util.Random;
import java.util.Scanner;
public class Sorting {

    public static void main(String[] args) {
        int a[] = {9, 5, 3, -1, 10, 8, 2, 1, 4, -7};
        int b[] = {12, 4, 16, 19, 11, 1, 14, 23, 3, 10, 18, 8, 22, 9, 20, 25, 2, 13, 21, 7, 5, 24, 15, 17, 6};
        int c[] = {6, 43, 23, 46, 48, 24, 9, 50, 12, 36, 29, 32, 42, 21, 8, 15, 41, 28, 27, 49, 25, 26, 34, 20, 16,
                  10, 38, 30, 2, 13, 44, 4, 22, 5, 31, 3, 7, 39, 35, 17, 40, 18, 19, 45, 47, 11, 14, 33, 1, 37};
        int d[] = {80, 45, 33, 78, 7, 68, 90, 40, 73, 31, 29, 13, 44, 60, 66, 12, 41, 50, 52, 47, 82, 93, 14, 24, 
                  18, 3, 57, 51, 81, 63, 84, 48, 20, 83, 53, 27, 92, 16, 56, 28, 55, 9, 23, 77, 34, 95, 76, 46, 4,
                  87, 5, 94, 85, 21, 88, 37, 22, 74, 67, 39, 26, 30, 64, 19, 65, 42, 96, 43, 36, 72, 100, 75, 1, 97,
                  89, 91, 10, 98, 62, 11, 69, 59, 32, 38, 54, 70, 71, 8, 15, 86, 61, 99, 2, 17, 35, 79, 25, 6, 58, 44};

        System.out.println("Data Sebelum Diurutkan\t:");
        System.out.println("Data A\t:" + java.util.Arrays.toString(a));
        System.out.println("Data B\t:" + java.util.Arrays.toString(b));
        System.out.println("Data C\t:" + java.util.Arrays.toString(c));
        System.out.println("Data D\t:" + java.util.Arrays.toString(d));

        selectionSort(a, b, c, d);

        System.out.println("\nData Setelah Diurutkan\t:");
        System.out.println("Data A\t:" + java.util.Arrays.toString(a));
        System.out.println("Data B\t:" + java.util.Arrays.toString(b));
        System.out.println("Data C\t:" + java.util.Arrays.toString(c));
        System.out.println("Data D\t:" + java.util.Arrays.toString(d));

    }

    static void selectionSort(int[] a, int[] b, int[] c, int[] d) {

        for (int currentIndex = 0; currentIndex < a.length - 1; currentIndex++) {
            int minIndex = currentIndex;
            for (int i = currentIndex + 1; i < a.length; i++) {
                if (a[i] < a[minIndex]) {
                    minIndex = i;
                }
            }
            if (minIndex != currentIndex) {
                int temp = a[currentIndex];
                a[currentIndex] = a[minIndex];
                a[minIndex] = temp;
            }
        }
        for (int currentIndex = 0; currentIndex < b.length - 1; currentIndex++) {
            int minIndex = currentIndex;
            for (int i = currentIndex + 1; i < b.length; i++) {
                if (b[i] < b[minIndex]) {
                    minIndex = i;
                }
            }
            if (minIndex != currentIndex) {
                int temp = b[currentIndex];
                b[currentIndex] = b[minIndex];
                b[minIndex] = temp;
            }
        }
        for (int currentIndex = 0; currentIndex < c.length - 1; currentIndex++) {
            int minIndex = currentIndex;
            for (int i = currentIndex + 1; i < c.length; i++) {
                if (c[i] < c[minIndex]) {
                    minIndex = i;
                }
            }
            if (minIndex != currentIndex) {
                int temp = c[currentIndex];
                c[currentIndex] = c[minIndex];
                c[minIndex] = temp;
            }
        }
        for (int currentIndex = 0; currentIndex < d.length - 1; currentIndex++) {
            int minIndex = currentIndex;
            for (int i = currentIndex + 1; i < d.length; i++) {
                if (d[i] < d[minIndex]) {
                    minIndex = i;
                }
            }
            if (minIndex != currentIndex) {
                int temp = d[currentIndex];
                d[currentIndex] = d[minIndex];
                d[minIndex] = temp;
            }
        }
    }
}
