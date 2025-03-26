package b07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static ListProcessorImpl process = new ListProcessorImpl();

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, -6, 10);
        List<Integer> list2 = Arrays.asList(2, 3, 5, 6, 9);

        ListProcessor.printList(list);
        check(list);

        ListProcessor.printList(list2);
        check(list2);

    }
    public static void check(List<Integer> list) {
        if (process.containsNegative(list)) {
            System.out.println("Ko co so am");
        }else {
            System.out.println("Co so am");
        }
    }
}
