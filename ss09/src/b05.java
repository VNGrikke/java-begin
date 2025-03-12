public class b05 {
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

class Vector2D {
    private double x;
    private double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calculateMagnitude() {
        return Math.sqrt(x * x + y * y);
    }

    public Vector2D add(Vector2D v) {
        return new Vector2D(this.x + v.x, this.y + v.y);
    }

    public Vector2D subtract(Vector2D v) {
        return new Vector2D(this.x - v.x, this.y - v.y);
    }

    public double dotProduct(Vector2D v) {
        return this.x * v.x + this.y * v.y;
    }

    public void displayVector() {
        System.out.println("(" + x + ", " + y + ")");
    }
}