public class Main {
    private static final String[] ROMAN_SYMBOLS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static final int[] ARABIC_VALUES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public static String convertToRoman(int year) {
        if (year <= 0 || year >= 10000) {
            throw new IllegalArgumentException("Год должен быть в диапазоне 1 < n < 10000");
        }

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < ROMAN_SYMBOLS.length; i++) {
            while (year >= ARABIC_VALUES[i]) {
                roman.append(ROMAN_SYMBOLS[i]);
                year -= ARABIC_VALUES[i];
            }
        }

        return roman.toString();
    }

    public static void main(String[] args) {
        int year = 2023;
        String romanYear = convertToRoman(year);
        System.out.println(romanYear);
    }
}
