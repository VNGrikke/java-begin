import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class b03 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(-82);
        numbers.add(37);
        numbers.add(14);
        numbers.add(52);
        numbers.add(-6);
        System.out.println("Phan tu lon nhat: " + Collections.max(numbers));
        System.out.println("Phan tu nho nhat: " + Collections.min(numbers));
    }
}
