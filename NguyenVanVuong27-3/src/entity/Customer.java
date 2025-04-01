package entity;

import java.util.Optional;
import java.util.Scanner;

public class Customer implements IApp {
    public static  int countId = 0;
    private int id;
    private String name;
    private Optional<String> email;

    public Customer() {
        id = ++countId;
    }

    public int getId() {
        return id;
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
    public void inputData(Scanner scanner) {
        do {
            System.out.println("Nhap ten khach hang");
            name = scanner.nextLine();
            if (name == null || name.isEmpty() ) {
                System.out.println("khong dc de trong");
                break;
            }
            System.out.println("Nhap mail khach hang(co the de trong)");
            String mail = scanner.nextLine();
            email = mail.isEmpty() ? Optional.empty() : Optional.of(mail);

            break;
        }while (true);
        id = ++countId;
    }

    @Override
    public String toString() {
        return "| " + id + " | " + name + " | " + email.orElse("Khong co email") + " |\n";
    }
}
