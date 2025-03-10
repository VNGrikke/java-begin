import java.util.Scanner;

public class b05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = null; // Mảng số nguyên
        int n = 0; // Kích thước mảng

        while (true) {
            System.out.println("*************** MENU ***************");
            System.out.println("1. Nhập giá trị `n` phần tử của mảng");
            System.out.println("2. In giá trị các phần tử trong mảng");
            System.out.println("3. Tính trung bình các phần tử dương trong mảng");
            System.out.println("4. In ra vị trí các phần tử có giá trị bằng `k`");
            System.out.println("5. Tính số lượng các phần tử là số nguyên tố");
            System.out.println("6. Thoát chương trình");
            System.out.print("Chọn chức năng: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhập số phần tử của mảng: ");
                    n = sc.nextInt();
                    if (n <= 0) {
                        System.out.println("Số phần tử phải lớn hơn 0!");
                        break;
                    }
                    arr = new int[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
                        arr[i] = sc.nextInt();
                    }
                    break;
                case 2:
                    if (arr == null) {
                        System.out.println("Mảng chưa được khởi tạo!");
                        break;
                    }
                    System.out.print("Các phần tử trong mảng: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    if (arr == null) {
                        System.out.println("Mảng chưa được khởi tạo!");
                        break;
                    }
                    int sum = 0, count = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] > 0) {
                            sum += arr[i];
                            count++;
                        }
                    }
                    if (count == 0) {
                        System.out.println("Không có phần tử dương trong mảng.");
                    } else {
                        System.out.println("Trung bình các phần tử dương: " + (double) sum / count);
                    }
                    break;
                case 4:
                    if (arr == null) {
                        System.out.println("Mảng chưa được khởi tạo!");
                        break;
                    }
                    System.out.print("Nhập giá trị k: ");
                    int k = sc.nextInt();
                    System.out.print("Các vị trí có giá trị " + k + ": ");
                    boolean found = false;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == k) {
                            System.out.print(i + " ");
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Không có phần tử nào có giá trị " + k);
                    }
                    System.out.println();
                    break;
                case 5:
                    if (arr == null) {
                        System.out.println("Mảng chưa được khởi tạo!");
                        break;
                    }
                    int primeCount = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] > 1) {
                            boolean isPrime = true;
                            for (int j = 2; j * j <= arr[i]; j++) {
                                if (arr[i] % j == 0) {
                                    isPrime = false;
                                    break;
                                }
                            }
                            if (isPrime) {
                                primeCount++;
                            }
                        }
                    }
                    System.out.println("Số lượng số nguyên tố trong mảng: " + primeCount);
                    break;
                case 6:
                    System.out.println("Thoát chương trình!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại.");
            }
            System.out.println();
        }
    }
}
