package b07;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public boolean hasRealRoots() {
        return getDiscriminant() >= 0;
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b + Math.sqrt(delta)) / (2 * a);
        } else {
            return Double.NaN;
        }
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b - Math.sqrt(delta)) / (2 * a);
        } else {
            return Double.NaN;
        }
    }

    public void display() {
        if (hasRealRoots()) {
            if (getDiscriminant() == 0) {
                System.out.println("pt co 1 no: " + getRoot1());
            } else {
                System.out.println("pt co 2 no");
                System.out.println("x1: " + getRoot1());
                System.out.println("x2: " + getRoot2());
            }
        } else {
            System.out.println("pt vo no.");
        }
    }
}
