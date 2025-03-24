package de03.presentation;
import de03.bussiness.EmployeeBusiness;

import java.util.Scanner;

public class EmployeeApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeBusiness eb = new EmployeeBusiness();
        int choice;
        do {
            System.out.println("""
                    ---------------- Employee Menu ----------------
                    1. Hiển thị danh sách nhân viên
                    2. Thêm mới nhân viên
                    3. Chỉnh sửa thông tin nhân viên
                    4. Xóa nhân viên
                    5. Tìm kiếm nhân viên
                    6. Sắp xếp nhân viên
                    0. Thoát chương trình
                    ----------------------------------------------""");
            System.out.print("Nhập lựa chọn: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 :
                    eb.displayEmployees();
                    break;
                case 2 :
                    eb.addEmployee(sc);
                    break;
                case 3 :
                    eb.editEmployee(sc);
                    break;
                case 4 :
                    eb.deleteEmployee(sc);
                    break;
                case 5 :
                    eb.searchEmployee(sc);
                    break;
                case 6 :
                    eb.sortEmployees();
                    break;
                case 0 :
                    System.out.println("Thoát chương trình.");
                default :
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
        sc.close();
    }
}