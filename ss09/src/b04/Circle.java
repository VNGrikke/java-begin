package b04;

public class Circle {
    private double radius;

    private static double PI = 3.14159;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }

    public void display() {
        System.out.println("Bán kính: " + radius);
        System.out.println("Diện tích: " + getArea());
        System.out.println("Chu vi: " + getCircumference());
    }
}
