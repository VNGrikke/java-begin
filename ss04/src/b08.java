import java.util.Scanner;

public class b08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        while (true) {
            System.out.print("Nhập một số nguyên dương N: ");
            N = scanner.nextInt();
            if (N > 0) {
                break;
            } else {
                System.out.println("Số nhập vào không hợp lệ. Vui lòng nhập lại.");
            }
        }
        System.out.println("Các số Armstrong từ 1 đến " + N + " là:");
        for (int i = 1; i <= N; i++) {
            int num = i;
            int sum = 0;
            int digits = 0;
            int temp = num;

            while (temp != 0) {
                digits++;
                temp /= 10;
            }

            temp = num;
            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }
            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
