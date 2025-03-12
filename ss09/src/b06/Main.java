package b06;

public class Main {
    public static void main(String[] args) {
    Point2D point1 = new Point2D(3.0, 4.0);
    Point2D point2 = new Point2D(1.0, 2.0);

    System.out.println("Điểm 1:");
    point1.displayPoint();
    System.out.println("Điểm 2:");
    point2.displayPoint();

    double distance = point1.distanceTo(point2);
    System.out.println("\nKhoảng cách giữa điểm 1 và điểm 2: " + distance);

    point1.setX(5.0);
    point1.setY(6.0);
    System.out.println("\nCập nhật điểm 1:");
    point1.displayPoint();

    distance = point1.distanceTo(point2);
    System.out.println("\nKhoảng cách giữa điểm 1 và điểm 2 đã cập nhật: " + distance);
}
}
