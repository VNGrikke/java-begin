package b08;

import java.util.List;

public class ListProcessorImpl implements ListProcessor {

    @Override
    public Integer sumOddNumbers(List<Integer> list) {
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        return sum;
    }

    @Override
    public List<Integer> checkOdd(List<Integer> list) {
        return ListProcessor.super.checkOdd(list);
    }
}
