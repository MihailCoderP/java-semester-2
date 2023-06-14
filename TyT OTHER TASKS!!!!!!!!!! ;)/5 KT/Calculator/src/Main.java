import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        HistoryManager historyManager = new HistoryManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите математическое выражение  ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("выход")) {
                break;
            } else if (input.equalsIgnoreCase("история")) {
                List<String> history = historyManager.loadHistory();
                System.out.println("История вычмслений:");
                for (String entry : history) {
                    System.out.println(entry);
                }
            } else {
                double result = calculator.evaluateExpression(input);
                System.out.println("Результат: " + result);

                historyManager.saveExpression(input, result);
            }
        }
    }
}
