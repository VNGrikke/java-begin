package b08;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public interface ListProcessor {
    abstract Integer sumOddNumbers(List<Integer> list);

    static void printList(List<Integer> list) {
        list.forEach(System.out::println);
    }

    default List<Integer> checkOdd(List<Integer> list) {
        Predicate<Integer> isOdd = i -> i % 2 != 0;
        List<Integer> listOddNumbers = new ArrayList<>();
        for (Integer i : list) {
            if (isOdd.test(i)) {
                listOddNumbers.add(i);
            }
        }
        return listOddNumbers;
    }
}
