import java.util.Scanner;

public class b03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Số nhập vào không hợp lệ");
        } else {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        }
    }
}
