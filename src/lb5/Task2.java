package lb5;

import java.util.Random;

public class Task2 {

    public static void fillArray(int[] array) {
        if (array.length % 2 == 0) {
            for (int i = array.length / 2 - 1, j = 0; i >= 0; i--, j++) {;
                array[i] = j;
                array[array.length / 2 + (array.length / 2 - i) - 1] = j;
            }
        } else {
            for (int i = array.length / 2, j = 0; i >= 0; i--, j++) {
                if (i == array.length / 2) {
                    array[i] = j;
                } else {
                    array[i] = j;
                    array[array.length / 2 + (array.length / 2 - i)] = j;
                }
            }
        }
    }

}
