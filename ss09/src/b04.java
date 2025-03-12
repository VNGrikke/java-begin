public class b04 {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Tam giác 1:");
        circle1.display();

        Circle circle2 = new Circle(5.0);
        System.out.println("\nTam giác 2:");
        circle2.display();
    }
}

class Circle {
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