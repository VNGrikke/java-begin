package de03.enity;

import java.util.Scanner;
import de03.validate.Validator;

public class Employee implements IApp {
    private String employeeId;
    private String employeeName;
    private String birthday;
    private String phoneNumber;
    private boolean sex;
    private float coefficient;
    private int allowanceSalary = 0;
    private String department;
    private byte status = 1;
    private static final int BASE_SALARY = 3000000;

    public Employee() {}

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public int getTotalSalary() {
        return (int) (BASE_SALARY * coefficient + allowanceSalary);
    }

    public void inputData(Scanner sc) {
        System.out.print("Nhập tên nhân viên: ");
        this.employeeName = Validator.validateString(sc, "Tên nhân viên không được để trống!");

        System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
        this.birthday = Validator.validateDate(sc);

        System.out.print("Nhập số điện thoại: ");
        this.phoneNumber = Validator.validatePhoneNumber(sc);

        System.out.print("Nhập giới tính (true - Nam, false - Nữ): ");
        this.sex = Boolean.parseBoolean(sc.nextLine());

        System.out.print("Nhập hệ số lương: ");
        this.coefficient = Validator.validatePositiveFloat(sc);

        System.out.print("Nhập phụ cấp lương: ");
        this.allowanceSalary = Validator.validatePositiveInt(sc);

        System.out.print("Nhập phòng ban: ");
        this.department = Validator.validateString(sc, "Phòng ban không được để trống!");
    }

    public void displayData() {
        String gender = sex ? "Nam" : "Nữ";
        String statusText = switch (status) {
            case 1 -> "Đang làm việc";
            case 2 -> "Đang nghỉ phép";
            case 3 -> "Đã nghỉ việc";
            default -> "Không xác định";
        };
        System.out.printf("ID: %s | Tên: %s | Giới tính: %s | SĐT: %s | Tổng lương: %,d | Phòng: %s | Trạng thái: %s%n",
                employeeId, employeeName, gender, phoneNumber, getTotalSalary(), department, statusText);
    }
}
