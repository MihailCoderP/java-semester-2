public class Main {

    public static String addNumbers(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int sum = n1 + n2;
        return Integer.toString(sum);
    }

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        String result = addNumbers(num1, num2);
        System.out.println(result);
    }
}
