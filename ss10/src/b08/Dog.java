package b08;

public class Dog extends Animals {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        if (isValidBreed(breed)) {
            this.breed = breed;
        } else {
            System.out.println("Giống chó không hợp lệ.");
        }
    }

    private boolean isValidBreed(String breed) {
        return breed != null && !breed.trim().isEmpty();
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (isValidBreed(breed)) {
            this.breed = breed;
        } else {
            System.out.println("Giống chó không hợp lệ.");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Gọi phương thức của lớp cha
        System.out.println("Giống chó: " + breed);
    }

    @Override
    public String makeSound() {
        return "Gâu Gâu";
    }
}