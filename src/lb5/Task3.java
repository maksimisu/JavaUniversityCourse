package lb5;

import java.util.Scanner;

public class Task3 {

    String s = "";
    Scanner scanner = new Scanner(System.in);

    public void doTask() {
        boolean condition = true;
        while (condition) {
            System.out.println("Enter:");
            System.out.println("   1 for entering new expression,");
            System.out.println("   2 for printing all words with comma,");
            System.out.println("   3 exiting the program.");
            switch (scanner.nextLine()) {
                case "1" -> receiveExpression();
                case "2" -> printStringWithComma();
                case "3" -> condition = false;
                default -> System.out.println("Not valid command.");
            }
        }
    }

    private void receiveExpression() {
        String word = scanner.nextLine();
        if (word.charAt(0) == '+') {
            addWord(word);
        } else if (word.charAt(0) == '-') {
            removeWord(word);
        } else {
            System.out.println("Invalid expression.");
        }
    }

    private void printStringWithComma() {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            res.append(s.charAt(i));
            if (i + 1 < s.length() && s.charAt(i + 1) >= 'A' && s.charAt(i + 1) <= 'Z') {
                res.append(", ");
            }
        }
        System.out.println(res);
    }

    private void addWord(String word) {
        s += word.replace('+', ' ').trim();
    }

    private void removeWord(String word) {
        word = word.replace('-', ' ').trim();
        if (s.contains(word)) {
            s = s.replace(word, "");
        } else {
            System.out.println("No word " + word + " found.");
        }
    }
}
