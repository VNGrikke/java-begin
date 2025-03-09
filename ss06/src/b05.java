import java.util.Scanner;

public class b05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi văn bản: ");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");

        String specialCharRegex = ".*[^a-zA-Z0-9].*";

        String result = "";
        int count = 0;

        for (String word : words) {
            if (word.matches(specialCharRegex)) {
                count++;
                if (result.isEmpty()) {
                    result = word;
                } else {
                    result += ", " + word;
                }
            }
        }

        if (count == 0) {
            System.out.println("Không có từ chứa ký tự đặc biệt.");
        } else {
            System.out.println(count + "(" + result + ")");
        }
    }
}
