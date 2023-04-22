import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        int X = input.nextInt();
        int chis = Integer.MAX_VALUE;
        int number = 0;
        for (int i = 0; i <= X; i++) {
            int raz = Math.abs((i * i) - X);
            if (raz < chis) {
                chis = raz;
                number = i;
            }
        }
        System.out.println("Число квадрат которого ближе всего расположен к введенному числу: "+ number);
    }
}