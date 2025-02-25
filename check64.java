package jt;

public class check64 {

    public static void main(String[] args) {
        int num = 64;
        boolean isEven;
        boolean isMultiple3;
        boolean isMultiple2and7;
        boolean isMultiple2or7;

        if (num % 2 == 0) {
            isEven = true;
        } else {
            isEven = false;
        }
        if (num % 3 == 0) {
            isMultiple3 = true;
        } else {
            isMultiple3 = false;
        }
        if ((num % 2 == 0) && (num % 7 == 0)) {
            isMultiple2and7 = true;
        } else {
            isMultiple2and7 = false;
        }
        if ((num % 2 == 0) || (num % 7 == 0)) {
            isMultiple2or7 = true;
        } else {
            isMultiple2or7 = false;
        }
        System.out.println("is Even? : " + isEven +"\nis Multiple 3? : "+isMultiple3 +"\nis Multiple 2 and 7? : "+isMultiple2and7 +"\nis Multiple 2 or 7? : "+isMultiple2or7);
    }

}
