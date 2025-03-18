package Abtraction;

import java.util.Scanner;

public abstract class Person {
    private String name;
    private int age;
    private boolean gender;
    Scanner sc = new Scanner(System.in);
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Person(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void inputData(Scanner scanner){
        System.out.println("Ten: " + scanner.nextLine());


    }


    public abstract int addTwoNumbers(int a, int b);
    public abstract void Hello();

}
