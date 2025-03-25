package btPortal.b10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Employee> employees = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int countId = 0;
        do {
            System.out.println("********MENU*********");
            System.out.println("1. them moi nv");
            System.out.println("2. tong luong tat ca nhan vien");
            System.out.println("3. luong tb");
            System.out.println("4. luong cao nhat");
            System.out.println("5. luong thap nhat");
            System.out.println("6. danh sach");
            System.out.println("lua chon");

            switch (sc.nextInt()){
                case 1:
                    countId++;
                    System.out.print("Nhap ten: ");
                    String name = sc.next();
                    System.out.print("nhap luong");
                    float salary = sc.nextFloat();

                    employees.put(countId, new Employee(name, salary));
                    break;

                case 2:
                    float sumSalary = 0;
                    for (Employee employee : employees.values()) {
                        sumSalary += employee.getSalary();
                    }
                    System.out.println("Tong luong: "+ sumSalary);
                    break;
                case 3:
                    sumSalary = 0;
                    for (Employee employee : employees.values()) {
                        sumSalary += employee.getSalary();
                    }
                    System.out.println("Luong trung binh: "+ sumSalary/countId);
                    break;
                case 4:
                    float maxSalary = 0;
                    for (Employee employee : employees.values()) {
                        if (employee.getSalary() > maxSalary) {
                            maxSalary = employee.getSalary();
                        }
                    }
                    System.out.println("Luong cao nhat: "+ maxSalary);
                    break;
                case 5:
                    float minSalary = employees.get(1).getSalary();
                    for (Employee employee : employees.values()) {
                        if (employee.getSalary() < minSalary) {
                            minSalary = employee.getSalary();
                        }
                    }
                    System.out.println("Luong thap nhat: "+ minSalary);
                    break;
                case 6:
                    for (Integer key : employees.keySet()) {
                        System.out.println("| "+key+" | "+employees.get(key).getName()+" | "+employees.get(key).getSalary()+" |");
                    }
                    break;
            }

        }while (true);
    }
}
