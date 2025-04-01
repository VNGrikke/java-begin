package b21;

import java.util.Scanner;

public class b04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhap vao 1 so nguyen:");
            int number = Integer.parseInt(sc.nextLine());
        }catch (NumberFormatException e){
            System.err.println("Khong phai la so nguyen");
        }finally {
            System.out.println("cam on");
        }
    }
}
