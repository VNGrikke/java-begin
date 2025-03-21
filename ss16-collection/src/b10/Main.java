package b10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();

        System.out.println("Nhap sl sv: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("sv "+ (i+1));
            System.out.print("Msv: ");
            String id = scanner.nextLine();
            System.out.print("Ho ten: ");
            String name = scanner.nextLine();
            System.out.print("GPA: ");
            double gpa = Double.parseDouble(scanner.nextLine());
            studentList.add(new Student(id, name, gpa));
        }

        System.out.println("\nDanh sach:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        System.out.print("\nNhap ten can tim: ");
        String searchName = scanner.nextLine();
        boolean found = false;
        for (Student student : studentList) {
            if (student.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Da tim thay sv: " + student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("khong tim thay sv ten: " + searchName);
        }

        System.out.println("\nDanh sach sau phan loai:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
