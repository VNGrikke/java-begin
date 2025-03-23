import java.util.*;

public class b07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi.");
        String input = sc.nextLine();
        String[] lowercaseInput = input.toLowerCase().split("\\W+");

        Map<String, Integer> count = new HashMap<>();
        for (String word : lowercaseInput) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        List<String> sortedWords = new ArrayList<>(count.keySet());
        Collections.sort(sortedWords);

        System.out.println("Danh sach:");
        for (String word : sortedWords) {
            System.out.println(word + ": " + count.get(word));
        }    }
}
