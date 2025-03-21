import java.util.ArrayList;
import java.util.List;

public class b04 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Tong cac phan tu: " + sum);
    }
}
