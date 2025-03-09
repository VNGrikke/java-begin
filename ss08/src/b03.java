import java.util.Scanner;

public class b03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email, password;

        while (true) {
            System.out.print("Nhập email: ");
            email = scanner.nextLine();
            if (email.matches("^[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.(com|vn|org)$")) {
                break;
            }
            System.out.println("Email không hợp lệ. Vui lòng nhập lại!");
        }

        while (true) {
            System.out.print("Nhập mật khẩu: ");
            password = scanner.nextLine();
            if (password.length() >= 8 &&
                    password.matches(".*[A-Z].*") &&
                    password.matches(".*[a-z].*") &&
                    password.matches(".*[0-9].*") &&
                    password.matches(".*[@#$%!&*].*")) {
                break;
            }
            System.out.println("Mật khẩu không hợp lệ. Vui lòng nhập lại!");
        }

        System.out.println("Email và mật khẩu hợp lệ!");
    }
}
