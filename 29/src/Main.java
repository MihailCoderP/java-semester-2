import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int number = 695;
        int start = 2;

        boolean isPossible = checkSeries(number, start);
        System.out.println("Это возможно? " + isPossible);
    }

    private static boolean checkSeries(int number, int start) {
        List<Integer> digits = getDigits(number);
        int sum = 0;
        int multiplier = start;

        for (int i = 0; i < digits.size(); i++) {
            int exponent = i + 1;
            sum += Math.pow(digits.get(i), exponent);
        }

        for (int i = 6; i <= sum / 2; i++) {
            if (sum % i == 0 && sum / i == multiplier) {
                return true;
            }
        }

        return false;
    }

    private static List<Integer> getDigits(int number) {
        List<Integer> digits = new ArrayList<>();

        while (number > 0) {
            int digit = number % 10;
            digits.add(0, digit);
            number /= 10;
        }

        return digits;
    }
}
