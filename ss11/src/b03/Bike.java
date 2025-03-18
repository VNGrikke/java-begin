package b03;

public class Bike extends Vehicle {


    public Bike(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void displayInfo() {
        System.out.println("tên xe: " + name);
        System.out.println("tốc độ: "+ speed);

    }
}
