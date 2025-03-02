import java.util.Scanner;

public class b09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập cạnh a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập cạnh b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập cạnh c: ");
        double c = scanner.nextDouble();

        if ( a + b <= c || a + c <= b || b + c <= a ) {
            System.out.println("Cạnh không hợp lệ");
            return;
        }

        double perimeter = a + b + c;

        double s = perimeter / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Chu vi: " + perimeter);
        System.out.println("Diện tích: " + area);
    }
}
