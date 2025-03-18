import java.util.ArrayList;
import java.util.Scanner;

public class b05 {
    private static final ArrayList<String> products = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = getChoice();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    showAllProducts();
                    break;
                case 3:
                    findProduct();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default :
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("1. Add Product");
        System.out.println("2. Show All Products");
        System.out.println("3. Find Product");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static int getChoice() {
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            sc.next();
        }
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }

    private static void addProduct() {
        System.out.print("Enter product name: ");
        String product = sc.nextLine().trim();
        if (!product.isEmpty()) {
            products.add(product);
            System.out.println("Product added successfully.");
        } else {
            System.out.println("Product name cannot be empty.");
        }
    }

    private static void showAllProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            System.out.println("Product List:");
            for (String product : products) {
                System.out.println("- " + product);
            }
        }
    }

    private static void findProduct() {
        System.out.print("Enter product name to find: ");
        String name = sc.nextLine().trim();
        for (String product : products) {
            if (product.equalsIgnoreCase(name)) {
                System.out.println("Product found: " + product);
                return;
            }
        }
        System.out.println("Product not found.");
    }
}
