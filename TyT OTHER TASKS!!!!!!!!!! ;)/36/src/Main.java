import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final int CODE_LENGTH = 4;
    private static final int MAX_ATTEMPTS = 20;

    public static void main(String[] args) {
        int[] secretCode = generateSecretCode();

        System.out.println("Добро пожаловать в игру разгадывания кода!");
        System.out.println("Код состоит из 4 чисел от 0 до 9.");
        System.out.println("У вас есть не более 20 попыток.");

        for (int attempt = 1; attempt <= MAX_ATTEMPTS; attempt++) {
            System.out.println("Попытка №" + attempt);
            int[] guess = readGuess();

            if (Arrays.equals(guess, secretCode)) {
                System.out.println("Поздравляю! Вы разгадали код!");
                return;
            }

            int numMatches = countMatchingDigits(guess, secretCode);
            System.out.println("Совпавших чисел: " + numMatches);
        }

        System.out.println("Вы исчерпали все попытки. Код не разгадан.");
    }

    private static int[] generateSecretCode() {
        int[] code = new int[CODE_LENGTH];
        Random random = new Random();

        for (int i = 0; i < CODE_LENGTH; i++) {
            code[i] = random.nextInt(10);
        }

        return code;
    }

    private static int[] readGuess() {
        int[] guess = new int[CODE_LENGTH];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 4 числа:");
        for (int i = 0; i < CODE_LENGTH; i++) {
            guess[i] = scanner.nextInt();
        }

        return guess;
    }

    private static int countMatchingDigits(int[] guess, int[] code) {
        int count = 0;

        for (int i = 0; i < CODE_LENGTH; i++) {
            if (guess[i] == code[i]) {
                count++;
            }
        }

        return count;
    }
}
