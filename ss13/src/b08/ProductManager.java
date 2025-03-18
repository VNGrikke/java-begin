package b08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private List<Product> products;
    private Scanner sc;

    public ProductManager() {
        products = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void addProduct() {
        System.out.print("Enter product name: ");
        String name = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        sc.nextLine();

        products.add(new Product(name, price, quantity));
        System.out.println("Product added successfully.");
    }

    public void showAllProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }
        System.out.printf("%-15s %-10s %-10s\n", "Name", "Price", "Quantity");
        System.out.println("--------------------------------");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void findProductByName() {
        System.out.print("Enter product name to search: ");
        String name = sc.nextLine();
        boolean found = false;
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                System.out.println("Product found: " + product);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found.");
        }
    }
}
