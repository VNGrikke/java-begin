import java.util.Scanner;

public class b07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if ( input == null || input.length() == 0 ){
            System.out.println("Lỗi nhập dữ liệu");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if ( c >= 'A' && c <= 'Z' ){
                if(i !=0 ){
                    sb.append("_");
                }
                sb.append((char)(c+32));
            } else {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}