package ra.entity;

import java.time.LocalDate;
import java.util.Scanner;

public class Product implements IProduct{
    private static int count = 0;
    private int id;
    private String productName;
    private float price;
    private String category;
    private LocalDate createDate;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public Product(String productName, float price, String category) {
        this.id = ++count;
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.createDate = LocalDate.now();
    }

    public Product() {
        id = ++count;
    }



    @Override
    public void inputData(Scanner sc) {
        System.out.print("Nhập tên sản phẩm (30-100 kí tự): ");
        productName = sc.nextLine().trim();

        while(productName.length() < 30 || productName.length() > 100) {
            System.out.println("Nhập lại:");
            productName = sc.nextLine().trim();
        }

        System.out.print("Nhập giá sản phẩm: ");
        price = sc.nextFloat();
        while (price <= 0) {
            System.out.println("Giá phải lớn hơn 0. Nhập lại:");
            price = sc.nextFloat();
        }
        sc.nextLine();

        System.out.print("Nhập danh mục sản phẩm: ");
        category = sc.nextLine();

        createDate = LocalDate.now();
    }

    @Override
    public void displayData() {
        System.out.println("| " + id + " | " + productName + " | " + price + " | " + category + " | " + createDate + " |");
    }
}
