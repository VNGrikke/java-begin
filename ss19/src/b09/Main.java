package b09;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        System.out.println();
        Product newProduct = new Product();

        products.add(new Product("dt", 155.6f));
        products.add(new Product("tl", 13.6f));
        products.add(new Product("tv", 122.6f));
        products.add(new Product("mt", 99.99f));


        ProductProcessor processor = new ProductProcessorImpl();

        List<Product> products1 = processor.hasExpensiveProduct(products);

        if (products1.size() > 0) {
            System.out.println("San pham lon hon 100");
            ProductProcessor.printList(products1);
        }else {
            System.out.println("Khong co sp lon hon 100");
        }

        System.out.println("Tong gia tri tat ca san pham: " + processor.calculateTotalValue(products));
        System.out.println("Danh sach san pham");
        ProductProcessor.printList(products);


    }
}
