package b08;

public class Main {
    public static void main(String[] args) {
        Animals[] animals = new Animals[4];
        animals[0] = new Dog("Vy", 3, "Golden Retriever");
        animals[1] = new Cat("Son", 2, "Gray");
        animals[2] = new Dog("Quang", 5, "German Shepherd");
        animals[3] = new Cat("Hien", 1, "White");

        for (Animals animal : animals) {
            animal.displayInfo();
            System.out.println("Âm thanh: " + animal.makeSound());
            System.out.println("-----------------------------");
        }
    }
}
