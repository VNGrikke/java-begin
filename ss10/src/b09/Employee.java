package b09;

public class Employee {
    private String name;
    private String id;
    private double salary;

    public Employee() {}

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double amount) {
        if (amount > 0) {
            this.salary += amount;
        } else {
            System.out.println("Số tiền tăng lương phải lớn hơn 0.");
        }
    }

    @Override
    public String toString() {
        return "Tên: " + name + ", Mã số: " + id + ", Lương: " + salary;
    }
}
