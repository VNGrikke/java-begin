public class b03 {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        System.out.println("Hình chữ nhật 1 :");
        rect1.display();

        Rectangle rect2 = new Rectangle(5, 10);
        System.out.println("\nHình chữ nhật 2 :");
        rect2.display();
    }
}

class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public void display() {
        System.out.println("Dài: " + length);
        System.out.println("Rộng: " + width);
        System.out.println("Diện tích: " + getArea());
        System.out.println("Chu vi: " + getPerimeter());
    }
}