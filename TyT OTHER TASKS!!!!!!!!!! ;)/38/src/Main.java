public class Main {
    public static void main(String[] args) {
        String text = "Программа на Java для изменения текста.";
        String transformedText = transformText(text);
        System.out.println(transformedText);
    }

    private static String transformText(String text) {
        String[] words = text.split("\\s+"); // Разделяем текст на слова по пробелам
        StringBuilder transformedText = new StringBuilder();

        for (String word : words) {
            String punctuation = getTrailingPunctuation(word); // Получаем знаки препинания в конце слова
            String transformedWord = word.substring(1) + word.charAt(0) + "ауч" + punctuation; // Перемещаем первую букву в конец и добавляем "ауч"
            transformedText.append(transformedWord).append(" ");
        }

        return transformedText.toString().trim(); // Удаляем лишний пробел в конце и возвращаем результат
    }

    private static String getTrailingPunctuation(String word) {
        int lastCharIndex = word.length() - 1;
        StringBuilder punctuation = new StringBuilder();

        return punctuation.toString();
    }
}
