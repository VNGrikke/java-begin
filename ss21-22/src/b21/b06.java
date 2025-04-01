package b21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b06 {
    static int countInt = 0;
    static int countChar = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi");
        String str = sc.nextLine();

        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            try {
                int ch = Integer.parseInt(String.valueOf(str.charAt(i)));
                list.add(String.valueOf(ch));
                countInt++;
            } catch (NumberFormatException e) {
                countChar++;
            } catch (Exception e1){
                e1.printStackTrace();
            }
        }

        System.out.println("Danh sach ki tu hop le: " + list);
        System.out.printf("So ky tu hop le va khong hop le: %d - %d\n", countInt, countChar);
    }
}