public class Main {
    public static void main(String[] args) {
        Check coo = new Check();
        float [] A = coo.coordinates();
        float [] B = coo.coordinates();
        float [] C = coo.coordinates();
        Triangle triangle = new Triangle(A, B, C);
        System.out.println("Барицентр треугольника находится в координатах [" + triangle.getXBarycenter() + "," + triangle.getYBarycenter() + "]");
    }
}