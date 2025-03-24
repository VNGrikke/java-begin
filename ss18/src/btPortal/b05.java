package btPortal;

import java.util.*;

public class b05 {
    public static void main(String[] args) {
        Map<String, Integer> productHashMap = new HashMap<>();
        productHashMap.put("SP01", 500);
        productHashMap.put("SP04", 8500);
        productHashMap.put("SP02", 1500);
        productHashMap.put("SP05", 200);
        productHashMap.put("SP03", 1000);

        List<Map.Entry<String, Integer>> productList = new ArrayList<>(productHashMap.entrySet());

        productList.sort(Map.Entry.comparingByValue());

        Map<String, Integer> productLinkedHashMap = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : productList) {
            if (entry.getValue() >= 500 && entry.getValue() <= 1500) {
                productLinkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }

        for (String key : productLinkedHashMap.keySet()) {
            System.out.println(key+": "+productLinkedHashMap.get(key));
        }
    }
}
