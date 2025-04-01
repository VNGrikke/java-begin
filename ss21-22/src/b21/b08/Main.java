package b21.b08;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static b21.b08.InvalidPhoneNumberLengthException.validatePhoneNumber;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap danh sach cac so dien thoai (ngan cach bang dau phay):");
        String phone = sc.nextLine().trim();
        String[] arrayPhone = phone.split(",");
        List<String> listPhone = Arrays.asList(arrayPhone);
        System.out.println("STT   So dien thoai        Ghi chu");

        for (int i = 0; i < listPhone.size(); i++) {
            String ghiChu;
            try {
                ghiChu = validatePhoneNumber(listPhone.get(i).trim());
            } catch (InvalidPhoneNumberLengthException e) {
                ghiChu = e.getMessage();
            }

            System.out.println(String.format("%-5s %-20s %s", i + 1, listPhone.get(i).trim(), ghiChu));
        }
    }
}

// 1234567890,0123456789,012345,0123a45678