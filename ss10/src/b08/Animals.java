package b08;

public class Animals {
    protected String name;
    protected int age;

    public Animals(String name, int age) {
        if (isValidName(name) && isValidAge(age)) {
            this.name = name;
            this.age = age;
        } else {
            System.out.println("Dữ liệu không hợp lệ. Không thể tạo đối tượng Animals.");
        }
    }

    private boolean isValidName(String name) {
        return name != null && !name.trim().isEmpty();
    }

    private boolean isValidAge(int age) {
        return age >= 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (isValidName(name)) {
            this.name = name;
        } else {
            System.out.println("Tên không hợp lệ.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (isValidAge(age)) {
            this.age = age;
        } else {
            System.out.println("Tuổi không hợp lệ.");
        }
    }

    public void displayInfo() {
        System.out.println("Tên: " + name + ", Tuổi: " + age);
    }

    public String makeSound() {
        return "Some generic sound";
    }
}
