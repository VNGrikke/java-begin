import java.util.Scanner;

public class b01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi bất kỳ: ");
        String input = scanner.nextLine();
        String[] words = input.trim().split("\\s+");
        int wordCount = (input.trim().isEmpty()) ? 0 : words.length;

        System.out.println("Số lượng từ trong chuỗi là: " + wordCount);
    }
}
