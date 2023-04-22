import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static String deleteRepeat(String string) {
        String[] words = string.split("\\s+");
        List<String> noRepeat = new ArrayList<>();
        for (String word : words) {
            if (!noRepeat.contains(word)) {
                noRepeat.add(word);
            }
        }
        return String.join(" ", noRepeat);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scan.nextLine();
        String result = deleteRepeat(str);
        System.out.println(result);
    }
}