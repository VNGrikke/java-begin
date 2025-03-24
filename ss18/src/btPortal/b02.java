package btPortal;

import java.util.HashMap;

public class b02 {
    public static void main(String[] args) {
        HashMap<String, Integer> productHashMap = new HashMap<>();
        productHashMap.put("Laptop", 1000);
        productHashMap.put("Iphone x", 2000);
        productHashMap.put("Samsung zflip", 300);
        productHashMap.put("tablet", 999);

        System.out.println(productHashMap.containsKey("Laptop"));
        for (String key : productHashMap.keySet()) {
            if (productHashMap.get(key) >= 1000) {
                System.out.println(key+": " +productHashMap.get(key));
            }
        }
    }
}
