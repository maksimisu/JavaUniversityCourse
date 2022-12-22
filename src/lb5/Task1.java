package lb5;

public class Task1 {

    public static double doMath(String expression) throws Exception {
        double result = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (i == 0) {
                result += Integer.parseInt(String.valueOf(expression.charAt(i)));
                continue;
            }
            if (expression.charAt(i) >= '0' && expression.charAt(i) <= '9') {
                result += Integer.parseInt(String.valueOf(expression.charAt(++i)));
            } else {
                if (i + 1 < expression.length()) {
                    switch (expression.charAt(i)) {
                        case '+' -> result += Integer.parseInt(String.valueOf(expression.charAt(++i)));
                        case '-' -> result -= Integer.parseInt(String.valueOf(expression.charAt(++i)));
                        case '/' -> result /= Integer.parseInt(String.valueOf(expression.charAt(++i)));
                        case '*' -> result *= Integer.parseInt(String.valueOf(expression.charAt(++i)));
                        default -> throw new Exception("Not a number or operation!");
                    }
                }
            }
        }
        return result;
    }
}
