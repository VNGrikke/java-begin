import java.util.Scanner;

public class b05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        char operator = scanner.next().charAt(0);
        double b = scanner.nextDouble();
        double result;

        switch (operator) {
            case '+':
                result = a + b;
                System.out.println("ket qua: " + result);
                break;
            case '-':
                result = a - b;
                System.out.println("ket qua: " + result);
                break;
            case '*':
                result = a * b;
                System.out.println("ket qua: " + result);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("khong the chia cho 0.");
                } else {
                    result = a / b;
                    System.out.println("ket qua: " + result);
                }
                break;
            default:
                System.out.println("khong hop le.");
        }
    }
}
