import java.util.Scanner;

public class b04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();
        String result = input.replaceAll("[0-9]", "*");
        System.out.printf("\"%s\"", result);
    }
}
