public class Main {

    public static void main(String[] args) {
        String message = "Hello, World!";
        int shift = 3;
        boolean encrypt = true; // true - шифрование, false - дешифрование

        String encryptedMessage = caesarCipher(message, shift, encrypt);

        System.out.println("Зашифрованное/расшифрованное сообщение: " + encryptedMessage);
    }

    public static String caesarCipher(String message, int shift, boolean encrypt) {
        StringBuilder result = new StringBuilder();

        // Приведем сдвиг к диапазону 0-25
        shift = shift % 26;
        if (shift < 0) {
            shift += 26;
        }

        // Пройдемся по каждому символу в сообщении
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);

            // Проверим, является ли символ буквой английского алфавита
            if (Character.isLetter(ch)) {
                // Определим начальное смещение в зависимости от направления
                int offset = encrypt ? 'A' : 'Z';

                // Приведем символ к верхнему регистру
                ch = Character.toUpperCase(ch);

                // Применим сдвиг
                ch = (char) ((ch - offset + shift) % 26 + offset);
            }

            // Добавим символ в результат
            result.append(ch);
        }

        return result.toString();
    }
}
