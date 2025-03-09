import java.util.Scanner;

public class b04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao kich thuoc cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        if (n == 0) {
            System.out.print("Kich thuoc rong");
        } else {
            System.out.print("Nhap vao cac phan tu cua mang: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int temp;
            for (int i = 0; i < n / 2; i++) {
                int j = n - 1 - i;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            System.out.print("Mang sau khi dao nguoc: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
