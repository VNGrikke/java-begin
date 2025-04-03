package b03;

public class Main {
    public static void main(String[] args){
        Car car1 = new Car.CarBuilder().setColor("Black").setEngine("electric").setSeats(4).build();
        Car car2 = new Car.CarBuilder().setColor("Red").setEngine("diesel").setSeats(9).build();

        car1.displayInfo();
        car2.displayInfo();
    }
}
