import java.util.ArrayList;
import java.util.List;

public class b05 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>(List.of(1, 2, 3, 2, 2, 1, 5));

        System.out.println("Danh sach: " + numbers);

        ArrayList<Integer> counted = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            int count = 0;
            if (!counted.contains(numbers.get(i))) { // kiem tra trong danh sach co ton tai khong
                for (int j = 0; j < numbers.size(); j++) {
                    if (numbers.get(i).equals(numbers.get(j))) {
                        count++;
                    }
                }
                counted.add(numbers.get(i)); // them phan tu da dem vao danh sach
                System.out.println(numbers.get(i) + ": " + count + " lần");
            }
        }

    }
}
