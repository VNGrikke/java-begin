package b06;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("lambda");
        list.add("stream");
        list.add("functional");

        StringProcessor processor = (input) -> input.toUpperCase() + " - TECHNICAL";

        List<String> strings = new ArrayList<>();
        for (String s : list) {
            strings.add(processor.processString(s));
        }
        
        processor.printList(strings);
    }
}
