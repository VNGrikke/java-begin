package b06;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product 1", 100));
        products.add(new Product("Product 2", 200));
        products.add(new Product("Product 3", 300));

        double total = calculateTotal(products);
        double tax = calculateTax(total, 0.1);
        double finalAmount = calculateFinalAmount(total, tax);

        displayInvoice(products, total, tax, finalAmount);
    }

    private static double calculateTotal(List<Product> products) {
        double total = 0;
        for (Product product : products) {
            total += product.price;
        }
        return total;
    }

    private static double calculateTax(double total, double taxRate) {
        return total * taxRate;
    }

    private static double calculateFinalAmount(double total, double tax) {
        return total + tax;
    }

    private static void displayInvoice(List<Product> products, double total, double tax, double finalAmount) {
        System.out.println("Invoice:");
        System.out.printf("%-15s %-10s\n", "Name", "Price");
        System.out.println("-----------------------------");
        for (Product product : products) {
            System.out.printf("%-15s %-10.2f\n", product.name, product.price);
        }
        System.out.println("-----------------------------");
        System.out.printf("%-15s %-10.2f\n", "Total:", total);
        System.out.printf("%-15s %-10.2f\n", "Tax:", tax);
        System.out.printf("%-15s %-10.2f\n", "Final Amount:", finalAmount);
    }
}
