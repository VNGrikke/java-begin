import java.util.Scanner;

public class b09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương N: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Số nhập vào không hợp lệ");
        } else {
            System.out.println("Các số Palindrome từ 1 đến " + N + " là:");
            for (int i = 1; i <= N; i++) {
                int originalNum = i;
                int num = i;
                int reverse = 0;

                while (num != 0) {
                    int digit = num % 10;
                    reverse = reverse * 10 + digit;
                    num /= 10;
                }
                if (originalNum == reverse) {
                    System.out.println(originalNum);
                }
            }
        }
    }
}
