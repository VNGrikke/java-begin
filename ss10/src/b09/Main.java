package b09;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Nguyễn Văn A", "E001", 10000000);
        System.out.println("Thông tin nhân viên:");
        System.out.println(employee.toString());
        System.out.println("Lương nhân viên: " + employee.getSalary());

        Manager manager = new Manager("Trần Thị B", "M001", 15000000, 5000000);
        System.out.println("\nThông tin quản lý:");
        System.out.println(manager.toString());
        System.out.println("Lương quản lý: " + manager.getSalary());

        Developer developer = new Developer("Lê Văn C", "D001", 12000000, "Java");
        System.out.println("\nThông tin lập trình viên:");
        System.out.println(developer.toString());
        System.out.println("Lương lập trình viên: " + developer.getSalary());

        employee.increaseSalary(2000000);
        System.out.println("\nThông tin nhân viên sau khi tăng lương:");
        System.out.println(employee.toString());
        System.out.println("Lương nhân viên sau khi tăng: " + employee.getSalary());
    }
}
