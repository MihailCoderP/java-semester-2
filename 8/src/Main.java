import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scan.nextInt();
        System.out.println("Введите число: ");
        int b = scan.nextInt();
        System.out.println("Введите число: ");
        int c = scan.nextInt();
        if (a + b > c && a + c > b && b + c > a){
            double cosA = (b * b + c * c - a * a) / (2 * b * c);
            double cosB = (a * a + c * c - b * b) / (2 * a * c);
            double cosC = (a * a + b * b - c * c) / (2 * a * b);
            double angleA = Math.toDegrees(Math.acos(cosA));
            double angleB = Math.toDegrees(Math.acos(cosB));
            double angleC = Math.toDegrees(Math.acos(cosC));
            double maxAngle = Math.max(Math.max(angleA, angleB), angleC);
            System.out.println("Наибольший внешний угол: " + maxAngle);
        } else {
            System.out.println("Треугольник не существует");

        }


    }
}