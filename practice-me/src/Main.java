import java.util.Scanner;

public class Main {
    private Categories[] categoriesList = new Categories[1000];
    private Product[] productList = new Product[1000];
    private int categoryCount = 0;
    private int productCount = 0;
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
                    for (int i = 0; i < categoryCount; i++) {
                        categoriesList[i].displayData();
                    }
                    break;
                case 2:
                    if (categoryCount < categoriesList.length) {
                        Categories cat = new Categories();
                        cat.inputData(scanner);
                        categoriesList[categoryCount++] = cat;
                        System.out.println("Thêm thành công.");
                    } else {
                        System.out.println("Danh sách danh mục đã đầy.");
                    }
                    break;
                case 3:
                    System.out.print("Nhập mã danh mục cần cập nhật: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < categoryCount; i++) {
                        if (categoriesList[i].getCategoryId() == id) {
                            categoriesList[i].inputData(scanner);
                            System.out.println("Cập nhật thành công.");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Nhập mã danh mục cần xóa: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < categoryCount; i++) {
                        if (categoriesList[i].getCategoryId() == deleteId) {
                            for (int j = i; j < categoryCount - 1; j++) {
                                categoriesList[j] = categoriesList[j + 1];
                            }
                            categoryCount--;
                            System.out.println("Xóa thành công.");
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.print("Nhập tên danh mục cần tìm: ");
                    String name = scanner.nextLine();
                    for (int i = 0; i < categoryCount; i++) {
                        if (categoriesList[i].getCategoryName().contains(name)) {
                            categoriesList[i].displayData();
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
                    for (int i = 0; i < productCount; i++) {
                        productList[i].displayData();
                    }
                    break;
                case 2:
                    if (productCount < productList.length) {
                        Product prod = new Product();
                        prod.inputData(scanner);
                        productList[productCount++] = prod;
                        System.out.println("Thêm thành công.");
                    } else {
                        System.out.println("Danh sách sản phẩm đã đầy.");
                    }
                    break;
                case 3:
                    System.out.print("Nhập mã sản phẩm cần cập nhật: ");
                    String updateId = scanner.nextLine();
                    for (int i = 0; i < productCount; i++) {
                        if (productList[i].getProductId().equals(updateId)) {
                            productList[i].inputData(scanner);
                            System.out.println("Cập nhật thành công.");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Nhập mã sản phẩm cần xóa: ");
                    String deleteId = scanner.nextLine();
                    for (int i = 0; i < productCount; i++) {
                        if (productList[i].getProductId().equals(deleteId)) {
                            for (int j = i; j < productCount - 1; j++) {
                                productList[j] = productList[j + 1];
                            }
                            productCount--;
                            System.out.println("Xóa thành công.");
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.print("Nhập tên hoặc tiêu đề sản phẩm cần tìm: ");
                    String keyword = scanner.nextLine();
                    for (int i = 0; i < productCount; i++) {
                        if (productList[i].getProductName().contains(keyword) || productList[i].getTitle().contains(keyword)) {
                            productList[i].displayData();
                        }
                    }
                    break;
                case 6:
                    for (int i = 0; i < productCount - 1; i++) {
                        for (int j = i + 1; j < productCount; j++) {
                            if (productList[i].getExportPrice() > productList[j].getExportPrice()) {
                                Product temp = productList[i];
                                productList[i] = productList[j];
                                productList[j] = temp;
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp sản phẩm theo giá bán tăng dần.");
                    break;
                case 7:
                    System.out.print("Nhập mã sản phẩm cần bán: ");
                    String sellId = scanner.nextLine();
                    for (int i = 0; i < productCount; i++) {
                        if (productList[i].getProductId().equals(sellId)) {
                            System.out.print("Nhập số lượng cần bán: ");
                            int quantity = Integer.parseInt(scanner.nextLine());
                            if (quantity <= productList[i].getQuantity()) {
                                productList[i].setQuantity(productList[i].getQuantity() - quantity);
                                System.out.println("Bán thành công. Số lượng còn lại: " + productList[i].getQuantity());
                            } else {
                                System.out.println("Số lượng không đủ.");
                            }
                            break;
                        }
                    }
                    break;
                case 8:
                    System.out.println("Thống kê số lượng sản phẩm theo danh mục:");
                    for (int i = 0; i < categoryCount; i++) {
                        int count = 0;
                        for (int j = 0; j < productCount; j++) {
                            if (productList[j].getCategoryId() == categoriesList[i].getCategoryId()) {
                                count++;
                            }
                        }
                        System.out.println("Danh mục: " + categoriesList[i].getCategoryName() + " - Số lượng: " + count);
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