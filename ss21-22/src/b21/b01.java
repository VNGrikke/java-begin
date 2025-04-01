package b21;

import java.util.Scanner;

public class b01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhap vao 2 so");

            int num1 = Integer.parseInt(sc.nextLine().trim());
            int num2 = Integer.parseInt(sc.nextLine().trim());

            int div = num1/num2;

            System.out.println("Ket qua phep chia: " + div);
        } catch (ArithmeticException e1) {
            System.out.println("Khong the chia cho khong");
        } catch (NumberFormatException e2) {
            System.out.println("Khong phai la so ");
        } catch (Exception e3) {
            System.out.println(e3.getMessage());
        }


    }
}
