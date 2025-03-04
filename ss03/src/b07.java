import java.util.Scanner;

public class b07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("tam giac deu");
            } else if (a == b || b == c || a == c) {
                System.out.println("tam giac can");
            } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("tam giac vuong");
            } else {
                System.out.println("tam giac thuong");
            }
        } else {
            System.out.println("khong tao ra tam giac");
        }

    }
}
