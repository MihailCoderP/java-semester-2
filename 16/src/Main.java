import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int uppReg = 0, lowReg = 0;
        for (int i = 0; i < input.length(); i++) {
            char X = input.charAt(i);
            if (Character.isUpperCase(X)) {
                uppReg++;
            } else if (Character.isLowerCase(X)) {
                lowReg++;
            }
        }
        if (uppReg > lowReg) {
            input = input.toUpperCase();
        } else if (lowReg > uppReg) {
            input = input.toLowerCase();
        } else {
            input = input.toLowerCase();
        }
        System.out.println(input);
    }
}