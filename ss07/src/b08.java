import java.util.Scanner;

public class b08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int index = (int) (Math.floor(Math.random() * chars.length()));
            sb.append(chars.charAt(index));
        }
        System.out.println(sb.toString());
    }
}
