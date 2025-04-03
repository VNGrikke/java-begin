package b03;

public class Car {
    private String engine;
    private int seats;
    private String color;

    public Car(CarBuilder carBuilder) {
        this.engine = carBuilder.engine;
        this.seats = carBuilder.seats;
        this.color = carBuilder.color;
    }

    public void displayInfo(){
        System.out.println(this.engine + " - " + this.seats + " - " + this.color);
    }

    public static class CarBuilder{
        private String engine;
        private int seats;
        private String color;


        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }
        public Car build(){
            return new Car(this);
        }
    }


}
