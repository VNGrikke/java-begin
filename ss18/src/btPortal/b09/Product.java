package btPortal.b09;


public class Product {
    private String name;
    private float price;
    private int quantity;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product(String name, float price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "|" + name + "|" + price + "|" + quantity + "|";
    }

    public void updateProduct(float newPrice, int newQuantity, int type) {
        if (type == 1) {
            this.price = newPrice;
        }else if (type == 2) {
            this.quantity = newQuantity;
        }
    }

    public double sumPrice() {
        return this.price * this.quantity;
    }
}
