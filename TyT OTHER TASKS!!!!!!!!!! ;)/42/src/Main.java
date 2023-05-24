public class Main {
    public static int countNumbersIntervals(int[][] intervals) {
        int count = 0;
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            count += (end - start - 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {6, 10}, {11, 15}};
        int count = countNumbersIntervals(intervals);
        System.out.println(count);
    }
}
