public class Main {
    public static void main(String[] args) {
        String encryptedText = "защищенный текст";
        int offset = 3;

        String decryptedText = decrypt(encryptedText, offset);
        System.out.println(decryptedText);
    }

    private static String decrypt(String encryptedText, int offset) {
        StringBuilder decryptedText = new StringBuilder();

        for (char c : encryptedText.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'А' : 'а';
                int decryptedChar = (c - base - offset + 33) % 33 + base;
                decryptedText.append((char) decryptedChar);
            } else {
                decryptedText.append(c);
            }
        }

        return decryptedText.toString();
    }
}
