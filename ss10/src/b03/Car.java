package b03;

public class Car {
    private String make;
    private String model;
    private int year;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        int currentYear = java.time.Year.now().getValue();
        if (year > 0 && year <= currentYear) {
            this.year = year;
        } else {
            System.out.println("Năm sản xuất không hợp lệ. Vui lòng nhập năm từ 1 đến " + currentYear + ".");
        }
    }
}
