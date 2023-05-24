public class Main {
    public static int maximumSlideSum(int[][] pyramid) {
        int levels = pyramid.length;

        int[][] dp = new int[levels][levels];
        dp[0][0] = pyramid[0][0];


        for (int i = 1; i < levels; i++) {
            for (int j = 0; j <= i; j++) {
                // Вычисляем максимальную сумму скольжения для текущего элемента
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + pyramid[i][j];
                } else if (j == i) {
                    dp[i][j] = dp[i - 1][j - 1] + pyramid[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + pyramid[i][j];
                }
            }
        }

        // Находим максимальную сумму на последнем уровне пирамиды
        int maxSum = 0;
        for (int j = 0; j < levels; j++) {
            maxSum = Math.max(maxSum, dp[levels - 1][j]);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[][] pyramid = {
                {3},
                {7, 4},
                {2, 4, 6},
                {8, 5, 9, 3}
        };
        int maxSum = maximumSlideSum(pyramid);
        System.out.println("Максимальная сумма скольжения: " + maxSum);
    }
}
