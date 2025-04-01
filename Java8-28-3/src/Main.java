import ra.entity.Product;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static List<Product> products = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("**************************MENU************************* \n" +
                    "1. Danh sách sản phẩm \n" +
                    "2. Thêm mới sản phẩm \n" +
                    "3. Cập nhật sản phẩm \n" +
                    "4. Xóa sản phẩm theo ID \n" +
                    "5. Tìm sản phẩm theo tên \n" +
                    "6. Lọc sản phẩm theo điều kiện  \n" +
                    "7. Sắp xếp sản phẩm theo giá  \n" +
                    "8. Thoát");

            System.out.println("Nhap lua chon");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    if (products.isEmpty()) {
                        System.out.println("Danh sách trống!");
                        break;
                    }
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
                    searchProductByName();
                break;
                case 6:
                    filterProduct();
                break;
                case 7:
                    sortByPrice();
                break;
                case 8:
                    return;
                default:
                    System.out.println("Nhap lại lựa chọn");
                    break;
            }

        }while (true);
    }

    private static void displayProducts() {
        System.out.println("Danh sách sản phẩm (ID|NAME|PRICE|CATEGORY|CREATEDATE)");
        products.forEach(Product::displayData);
    }

    private static void addProduct() {
        System.out.println("Nhập dữ liệu sản phầm mới");
        Product product = new Product();
        product.inputData(sc);
        products.add(product);
    }

    private static void updateProduct() {
        System.out.println("Danh sách sản phẩm");
        displayProducts();

        System.out.println("Nhập id sản phẩm cần cập nhật");
        int id = Integer.parseInt(sc.nextLine());
        Optional<Product> product = products.stream().filter(p -> p.getId() == id).findFirst();
        if (product.isPresent()) {
            product.get().inputData(sc);
        }else {
            System.out.println("Khong tim thay");
        }
    }

    private static void deleteProduct() {
        System.out.println("Danh sách sản phẩm");
        displayProducts();

        System.out.println("Nhập id sản phẩm cần xóa");
        int id = Integer.parseInt(sc.nextLine());
        products.removeIf(p -> p.getId() == id);

    }

    private static void searchProductByName() {
        System.out.println("Nhập tên sp");
        String searchName = sc.nextLine();

        Optional<Product> searchProduct = products.stream().filter(product -> product.getProductName().equals(searchName)).findFirst();
        if (searchProduct.isPresent()) {
            searchProduct.get().displayData();
        }else {
            System.out.println("không tìm thấy");
        }
    }

    private static void filterProduct() {
        if (products.isEmpty()) {
            System.out.println("Danh sách trống");
            return;
        }
        do{
            System.out.println("1. Lọc sản phẩm có giá lớn hơn X \n" +
                    "2. Lọc sản phẩm theo danh mục");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Nhập giá trị: ");
                    float price = Float.parseFloat(sc.nextLine());
                    while (price <= 0){
                        System.out.println("Nhập lại");
                        price = Float.parseFloat(sc.nextLine());
                    }
                    float finalPrice = price;
                    List<Product> filterProducts = products.stream()
                            .filter(product -> product.getPrice() >= finalPrice)
                            .collect(Collectors.toList());

                    if (filterProducts.isEmpty()) {
                        System.out.println("Không có sản phầm nào giá lớn hơn " + finalPrice);
                    }else{
                        System.out.println("Danh sách sản phẩm có giá lớn hơn " + finalPrice);
                        filterProducts.forEach(product -> product.displayData());
                    }
                    return;
                case 2:
                    System.out.println("Nhập tên danh mục");
                    String searchCategory = sc.nextLine();
                    while (searchCategory.length() <= 0){
                        System.out.println("Nhập lại");
                        searchCategory = sc.nextLine();
                    }
                    String finalCategory = searchCategory;
                    filterProducts = products.stream().filter(product -> product.getCategory()
                            .equals(finalCategory)).collect(Collectors.toList());
                    if (filterProducts.isEmpty()) {
                        System.out.println("Không có sản phầm thuộc danh mục "+ finalCategory);
                    }else{
                        filterProducts.forEach(product -> product.displayData());
                    }
                    return;

                default:
                    System.out.println("Nhạp lại");
                    break;
            }
        }while (true);
    }

    private static void sortByPrice() {
        if (products.isEmpty()) {
            System.out.println("Danh sách trống");
            return;
        }
        do {
            System.out.println("1. Tăng dần \n" +
                    "2. Giảm dần ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    products.sort(Comparator.comparing(Product::getPrice));
                    return;
                case 2:
                    products.sort(Comparator.comparing(Product::getPrice).reversed());
                    return;
                default:
                    System.out.println("Nhập lại");
                    break;
            }
        }while (true);
    }


}
