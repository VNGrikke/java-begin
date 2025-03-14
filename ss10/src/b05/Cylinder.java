package b05;

public class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Chiều cao không hợp lệ. Chiều cao phải lớn hơn 0.");
        }
    }

    public double getVolume() {
        return getArea() * height;
    }
}
