package btPortal;

import java.util.LinkedHashMap;

public class b03 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> productLinkedHashMap = new LinkedHashMap<>();
        productLinkedHashMap.put("Laptop", 1000);
        productLinkedHashMap.put("Iphone x", 2000);
        productLinkedHashMap.put("Samsung zflip", 300);
        productLinkedHashMap.put("tablet", 999);
        productLinkedHashMap.put("PC", 9999);

        for (String key : productLinkedHashMap.keySet()) {
            System.out.println(key+": "+productLinkedHashMap.get(key));
        }

        productLinkedHashMap.put("Iphone x", 3000);
        productLinkedHashMap.remove("Samsung zflip");

        for (String key : productLinkedHashMap.keySet()) {
            System.out.println(key+": "+productLinkedHashMap.get(key));
        }
    }
}
