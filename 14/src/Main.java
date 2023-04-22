import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] number = new int[3];
        for (int i = 0; i < number.length; i++) {
            System.out.println("Введите число: ");
            int vvodNumber = scan.nextInt();
            if (i == 0 || vvodNumber > number[0]) {
                number[2] = number[1];
                number[1] = number[0];
                number[0] = vvodNumber;
            } else if (i == 1 || vvodNumber > number[1]) {
                number[2] = number[1];
                number[1] = vvodNumber;
            } else {
                number[2] = vvodNumber;
            }
        }
        System.out.println(number[0] + ", " + number[1] + ", " + number[2]);
    }
}