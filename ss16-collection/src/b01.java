import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class b01 {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Vuong");
        students.add("Vy");
        students.add("Son");
        students.add("Quang");
        students.add("Hien");

        System.out.println("dung for");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        System.out.println("dung foreach");
        for (String student : students) {
            System.out.println(student);
        }

        System.out.println("dung iterator");
        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext()) {
            String student = iterator.next();
            System.out.println(student);
        }
    }
}
