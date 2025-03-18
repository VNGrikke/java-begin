import java.util.Scanner;

public class Product implements IApp {
    private String productId;
    private String productName;
    private float importPrice;
    private float exportPrice;
    private String title;
    private String description;
    private int quantity;
    private int categoryId;
    private int status;

    public Product() {}

    public Product(String productId, String productName, float importPrice, float exportPrice, String title, String description, int quantity, int categoryId, int status) {
        this.productId = productId;
        this.productName = productName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.title = title;
        this.description = description;
        this.quantity = quantity;
        this.categoryId = categoryId;
        this.status = status;
    }

    // Getters and Setters
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.print("Nhập mã sản phẩm (5 ký tự, bắt đầu bằng C, E hoặc T): ");
        this.productId = scanner.nextLine();
        System.out.print("Nhập tên sản phẩm (10-100 ký tự): ");
        this.productName = scanner.nextLine();
        System.out.print("Nhập giá nhập: ");
        this.importPrice = Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập giá xuất (phải lớn hơn " + INTEREST + "): ");
        this.exportPrice = Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập tiêu đề (tối đa 200 ký tự): ");
        this.title = scanner.nextLine();
        System.out.print("Nhập mô tả: ");
        this.description = scanner.nextLine();
        System.out.print("Nhập số lượng: ");
        this.quantity = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập mã danh mục: ");
        this.categoryId = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập trạng thái (0: Đang hoạt động, 1: Hết hàng, 2: Không hoạt động): ");
        this.status = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("Mã sản phẩm: " + productId);
        System.out.println("Tên sản phẩm: " + productName);
        System.out.println("Giá nhập: " + importPrice);
        System.out.println("Giá xuất: " + exportPrice);
        System.out.println("Tiêu đề: " + title);
        System.out.println("Mô tả: " + description);
        System.out.println("Số lượng: " + quantity);
        System.out.println("Mã danh mục: " + categoryId);
        System.out.println("Trạng thái: " + (status == 0 ? "Đang hoạt động" : status == 1 ? "Hết hàng" : "Không hoạt động"));
    }
}