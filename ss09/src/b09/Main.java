package b09;

public class Main {
    public static void main(String[] args) {
        Fraction frac1 = new Fraction(3, 4);
        Fraction frac2 = new Fraction(5, 6);

        Fraction sum = frac1.add(frac2);
        Fraction difference = frac1.subtract(frac2);
        Fraction product = frac1.multiply(frac2);
        Fraction quotient = frac1.divide(frac2);

        System.out.println("Phân số 1: " + frac1);
        System.out.println("Phân số 2: " + frac2);
        System.out.println("Tổng: " + sum);
        System.out.println("Hiệu: " + difference);
        System.out.println("Tích: " + product);
        System.out.println("Thương: " + quotient);
    }
}
