import java.util.Scanner;

public class b08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------Nhập thông tin sinh viên------------");
        System.out.print("Nhập mã sinh viên: ");
        String studentId = scanner.nextLine();
        System.out.print("Nhập tên sinh viên: ");
        String studentName = scanner.nextLine();
        System.out.print("Nhập số điện thoại sinh viên: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Nhập ngày sinh sinh viên (dd/MM/yyyy): ");
        String dob = scanner.nextLine();
        System.out.print("Nhập giới tính sinh viên (1: Nam, 0: Nữ): ");
        int genderInput = Integer.parseInt(scanner.nextLine());
        String gender = (genderInput == 1) ? "Nam" : "Nữ";

        System.out.println("------------Nhập điểm sinh viên------------");
        System.out.print("Nhập điểm toán: ");
        double math = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập điểm lý: ");
        double physics = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập điểm hóa: ");
        double chemistry = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập điểm sinh học: ");
        double biology = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập điểm ngoại ngữ: ");
        double foreignLanguage = Double.parseDouble(scanner.nextLine());

        double averageScore = (math + physics + chemistry + biology + foreignLanguage) / 5;

        System.out.println("------------Hiển thị thông tin sinh viên------------");
        System.out.println("Mã sinh viên: " + studentId + " | Tên sinh viên: " + studentName + " | Giới tính: " + gender);
        System.out.println("Ngày sinh: " + dob + " | Số điện thoại sinh viên: " + phoneNumber);
        System.out.println("Điểm toán: " + math + " | Điểm Vật lý: " + physics + " | Điểm Hóa học: " + chemistry + " | Điểm Sinh học: " + biology + " | Điểm Ngoại ngữ: " + foreignLanguage);
        System.out.println("Điểm trung bình: " + String.format("%.2f", averageScore));
    }
}
