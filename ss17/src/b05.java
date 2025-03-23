import java.util.HashSet;
import java.util.Set;

public class b05 {
    public static void main(String[] args) {
        Set<Integer> num1 = new HashSet<Integer>();
        Set<Integer> num2 = new HashSet<Integer>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(4);
        num1.add(5);
        num2.add(4);
        num2.add(5);
        num2.add(6);
        num2.add(8);
        num2.add(7);

        num1.addAll(num2);
        System.out.println(num1);
    }
}
