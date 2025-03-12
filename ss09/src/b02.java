public class b02 {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Nguyễn Văn Vương", "dev", 50000);
        emp.displayInfo();
        emp.increaseSalary(10);
        System.out.println("Lương sau khi tăng: " + emp.getSalary());
    }
}

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        this.salary = this.salary * (1 + percentage / 100);
    }
}