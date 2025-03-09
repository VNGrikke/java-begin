import java.util.Scanner;

public class b02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập địa chỉ email: ");
        String email = sc.nextLine().trim();

        String regex = "^[a-zA-Z0-9]+@(gmail|email|edu|yahoo|outlook|icloud|hotmail|gov|org|net|microsoft|apple)\\.[a-zA-Z]{2,6}$";

        if (email.matches(regex)) {
            System.out.println("Email hợp lệ");
        } else {
            System.out.println("Email không hợp lệ");
        }
    }
}
