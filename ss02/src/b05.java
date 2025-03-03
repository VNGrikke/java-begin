import java.util.Scanner;

public class b05 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap vao chieu dai va chieu rong: ");
        a = sc.nextInt();
        b = sc.nextInt();
        int s = acreage(a, b);
        int cv = perimeter(a, b);
        System.out.printf("dien tich = %d", s);
        System.out.printf("dien tich = %d", cv);
    }

    public static int acreage(int a, int b){
        int s = a * b;
        return area;
    }

    public static int perimeter(int a, int b){
        int cv = (a + b) * 2;
        return area;
    }
}
