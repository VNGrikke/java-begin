package b09;

public class Product {
    private String name;
    private float price;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public Product() {}

    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }

    public void inputData(String inputName, float inputPrice) {
        name = inputName;
        price = inputPrice;
    }

    @Override
    public String toString() {
        return "| " + name + " | " + price + " |";
    }
}
