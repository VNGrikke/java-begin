package de03.validate;
import java.util.Scanner;

public class Validator {
    public static String validateString(Scanner sc, String errorMessage) {
        String input;
        do {
            input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println(errorMessage);
            }
        } while (input.isEmpty());
        return input;
    }

    public static String validateDate(Scanner sc) {
        String regex = "^\\d{2}/\\d{2}/\\d{4}$";
        String date;
        do {
            date = sc.nextLine();
            if (!date.matches(regex)) {
                System.out.println("Ngày sinh không hợp lệ! Định dạng dd/MM/yyyy.");
            }
        } while (!date.matches(regex));
        return date;
    }

    public static String validatePhoneNumber(Scanner sc) {
        String regex = "^(0[1-9][0-9]{8})$";
        String phone;
        do {
            phone = sc.nextLine();
            if (!phone.matches(regex)) {
                System.out.println("Số điện thoại không hợp lệ! Nhập lại:");
            }
        } while (!phone.matches(regex));
        return phone;
    }

    public static float validatePositiveFloat(Scanner sc) {
        float value;
        do {
            while (!sc.hasNextFloat()) {
                System.out.println("Giá trị phải là số thực dương!");
                sc.next();
            }
            value = sc.nextFloat();
            sc.nextLine();
            if (value <= 0) {
                System.out.println("Giá trị phải lớn hơn 0!");
            }
        } while (value <= 0);
        return value;
    }

    public static int validatePositiveInt(Scanner sc) {
        int value;
        do {
            while (!sc.hasNextInt()) {
                System.out.println("Giá trị phải là số nguyên dương!");
                sc.next();
            }
            value = sc.nextInt();
            sc.nextLine();
            if (value < 0) {
                System.out.println("Giá trị phải lớn hơn hoặc bằng 0!");
            }
        } while (value < 0);
        return value;
    }
}