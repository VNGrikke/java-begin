import java.util.Scanner;

public class Categories implements IApp {
    private static int nextId = 1;
    private int categoryId;
    private String categoryName;
    private int priority;
    private String description;
    private boolean status;

    public Categories() {
        this.categoryId = nextId++;
    }

    public Categories(String categoryName, int priority, String description, boolean status) {
        this.categoryId = nextId++;
        this.categoryName = categoryName;
        this.priority = priority;
        this.description = description;
        this.status = status;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.print("Nhập tên danh mục (6-50 ký tự): ");
        this.categoryName = scanner.nextLine();
        System.out.print("Nhập độ ưu tiên: ");
        this.priority = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập mô tả (tối đa 255 ký tự): ");
        this.description = scanner.nextLine();
        System.out.print("Nhập trạng thái (true/false): ");
        this.status = Boolean.parseBoolean(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("Mã danh mục: " + categoryId);
        System.out.println("Tên danh mục: " + categoryName);
        System.out.println("Độ ưu tiên: " + priority);
        System.out.println("Mô tả: " + description);
        System.out.println("Trạng thái: " + (status ? "Hoạt động" : "Không hoạt động"));
    }
}