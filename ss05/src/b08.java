import java.util.Scanner;

public class b08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao do dai mang: ");
        int n = sc.nextInt();
        if( n <= 0 ){
            System.out.println("mang khong hop le");
            return;
        }
        int[] arr = new int[n];
        System.out.print("Nhap vao cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr2 = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            boolean duplicate = false;
            for (int j = 0; j < n; j++) {
                if(i != j && arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate) {
                arr2[index++] = arr[i];
            }
        }

        System.out.print("Cac phan tu Khong trung lap: ");
        for (int i = 0; i < index; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
