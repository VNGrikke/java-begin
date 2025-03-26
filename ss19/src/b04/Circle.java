package b04;

public class Circle implements Shape{
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float area() {
        return (radius * radius * 3.14f);
    }
}
