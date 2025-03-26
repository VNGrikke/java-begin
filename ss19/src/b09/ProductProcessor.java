package b09;

import java.util.ArrayList;
import java.util.List;

public interface ProductProcessor {
    abstract float calculateTotalValue(List<Product> list);

    static void printList(List<Product> list) {
        list.forEach(product -> System.out.println(product.toString()));
    }


    default List<Product> hasExpensiveProduct(List<Product> list) {
        List<Product> result = new ArrayList<>();
        for (Product product : list) {
            if (product.getPrice() > 100f){
                result.add(product);
            }
        }
        return result;
    }
}
