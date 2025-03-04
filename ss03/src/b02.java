import java.util.Scanner;

public class b02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 3 so nguyen : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;

        System.out.printf("so lon nhat %d ", max);
    }
}
