import java.util.Scanner;

public class b10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Kiểm tra số nguyên tố");
            System.out.println("2. Kiểm tra số hoàn hảo");
            System.out.println("3. Tìm và tính tổng các ước của một số");
            System.out.println("4. Thoát chương trình");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập một số: ");
                    int n1 = scanner.nextInt();
                    boolean isPrime = true;
                    if (n1 <= 1) {
                        isPrime = false;
                    } else {
                        for (int i = 2; i <= Math.sqrt(n1); i++) {
                            if (n1 % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }
                    if (isPrime) {
                        System.out.println(n1 + " là số nguyên tố.");
                    } else {
                        System.out.println(n1 + " không phải là số nguyên tố.");
                    }
                    break;
                case 2:
                    System.out.print("Nhập một số: ");
                    int n2 = scanner.nextInt();
                    int sumPerfect = 0;
                    for (int i = 1; i < n2; i++) {
                        if (n2 % i == 0) {
                            sumPerfect += i;
                        }
                    }
                    if (sumPerfect == n2) {
                        System.out.println(n2 + " là số hoàn hảo.");
                    } else {
                        System.out.println(n2 + " không phải là số hoàn hảo.");
                    }
                    break;
                case 3:
                    System.out.print("Nhập một số: ");
                    int n3 = scanner.nextInt();
                    int sumDivisors = 0;
                    for (int i = 1; i <= n3; i++) {
                        if (n3 % i == 0) {
                            sumDivisors += i;
                        }
                    }
                    System.out.println("Tổng các ước của " + n3 + " là: " + sumDivisors);
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 4);
    }
}
