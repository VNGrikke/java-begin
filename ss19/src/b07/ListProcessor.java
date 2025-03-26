package b07;

import java.util.List;

public interface ListProcessor {

    abstract boolean containsNegative(List<Integer> list);

    static void printList(List<Integer> list) {
        list.forEach(System.out::print);
    }



}
