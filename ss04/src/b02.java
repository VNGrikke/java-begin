import java.util.Scanner;

public class b02  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên n: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Không phải số nguyên tố");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n + " là số nguyên tố");
            } else {
                System.out.println(n + " không phải là số nguyên tố");
            }
        }
    }
}
