package b03;

import java.util.Optional;

public class User {
    private String name;
    private Optional<String> phoneNumber;

    public String getName() {
        return name;
    }

    public Optional<String> getPhoneNumber() {
        return phoneNumber;
    }

    public User(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = Optional.ofNullable(phoneNumber);
    }

    public void printInfo(){
        System.out.println("Ten : "+name+"    SDT: "+phoneNumber.orElse("Khong co"));
    }

}
