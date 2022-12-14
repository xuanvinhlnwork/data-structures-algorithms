package lesson1.array;

import java.util.ArrayList;
import java.util.Arrays;

public class IntroArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }

        System.out.println(max);
    }
}
