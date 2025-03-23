package sest;

import java.util.HashSet;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
//        khởi tạo set từ set interface và triển khai Hashset:Lưu trữ giữ liệu ngẫu nhiên
        Set<String> set = new HashSet<String>();
        set.add("java");
        set.add("python");
        set.add("javascript");
        set.add("php");
        set.add("c");

        System.out.println(set);

//      Khoi tao set tu set interface va lop trien khai linkedhashset: luu tru du lieu them vao

        Set<String> setLinked = new HashSet<String>();
        setLinked.add("java");
        setLinked.add("python");
        setLinked.add("javascript");
        setLinked.add("php");
        setLinked.add("c");

        System.out.println(setLinked);

//      Khoi tao set tu set interface va lop trien khai treeset : luu tru du lieu theo thu tu tang dan

        Set<String> setTreeSet = new HashSet<String>();
        setTreeSet.add("java");
        setTreeSet.add("python");
        setTreeSet.add("javascript");
        setTreeSet.add("c");
        setTreeSet.add("c");

        setTreeSet.remove("c");
        setTreeSet.contains("java");
        System.out.println(setTreeSet);
    }
}
