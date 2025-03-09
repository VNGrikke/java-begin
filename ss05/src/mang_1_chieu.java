import java.util.Scanner;

public class mang_1_chieu {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        int curentIndex = 0;

        do {
            System.out.println("\n****************MENU*****************");
            System.out.println("1. Nhap vao gia tri cac phan tu");
            System.out.println("2. In ra cac phan tu");
            System.out.println("3. Tinh tong cac phan tu");
            System.out.println("4. In ra cac phan tu chia het cho 3 va tinh tong");
            System.out.println("5. In ra cac phan tu la so nguyen to va tinh tong");
            System.out.println("6. Thoat");
            System.out.println("Nhap lua chon:");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhap so phan tu can nhap: ");
                    int n = sc.nextInt();
                    if (n + curentIndex > arr.length) {
                        System.out.println("Khong du bo nho de luu cac phan tu! Vui long thu lai.");
                        break;
                    }
                    System.out.print("Nhap gia tri phan tu: ");
                    for (int i = 0; i < n; i++) {
                        arr[curentIndex] = sc.nextInt();
                        curentIndex++;
                    }
                    break;
                case 2:
                    if (curentIndex == 0) {
                        System.out.println("Mang dang rong!");
                        break;
                    }
                    System.out.println("Cac phan tu trong mang:");
                    for (int i = 0; i < curentIndex; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    break;
                case 3:
                    int sum = 0;
                    for (int i = 0; i < curentIndex; i++) {
                        sum += arr[i];
                    }
                    System.out.println("\nTong cac phan tu la: " + sum);
                    break;
                case 4:
                    int sumDiv3 = 0;
                    System.out.println("Cac phan tu chia het cho 3:");
                    for (int i = 0; i < curentIndex; i++) {
                        if (arr[i] % 3 == 0) {
                            System.out.print(arr[i] + " ");
                            sumDiv3 += arr[i];
                        }
                    }
                    System.out.println("\nTong cac phan tu chia het cho 3 la: " + sumDiv3);
                    break;
                case 5:
                    int sumPrime = 0;
                    System.out.println("Cac phan tu la so nguyen to:");
                    for (int i = 0; i < curentIndex; i++) {
                        boolean isPrime = true;
                        if (arr[i] < 2) {
                            isPrime = false;
                        } else {
                            for (int j = 2; i <= Math.sqrt(arr[i]); i++) {
                                if (arr[i] == 2) {
                                    break;
                                }
                                if (arr[i] % j == 0){
                                    isPrime = false;
                                    break;
                                };
                            }
                        }
                        if (isPrime){
                            System.out.print(arr[i] + " ");
                            sumPrime += arr[i];
                        }
                    }
                    System.out.println("\nTong cac phan tu la so nguyen to la: " + sumPrime);
                    break;
                case 6:
                    System.out.println("Thoat chuong trinh.");
                    return;
                default:
                    System.out.println("Lua chon khong hop le! Vui long nhap lai.");
                    break;
            }
        } while (true);
    }

}