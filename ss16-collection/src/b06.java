import java.util.ArrayList;
import java.util.List;

public class b06 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>(List.of(1, 2, 3, 2, 4, 1, 5));
        System.out.println("Danh sach: " + numbers);
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i).equals(numbers.get(j))) {
                    numbers.remove(j);
                    j--;
                }
            }
        }
        System.out.println("Danh sach: " + numbers);

    }
}
