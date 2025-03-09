import java.util.Scanner;

public class b05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao kich thuoc cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Nhap vao cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 1;
        int min = 1;
        int index = 0;
        boolean foundOdd = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0 && arr[i] > 0) {
                max = arr[i];
                min = arr[i];
                index = i;
                foundOdd = true;
                break;
            }
        }

        if (!foundOdd) {
            System.out.println("Khong co so le duong trong mang.");
            return;
        }

        for (int i = index; i < n; i++ ) {
            if (arr[i] %2 != 0){
                if (arr[i] > max){
                    max = arr[i];
                }
                if (arr[i] < min){
                    min = arr[i];
                }
            }
        }
    }
}
