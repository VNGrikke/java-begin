import java.util.ArrayList;
import java.util.List;

public class b08 {
    public static void main(String[] args) {
        List<String> ListString = new ArrayList<String>(List.of("chom chom","sau rieng","cam", "quat","oi", "dao"));
        System.out.println(ListString);
        for (int i = 0; i < ListString.size(); i++) {
            for (int j = 0; j < ListString.size(); j++) {
                if (ListString.get(i).length() < (ListString.get(j)).length()) {
                    String temp = ListString.get(j);
                    ListString.set(j, ListString.get(i));
                    ListString.set(i, temp);
                }
            }
        }
        System.out.println(ListString);
    }
}
