import java.util.ArrayList;
public class Check {
    private final ArrayList<Integer> info;
    public Check(ArrayList<Integer> info) {
        this.info = info;
    }
    public int counter(){
        int count = 0;
        for (int i : info) {
            if (i == 1) {
                count++;
            }
        }
        return count;
    }
}
