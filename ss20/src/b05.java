import java.util.List;
import java.util.Optional;

public class b05 {
    public static void main(String[] args) {
        List<Integer> normalList = List.of(10, 5, 8, 20, 7);
        List<Integer> singleElementList = List.of(10);
        List<Integer> allSameList = List.of(10, 10, 10);

        System.out.println(find(normalList));
        System.out.println(find(singleElementList));
        System.out.println(find(allSameList));
    }

    public static String find(List<Integer> list) {
        Optional<Integer> result = list.stream().distinct().sorted((a, b) -> b - a) .skip(1) .findFirst();
        return result.map(String::valueOf).orElse("Khong tim thay");
    }
}