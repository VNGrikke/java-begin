package OOP02.service;

import OOP02.enity.Product;

import java.util.*;

public class ProductBusiness {
    private final List<Product> productList = new ArrayList<>();

    public void inputProducts(Scanner sc) {
        System.out.print("Nhập số lượng sản phẩm: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            Product product = new Product();
            product.inputData(sc, productList);
            productList.add(product);
        }
    }

    public void displayProducts() {
        if (productList.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống!");
            return;
        }
        for (Product product : productList) {
            product.displayData();
        }
    }

    public void calculateProfit() {
        for (Product product : productList) {
            product.calProfit();
        }
        System.out.println("Đã tính lợi nhuận cho tất cả sản phẩm.");
    }

    public void sortByProfit() {
        productList.sort(Comparator.comparing(Product::getProfit).reversed());
        System.out.println("Sắp xếp thành công!");
        displayProducts();
    }

    public void statisticByPrice(Scanner sc) {
        System.out.print("Nhập khoảng giá từ: ");
        float fromPrice = Float.parseFloat(sc.nextLine());
        System.out.print("Nhập khoảng giá đến: ");
        float toPrice = Float.parseFloat(sc.nextLine());

        List<Product> result = new ArrayList<>();
        for (Product product : productList) {
            if (product.getExportPrice() >= fromPrice && product.getExportPrice() <= toPrice) {
                result.add(product);
            }
        }

        if (result.isEmpty()) {
            System.out.println("Không có sản phẩm nào trong khoảng giá này.");
        } else {
            System.out.println("Danh sách sản phẩm trong khoảng giá:");
            for (Product product : result) {
                product.displayData();
            }
        }
    }

    public void searchByName(Scanner sc) {
        System.out.print("Nhập tên sản phẩm cần tìm: ");
        String name = sc.nextLine().toLowerCase();

        List<Product> result = new ArrayList<>();
        for (Product product : productList) {
            if (product.getProductName().toLowerCase().contains(name)) {
                result.add(product);
            }
        }

        if (result.isEmpty()) {
            System.out.println("Không tìm thấy sản phẩm.");
        } else {
            System.out.println("Danh sách sản phẩm tìm thấy:");
            for (Product product : result) {
                product.displayData();
            }
        }
    }

    public void importProduct(Scanner sc) {
        System.out.print("Nhập mã sản phẩm cần nhập hàng: ");
        String productId = sc.nextLine();
        Product product = findProductById(productId);

        if (product != null) {
            System.out.print("Nhập số lượng cần nhập: ");
            int quantity = Integer.parseInt(sc.nextLine());
            if (quantity > 0) {
                product.setQuantity(product.getQuantity() + quantity);
                System.out.println("Nhập hàng thành công!");
            } else {
                System.out.println("Số lượng nhập không hợp lệ!");
            }
        } else {
            System.out.println("Không tìm thấy sản phẩm.");
        }
    }

    public void sellProduct(Scanner sc) {
        System.out.print("Nhập tên sản phẩm cần bán: ");
        String name = sc.nextLine();
        Product product = findProductByName(name);

        if (product != null) {
            System.out.print("Nhập số lượng cần bán: ");
            int quantity = Integer.parseInt(sc.nextLine());
            if (quantity > 0 && quantity <= product.getQuantity()) {
                product.setQuantity(product.getQuantity() - quantity);
                System.out.println("Bán hàng thành công!");
            } else {
                System.out.println("Số lượng bán không hợp lệ!");
            }
        } else {
            System.out.println("Không tìm thấy sản phẩm.");
        }
    }

    public void updateProductStatus(Scanner sc) {
        System.out.print("Nhập mã sản phẩm cần cập nhật trạng thái: ");
        String productId = sc.nextLine();
        Product product = findProductById(productId);

        if (product != null) {
            product.setStatus(!product.isStatus());
            System.out.println("Cập nhật trạng thái thành công!");
        } else {
            System.out.println("Không tìm thấy sản phẩm.");
        }
    }

    private Product findProductById(String productId) {
        for (Product product : productList) {
            if (product.getProductId().equalsIgnoreCase(productId)) {
                return product;
            }
        }
        return null;
    }

    private Product findProductByName(String productName) {
        for (Product product : productList) {
            if (product.getProductName().equalsIgnoreCase(productName)) {
                return product;
            }
        }
        return null;
    }
}
