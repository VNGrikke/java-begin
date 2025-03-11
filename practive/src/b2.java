import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[100][100];
        int n = 0, m = 0;

        while (true) {
            System.out.println("\n************** MENU **************");
            System.out.println("1. Nhập giá trị các phần tử của mảng");
            System.out.println("2. In giá trị các phần tử trong mảng theo ma trận");
            System.out.println("3. Tính số lượng phần tử chia hết cho 2 và 3");
            System.out.println("4. In các phần tử và tổng trên đường biên, đường chéo");
            System.out.println("5. Sắp xếp các phần tử tăng dần theo cột");
            System.out.println("6. In ra các phần tử là số nguyên tố");
            System.out.println("7. Sắp xếp đường chéo chính giảm dần");
            System.out.println("8. Chèn mảng 1 chiều vào hàng bất kỳ");
            System.out.println("9. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số hàng n: ");
                    n = scanner.nextInt();
                    System.out.print("Nhập số cột m: ");
                    m = scanner.nextInt();
                    System.out.println("Nhập các phần tử của ma trận:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            matrix[i][j] = scanner.nextInt();
                        }
                    }
                    break;

                case 2:
                    System.out.println("Ma trận vừa nhập:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.print(matrix[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    int count = 0;
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            if (matrix[i][j] % 2 == 0 && matrix[i][j] % 3 == 0) {
                                count++;
                            }
                        }
                    }
                    System.out.println("Số lượng phần tử chia hết cho 2 và 3: " + count);
                    break;

                case 4:
                    int sumBorder = 0, sumMainDiagonal = 0, sumSubDiagonal = 0;

                    System.out.println("Các phần tử trên đường biên:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                                System.out.print(matrix[i][j] + " ");
                                sumBorder += matrix[i][j];
                            }
                        }
                    }
                    System.out.println("\nTổng các phần tử trên đường biên: " + sumBorder);

                    if ( n != m ){
                        System.out.print("Khong phai mang vuong");
                        return;
                    }
                    System.out.println("\nCác phần tử trên đường chéo chính:");
                    for (int i = 0; i < n; i++) {
                        if (i < m) {
                            System.out.print(matrix[i][i] + " ");
                            sumMainDiagonal += matrix[i][i];
                        }
                    }
                    System.out.println("\nTổng các phần tử trên đường chéo chính: " + sumMainDiagonal);

                    System.out.println("\nCác phần tử trên đường chéo phụ:");
                    for (int i = 0; i < n; i++) {
                        if (m - 1 - i >= 0) {
                            System.out.print(matrix[i][m - 1 - i] + " ");
                            sumSubDiagonal += matrix[i][m - 1 - i];
                        }
                    }
                    System.out.println("\nTổng các phần tử trên đường chéo phụ: " + sumSubDiagonal);

                    break;

                case 5:
                    for (int j = 0; j < m; j++) {
                        for (int i = 0; i < n - 1; i++) {
                            for (int k = i + 1; k < n; k++) {
                                if (matrix[i][j] > matrix[k][j]) {
                                    int temp = matrix[i][j];
                                    matrix[i][j] = matrix[k][j];
                                    matrix[k][j] = temp;
                                }
                            }
                        }
                    }
                    System.out.println("Ma trận sau khi sắp xếp tăng dần theo cột:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.print(matrix[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 6:
                    System.out.println("Các số nguyên tố trong ma trận:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            boolean isPrime = matrix[i][j] > 1;
                            for (int k = 2; k * k <= matrix[i][j]; k++) {
                                if (matrix[i][j] % k == 0) {
                                    isPrime = false;
                                    break;
                                }
                            }
                            if (isPrime) {
                                System.out.print(matrix[i][j] + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;

                case 7:
                    for (int i = 1; i < Math.min(n, m); i++) {
                        int key = matrix[i][i];
                        int j = i - 1;
                        while (j >= 0 && matrix[j][j] < key) {
                            matrix[j + 1][j + 1] = matrix[j][j];
                            j--;
                        }
                        matrix[j + 1][j + 1] = key;
                    }
                    System.out.println("Ma trận sau khi sắp xếp đường chéo chính giảm dần:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.print(matrix[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 8:
                    System.out.print("Nhập chỉ số dòng muốn chèn (0 đến " + n + "): ");
                    int rowIndex = scanner.nextInt();
                    System.out.println("Nhập " + m + " phần tử của mảng 1 chiều:");
                    int[] newRow = new int[m];
                    for (int i = 0; i < m; i++) {
                        newRow[i] = scanner.nextInt();
                    }

                    for (int i = n; i > rowIndex; i--) {
                        for (int j = 0; j < m; j++) {
                            matrix[i][j] = matrix[i - 1][j];
                        }
                    }

                    for (int j = 0; j < m; j++) {
                        matrix[rowIndex][j] = newRow[j];
                    }

                    n++;
                    System.out.println("Ma trận sau khi chèn:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.print(matrix[i][j] + " ");
                        }
                        System.out.println();
                    }
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
