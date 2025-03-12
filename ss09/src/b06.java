public class b06 {
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

class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceTo(Point2D p) {
        return Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2));
    }

    public void displayPoint() {
        System.out.println("(" + x + ", " + y + ")");
    }
}