public class Main {
    public static void main(String[] args) {
        int M = 10;
        int N = 50;
        int[] X = {3, 5, 7};

        int sum = calculateSum(M, N, X);

        System.out.println("Сумма чисел, делящихся на указанные делители: " + sum);
    }

    public static int calculateSum(int M, int N, int[] X) {
        int sum = 0;

        for (int i = M; i <= N; i++) {
            for (int Y : X) {
                if (i % Y == 0) {
                    sum += i;
                    break;
                }
            }
        }

        return sum;
    }
}
