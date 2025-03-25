package btPortal;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class b08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nnhap vao 1 so nguyen duong(1-4000): ");
        int K = sc.nextInt();
        Map<Integer, String> romanNumerals = new LinkedHashMap<Integer,String>();
        romanNumerals.put(1000, "M");
        romanNumerals.put(900, "CM");
        romanNumerals.put(500, "D");
        romanNumerals.put(400, "CD");
        romanNumerals.put(100, "C");
        romanNumerals.put(90, "XC");
        romanNumerals.put(50, "L");
        romanNumerals.put(40, "XL");
        romanNumerals.put(10, "X");
        romanNumerals.put(9, "IX");
        romanNumerals.put(5, "V");
        romanNumerals.put(4, "IV");
        romanNumerals.put(1, "I");


        StringBuilder romanNumeral = new StringBuilder();

        for (Integer key : romanNumerals.keySet()) {
            while (K >= key) {
                romanNumeral.append(romanNumerals.get(key));
                K -= key;
            }
        }

        System.out.println(romanNumeral);
    }
}
