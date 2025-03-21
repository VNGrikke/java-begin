package generic;

import java.util.Arrays;
import java.util.*;

public class GenericDemo {
//    Wrapper class
//    int -> integer
//    String
//    float->float
//    double->double
//    boolean->boolean
    public static void main(String[] args) {
        // class generic
        System.out.println("Generic Demo");
        ClassGeneric<String,String> objStudent = new ClassGeneric<>("SV001","Nguyen Van Vuong");
        System.out.println("Thong tin SV: " + objStudent.toString());
        ClassGeneric<Integer,String> objBook = new ClassGeneric<>(1,"Yeu dai cuong");
        System.out.println("Thong tin Book: " + objBook.toString());

        // method
        System.out.println("Generic Demo");
        String[] array = {"Nguyen Van Vuong","Dinh Thien Vu"};
        Integer[] array2 = {1,2,3};

        System.out.println("Thong tin array: ");
        MethodGeneric.printArray(array);
        System.out.println("\nThong tin array2: ");
        MethodGeneric.printArray(array2);

        // interface
        System.out.println("\nGeneric interface Demo");
        Printer<Integer> printerInt = new Printer<Integer>(){};
        printerInt.displayData(1555);



    }

}
