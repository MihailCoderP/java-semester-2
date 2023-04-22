import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите начало ряда: ");
        int schet = vvod.nextInt();
        System.out.print("Введите шаг: ");
        int step = vvod.nextInt();
        System.out.print("Введите количество шагов: ");
        int numStep = vvod.nextInt();
        for (int i = 0; i < numStep; i++) {
            int num = schet + i * step;
            System.out.print(num + " ");
        }
    }
}