package b03;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Huyndai", 100);
        car.start();
        car.displayInfo();

        Vehicle bike = new Bike("Honda CB1000R", 100);
        bike.start();
        bike.displayInfo();
    }
}
