import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество игроков: ");
        int playerCount = scanner.nextInt();

        System.out.print("Введите номер игрока, с которого начинается игра: ");
        int startingPlayer = scanner.nextInt();

        List<Integer> players = new ArrayList<>();
        for (int i = 1; i <= playerCount; i++) {
            players.add(i);
        }

        List<Integer> result = playGame(players, startingPlayer);
        System.out.println("Результат игры: " + result);
    }

    private static List<Integer> playGame(List<Integer> players, int startingPlayer) {
        List<Integer> result = new ArrayList<>();
        int count = 1;
        int index = startingPlayer - 1;

        while (players.size() > 1) {
            if (count % 3 == 0) {
                int removedPlayer = players.remove(index);
                result.add(removedPlayer);
                index--;
            }

            count++;
            index = (index + 1) % players.size();
        }

        result.add(players.get(0)); // Добавляем победителя в результат
        return result;
    }
}
