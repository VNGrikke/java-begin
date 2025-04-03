package b02;

public class Main {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.getAnimal("Cat");
        dog.speak();
        Animal cat = AnimalFactory.getAnimal("Dog");
        cat.speak();

    }
}
