package demo;

import java.util.Scanner;

public class demoEception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhap vao so thu nhat va so thu hai");
            int firstNum = Integer.parseInt(sc.nextLine());
            int secondNum = Integer.parseInt(sc.nextLine());

            int divNum = firstNum / secondNum;

            System.out.println("Ket qua phep chia: " + divNum);
        }catch (ArithmeticException e1) {
            System.out.println("Khong the chia cho khong");
        }catch (NumberFormatException e2) {
            System.out.println(e2.getMessage());
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        int[] nums = {1,2,3,4,5,6,7,8,9};

        System.out.println("NNhap vao so phan tu can lay");
        int index = Integer.parseInt(sc.nextLine());

        System.out.println(nums[index]);

    }
}
