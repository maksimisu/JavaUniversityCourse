package lb2;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        CustomArrayList<Integer> arrayList = new CustomArrayList<>();
        CustomLinkedList<Integer> list = new CustomLinkedList<>();

        // TEST 1
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.remove(1);
        arrayList.remove((Integer) 3);
        System.out.println(arrayList.contains(4));
        System.out.println(arrayList.contains(2));
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        // TEST 2
        /*for (int i = 1; i <= 99; i++) {
            arrayList.add(i);
            System.out.println(i);
        }

        for (int i = 0; i < 20; i++) {
            arrayList.remove(0);
        }

        for (int i = 0; i < customArrayList.size(); i++) {
            System.out.println(customArrayList.get(i));
        }*/

        // TEST 3
        /*list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("size = " + list.size());
        System.out.println("contains 1 = " + list.contains(1));
        System.out.println("contains 3 = " + list.contains(3));
        System.out.println("contains 5 = " + list.contains(5));
        list.remove(0);
        list.remove((Integer) 4);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("size = " + list.size());*/
    }
}
