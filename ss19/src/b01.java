import java.util.*;
import java.util.function.Predicate;

public class b01 {
    public static void main(String[] args) {
        List<String> listString = Arrays.asList("C","Java","","python");

        System.out.println(listString);

        List<String> newListString = filterList(listString);

        System.out.println(newListString);

    }

    public static List<String> filterList(List<String> list){
        Predicate<String> filter = s -> !s.isEmpty() && s != null;
        List<String> newList = new ArrayList<>();
        for (String str : list){
            if (filter.test(str)){
                newList.add(str);
            }
        }
        return newList;
    }
}
