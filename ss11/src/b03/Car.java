package b03;

public class Car extends Vehicle {


    public Car(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void displayInfo() {
        System.out.println("tên xe: " + name);
        System.out.println("tốc độ: "+ speed);

    }
}
