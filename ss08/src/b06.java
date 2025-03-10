import java.util.Scanner;

public class b06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        String input = null;
        int[] arr = null;

        while (true) {
            System.out.println("\n********** MENU CHÍNH **********");
            System.out.println("1. Xử lý chuỗi");
            System.out.println("2. Xử lý số nguyên");
            System.out.println("3. Thoát chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("\n***** MENU XỬ LÝ CHUỖI *****");
                        System.out.println("1. Nhập chuỗi");
                        System.out.println("2. Loại bỏ khoảng trắng thừa");
                        System.out.println("3. Đếm số lần xuất hiện của từng ký tự");
                        System.out.println("4. Chuyển đổi chuỗi thành dạng viết hoa chữ cái đầu mỗi từ");
                        System.out.println("5. Quay lại menu chính");
                        System.out.print("Nhập lựa chọn của bạn: ");
                        int subChoice = scanner.nextInt();
                        scanner.nextLine();

                        if (subChoice == 5)  {
                            break;
                        }
                        if (subChoice == 1) {
                            System.out.print("Nhập chuỗi: ");
                            input = scanner.nextLine();
                            System.out.println("Chuỗi đã nhập: " + input);
                            continue;
                        }

                        if (input == null) {
                            System.out.println("Bạn cần nhập chuỗi trước (Chọn 1).");
                            continue;
                        }

                        switch (subChoice) {
                            case 2:
                                input = input.trim().replaceAll("\\s+", " ");
                                System.out.println("Chuỗi sau khi loại bỏ khoảng trắng thừa: " + input);
                                break;
                            case 3:
                                int[] freq = new int[256];
                                for (char c : input.toCharArray()) {
                                    freq[c]++;
                                }
                                System.out.println("Số lần xuất hiện của từng ký tự:");
                                for (int i = 0; i < 256; i++) {
                                    if (freq[i] > 0) {
                                        System.out.println("'" + (char) i + "' xuất hiện " + freq[i] + " lần");
                                    }
                                }
                                break;
                            case 4:
                                String[] words = input.split(" ");
                                StringBuilder result = new StringBuilder();
                                for (String word : words) {
                                    if (!word.isEmpty()) {
                                        result.append(Character.toUpperCase(word.charAt(0)))
                                                .append(word.substring(1)).append(" ");
                                    }
                                }
                                System.out.println("Chuỗi sau khi chuyển đổi: " + result.toString().trim());
                                break;
                            default:
                                System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại.");
                        }
                    }
                    break;

                case 2:
                    while (true) {
                        System.out.println("\n***** MENU XỬ LÝ SỐ *****");
                        System.out.println("1. Nhập mảng số");
                        System.out.println("2. Tìm số lớn nhất trong mảng");
                        System.out.println("3. Đếm số phần tử có chữ số đầu tiên là số lẻ");
                        System.out.println("4. Kiểm tra có phải mảng đối xứng không");
                        System.out.println("5. Quay lại menu chính");
                        System.out.print("Nhập lựa chọn của bạn: ");
                        int subChoice = scanner.nextInt();

                        if (subChoice == 5) {
                            break;
                        }

                        if (subChoice == 1) {
                            System.out.print("Nhập số lượng phần tử của mảng: ");
                            int n = scanner.nextInt();
                            arr = new int[n];
                            System.out.println("Nhập các phần tử của mảng:");
                            for (int i = 0; i < n; i++) {
                                arr[i] = scanner.nextInt();
                            }
                            System.out.println("Mảng đã nhập thành công.");
                            continue;
                        }

                        if (arr == null) {
                            System.out.println("Bạn cần nhập mảng trước (Chọn 1).");
                            continue;
                        }

                        switch (subChoice) {
                            case 2:
                                int max = arr[0];
                                for (int num : arr) {
                                    if (num > max) max = num;
                                }
                                System.out.println("Số lớn nhất trong mảng: " + max);
                                break;
                            case 3:
                                int count = 0;
                                for (int num : arr) {
                                    int firstDigit = Integer.parseInt(Integer.toString(num).substring(0, 1));
                                    if (firstDigit % 2 != 0) count++;
                                }
                                System.out.println("Số phần tử có chữ số đầu tiên là số lẻ: " + count);
                                break;
                            case 4:
                                boolean isSymmetric = true;
                                for (int i = 0; i < arr.length / 2; i++) {
                                    if (arr[i] != arr[arr.length - 1 - i]) {
                                        isSymmetric = false;
                                        break;
                                    }
                                }
                                if (isSymmetric) {
                                    System.out.println("Mảng đối xứng.");
                                } else {
                                    System.out.println("Mảng không đối xứng.");
                                }
                                break;
                            default:
                                System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại.");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Thoát chương trình.");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại.");
            }
        }
    }
}
