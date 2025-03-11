import java.util.Scanner;

public class b04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào 1 chuỗi: ");
        String str = sc.nextLine();

        String sb = new StringBuilder(str.toLowerCase()).reverse().toString();

        if (str.toLowerCase().equals(sb)) {
            System.out.println("Chuỗi đối xứng ");
        } else {
            System.out.println("Không phải chuỗi đối xứng");
        }
    }
}
