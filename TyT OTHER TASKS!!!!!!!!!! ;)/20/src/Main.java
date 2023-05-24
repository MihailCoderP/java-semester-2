import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void fillArray(int m, int n, String filePath) {
        int[][] array = new int[m][m];
        int value = 1;

        for (int layer = 0; layer < m / 2 + 1; layer++) {
            int size = m - layer * 2;
            int startX = layer;
            int startY = layer;

            // Заполнение внешнего кольца
            for (int i = 0; i < size; i++) {
                array[startX][startY + i] = value++;
            }

            for (int i = 1; i < size; i++) {
                array[startX + i][startY + size - 1] = value++;
            }

            for (int i = size - 2; i >= 0; i--) {
                array[startX + size - 1][startY + i] = value++;
            }

            for (int i = size - 2; i >= 1; i--) {
                array[startX + i][startY] = value++;
            }

            n++;
        }

        // Сохранение массива в файл
        try (FileWriter writer = new FileWriter(filePath)) {
            for (int[] row : array) {
                for (int num : row) {
                    writer.write(num + " ");
                }
                writer.write(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int m = 5; // Высота массива
        int n = 1; // Значение для внешнего кольца
        String filePath = "result.txt"; // Путь к файлу

        fillArray(m, n, filePath);

        System.out.println("Массив успешно сохранен в файл " + filePath);
    }
}
