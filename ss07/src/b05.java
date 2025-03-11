import java.util.Scanner;

public class b05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào 1 chuỗi: ");
        String str = sc.nextLine().trim();

        String[] word = str.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = word.length - 1; i >= 0; i--) {
            sb.append(word[i]).append(" ");
        }
        System.out.println(sb.toString());
    }
}
