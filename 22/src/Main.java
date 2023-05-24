public class Main {
    public static void main(String[] args) {
        double side1 = 5;
        double side2 = 6;
        double side3 = 7;

        double area = calculateTriangleArea(side1, side2, side3);

        System.out.println("Площадь треугольника: " + area);
    }
    public static double calculateTriangleArea(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        return area;
    }
}
