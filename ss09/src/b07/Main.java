package b07;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation equation1 = new QuadraticEquation(1, -3, 2);
        QuadraticEquation equation2 = new QuadraticEquation(1, 2, 1);
        QuadraticEquation equation3 = new QuadraticEquation(1, 1, 1);

        System.out.println("pt 1:");
        equation1.display();

        System.out.println("\npt 2:");
        equation2.display();

        System.out.println("\npt 3:");
        equation3.display();
    }
}
