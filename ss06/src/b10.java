import java.util.Scanner;

public class b10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập đoạn văn bản: ");
        String input = scanner.nextLine();
        scanner.close();

        if (input.trim().isEmpty()) {
            System.out.println("Không có văn bản để xử lý.");
            return;
        }

        String numbers = "";
        for (String word : input.split(" ")) {
            if (word.matches("\\d+")) {
                numbers += (numbers.isEmpty() ? "" : ", ") + "\"" + word + "\"";
            }
        }

        String cleanedText = input.replaceAll("[^a-zA-Z\s]", "").toLowerCase().trim().replaceAll("\\s+", " ");

        System.out.println("\"" + cleanedText + "\", [" + numbers + "]");
    }
}