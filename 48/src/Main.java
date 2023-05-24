import java.util.HashSet;
import java.util.Set;

public class Main {
    public static Set<Integer> generateU(int n) {
        Set<Integer> uSet = new HashSet<>();
        uSet.add(1); // Добавляем первое число u(0) = 1

        for (int i = 1; i <= n; i++) {
            int y = 2 * i + 1;
            int z = 3 * i + 1;

            uSet.add(y);
            uSet.add(z);
        }

        return uSet;
    }

    public static void main(String[] args) {
        int n = 10;
        Set<Integer> uSet = generateU(n);
        System.out.println(uSet);
    }
}
