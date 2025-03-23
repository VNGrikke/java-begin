import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class b08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> numbers = new TreeSet<Integer>();
        System.out.print("Nhap vao do dai mang: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        System.out.print("nhap vao k: ");
        int k = sc.nextInt();
        System.out.printf("tong cac so tong bang %d: ",k);
        for (int number : numbers) {
            int number2 = k - number;
            if (numbers.contains(number2)) {
                System.out.print("("+ number + ", " + number2 + "), ");
            }
        }

    }
}
