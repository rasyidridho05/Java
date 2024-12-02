//103122400018 Muhammad Rasyid Ridho

import java.util.Scanner;

public class list {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int nilai[] = {0, 0, 0};
        String matkul[] = {"Bahasa Korea", "Bahasa Inggris", "Math"};

        for (int i = 0; i < matkul.length; i++) {
            System.out.println(matkul[i] + " : " +nilai[i]);
        }
    }
}
