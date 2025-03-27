package b04;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate birthDate ;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        LocalDate now = LocalDate.now();
        Period age = Period.between(birthDate, now);
        return age.getYears();
    }

    public void printInfo(){
        System.out.println("Ten: "+ name + "   Ngay sinh: " + birthDate + "   Tuoi: " + getAge());
    }
}
