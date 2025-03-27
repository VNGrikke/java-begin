package entity;

import java.util.Optional;
import java.util.Scanner;

public class Customer implements IApp {
    public static  int countId = 0;
    private int id;
    private String name;
    private Optional<String> email;

    public Customer() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<String> getEmail() {
        return email;
    }

    public void setEmail(Optional<String> email) {
        this.email = email;
    }

    public Customer(int id, String name, Optional<String> email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public Order inputData(Scanner scanner) {
        do {
            System.out.println("Nhap ten khach hang");
            name = scanner.nextLine();
            if (name == null || name.isEmpty() ) {
                System.out.println("khong dc de trong");
                break;
            }
            System.out.println("Nhap mail khach hang(co the de trong)");
            email = Optional.ofNullable(scanner.nextLine());

            break;
        }while (true);
        id = ++countId;


        return null;
    }

    @Override
    public String toString() {
        return "| " + id + " | " + name + " | " + email.of("Khong co email") + " |\n";
    }
}
