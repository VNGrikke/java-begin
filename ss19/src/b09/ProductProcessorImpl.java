package b09;

import java.util.List;

public class ProductProcessorImpl implements ProductProcessor {


    @Override
    public float calculateTotalValue(List<Product> list) {
        float sum = 0;
        for (Product p : list) {
            sum += p.getPrice();
        }
        return sum;
    }

    @Override
    public List<Product> hasExpensiveProduct(List<Product> list) {
        return ProductProcessor.super.hasExpensiveProduct(list);
    }
}
