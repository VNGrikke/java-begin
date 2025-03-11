import java.util.Scanner;

public class b09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập 1 chuỗi: ");
        String str = sc.nextLine().trim().replaceAll("\\s+", "");

        System.out.println(str);
        StringBuilder sb = new StringBuilder();

        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i < str.length() - 1 && c == str.charAt(i+1)  ) {
                count++;
            } else {
                sb.append(c).append(count);
                count = 1;
            }

        }
        System.out.println(sb.toString());
    }
}
