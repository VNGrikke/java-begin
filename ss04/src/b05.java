import java.util.Scanner;

public class b05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương N: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Số nhập vào không hợp lệ");
        } else {
            boolean perfectNumber = false;
            System.out.println("Các số hoàn hảo nhỏ hơn " + N + " là:");
            for (int i = 1; i < N; i++) {
                int sum = 0;
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        sum += j;
                    }
                }
                if (sum == i) {
                    System.out.println(i);
                    perfectNumber = true;
                }
            }
            if (!perfectNumber) {
                System.out.println("Không có số hoàn hảo nào nhỏ hơn " + N);
            }
        }
    }
}
