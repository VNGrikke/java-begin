package b03;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 2 so a va b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        BiFunction<Integer, Integer, Integer> addF = MathOperations::add;
        BiFunction<Integer, Integer, Integer> subF = MathOperations::sub;
        BiFunction<Integer, Integer, Integer> mulF = MathOperations::mul;
        BiFunction<Integer, Integer, Integer> divF = MathOperations::div;


        System.out.println("Tong " + addF.apply(a, b));
        System.out.println("Hieu " + subF.apply(a,b));
        System.out.println("Nhan " + mulF.apply(a,b));
        System.out.println("Chia " + divF.apply(a,b));
        }
}
