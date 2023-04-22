import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        ArrayList<Integer> info = input.getInfo();
        Check scan = new Check(info);
        System.out.println("Сотрудников зашло на предприятие:  " + scan.counter());
    }
}