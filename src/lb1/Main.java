package lb1;

public class Main {

    public static void main(String[] args) {

        int arraySize = 5;
        int[][] array = new int[arraySize][arraySize];

        System.out.println();

        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < arraySize; i++) {
                if (array[i][arraySize - i - 1] % 2 == 0 && array[i][arraySize - i - 1] != 0)
                    System.out.print(array[i][arraySize - i - 1] + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println();

        Main main = new Main();
        int testArraySize = 10;
        int[] testArray;
        testArray = main.fillArray(0, testArraySize, 2);

        for (int i = 0; i < testArraySize; i++) {
            System.out.print(testArray[i] + " ");
        }
        System.out.println();

    }

    private int[] fillArray(int begin, int end, int step) {
        int[] resultArray = new int[end];
        for (int i = begin; i < end; i += step) {
            resultArray[i] = i;
        }
        return resultArray;
    }

}
