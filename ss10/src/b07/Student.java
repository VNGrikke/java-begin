package b07;

public class Student {
    private String name;
    private String id;
    private double gpa;

    public Student(String name, String id, double gpa) {
        if (isValidName(name) && isValidId(id) && isValidGpa(gpa)) {
            this.name = name;
            this.id = id;
            this.gpa = gpa;
        } else {
            System.out.println("Dữ liệu không hợp lệ. Không thể tạo đối tượng Student.");
        }
    }

    private boolean isValidName(String name) {
        return name != null && !name.trim().isEmpty();
    }

    private boolean isValidId(String id) {
        return id != null && !id.trim().isEmpty();
    }

    private boolean isValidGpa(double gpa) {
        return gpa >= 0.0 && gpa <= 4.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (isValidName(name)) {
            this.name = name;
        } else {
            System.out.println("Điểm trung bình không hợp lệ.");
        }
    }

    public String getDetails() {
        return "Tên: " + name + ", Mã SV: " + id + ", Điểm TB: " + gpa;
    }
}