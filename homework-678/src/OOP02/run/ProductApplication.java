package OOP02.run;

import OOP02.service.ProductBusiness;
import java.util.Scanner;

public class ProductApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductBusiness productBusiness = new ProductBusiness();

        while (true) {
            System.out.println("***********************MENU**************************");
            System.out.println("1. Nhập thông tin n sản phẩm");
            System.out.println("2. Hiển thị thông tin các sản phẩm");
            System.out.println("3. Tính lợi nhuận các sản phẩm");
            System.out.println("4. Sắp xếp các sản phẩm theo lợi nhuận giảm dần");
            System.out.println("5. Thống kê các sản phẩm theo giá");
            System.out.println("6. Tìm các sản phẩm theo tên sản phẩm");
            System.out.println("7. Nhập sản phẩm");
            System.out.println("8. Bán sản phẩm");
            System.out.println("9. Cập nhật trạng thái sản phẩm");
            System.out.println("10. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 :
                    productBusiness.inputProducts(sc);
                    break;
                case 2 :
                    productBusiness.displayProducts();
                    break;
                case 3 :
                    productBusiness.calculateProfit();
                    break;
                case 4 :
                    productBusiness.sortByProfit();
                    break;
                case 5 :
                    productBusiness.statisticByPrice(sc);
                    break;
                case 6 :
                    productBusiness.searchByName(sc);
                    break;
                case 7 :
                    productBusiness.importProduct(sc);
                    break;
                case 8 :
                    productBusiness.sellProduct(sc);
                    break;
                case 9 :
                    productBusiness.updateProductStatus(sc);
                    break;
                case 10 :
                    System.out.println("Thoát chương trình.");
                    return;
                default :
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập từ 1-10.");
            }
        }
    }
}
