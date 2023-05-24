import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int number = 341;
        int nextPermutation = findNextPermutation(number);
        System.out.println("Next permutation: " + nextPermutation);
    }
    private static int findNextPermutation(int number) {
        char[] num = String.valueOf(number).toCharArray();
        int n = num.length;

        int i = n - 2;
        while (i >= 0 && num[i] >= num[i + 1]) {
            i--;
        }
        if (i < 0) {
            return -1;
        }

        int j = n - 1;
        while (num[j] <= num[i]) {
            j--;
        }

        swap(num, i, j);

        reverse(num, i + 1, n - 1);

        int nextPermutation = Integer.parseInt(String.valueOf(num));
        return nextPermutation;
    }

    private static void swap(char[] digits, int i, int j) {
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
    }

    private static void reverse(char[] digits, int start, int end) {
        while (start < end) {
            swap(digits, start, end);
            start++;
            end--;
        }
    }
}
