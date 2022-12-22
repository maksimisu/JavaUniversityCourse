package lb3;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // Task 1
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        System.out.println();

        // Task 2
        Stream<Integer> randStream = Stream.generate(() -> new Random().nextInt(10)).limit(10);
        List<Integer> filteredList = randStream.filter(e -> e % 2 == 0 && e != 0).toList();
        filteredList.forEach(System.out::println);
        double arithmeticalMean = 0;
        for (Integer integer : filteredList) {
            arithmeticalMean += integer;
        }
        arithmeticalMean /= filteredList.size();
        System.out.println("Arithmetical mean: " + arithmeticalMean);
        System.out.println();

        // Task 3
        String s = "sjdhgfsjkavchjwagehf";
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'h' && s.charAt(i) <= 't') {
                String temp = Character.toString(s.charAt(i));
                res.append(temp.toUpperCase());
            } else {
                res.append(s.charAt(i));
            }
        }
        System.out.println(res);
    }
}
