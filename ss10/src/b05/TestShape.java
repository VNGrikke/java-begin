package b05;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5.0);
        System.out.println("Diện tích hình tròn: " + circle.getArea());

        circle.setRadius(-3.0);
        System.out.println("Diện tích hình tròn sau khi thử thiết lập không hợp lệ: " + circle.getArea());

        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(5.0);
        cylinder.setHeight(10.0);
        System.out.println("Thể tích hình trụ: " + cylinder.getVolume());

        cylinder.setHeight(-7.0);
        System.out.println("Thể tích hình trụ sau khi thử thiết lập không hợp lệ: " + cylinder.getVolume());
    }
}
