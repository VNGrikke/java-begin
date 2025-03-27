package b07;

public class Employee {
    private String name;
    private int age;
    private String department;
    private double salary;

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public Employee(String name,  int age, String department, double salary) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.department = department;
    }


}
