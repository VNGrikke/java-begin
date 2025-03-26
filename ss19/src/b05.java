import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class b05 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Andrew", "Bob", "Anna", "Charles");
        List<String> names2 = Arrays.asList("Anna", "Alexandra", "Ashton", "Alfred", "Ariana");

        System.out.println(check(names));
        System.out.println(check(names2));
    }

    public static int check(List<String> names){
        Predicate<String> p1 = s -> s.charAt(0) == 'A' && s.length() >= 5;
        int count = 0;
        for (String name : names) {
            if (p1.test(name)) {
                count++;
            }
        }
        return count;
    }
}
