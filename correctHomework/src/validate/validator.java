package validate;

import java.util.Scanner;

public class validator {
    public static String validateInputString(Scanner sc, String message, StringRule stringRule) {
        System.out.println(message);
        do {
            String input = sc.nextLine();
            if (stringRule.isValid(input)) {
                return input;
            }
            System.err.println("dữ liệu không hợp lệ, vui lòng nhập lại");
        }while (true);
    }

    public static int validateInputInt(Scanner sc, String message) {
        System.out.println(message);
        do {
            if (!sc.hasNextInt()) {
                System.err.println("du lieu khong phai so nguyen vui long nhap lai");
                sc.nextLine();
                continue;
            }
            return Integer.parseInt(sc.nextLine());
        }while (true);
    }

    public static boolean validateInputBoolean(Scanner sc, String message) {
        System.out.println(message);
        do {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                return Boolean.parseBoolean(sc.nextLine());
            }
            System.err.println("dữ liệu không hợp lệ vui lòng nhập lại");
        }while (true);
    }

    public static float validateInputFloat(Scanner sc, String message, float minValue) {
        System.out.println(message);
        do {
            if (!sc.hasNextFloat()) {
                System.err.println("dữ liệu không hợp lệ vui lòng nhập lại");
                sc.nextLine();
                continue;
            }

            float number = Float.parseFloat(sc.nextLine());
            if (number > minValue){
                return number;
            }
            System.err.printf("giá trị phải lớn hơn %f, vui lòng nhập lại\n", minValue);
        }while (true);
    }
}
