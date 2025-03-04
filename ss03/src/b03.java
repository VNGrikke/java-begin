import java.util.Scanner;

public class b03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        if (a < 5) {
            System.out.print("yeu");
        } else if (a < 6.5) {
            System.out.print("trung binh");
        } else if (a < 8.5) {
            System.out.print("kha");
        } else if (a < 10) {
            System.out.print("gioi");
        } else{
            System.out.print("khong hop le");
        }
    }
}
