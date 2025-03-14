package b07;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("Nguyễn Văn A", "SV001", 3.5);
        students[1] = new Student("Trần Thị B", "SV002", 3.8);
        students[2] = new GraduateStudent("Lê Văn C", "SV003", 3.9, "AI trong chăm sóc sức khỏe", "TS. Nguyễn Tiến D");
        students[3] = new GraduateStudent("Phạm Thị E", "SV004", 4.0, "Công nghệ chuỗi khối", "TS. Trần Thị F");

        for (Student student : students) {
            System.out.println(student.getDetails());
        }
    }
}
