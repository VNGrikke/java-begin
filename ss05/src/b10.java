import java.util.Scanner;

public class b10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao do dai mang: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("mang khong hop le");
            return;
        }

        int[] arr = new int[n];
        System.out.print("Nhap vao cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int sum = 0;
        int max = 0;
        int firstIndex = 0, tempIndex = 0;
        int lastIndex = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                count++;
            }
            sum += arr[i];
            if (sum > max) {
                max = sum;
                firstIndex = tempIndex;
                lastIndex = i;
            }
            if (sum < 0) {
                sum = 0;
                tempIndex = i + 1;
            }
        }

        if (count == n) {
            max = arr[0];
            firstIndex = 0;
            lastIndex = 0;
            for (int i = 1; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    firstIndex = i;
                    lastIndex = i;
                }
            }
        }
        System.out.printf("tong day con lon nhat: %d [", max);
        for (int i = firstIndex; i <= lastIndex; i++) {
            System.out.print(arr[i]);
            if (i < lastIndex) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
