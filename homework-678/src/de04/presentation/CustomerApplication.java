package de04.presentation;

import de04.bussiness.CustomerBusiness;
import java.util.Scanner;

public class CustomerApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomerBusiness customerBusiness = new CustomerBusiness();

        while (true) {
            System.out.println("\n-------------------- Customer Menu --------------------");
            System.out.println("1. Hiển thị danh sách khách hàng");
            System.out.println("2. Thêm mới khách hàng");
            System.out.println("3. Chỉnh sửa thông tin khách hàng");
            System.out.println("4. Xóa khách hàng");
            System.out.println("5. Tìm kiếm khách hàng");
            System.out.println("6. Sắp xếp danh sách khách hàng");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 :
                    customerBusiness.displayCustomers();
                    break;
                case 2 :
                    customerBusiness.addCustomer(sc);
                    break;
                case 3 :
                    customerBusiness.editCustomer(sc);
                    break;
                case 4 :
                    customerBusiness.deleteCustomer(sc);
                    break;
                case 5 :
                    customerBusiness.searchCustomer(sc);
                    break;
                case 6 :
                    customerBusiness.sortCustomers(sc);
                    break;
                case 0 :
                    System.out.println("Thoát chương trình.");
                    return;
                default :
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
