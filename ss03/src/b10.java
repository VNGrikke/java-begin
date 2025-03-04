import java.util.Scanner;

public class b10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c != 0) {
                    double x = -d / c;
                    System.out.printf("pt bac 1 x = %.2f", x);
                } else {
                    if (d == 0) {
                        System.out.println("Vo so nghiem");
                    } else {
                        System.out.println("Vo nghiem");
                    }
                }
            } else {
                double delta = b * b - 4 * b * c;
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
        } else {
            double p = (3 * a * c - b * b) / (3 * a * a);
            double q = (2 * b * b * b - 9 * a * b * c + 27 * a * a * d) / (27 * a * a * a);

            double delta = (q * q) / 4 + (p * p * p) / 27;

            if (delta > 0) {
                double u = Math.cbrt(-q / 2 + Math.sqrt(delta));
                double v = Math.cbrt(-q / 2 - Math.sqrt(delta));
                double x1 = u + v - (b / (3 * a));
                System.out.println("x1 = " + x1 + " 1 nghiem thuc duy nhat");
            } else if (delta == 0) {
                double u = Math.cbrt(-q / 2);
                double x = 2 * u - (b / (3 * a));
                System.out.println("x1 = " + x + " 2 nghiem trung nhau");
            } else {
                double r = Math.sqrt(-(p * p * p) / 27);
                double phi = Math.acos(-q / (2 * r));
                double x1 = 2 * Math.cbrt(r) * Math.cos(phi / 3) - (b / (3 * a));
                double x2 = 2 * Math.cbrt(r) * Math.cos((phi + 2 * Math.PI) / 3) - (b / (3 * a));
                double x3 = 2 * Math.cbrt(r) * Math.cos((phi + 4 * Math.PI) / 3) - (b / (3 * a));

                System.out.println("x1 = " + x1 + ", x2 = " + x2 + ", x3 = " + x3 + " 3 nghiem thuc");
            }
        }
    }
}