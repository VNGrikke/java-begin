package b05;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Bán kính không hợp lệ. Bán kính phải lớn hơn 0.");
        }
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}