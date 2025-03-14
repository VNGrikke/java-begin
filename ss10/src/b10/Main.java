package b10;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Hình tròn", 5.0);
        Shape rectangle = new Rectangle("Hình chữ nhật", 4.0, 6.0);
        Shape triangle = new Triangle("Hình tam giác", 3.0, 4.0, 5.0);

        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(triangle.toString());

        Shape[] shapes = {circle, rectangle, triangle};

        System.out.println("\nThông tin các hình trong mảng:");
        for (Shape shape : shapes) {
            System.out.println("Tên hình: " + shape.name);
            System.out.println("Diện tích: " + shape.calculateArea());
            System.out.println("Chu vi: " + shape.calculatePerimeter());
            System.out.println("-----------------------------");
        }
    }
}
