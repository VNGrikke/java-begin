package b03;

public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        System.out.println("Hình chữ nhật 1 :");
        rect1.display();

        Rectangle rect2 = new Rectangle(5, 10);
        System.out.println("\nHình chữ nhật 2 :");
        rect2.display();
    }
}
