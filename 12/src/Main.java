import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scan.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scan.nextInt();
        int schet = Math.min(num1, num2);
        for (int i = schet; ; i += schet) {
            int sqr = i * i;
            System.out.println(sqr);
            if (sqr >= Math.max(num1, num2) * Math.max(num1, num2)) {
                break;
            }
        }
    }
}