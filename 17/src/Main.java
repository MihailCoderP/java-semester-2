import java.util.*;

public class Main {
    public static boolean checkBrackets(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String example1 = "()";
        String example2 = "(()()((())))";
        String example3 = "(((())()";

        System.out.println(checkBrackets(example1));
        System.out.println(checkBrackets(example2));
        System.out.println(checkBrackets(example3));
    }
}