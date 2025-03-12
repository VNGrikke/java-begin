package b04;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Tam giác 1:");
        circle1.display();

        Circle circle2 = new Circle(5.0);
        System.out.println("\nTam giác 2:");
        circle2.display();
    }
}
