public class Main {
    public static void main(String[] args) {
        long n = 10;

        String winner = playGame(n);
        System.out.println("Победитель: " + winner);
    }

    private static String playGame(long sticks) {
        if (sticks == 1) {

            return "Таня";
        }

        if (sticks % 2 == 0) {
            // Если количество палочек четное
            String winner1 = playGame(sticks - 1); // Игрок забирает одну палочку
            String winner2 = playGame(sticks / 2); // Игрок забирает половину палочек
            if (winner1.equals("Таня") || winner2.equals("Таня")) {
                return "Саша";
            } else {
                return "Таня";
            }
        } else {
            // Если количество палочек нечетное, игрок забирает одну палочку
            return playGame(sticks - 1);
        }
    }
}
