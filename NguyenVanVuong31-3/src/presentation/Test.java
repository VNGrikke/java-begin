package presentation;

import java.util.Scanner;

import static util.validate.*;

public class Test {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int number1 = intergerValidate("Nhap 1 so nguyen", sc);
        System.out.println("Nhap 1 so thuc(float)");
        float number2 = floatValidate(sc.nextFloat());
        System.out.println("Nhap 1 so thuc(double)");
        double number3 = doubleValidate(sc.nextDouble());
        System.out.println("Nhap gia tri true/false");
        boolean answer = boolValidate(sc.nextBoolean());

        System.out.println("Nhap vao 1 chuoi");
        String str = stringValidate(sc.nextLine(), 20, 2);

        System.out.println("Nhap vao 1 so dien thoai");
        String phone = phoneValidate(sc.nextLine());
    }
}
