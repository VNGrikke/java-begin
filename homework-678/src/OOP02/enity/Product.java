package OOP02.enity;

import java.util.List;
import java.util.Scanner;
import OOP02.validator.ProductValidate;


public class Product {
    private String productId;
    private String productName;
    private float importPrice;
    private float exportPrice;
    private float profit;
    private int quantity;
    private String descriptions;
    private boolean status;

    public Product() {
    }

    public Product(String productId, String productName, float importPrice, float exportPrice, int quantity, String descriptions, boolean status) {
        this.productId = productId;
        this.productName = productName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.profit = exportPrice - importPrice;
        this.quantity = quantity;
        this.descriptions = descriptions;
        this.status = status;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getProfit() {
        return profit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void inputData(Scanner scanner, List<Product> arrProduct) {
        System.out.print("Nhập mã sản phẩm (4 ký tự): ");
        this.productId = ProductValidate.inputProductId(scanner, arrProduct);

        System.out.print("Nhập tên sản phẩm (6-50 ký tự): ");
        this.productName = ProductValidate.inputProductName(scanner, arrProduct);

        System.out.print("Nhập giá nhập: ");
        this.importPrice = ProductValidate.inputImportPrice(scanner);

        System.out.print("Nhập giá xuất: ");
        this.exportPrice = ProductValidate.inputExportPrice(scanner, this.importPrice);

        this.profit = this.exportPrice - this.importPrice;

        System.out.print("Nhập số lượng sản phẩm: ");
        this.quantity = ProductValidate.inputQuantity(scanner);

        System.out.print("Nhập mô tả sản phẩm: ");
        this.descriptions = scanner.nextLine();

        System.out.print("Trạng thái sản phẩm (true - Đang bán, false - Không bán): ");
        this.status = scanner.nextBoolean();
        scanner.nextLine();
    }

    public void displayData() {
        System.out.println("Mã sản phẩm: " + productId);
        System.out.println("Tên sản phẩm: " + productName);
        System.out.println("Giá nhập: " + importPrice);
        System.out.println("Giá xuất: " + exportPrice);
        System.out.println("Lợi nhuận: " + profit);
        System.out.println("Số lượng: " + quantity);
        System.out.println("Mô tả: " + descriptions);
        System.out.println("Trạng thái: " + (status ? "Đang bán" : "Không bán"));
    }


    public void calProfit() {
        this.profit = this.exportPrice - this.importPrice;
    }

}
