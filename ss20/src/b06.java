import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class b06 {
    public static void main(String[] args) {
        List<String> items = List.of("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Integer> map = new HashMap<>();
        for (String item : items) {
            if (map.containsKey(item)) {
                map.put(item, map.get(item) + 1);
            }else {
                map.put(item, 1);
            }
        }

        System.out.println(LocalDateTime.now());

        map.forEach((k, v) -> System.out.println(k + ": " + v));

    }
}
