import java.util.Scanner;

public class b07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương N: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Số nhập vào không hợp lệ");
        } else {
            System.out.println("Các số Happy từ 1 đến " + N + " là:");
            for (int i = 1; i <= N; i++) {
                int num = i;
                int check = 0;
                while (num != 1 && check < 1000) {
                    int sum = 0;
                    while (num != 0) {
                        int digit = num % 10;
                        sum += digit * digit;
                        num /= 10;
                    }
                    num = sum;
                    check++;
                }
                if (num == 1) {
                    System.out.println(i);
                }
            }
        }
    }
}
