import java.util.Scanner;

public class b04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        while (true) {
            System.out.print("Nhập một số nguyên (nhập 0 để dừng): ");
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
        }
        System.out.println("Tổng các số đã nhập là: " + sum);
    }
}
