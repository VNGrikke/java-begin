package b02;

public class AnimalFactory {
    public static Animal getAnimal(String type) {
        if (type.equalsIgnoreCase("CAT")) {
            return new Cat();
        }else if (type.equalsIgnoreCase("DOG")) {
            return new Dog();
        }else {
            throw new IllegalArgumentException("Dau vao khong hop le");
        }
    }
}
