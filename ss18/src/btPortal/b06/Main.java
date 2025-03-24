package btPortal.b06;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Student> studentLinkedHashMap = new LinkedHashMap<String,Student>();

        studentLinkedHashMap.put("ST001", new Student( 7.5, 6.45, 5.55));
        studentLinkedHashMap.put("ST002", new Student( 4.9, 7.0, 5.55));
        studentLinkedHashMap.put("ST003", new Student( 3.6, 5.4, 5.55));
        studentLinkedHashMap.put("ST004", new Student( 8.5, 7.5, 5.55));
        studentLinkedHashMap.put("ST005", new Student( 6.9, 8.5, 5.55));
        studentLinkedHashMap.put("ST006", new Student( 5.0, 6.4, 5.55));
        studentLinkedHashMap.put("ST007", new Student( 5.75, 4.4, 5.55));
        studentLinkedHashMap.put("ST008", new Student( 3.15, 3.5, 5.55));
        studentLinkedHashMap.put("ST009", new Student( 8.45, 8.4, 5.55));
        studentLinkedHashMap.put("ST010", new Student( 6.25, 8.5, 5.55));

        Map<String, Double> studentAvg = new LinkedHashMap<String, Double>();
        for (Map.Entry<String, Student> entry : studentLinkedHashMap.entrySet()) {
            studentAvg.put(entry.getKey(), entry.getValue().avgScore());
        }

        for (Map.Entry<String, Double> entry : studentAvg.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
