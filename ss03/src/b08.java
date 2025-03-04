import java.util.Scanner;

public class b08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a == 0) {
            if (b != 0) {
                double x = -c / b;
                System.out.printf("pt bac 1 x = %.2f", x);
            } else {
                if (c == 0) {
                    System.out.println("Vo so nghiem");
                } else {
                    System.out.println("Vo nghiem");
                }
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("x1 = %.2f ,x2 = %.2f(2 nghiem phan biet)", x1, x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.printf("x = %.2f (nghiem kep)", x);
            } else {
                System.out.println("Vo nghiem");
            }
        }
    }
}