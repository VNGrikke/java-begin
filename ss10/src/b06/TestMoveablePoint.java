package b06;

public class TestMoveablePoint {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(2.0);
        point.setY(3.0);
        System.out.println("Thông tin điểm ban đầu: " + point);

        MoveablePoint moveablePoint = new MoveablePoint();
        moveablePoint.setX(1.0);
        moveablePoint.setY(1.0);
        moveablePoint.setXSpeed(2.0);
        moveablePoint.setYSpeed(3.0);
        System.out.println("Thông tin điểm di chuyển ban đầu: " + moveablePoint);

        moveablePoint.move();
        System.out.println("Thông tin điểm di chuyển sau khi di chuyển: " + moveablePoint);

        moveablePoint.setXSpeed(1.0);
        moveablePoint.setYSpeed(1.0);
        moveablePoint.move();
        System.out.println("Thông tin điểm di chuyển sau khi thay đổi tốc độ: " + moveablePoint);
    }
}