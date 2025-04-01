package b21.b05;
import java.util.Scanner;

public class b05 {
    public static void main(String[] args) throws primeException {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhap vao 1 so nguyen");
            int number = Integer.parseInt(sc.nextLine());
            isPrime(number);
        }catch (NumberFormatException e) {
            System.err.println("Khong phai so nguyen");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void isPrime(int number) throws primeException {
        if (number < 0) {
            throw new primeException("Số phải lớn hơn 0");
        }

        if (number < 2) {
            throw new primeException("Không phải số nguyên tố");
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                throw new primeException("Không phải số nguyên tố");
            }
        }

        System.out.println(number + " là số nguyên tố");
    }
}
