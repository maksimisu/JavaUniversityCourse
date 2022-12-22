package lb4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayUtils arrayUtils = new ArrayUtils();

        // Task 1

        double[] d1 = { 1, 1, 1, 2, 1, 1};
        System.out.println(arrayUtils.findUnique(d1));
        double[] d2 = { 0, 0, 0.55, 0, 0};
        System.out.println(arrayUtils.findUnique(d2));

        // Task 2

        int[] intArray = { 5, 3, 2, 8, 1, 4 };
        arrayUtils.sortArray(intArray);
        Arrays.stream(intArray).forEach(System.out::println);

        // Task 3

        SimpleTime time1 = new SimpleTime(359999); // 99:59:59
        System.out.println(time1.timeToString());

        SimpleTime time2 = new SimpleTime(86400 + 1980 + 42); // 24:33:42
        System.out.println(time2.timeToString());

        SimpleTime time3 = new SimpleTime((60 * 60) + 60 + 6); // 01:01:06
        System.out.println(time3.timeToString());

/*
        SimpleTime time4 = new SimpleTime(360000); // 100:00:00 NULL
        System.out.println(time4.timeToString());
*/

    }
}
