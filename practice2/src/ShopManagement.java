import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopManagement {
    private List<Categories> categoriesList = new ArrayList<>();
    private List<Product> productList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        while (true) {
            System.out.println("*********************SHOP MENU*********************");
            System.out.println("1. Quản lý danh mục");
            System.out.println("2. Quản lý sản phẩm");
            System.out.println("3. Thoát");
            System.out.print("Chọn chức năng: ");
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
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    private void manageCategories() {
        while (true) {
            System.out.println("********************QUẢN LÝ DANH MỤC********************");
            System.out.println("1. Danh sách danh mục");
            System.out.println("2. Thêm mới danh mục");
            System.out.println("3. Cập nhật danh mục");
            System.out.println("4. Xóa danh mục");
            System.out.println("5. Tìm kiếm danh mục theo tên");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayCategories();
                    break;
                case 2:
                    addCategory();
                    break;
                case 3:
                    updateCategory();
                    break;
                case 4:
                    deleteCategory();
                    break;
                case 5:
                    searchCategoryByName();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    private void manageProducts() {
        while (true) {
            System.out.println("********************QUẢN LÝ SẢN PHẨM********************");
            System.out.println("1. Danh sách sản phẩm");
            System.out.println("2. Thêm mới sản phẩm");
            System.out.println("3. Cập nhật sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên hoặc tiêu đề");
            System.out.println("6. Tìm kiếm sản phẩm theo khoảng giá bán");
            System.out.println("7. Sắp xếp sản phẩm theo giá bán tăng dần");
            System.out.println("8. Bán sản phẩm");
            System.out.println("9. Thống kê số lượng sản phẩm theo danh mục");
            System.out.println("10. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayProducts();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    searchProductByNameOrTitle();
                    break;
                case 6:
                    searchProductByPriceRange();
                    break;
                case 7:
                    sortProductsByExportPrice();
                    break;
                case 8:
                    sellProduct();
                    break;
                case 9:
                    countProductsByCategory();
                    break;
                case 10:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    // Các phương thức quản lý danh mục
    private void displayCategories() {
        if (categoriesList.isEmpty()) {
            System.out.println("Danh sách danh mục trống.");
        } else {
            System.out.println("Danh sách danh mục:");
            for (Categories category : categoriesList) {
                category.displayData();
                System.out.println("-----------------------------");
            }
        }
    }

    private void addCategory() {
        Categories category = new Categories();
        category.inputData(scanner);
        categoriesList.add(category);
        System.out.println("Thêm danh mục thành công.");
    }

    private void updateCategory() {
        System.out.print("Nhập mã danh mục cần cập nhật: ");
        int id = Integer.parseInt(scanner.nextLine());
        Categories category = findCategoryById(id);
        if (category != null) {
            System.out.println("Nhập thông tin mới cho danh mục:");
            category.inputData(scanner);
            System.out.println("Cập nhật danh mục thành công.");
        } else {
            System.out.println("Không tìm thấy danh mục với mã " + id);
        }
    }

    private void deleteCategory() {
        System.out.print("Nhập mã danh mục cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        Categories category = findCategoryById(id);
        if (category != null) {
            if (isCategoryEmpty(category.getCategoryId())) {
                categoriesList.remove(category);
                System.out.println("Xóa danh mục thành công.");
            } else {
                System.out.println("Không thể xóa danh mục vì danh mục có sản phẩm.");
            }
        } else {
            System.out.println("Không tìm thấy danh mục với mã " + id);
        }
    }

    private void searchCategoryByName() {
        System.out.print("Nhập tên danh mục cần tìm: ");
        String name = scanner.nextLine();
        boolean found = false;
        for (Categories category : categoriesList) {
            if (category.getCategoryName().toLowerCase().contains(name.toLowerCase())) {
                category.displayData();
                System.out.println("-----------------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy danh mục với tên " + name);
        }
    }

    private Categories findCategoryById(int id) {
        for (Categories category : categoriesList) {
            if (category.getCategoryId() == id) {
                return category;
            }
        }
        return null;
    }

    private boolean isCategoryEmpty(int categoryId) {
        for (Product product : productList) {
            if (product.getCategoryId() == categoryId) {
                return false;
            }
        }
        return true;
    }

    // Các phương thức quản lý sản phẩm
    private void displayProducts() {
        if (productList.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
        } else {
            System.out.println("Danh sách sản phẩm:");
            for (Product product : productList) {
                product.displayData();
                System.out.println("-----------------------------");
            }
        }
    }

    private void addProduct() {
        Product product = new Product();
        product.inputData(scanner);
        productList.add(product);
        System.out.println("Thêm sản phẩm thành công.");
    }

    private void updateProduct() {
        System.out.print("Nhập mã sản phẩm cần cập nhật: ");
        String id = scanner.nextLine();
        Product product = findProductById(id);
        if (product != null) {
            System.out.println("Nhập thông tin mới cho sản phẩm:");
            product.inputData(scanner);
            System.out.println("Cập nhật sản phẩm thành công.");
        } else {
            System.out.println("Không tìm thấy sản phẩm với mã " + id);
        }
    }

    private void deleteProduct() {
        System.out.print("Nhập mã sản phẩm cần xóa: ");
        String id = scanner.nextLine();
        Product product = findProductById(id);
        if (product != null) {
            productList.remove(product);
            System.out.println("Xóa sản phẩm thành công.");
        } else {
            System.out.println("Không tìm thấy sản phẩm với mã " + id);
        }
    }

    private void searchProductByNameOrTitle() {
        System.out.print("Nhập tên hoặc tiêu đề sản phẩm cần tìm: ");
        String keyword = scanner.nextLine();
        boolean found = false;
        for (Product product : productList) {
            if (product.getProductName().toLowerCase().contains(keyword.toLowerCase()) ||
                    product.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                product.displayData();
                System.out.println("-----------------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sản phẩm với từ khóa " + keyword);
        }
    }

    private void searchProductByPriceRange() {
        System.out.print("Nhập giá bán tối thiểu: ");
        float minPrice = Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập giá bán tối đa: ");
        float maxPrice = Float.parseFloat(scanner.nextLine());
        boolean found = false;
        for (Product product : productList) {
            if (product.getExportPrice() >= minPrice && product.getExportPrice() <= maxPrice) {
                product.displayData();
                System.out.println("-----------------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sản phẩm trong khoảng giá từ " + minPrice + " đến " + maxPrice);
        }
    }

    private void sortProductsByExportPrice() {
        int n = productList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (productList.get(j).getExportPrice() > productList.get(j + 1).getExportPrice()) {
                    Product temp = productList.get(j);
                    productList.set(j, productList.get(j + 1));
                    productList.set(j + 1, temp);
                }
            }
        }
        System.out.println("Đã sắp xếp sản phẩm theo giá bán tăng dần.");
        displayProducts();
    }

    private void sellProduct() {
        System.out.print("Nhập mã sản phẩm cần bán: ");
        String id = scanner.nextLine();
        Product product = findProductById(id);
        if (product != null) {
            System.out.print("Nhập số lượng cần bán: ");
            int quantity = Integer.parseInt(scanner.nextLine());
            if (quantity <= product.getQuantity()) {
                product.setQuantity(product.getQuantity() - quantity);
                System.out.println("Bán sản phẩm thành công. Số lượng còn lại: " + product.getQuantity());
            } else {
                System.out.println("Số lượng sản phẩm không đủ để bán.");
            }
        } else {
            System.out.println("Không tìm thấy sản phẩm với mã " + id);
        }
    }

    private void countProductsByCategory() {
        System.out.println("Thống kê số lượng sản phẩm theo danh mục:");
        for (Categories category : categoriesList) {
            int count = 0;
            for (Product product : productList) {
                if (product.getCategoryId() == category.getCategoryId()) {
                    count++;
                }
            }
            System.out.println("Danh mục: " + category.getCategoryName() + " - Số lượng sản phẩm: " + count);
        }
    }

    private Product findProductById(String id) {
        for (Product product : productList) {
            if (product.getProductId().equalsIgnoreCase(id)) {
                return product;
            }
        }
        return null;
    }

}