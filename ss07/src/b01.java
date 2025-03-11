import java.util.Scanner;

public class b01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.println("Nhập chuỗi thứ nhất: ");
        String str1 = sc.nextLine();
        System.out.println("Nhập chuỗi thứ hai: ");
        String str2 = sc.nextLine();
        System.out.println("Nhập chuỗi thứ ba: ");
        String str3 = sc.nextLine();

        sb.append(str1);
        sb.append(str2);
        sb.append(str3);

        String result = sb.toString().toUpperCase();

        System.out.println(result);
    }
}
