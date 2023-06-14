import java.util.LinkedList;

public class Calculator {
    private static final String OPERATORS = "+-*/^|%"; 
    private static final int[] PRIORITY = new int[]{1, 1, 2, 2, 3, 2, 2}; 

    private boolean isOperator(char c) {
        return OPERATORS.indexOf(c) >= 0;
    }

    private double executeOperation(double num1, double num2, char operator) {
        switch (operator) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/': return num1 / num2;
            case '%': return num1 % num2;
            case '^': return Math.pow(num1, num2);
            case '|': return num1 > 0 ? num1 : -num1;
            default: throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public double evaluateExpression(String expression) {
        LinkedList<Double> numbers = new LinkedList<>();
        LinkedList<Character> operators = new LinkedList<>();
        StringBuilder numBuilder = new StringBuilder(); 

        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c) || c == '.') { 
                numBuilder.append(c);
            } else if (isOperator(c)) { 
                if (numBuilder.length() > 0) { 
                    numbers.add(Double.parseDouble(numBuilder.toString()));
                    numBuilder.setLength(0); 
                }
                char op = c;
                if (op == '-' && (numbers.isEmpty() || isOperator(operators.getLast()))) {
                    numBuilder.append(op);
                } else {
                    while (!operators.isEmpty() && PRIORITY[OPERATORS.indexOf(operators.getLast())] >= PRIORITY[OPERATORS.indexOf(op)]) {
                        char operator = operators.removeLast();
                        double num2 = numbers.removeLast();
                        double num1 = numbers.removeLast();
                        double result = executeOperation(num1, num2, operator);
                        numbers.add(result);
                    }
                    operators.add(op); 
                }
            } else if (c == '(') { 
                operators.add(c);
            } else if (c == ')') { 
                if (numBuilder.length() > 0) { 
                    numbers.add(Double.parseDouble(numBuilder.toString()));
                    numBuilder.setLength(0); 
                }
                while (!operators.isEmpty() && operators.getLast() != '(') {
                    char operator = operators.removeLast();
                    double num2 = numbers.removeLast();
                    double num1 = numbers.removeLast();
                    double result = executeOperation(num1, num2, operator);
                    numbers.add(result);
                }
                if (!operators.isEmpty() && operators.getLast() == '(') {
                    operators.removeLast(); 
                }
            }
        }
        if (numBuilder.length() > 0) {
            numbers.add(Double.parseDouble(numBuilder.toString()));
        }
        while (!operators.isEmpty()) {
            char operator = operators.removeLast();
            double num2 = numbers.removeLast();
            double num1 = numbers.removeLast();
            double result = executeOperation(num1, num2, operator);
            numbers.add(result);
        }

        return numbers.removeLast();
    }
}
