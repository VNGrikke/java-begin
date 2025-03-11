import java.util.Scanner;

public class b03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.print("Nhập vào 1 chuỗi: ");
        String str = sc.nextLine();
        sb.append(str);

        System.out.println(sb.toString());
        System.out.print(sb.reverse().toString());
    }
}
