package b03;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car();

        car.setMake("Toyota");
        car.setModel("Corolla");
        car.setYear(2020);

        System.out.println("Thương hiệu: " + car.getMake());
        System.out.println("Mẫu xe: " + car.getModel());
        System.out.println("Năm sản xuất: " + car.getYear());

        car.setYear(2025);
        System.out.println("Năm sản xuất sau khi thử thiết lập không hợp lệ: " + car.getYear());
    }
}
