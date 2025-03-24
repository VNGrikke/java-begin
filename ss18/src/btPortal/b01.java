package btPortal;

import java.util.HashMap;

public class b01 {
    public static void main(String[] args) {
        HashMap<String, Double>   student = new HashMap<String, Double>();
        student.put("Nguyen Van Vuong", 6.0);
        student.put("Nguyen Xuan Quang", 7.0);
        student.put("Nguyen Dac Son", 8.0);
        student.put("Luong ha Minh Vy", 9.0);
        student.put("Nguyen Manh Hung", 1.0);

        for ( String key : student.keySet() ) {
            System.out.println(key+": "+student.get(key));
        }
    }
}
