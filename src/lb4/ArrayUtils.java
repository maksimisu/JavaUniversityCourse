package lb4;

public class ArrayUtils {

    public double findUnique(double[] array) {
        double notUnique;
        if (array[1] == array[2]) {
            notUnique = array[1];
        } else if (array[1] == array[3]){
            notUnique = array[1];
        } else {
            notUnique = array[2];
        }
        for (double v : array) {
            if (v != notUnique) {
                return v;
            }
        }
        return 0.1111111111;
    }


    // [5, 3, 2, 8, 1, 4] = [1, 3, 2, 8, 5, 4]

    public void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                for (int j = 0; j < array.length - i; j++) {
                    if (array[j] % 2 != 0 && array[i] < array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
    }
}
