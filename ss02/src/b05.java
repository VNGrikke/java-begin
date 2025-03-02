import java.util.Scanner;

public class b05 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap vao chieu dai va chieu rong: ");
        a = sc.nextInt();
        b = sc.nextInt();
        int area = acreage(a, b);
        System.out.printf("dien tich = %d", area);
    }

    public static int acreage(int a, int b){
        int area = a * b;
        return area;
    }
}
