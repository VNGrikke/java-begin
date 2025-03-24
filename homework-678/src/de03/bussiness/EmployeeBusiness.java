package de03.bussiness;

import de03.enity.Employee;

import java.util.*;

public class EmployeeBusiness {
    private Set<Employee> employeeList = new HashSet<>();

    public void displayEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("Danh sách nhân viên trống!");
        } else {
            Iterator<Employee> iterator = employeeList.iterator();
            while (iterator.hasNext()) {
                Employee emp = iterator.next();
                emp.displayData();
            }
        }
    }

    public void addEmployee(Scanner sc) {
        System.out.print("Nhập số nhân viên cần thêm: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập mã nhân viên: ");
            String empId = sc.nextLine();
            Employee emp = new Employee(empId);
            emp.inputData(sc);
            employeeList.add(emp);
            System.out.println("Thêm nhân viên thành công!");
        }
    }

    public void editEmployee(Scanner sc) {
        System.out.print("Nhập mã nhân viên cần sửa: ");
        String empId = sc.nextLine();
        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            if (emp.getEmployeeId().equals(empId)) {
                System.out.println("Thông tin cũ:");
                emp.displayData();
                emp.inputData(sc);
                System.out.println("Chỉnh sửa thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên!");
    }

    public void deleteEmployee(Scanner sc) {
        System.out.print("Nhập mã nhân viên cần xóa: ");
        String empId = sc.nextLine();
        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            if (emp.getEmployeeId().equals(empId)) {
                iterator.remove();
                System.out.println("Xóa thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên!");
    }

    public void searchEmployee(Scanner sc) {
        System.out.print("Nhập tên nhân viên cần tìm: ");
        String name = sc.nextLine().toLowerCase();
        boolean found = false;
        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            if (emp.getEmployeeName().toLowerCase().contains(name)) {
                emp.displayData();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy kết quả phù hợp.");
        }
    }

    public void sortEmployees() {
        List<Employee> sortedList = new ArrayList<>(employeeList);
        for (int i = 0; i < sortedList.size() - 1; i++) {
            for (int j = i + 1; j < sortedList.size(); j++) {
                if (sortedList.get(i).getEmployeeName().compareTo(sortedList.get(j).getEmployeeName()) > 0) {
                    Employee temp = sortedList.get(i);
                    sortedList.set(i, sortedList.get(j));
                    sortedList.set(j, temp);
                }
            }
        }
        for (Employee emp : sortedList) {
            emp.displayData();
        }
    }
}