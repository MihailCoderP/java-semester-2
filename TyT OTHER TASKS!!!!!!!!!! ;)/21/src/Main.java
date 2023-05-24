import java.util.HashMap;
import java.util.Map;

public class Main {
    private static final Map<Character, Character> keypadMap = new HashMap<>();

    static {
        keypadMap.put('1', '1');
        keypadMap.put('2', 'a');
        keypadMap.put('3', 'd');
        keypadMap.put('4', 'g');
        keypadMap.put('5', 'j');
        keypadMap.put('6', 'm');
        keypadMap.put('7', 'p');
        keypadMap.put('8', 't');
        keypadMap.put('9', 'w');
        keypadMap.put('0', ' ');
    }

    public static String convertKeypadToPhone(String keypadInput) {
        StringBuilder phoneInput = new StringBuilder();

        for (char c : keypadInput.toCharArray()) {
            char convertedChar = keypadMap.get(c);
            phoneInput.append(convertedChar);
        }

        return phoneInput.toString();
    }

    public static void main(String[] args) {
        String keypadInput = "789";
        String phoneInput = convertKeypadToPhone(keypadInput);

        System.out.println("Keypad Input: " + keypadInput);
        System.out.println("Phone Input: " + phoneInput);
    }
}
