package presentation;

import entity.Customer;
import entity.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static business.CustomerBusiness.*;

public class ShopManagement {
    static Scanner scanner = new Scanner(System.in);
    public static List<Order> orderList = new ArrayList<Order>();
    public static List<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("**********************SHOP MENU*******************    \n" +
                "1. Quản lý khách hàng \n" +
                "2. Quản lý đơn hàng \n" +
                "3. Thoát ");

        do {
            switch (scanner.nextInt()){
                case 1:
                    CustomerMenu();
                    break;
                case 2:
                    OrderMenu();
                    break;
                case 3:
                    System.out.println("thoat");
                    return;
                default:
                    System.out.println("sai cu phap");
                    break;
            }
        }while (true);
    }

    public static void CustomerMenu() {
        do {
            System.out.println("***********************CUSTOMER MENU****************** \n" +
                    "1. Danh sách khách hàng       \n" +
                    "2. Thêm mới khách hàng       \n" +
                    "3. Thoát  ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ListCustomer();
                    break;

                case 2:
                    AddCustomer();
                    break;

                case 3:

                    return;
                default:
                    break;
            }
        }while (true);
    }

    public static void OrderMenu() {
        do {
            System.out.println("***********************ORDER MENU********************** \n" +
                    "1. Danh sách đơn hàng       \n" +
                    "2. Thêm mới đơn hàng       \n" +
                    "3. Cập nhật trạng thái đơn hàng      \n" +
                    "4. Danh sách đơn hàng quá hạn      \n" +
                    "5. Thống kê số lượng đơn hàng đã giao (Trạng thái true)   \n" +
                    "6. Tính tổng doanh thu các đơn hàng đã giao    \n" +
                    "7. Thoát  ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    return;
                default:
                    break;
            }
        }while (true);
    }


}
