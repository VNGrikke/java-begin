package b21;

import java.util.Scanner;

public class b02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {1,2,3,4,5,6,7,8,9,10};

        try {
            System.out.print("Nhap index: ");
            int index = Integer.parseInt(sc.nextLine().trim());
            System.out.print(nums[index]);
        }catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Chi so ngoai pham vi");
        }catch (NumberFormatException e2) {
            System.out.println("khong phai la so");
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
