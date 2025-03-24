package de04.validate;


import java.util.Scanner;
import java.util.regex.Pattern;

public class Validator {
    public static String validateString(Scanner sc, int min, int max) {
        String input;
        do {
            input = sc.nextLine().trim();
            if (input.length() < min || input.length() > max) {
                System.out.println("Độ dài phải từ " + min + " đến " + max + " ký tự!");
            }
        } while (input.length() < min || input.length() > max);
        return input;
    }

    public static String validateDate(Scanner sc) {
        String regex = "\\d{2}/\\d{2}/\\d{4}";
        String date;
        do {
            date = sc.nextLine().trim();
            if (!Pattern.matches(regex, date)) {
                System.out.println("Định dạng ngày không hợp lệ! (dd/MM/yyyy)");
            }
        } while (!Pattern.matches(regex, date));
        return date;
    }

    public static String validatePhoneNumber(Scanner sc) {
        String regex = "0[0-9]{9}";
        String phone;
        do {
            phone = sc.nextLine().trim();
            if (!Pattern.matches(regex, phone)) {
                System.out.println("Số điện thoại không hợp lệ!");
            }
        } while (!Pattern.matches(regex, phone));
        return phone;
    }

    public static String validateEmail(Scanner sc) {
        String regex = "^[a-zA-Z0-9._%+-]+@gmail\\.com$";
        String email;
        do {
            email = sc.nextLine().trim();
            if (!Pattern.matches(regex, email)) {
                System.out.println("Email không hợp lệ! (phải là Gmail)");
            }
        } while (!Pattern.matches(regex, email));
        return email;
    }
}