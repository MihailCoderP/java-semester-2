import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        System.out.print("Введите символ: ");
        char X = scanner.next().charAt(0);
// подсчёт символа
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == X) {
                count++;
            }
        }
        System.out.println("Символ " + X + " встречается " + count + " раз");
    }
}