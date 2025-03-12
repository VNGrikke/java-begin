import java.util.Scanner;

public class b10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[100];
        int studentCount = 0;
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Hiển thị danh sách tất cả sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Sửa thông tin sinh viên dựa vào mã sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displayAllStudents(students, studentCount);
                    break;
                case 2:
                    studentCount = addNewStudent(students, studentCount, scanner);
                    break;
                case 3:
                    updateStudent(students, studentCount, scanner);
                    break;
                case 4:
                    studentCount = deleteStudent(students, studentCount, scanner);
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 5);
    }

    private static void displayAllStudents(Student[] students, int studentCount) {
        if (studentCount == 0) {
            System.out.println("Không có sinh viên nào trong danh sách.");
        } else {
            for (int i = 0; i < studentCount; i++) {
                students[i].displayData();
            }
        }
    }

    private static int addNewStudent(Student[] students, int studentCount, Scanner scanner) {
        if (studentCount < students.length) {
            Student student = new Student();
            student.inputData(scanner);
            students[studentCount] = student;
            System.out.println("Thêm sinh viên thành công.");
            return studentCount + 1;
        } else {
            System.out.println("Danh sách sinh viên đã đầy, không thể thêm mới.");
            return studentCount;
        }
    }

    private static void updateStudent(Student[] students, int studentCount, Scanner scanner) {
        System.out.print("Nhập mã sinh viên cần sửa: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId() == id) {
                students[i].inputData(scanner);
                System.out.println("Cập nhật thông tin sinh viên thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên có mã " + id);
    }

    private static int deleteStudent(Student[] students, int studentCount, Scanner scanner) {
        System.out.print("Nhập mã sinh viên cần xóa: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId() == id) {
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                System.out.println("Xóa sinh viên thành công.");
                return studentCount - 1;
            }
        }
        System.out.println("Không tìm thấy sinh viên có mã " + id);
        return studentCount;
    }
}

enum Gender {
    MALE, FEMALE, OTHER
}

class Student {
    private int id;
    private String name;
    private int age;
    private Gender gender;
    private String address;
    private String phoneNumber;

    public Student() {
    }

    public Student(int id, String name, int age, Gender gender, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void inputData(Scanner scanner) {
        System.out.print("Nhập mã sinh viên: ");
        this.id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tên sinh viên: ");
        this.name = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        this.age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập giới tính (MALE, FEMALE, OTHER): ");
        this.gender = Gender.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Nhập địa chỉ: ");
        this.address = scanner.nextLine();
        System.out.print("Nhập số điện thoại: ");
        this.phoneNumber = scanner.nextLine();
    }

    public void displayData() {
        System.out.println("Mã HS: " + id);
        System.out.println("Tên HS: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gender);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Số điện thoại: " + phoneNumber);
        System.out.println();
    }
}