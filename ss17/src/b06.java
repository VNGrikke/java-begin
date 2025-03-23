import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class b06 {
    public static void main(String[] args) {
        Set<Integer> num1 = new HashSet<Integer>();
        Set<Integer> num2 = new HashSet<Integer>();
        num1.add(10);
        num1.add(20);
        num1.add(30);
        num1.add(40);
        num2.add(50);
        num2.add(60);
        num2.add(30);
        num2.add(40);

        num1.retainAll(num2);
        Set<Integer> sort = new TreeSet<Integer>(num1);
        System.out.println(sort);
    }
}
