import java.util.Scanner;

public class b10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = "";

        while (true) {
            System.out.println("===== MENU QUẢN LÝ CHUỖI =====");
            System.out.println("1. Đảo ngược chuỗi");
            System.out.println("2. Chèn chuỗi vào vị trí bất kỳ");
            System.out.println("3. Xóa một đoạn trong chuỗi");
            System.out.println("4. Thay thế một đoạn trong chuỗi");
            System.out.println("5. Chuyển đổi toàn bộ chuỗi thành chữ hoa/chữ thường");
            System.out.println("6. Thoát chương trình");
            System.out.print("Chọn chức năng (1-6): ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập chuỗi: ");
                    inputString = sc.nextLine();
                    String reversed = new StringBuilder(inputString).reverse().toString();
                    System.out.println("Chuỗi sau khi đảo ngược: " + reversed);
                    break;

                case 2:
                    System.out.print("Nhập chuỗi gốc: ");
                    inputString = sc.nextLine();
                    System.out.print("Nhập chuỗi cần chèn: ");
                    String toInsert = sc.nextLine();
                    System.out.print("Nhập vị trí cần chèn: ");
                    int position = sc.nextInt();
                    if (position >= 0 && position <= inputString.length()) {
                        String result = inputString.substring(0, position) + toInsert + inputString.substring(position);
                        System.out.println("Chuỗi sau khi chèn: " + result);
                    } else {
                        System.out.println("Vị trí không hợp lệ!");
                    }
                    break;

                case 3:
                    System.out.print("Nhập chuỗi gốc: ");
                    inputString = sc.nextLine();
                    System.out.print("Nhập vị trí bắt đầu: ");
                    int startIndex = sc.nextInt();
                    System.out.print("Nhập vị trí kết thúc: ");
                    int endIndex = sc.nextInt();
                    sc.nextLine();
                    if (startIndex >= 0 && endIndex >= startIndex && endIndex <= inputString.length()) {
                        String result = inputString.substring(0, startIndex) + inputString.substring(endIndex);
                        System.out.println("Chuỗi sau khi xóa: " + result);
                    } else {
                        System.out.println("Vị trí không hợp lệ!");
                    }
                    break;

                case 4:
                    System.out.print("Nhập chuỗi gốc: ");
                    inputString = sc.nextLine();
                    System.out.print("Nhập vị trí bắt đầu: ");
                    startIndex = sc.nextInt();
                    System.out.print("Nhập vị trí kết thúc: ");
                    endIndex = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhập chuỗi thay thế: ");
                    String replacement = sc.nextLine();
                    if (startIndex >= 0 && endIndex >= startIndex && endIndex <= inputString.length()) {
                        String result = inputString.substring(0, startIndex) + replacement + inputString.substring(endIndex);
                        System.out.println("Chuỗi sau khi thay thế: " + result);
                    } else {
                        System.out.println("Vị trí không hợp lệ!");
                    }
                    break;

                case 5:
                    System.out.print("Nhập chuỗi: ");
                    inputString = sc.nextLine();
                    System.out.println("1. Chữ hoa");
                    System.out.println("2. Chữ thường");
                    System.out.print("Chọn: ");
                    int subChoice = sc.nextInt();
                    sc.nextLine();
                    if (subChoice == 1) {
                        System.out.println("Chuỗi chữ hoa: " + inputString.toUpperCase());
                    } else if (subChoice == 2) {
                        System.out.println("Chuỗi chữ thường: " + inputString.toLowerCase());
                    } else {
                        System.out.println("Lựa chọn không hợp lệ!");
                    }
                    break;

                case 6:
                    System.out.println("Thoát chương trình. Tạm biệt!");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!");
            }
            System.out.println();
        }
    }
}
