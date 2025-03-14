package b08;

public class Cat extends Animals {
    private String furColor;

    public Cat(String name, int age, String furColor) {
        super(name, age);
        if (isValidFurColor(furColor)) {
            this.furColor = furColor;
        } else {
            System.out.println("Màu lông không hợp lệ.");
        }
    }

    private boolean isValidFurColor(String furColor) {
        return furColor != null && !furColor.trim().isEmpty();
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        if (isValidFurColor(furColor)) {
            this.furColor = furColor;
        } else {
            System.out.println("Màu lông không hợp lệ.");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Gọi phương thức của lớp cha
        System.out.println("Màu lông: " + furColor);
    }

    @Override
    public String makeSound() {
        return "Meo Meo";
    }
}