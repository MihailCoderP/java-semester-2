import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int i = 10;
        long fib = fibonacci(i);
        System.out.println("Fibonacci(" + i + "): " + fib);

        Map<Integer, Integer> digitCount = countDigits(fib);
        int maxCountDigit = findMaxCountDigit(digitCount);
        System.out.println("Digit with maximum occurrences: " + maxCountDigit);
    }

    private static long fibonacci(int n) {
        long a = 0;
        long b = 1;

        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }

    private static Map<Integer, Integer> countDigits(long number) {
        Map<Integer, Integer> digitCount = new HashMap<>();

        while (number > 0) {
            int digit = (int) (number % 10);
            digitCount.put(digit, digitCount.getOrDefault(digit, 0) + 1);
            number /= 10;
        }

        return digitCount;
    }

    private static int findMaxCountDigit(Map<Integer, Integer> digitCount) {
        int maxCountDigit = -1;
        int maxCount = -1;

        for (Map.Entry<Integer, Integer> entry : digitCount.entrySet()) {
            int digit = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount || (count == maxCount && digit > maxCountDigit)) {
                maxCountDigit = digit;
                maxCount = count;
            }
        }

        return maxCountDigit;
    }
}
