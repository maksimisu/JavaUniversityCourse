package lb5;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // Task 1
        String expression = "1+5+8-7*5/4";
        try {
            System.out.println(Task1.doMath(expression));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // Task 2
        int[] array = new int[new Random().nextInt(20)];
        System.out.println("Array size: " + array.length);
        Task2.fillArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Task 3
        Task3 task3 = new Task3();
        task3.doTask();
    }
}