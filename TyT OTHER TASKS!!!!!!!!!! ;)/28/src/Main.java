public class Main {
    public static void main(String[] args) {
        int n = 9;

        int[] squares = findSquares(n);

        if (squares != null) {
            System.out.println("Число " + n + " является разницей между " + squares[1] + " и " + squares[0]);
        } else {
            System.out.println("Для числа " + n + " не существует последовательных квадратов с такой разницей.");
        }
    }

    public static int[] findSquares(int n) {
        int i = 1;

        while (true) {
            int square1 = i * i;
            int square2 = (i + 1) * (i + 1);

            int diff = square2 - square1;

            if (diff == n) {
                int[] result = {square1, square2};
                return result;
            } else if (diff > n) {
                break;
            }

            i++;
        }

        return null;
    }
}
