package btPortal;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class b08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nnhap vao 1 so nguyen duong(1-100): ");
        int K = sc.nextInt();
        Map<Integer, String> romanNumerals = new TreeMap<>();
        romanNumerals.put(1, "I");
        romanNumerals.put(5, "V");
        romanNumerals.put(10, "X");
        romanNumerals.put(50, "L");
        romanNumerals.put(100, "C");

        int current = 10;
        String romanNumeral = "";
        do {
            int number = K % current;
            System.out.println(number);
            current *= 10;
        }while (true);


    }
}
