import java.util.Set;
import java.util.TreeSet;

public class b04 {
    public static void main(String[] args) {
        Set<Integer> numTreeSet = new TreeSet<Integer>();
        numTreeSet.add(45);
        numTreeSet.add(12);
        numTreeSet.add(78);
        numTreeSet.add(34);
        numTreeSet.add(23);
        numTreeSet.add(89);

        System.out.println(numTreeSet);
    }
}
