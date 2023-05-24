public class Main {
    public static void main(String[] args) {
        String str = "aabosobca";

        int length = findLongestLength(str);

        System.out.println("Длина самого длинного палиндрома: " + length);
    }

    public static int findLongestLength(String str) {
        int maxLength = 0;

        for (int i = 0; i < str.length(); i++) {

            int len1 = expandAroundCenter(str, i, i);
            maxLength = Math.max(maxLength, len1);


            int len2 = expandAroundCenter(str, i, i + 1);
            maxLength = Math.max(maxLength, len2);
        }

        return maxLength;
    }
    
    private static int expandAroundCenter(String str, int left, int right) {
        int length = 0;

        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            length = right - left + 1;
            left--;
            right++;
        }

        return length;
    }
}
