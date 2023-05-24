import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String weights = "56 65 74 100 99 68 86 180 90";
        String[] weightsArray = weights.split(" ");

        Arrays.sort(weightsArray, Comparator.comparingInt(Main::getWeightSum));

        String sortedWeights = String.join(" ", weightsArray);
        System.out.println(sortedWeights);
    }

    private static int getWeightSum(String weight) {
        int sum = 0;
        for (char digit : weight.toCharArray()) {
            sum += Character.getNumericValue(digit);
        }
        return sum;
    }
}
