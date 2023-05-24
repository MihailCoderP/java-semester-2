public class Main {
    public static void main(String[] args) {
        int N = 20;
        int X = 3;
        int Y = 5;

        int sum = calculateSum(N, X, Y);

        System.out.println("Сумма чисел, делящихся на " + X + " или " + Y + ": " + sum);
    }
    public static int calculateSum(int N, int X, int Y) {
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            if (i % X == 0 || i % Y == 0) {
                sum += i;
            }
        }

        return sum;
    }
}
