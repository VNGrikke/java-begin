package b05;

public class Main {
    public static void main(String[] args) {
        Vector2D v1 = new Vector2D(3.0, 3.0);
        Vector2D v2 = new Vector2D(1.0, 2.0);

        System.out.println("Vector 1:");
        v1.displayVector();
        System.out.println("Vector 2:");
        v2.displayVector();

        System.out.println("\nĐộ lớn của vectơ 1: " + v1.calculateMagnitude());
        System.out.println("Độ lớn của vectơ 2: " + v2.calculateMagnitude());

        Vector2D sum = v1.add(v2);
        System.out.println("\nTổng của Vectơ 1 và Vectơ 2:");
        sum.displayVector();

        Vector2D difference = v1.subtract(v2);
        System.out.println("\nSự khác biệt của Vectơ 1 và Vectơ 2:");
        difference.displayVector();

        double dotProduct = v1.dotProduct(v2);
        System.out.println("\nTích vô hướng của vectơ 1 và vectơ 2: " + dotProduct);
    }
}
