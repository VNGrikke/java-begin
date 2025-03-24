package de04.bussiness;
import de04.enity.Customer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CustomerBusiness {
    private ArrayList<Customer> customerList = new ArrayList<>();

    public void displayCustomers() {
        if (customerList.isEmpty()) {
            System.out.println("Danh sách trống!");
        } else {
            for (Customer c : customerList) {
                c.displayData();
            }
        }
    }

    public void addCustomer(Scanner sc) {
        System.out.print("Nhập số lượng khách hàng cần thêm: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập mã khách hàng (bắt đầu với 'C' + 4 số): ");
            String customerId = sc.nextLine().trim().toUpperCase();

            Customer customer = new Customer(customerId);
            customer.inputData(sc);
            customerList.add(customer);
            System.out.println("Thêm khách hàng thành công!");
        }
    }

    public void editCustomer(Scanner sc) {
        System.out.print("Nhập mã khách hàng cần chỉnh sửa: ");
        String id = sc.nextLine().trim().toUpperCase();
        for (Customer c : customerList) {
            if (c.getCustomerId().equals(id)) {
                System.out.println("Thông tin cũ:");
                c.displayData();
                c.inputData(sc);
                System.out.println("Chỉnh sửa thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy khách hàng!");
    }

    public void deleteCustomer(Scanner sc) {
        System.out.print("Nhập mã khách hàng cần xóa: ");
        String id = sc.nextLine().trim().toUpperCase();
        for (Customer c : customerList) {
            if (c.getCustomerId().equals(id)) {
                customerList.remove(c);
                System.out.println("Xóa thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy khách hàng!");
    }

    public void searchCustomer(Scanner sc) {
        System.out.println("\n----- Tìm kiếm khách hàng -----");
        System.out.println("1. Tìm theo tên khách hàng");
        System.out.println("2. Tìm theo loại khách hàng");
        System.out.println("3. Tìm theo số điện thoại");
        System.out.print("Chọn tiêu chí tìm kiếm: ");

        int choice = sc.nextInt();
        sc.nextLine();

        List<Customer> resultList = new ArrayList<>();

        switch (choice) {
            case 1 -> {
                System.out.print("Nhập tên khách hàng cần tìm: ");
                String name = sc.nextLine().toLowerCase().trim();
                for (Customer c : customerList) {
                    if (c.getFirstName().toLowerCase().contains(name)) {
                        resultList.add(c);
                    }
                }
            }
            case 2 -> {
                System.out.print("Nhập loại khách hàng cần tìm (cá nhân/doanh nghiệp): ");
                String type = sc.nextLine().toLowerCase().trim();
                for (Customer c : customerList) {
                    if (c.getCustomerType().toLowerCase().equals(type)) {
                        resultList.add(c);
                    }
                }
            }
            case 3 -> {
                System.out.print("Nhập số điện thoại cần tìm: ");
                String phone = sc.nextLine().trim();
                for (Customer c : customerList) {
                    if (c.getPhoneNumber().equals(phone)) {
                        resultList.add(c);
                    }
                }
            }
            default -> {
                System.out.println("Lựa chọn không hợp lệ!");
                return;
            }
        }

        if (resultList.isEmpty()) {
            System.out.println("Không tìm thấy kết quả phù hợp.");
        } else {
            System.out.println("Kết quả tìm kiếm:");
            for (Customer c : resultList) {
                c.displayData();
            }
        }
    }

    public void sortCustomers(Scanner sc) {
        if (customerList.isEmpty()) {
            System.out.println("Danh sách khách hàng trống, không thể sắp xếp.");
            return;
        }

        System.out.println("\n----- Sắp xếp khách hàng -----");
        System.out.println("1. Sắp xếp theo tên tăng dần");
        System.out.println("2. Sắp xếp theo tên giảm dần");
        System.out.println("3. Sắp xếp theo năm sinh tăng dần");
        System.out.println("4. Sắp xếp theo năm sinh giảm dần");
        System.out.print("Chọn tiêu chí sắp xếp: ");

        int choice = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng thừa

        switch (choice) {
            case 1:
                customerList.sort(Comparator.comparing(Customer::getFirstName));
                System.out.println("Đã sắp xếp danh sách theo tên tăng dần.");
                break;
            case 2:
                customerList.sort(Comparator.comparing(Customer::getFirstName).reversed());
                System.out.println("Đã sắp xếp danh sách theo tên giảm dần.");
                break;
            case 3:
                customerList.sort(Comparator.comparing(Customer::getDateOfBirth));
                System.out.println("Đã sắp xếp danh sách theo năm sinh tăng dần.");
                break;
            case 4:
                customerList.sort(Comparator.comparing(Customer::getDateOfBirth).reversed());
                System.out.println("Đã sắp xếp danh sách theo năm sinh giảm dần.");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ! Hãy chọn lại.");
                return;
        }

        System.out.println("Danh sách sau khi sắp xếp:");
        displayCustomers();
    }

}