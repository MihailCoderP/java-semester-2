import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scan.nextLine().trim();
        String formatName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("Привет, " + formatName + "!!!");
    }
}