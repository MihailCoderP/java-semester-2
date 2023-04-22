public class Main {
        public static void main(String[] args) {

            int n = 3;
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = (int)(Math.random() * 10 + 1);
                }
            }
            System.out.println("Initial Matrix");
            System.out.println("------");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%4d", a[i][j]);
                }
                System.out.println();
            }

            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
                }
            }

            System.out.println();
            System.out.println("New Matrix");
            System.out.println("------");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%3d", a[i][j]);
                }
                System.out.println();
            }

        }
    }
