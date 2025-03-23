import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class b02 {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<String>();
        strings.add("java");
        strings.add("c++");
        strings.add("python");
        strings.add("javascript");

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap: ");
        String input = sc.nextLine();

        System.out.println(strings.contains(input));

    }
}
