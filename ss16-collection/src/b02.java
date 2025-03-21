import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 10 so nguyen: ");
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            numbers.add(sc.nextInt());
        }

        System.out.println("danh sach truoc khi xoa: ");
        for ( Integer number : numbers ) {
            System.out.printf("%5d", number);
        }

        numbers.removeIf(number -> number % 3 == 0);

        System.out.println("\ndanh sach sau khi xoa: ");
        for (Integer number : numbers ) {
            System.out.printf("%5d", number);
        }

    }
}
