import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        int length = scanner.nextInt();

        int[] numbers = new int[length];
        System.out.println("Введите числа массива: ");
        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sumSqr = 0;
        for (int i = 0; i < length; i++) {
            sumSqr += numbers[i] * numbers[i];
        }

        System.out.println("Сумма квадратов: " + sumSqr);
    }
}