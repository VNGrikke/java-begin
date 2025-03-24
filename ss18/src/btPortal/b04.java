package btPortal;

import java.util.Map;
import java.util.TreeMap;

public class b04 {
    public static void main(String[] args) {
        Map<String, Integer> empTreeMap = new TreeMap<>();
        empTreeMap.put("NV001", 2000);
        empTreeMap.put("NV002", 1000);
        empTreeMap.put("NV005", 2500);
        empTreeMap.put("NV004", 2300);
        empTreeMap.put("NV003", 2100);

        for (String key : empTreeMap.keySet()) {
            System.out.println(key+": "+empTreeMap.get(key));
        }

        empTreeMap.put("NV001", 2500);
        empTreeMap.remove("NV002");

        for (String key : empTreeMap.keySet()) {
            System.out.println(key+": "+empTreeMap.get(key));
        }

    }
}
