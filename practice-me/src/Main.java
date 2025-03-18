import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private List<Categories> categoriesList = new ArrayList<>();
    private List<Product> productList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main shop = new Main();
        shop.run();
    }

    public void run() {
        while (true) {
            System.out.println("*********************SHOP MENU*********************");
            System.out.println("1. Quản lý danh mục");
            System.out.println("2. Quản lý sản phẩm");
            System.out.println("3. Thoát");
            System.out.print("Chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    manageCategories();
                    break;
                case 2:
                    manageProducts();
                    break;
                case 3:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    private void manageCategories() {
        while (true) {
            System.out.println("****************QUẢN LÝ DANH MỤC***************");
            System.out.println("1. Danh sách danh mục");
            System.out.println("2. Thêm danh mục");
            System.out.println("3. Cập nhật danh mục");
            System.out.println("4. Xóa danh mục");
            System.out.println("5. Tìm kiếm danh mục");
            System.out.println("6. Thoát");
            System.out.print("Chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    for (Categories c : categoriesList) c.displayData();
                    break;
                case 2:
                    Categories cat = new Categories();
                    cat.inputData(scanner);
                    categoriesList.add(cat);
                    System.out.println("Thêm thành công.");
                    break;
                case 3:
                    System.out.print("Nhập mã danh mục cần cập nhật: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    for (Categories c : categoriesList) {
                        if (c.getCategoryId() == id) {
                            c.inputData(scanner);
                            System.out.println("Cập nhật thành công.");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Nhập mã danh mục cần xóa: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    categoriesList.removeIf(c -> c.getCategoryId() == deleteId);
                    System.out.println("Xóa thành công.");
                    break;
                case 5:
                    System.out.print("Nhập tên danh mục cần tìm: ");
                    String name = scanner.nextLine();
                    for (Categories c : categoriesList) {
                        if (c.getCategoryName().contains(name)) {
                            c.displayData();
                        }
                    }
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    private void manageProducts() {
        while (true) {
            System.out.println("****************QUẢN LÝ SẢN PHẨM*******************");
            System.out.println("1. Danh sách sản phẩm");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Cập nhật sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm");
            System.out.println("6. Sắp xếp sản phẩm theo giá bán");
            System.out.println("7. Bán sản phẩm");
            System.out.println("8. Thống kê sản phẩm theo danh mục");
            System.out.println("9. Thoát");
            System.out.print("Chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    for (Product p : productList) p.displayData();
                    break;
                case 2:
                    Product prod = new Product();
                    prod.inputData(scanner);
                    productList.add(prod);
                    System.out.println("Thêm thành công.");
                    break;
                case 3:
                    System.out.print("Nhập mã sản phẩm cần cập nhật: ");
                    String updateId = scanner.nextLine();
                    for (Product p : productList) {
                        if (p.getProductId().equals(updateId)) {
                            p.inputData(scanner);
                            System.out.println("Cập nhật thành công.");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Nhập mã sản phẩm cần xóa: ");
                    String deleteId = scanner.nextLine();
                    productList.removeIf(p -> p.getProductId().equals(deleteId));
                    System.out.println("Xóa thành công.");
                    break;
                case 5:
                    System.out.print("Nhập tên hoặc tiêu đề sản phẩm cần tìm: ");
                    String keyword = scanner.nextLine();
                    for (Product p : productList) {
                        if (p.getProductName().contains(keyword) || p.getTitle().contains(keyword)) {
                            p.displayData();
                        }
                    }
                    break;
                case 6:
                    for (int i = 0; i < productList.size() - 1; i++) {
                        for (int j = i + 1; j < productList.size(); j++) {
                            if (productList.get(i).getExportPrice() > productList.get(j).getExportPrice()) {
                                Product temp = productList.get(i);
                                productList.set(i, productList.get(j));
                                productList.set(j, temp);
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp sản phẩm theo giá bán tăng dần.");
                    break;
                case 7:
                    System.out.print("Nhập mã sản phẩm cần bán: ");
                    String sellId = scanner.nextLine();
                    for (Product p : productList) {
                        if (p.getProductId().equals(sellId)) {
                            System.out.print("Nhập số lượng cần bán: ");
                            int quantity = Integer.parseInt(scanner.nextLine());
                            if (quantity <= p.getQuantity()) {
                                p.setQuantity(p.getQuantity() - quantity);
                                System.out.println("Bán thành công. Số lượng còn lại: " + p.getQuantity());
                            } else {
                                System.out.println("Số lượng không đủ.");
                            }
                            break;
                        }
                    }
                    break;
                case 8:
                    System.out.println("Thống kê số lượng sản phẩm theo danh mục:");
                    for (Categories c : categoriesList) {
                        int count = 0;
                        for (Product p : productList) {
                            if (p.getCategoryId() == c.getCategoryId()) {
                                count++;
                            }
                        }
                        System.out.println("Danh mục: " + c.getCategoryName() + " - Số lượng: " + count);
                    }
                    break;
                case 9:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}