package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class validate {
    public static int intergerValidate(String message, Scanner sc) {
        System.out.println(message);
        do {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                e.getMessage();
            } catch (Exception e1){
                e1.getMessage();
            }
        }while (true);

    }
    public static float floatValidate(float number) {

        do {
            try {
                return Float.parseFloat(String.valueOf(number));
            } catch (NumberFormatException e) {
                e.getMessage();
            } catch (Exception e1){
                e1.getMessage();
            }
        }while (true);

    }

    public static Double doubleValidate(double number) {
        try {
            double number1 = Double.parseDouble(String.valueOf(number));
        } catch (NumberFormatException e) {
            e.getMessage();
        } catch (InputMismatchException e1){
            e1.getMessage();
        }
        return number;
    }

    public static Boolean boolValidate(Boolean answer) {
        try {
            boolean answer1 = Boolean.parseBoolean(String.valueOf(answer));
        }catch (BootstrapMethodError e){
            e.getMessage();
        }
        return answer;
    }
    public static String stringValidate(String str, int max, int min) throws Exception {
        if (str.length() > max)
            throw new Exception("Qua dai");

        if (str.length() < min)
            throw new Exception("Qua ngan");

        if (str.isEmpty())
            throw new Exception("Khong duoc de trong");

        return str;
    }

    public static String phoneValidate(String phone) throws Exception {
        if (phone.length() != 10) {
            throw new Exception("Do dai khong hop le");
        }

        if (phone.charAt(0) != '0') {
            throw new Exception("Phai bat dau bang so 0");
        }

        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                throw new Exception("Chua ki tu khong hop le");
            }
        }

        return phone;
    }



}
