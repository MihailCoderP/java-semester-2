public class Main {
    public static int fusc(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n % 2 == 0) {
            return fusc(n / 2);
        }
        int half = n / 2;
        return fusc(half) + fusc(half + 1);
    }

    public static void main(String[] args) {
        int n = 11;
        int fuscNumber = fusc(n);
        System.out.println("Fusc(" + n + ") = " + fuscNumber);
    }
}
