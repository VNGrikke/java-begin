package b04;

public class Main {
    public static void main(String[] args) {
        float radius = 3f;
        Circle circle = new Circle(radius);
        Shape.description();
        System.out.println(circle.area());

    }
}
