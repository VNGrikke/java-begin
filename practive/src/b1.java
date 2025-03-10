import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[100];
        int n = 0;

        while (true) {
            System.out.println("\n******************** MENU ********************");
            System.out.println("1. Nhập giá trị n phần tử của mảng");
            System.out.println("2. In giá trị các phần tử trong mảng");
            System.out.println("3. Tính trung bình các phần tử dương");
            System.out.println("4. In ra vị trí các phần tử có giá trị bằng k");
            System.out.println("5. Sắp xếp mảng giảm dần (Bubble Sort)");
            System.out.println("6. Tính số lượng số nguyên tố trong mảng");
            System.out.println("7. Sắp xếp theo yêu cầu đặc biệt");
            System.out.println("8. Chèn giá trị m vào mảng (giữ sắp xếp giảm dần)");
            System.out.println("9. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng phần tử n (tối đa 100): ");
                    n = scanner.nextInt();
                    System.out.println("Nhập các phần tử của mảng:");
                    for (int i = 0; i < n; i++) {
                        arr[i] = scanner.nextInt();
                    }
                    break;

                case 2:
                    System.out.print("Mảng hiện tại: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    double sum = 0;
                    int count = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] > 0) {
                            sum += arr[i];
                            count++;
                        }
                    }
                    if (count > 0) {
                        System.out.println("Trung bình các phần tử dương: " + (sum / count));
                    } else {
                        System.out.println("Không có phần tử dương nào.");
                    }
                    break;

                case 4:
                    System.out.print("Nhập giá trị k cần tìm: ");
                    int k = scanner.nextInt();
                    System.out.print("Vị trí của các phần tử có giá trị " + k + ": ");
                    boolean found = false;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == k) {
                            System.out.print(i + " ");
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy phần tử nào.");
                    }
                    System.out.println();
                    break;

                case 5:
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (arr[j] < arr[j + 1]) {
                                int temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                        }
                    }
                    System.out.print("Mảng sau khi sắp xếp giảm dần: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 6:
                    int primeCount = 0;
                    for (int i = 0; i < n; i++) {
                        boolean isPrime = true;
                        if (arr[i] < 2) {
                            isPrime = false;
                        } else {
                            for (int j = 2; j * j <= arr[i]; j++) {
                                if (arr[i] % j == 0) {
                                    isPrime = false;
                                    break;
                                }
                            }
                        }
                        if (isPrime) primeCount++;
                    }
                    System.out.println("Số lượng số nguyên tố trong mảng: " + primeCount);
                    break;

                case 7:
                    int countEvenDiv3 = 0, countOddDiv3 = 0, countOthers = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] % 2 == 0 && arr[i] % 3 == 0) {
                            countEvenDiv3++;
                        } else if (arr[i] % 2 != 0 && arr[i] % 3 == 0) {
                            countOddDiv3++;
                        } else {
                            countOthers++;
                        }
                    }

                    int[] evenDiv3 = new int[countEvenDiv3];
                    int[] oddDiv3 = new int[countOddDiv3];
                    int[] others = new int[countOthers];

                    int e = 0, o = 0, t = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] % 2 == 0 && arr[i] % 3 == 0) {
                            evenDiv3[e++] = arr[i];
                        } else if (arr[i] % 2 != 0 && arr[i] % 3 == 0) {
                            oddDiv3[o++] = arr[i];
                        } else {
                            others[t++] = arr[i];
                        }
                    }

                    for (int i = 0; i < countEvenDiv3 - 1; i++) {
                        for (int j = i + 1; j < countEvenDiv3; j++) {
                            if (evenDiv3[i] > evenDiv3[j]) {
                                int temp = evenDiv3[i];
                                evenDiv3[i] = evenDiv3[j];
                                evenDiv3[j] = temp;
                            }
                        }
                    }

                    for (int i = 0; i < countOthers - 1; i++) {
                        for (int j = i + 1; j < countOthers; j++) {
                            if (others[i] > others[j]) {
                                int temp = others[i];
                                others[i] = others[j];
                                others[j] = temp;
                            }
                        }
                    }

                    for (int i = 0; i < countOddDiv3 - 1; i++) {
                        for (int j = i + 1; j < countOddDiv3; j++) {
                            if (oddDiv3[i] < oddDiv3[j]) {
                                int temp = oddDiv3[i];
                                oddDiv3[i] = oddDiv3[j];
                                oddDiv3[j] = temp;
                            }
                        }
                    }

                    int index = 0;
                    for (int i = 0; i < countEvenDiv3; i++) {
                        arr[index++] = evenDiv3[i];
                    }
                    for (int i = 0; i < countOthers; i++) {
                        arr[index++] = others[i];
                    }
                    for (int i = 0; i < countOddDiv3; i++) {
                        arr[index++] = oddDiv3[i];
                    }

                    System.out.print("Mảng sau khi sắp xếp theo yêu cầu: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;


                case 8:
                    System.out.print("Nhập giá trị m cần chèn: ");
                    int m = scanner.nextInt();

                    int i;
                    for (i = n - 1; i >= 0 && arr[i] < m; i--) {
                        arr[i + 1] = arr[i];
                    }
                    arr[i + 1] = m;
                    n++;

                    for (i = 0; i < n - 1; i++) {
                        int maxIdx = i;
                        for (int j = i + 1; j < n; j++) {
                            if (arr[j] > arr[maxIdx]) {
                                maxIdx = j;
                            }
                        }
                        int temp = arr[i];
                        arr[i] = arr[maxIdx];
                        arr[maxIdx] = temp;
                    }

                    System.out.print("Mảng sau khi chèn " + m + " và sắp xếp giảm dần: ");
                    for (int j = 0; j < n; j++) {
                        System.out.print(arr[j] + " ");
                    }
                    System.out.println();
                    break;

                case 9:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại.");
            }
        }
    }
}
