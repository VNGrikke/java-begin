package b02;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Nguyễn Văn Vương", "dev", 5000);
        emp.displayInfo();
        emp.increaseSalary(10);
        System.out.println("Lương sau khi tăng: " + emp.getSalary());
    }
}
