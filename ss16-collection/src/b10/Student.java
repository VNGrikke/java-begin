package b10;

public class Student {
    private String id;
    private String name;
    private double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }


    public String rateGPA() {
        if (gpa >= 8.5) {
            return "Xuat xac";
        }
        if (gpa >= 7.0){
            return "Gioi";
        }
        if (gpa >= 5.5){
            return "Kha";
        }
        return "Trung binh/Yeu";
    }

    @Override
    public String toString() {
        return "id: " + id + ", Ten: " + name + ", gpa: " + gpa + ", danh gia: " + rateGPA();
    }

}
