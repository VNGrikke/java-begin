package OOP02.validator;

import java.util.List;
import java.util.Scanner;
import OOP02.enity.Product;

public class ProductValidate {

    public static String inputProductId(Scanner scanner, List<Product> arrProduct) {
        String productId;
        boolean isValid;
        do {
            productId = scanner.nextLine();
            isValid = productId.matches("^[A-Za-z0-9]{4}$") && !isProductIdExists(productId, arrProduct);
            if (!isValid) {
                System.out.print("Mã sản phẩm không hợp lệ hoặc đã tồn tại. Nhập lại: ");
            }
        } while (!isValid);
        return productId;
    }

    public static String inputProductName(Scanner scanner, List<Product> arrProduct) {
        String productName;
        boolean isValid;
        do {
            productName = scanner.nextLine();
            isValid = productName.length() >= 6 && productName.length() <= 50 && !isProductNameExists(productName, arrProduct);
            if (!isValid) {
                System.out.print("Tên sản phẩm không hợp lệ hoặc đã tồn tại. Nhập lại: ");
            }
        } while (!isValid);
        return productName;
    }

    public static float inputImportPrice(Scanner scanner) {
        float importPrice;
        do {
            importPrice = scanner.nextFloat();
            scanner.nextLine();
            if (importPrice <= 0) {
                System.out.print("Giá nhập phải lớn hơn 0. Nhập lại: ");
            }
        } while (importPrice <= 0);
        return importPrice;
    }

    public static float inputExportPrice(Scanner scanner, float importPrice) {
        float exportPrice;
        do {
            exportPrice = scanner.nextFloat();
            scanner.nextLine();
            if (exportPrice < importPrice * 1.2) {
                System.out.print("Giá xuất phải lớn hơn ít nhất 20% giá nhập. Nhập lại: ");
            }
        } while (exportPrice < importPrice * 1.2);
        return exportPrice;
    }

    public static int inputQuantity(Scanner scanner) {
        int quantity;
        do {
            quantity = scanner.nextInt();
            scanner.nextLine();
            if (quantity <= 0) {
                System.out.print("Số lượng phải lớn hơn 0. Nhập lại: ");
            }
        } while (quantity <= 0);
        return quantity;
    }

    private static boolean isProductIdExists(String productId, List<Product> arrProduct) {
        for (Product p : arrProduct) {
            if (p != null && p.getProductId().equals(productId)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isProductNameExists(String productName, List<Product> arrProduct) {
        for (Product p : arrProduct) {
            if (p != null && p.getProductName().equalsIgnoreCase(productName)) {
                return true;
            }
        }
        return false;
    }
}
