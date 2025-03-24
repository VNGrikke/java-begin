package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapdemo {
    public static void main(String[] args) {
        // HashMap la luu tru du lieu khong co thu tu
//        Map<Integer, String> studentHashmap = new HashMap<>();
//        studentHashmap.put(1, "A");
//        studentHashmap.put(2, "B");
//        studentHashmap.put(3, "C");
//        studentHashmap.put(4, "D");
//        studentHashmap.put(1, "E");
//        System.out.println(studentHashmap);

//        Map<Integer, String> studentLinkedHashMap = new LinkedHashMap<>();
//        studentLinkedHashMap.put(1, "A");
//        studentLinkedHashMap.put(2, "B");
//        studentLinkedHashMap.put(3, "C");
//        studentLinkedHashMap.put(4, "D");
//        studentLinkedHashMap.put(1, "E");
//        System.out.println(studentLinkedHashMap);

        Map<Integer, String> studentTreeMap = new TreeMap<>();
        studentTreeMap.put(1, "A");
        studentTreeMap.put(3, "C");
        studentTreeMap.put(2, "B");
        studentTreeMap.put(4, "D");
        studentTreeMap.put(1, "E");
        System.out.println(studentTreeMap);


        // tra ve value get(object key)" lay gia tri value theo key
        System.out.println(studentTreeMap.get(2));

        // xoa phan tu theo key
        studentTreeMap.remove(2);
        System.out.println(studentTreeMap);

        // containkey(object key) kiem tra co ton tai  key ko
        System.out.println(studentTreeMap.containsKey(1)); // true
        System.out.println(studentTreeMap.containsKey(2)); // false

        // keyset() tra ve 1 set gom cac key trong map
        System.out.println(studentTreeMap.keySet());

        // value() tra ve 1 collection chua value trog map
        System.out.println(studentTreeMap.values());

        // entrySet tra ve 1 set chua cac cap key va value
        System.out.println(studentTreeMap.entrySet());

        // duyet map voi phuong thuc keyset
        for (Integer key : studentTreeMap.keySet()) {
            System.out.println(key);
        }

        // duyet voi phuong thuc values
        for (String value : studentTreeMap.values()) {
            System.out.println(value);
        }
    }


}
