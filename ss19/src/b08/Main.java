package b08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        ListProcessor processor = new ListProcessorImpl();

        List<Integer> oddNumbers = processor.checkOdd(numbers);

        System.out.println("tong so le: " + processor.sumOddNumbers(oddNumbers));
        ListProcessor.printList(oddNumbers);

    }
}
