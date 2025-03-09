import java.util.Scanner;

public class b02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0) {
                sum += arr[i];
            }
        }
        if (sum > 0) {
            System.out.println("Tổng: " + sum);
        } else {
            System.out.println("Không có số nào chia hết cho 3");
        }
    }
}
