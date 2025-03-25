import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Student> students = new HashMap<>();
        do {
            System.out.println("*********MENU*********");
            System.out.println("1. Danh sach sv");
            System.out.println("2. Them sv");
            System.out.println("3. Xoa sinh vien theo id");
            System.out.println("4. Tinh diem trung binh cac sv");
            System.out.println("5. Sinh vien co diem tb cao nhat");
            System.out.println("6. Sinh vien co tuoi nho nhat");
            System.out.println("7. Thoat");

            System.out.println("Nhap lua chon");

            switch (sc.nextInt()) {
                case 1:
                    if (students.size() == 0) {
                        System.out.println("Danh sach rong");
                    }else {
                        System.out.println("Danh sach sv(masv|ten|tuoi|diemtb)");
                        for ( String key : students.keySet()) {
                            System.out.println("| " +key + " | " + students.get(key).toString());
                        }
                    }
                break;

                case 2:
                    System.out.println("Nhap so luong sv them moi");
                    int n = sc.nextInt();
                    for ( int i = 0; i < n; i++ ) {
                        do {
                            System.out.println("Nhap ma sv");
                            String IdStd = sc.next().toUpperCase().trim();
                            if (students.containsKey(IdStd)) {
                                System.out.println("ma sv da ton tai. Nhap lai");
                            }else {
                                System.out.println("Nhap ten");
                                String name = sc.next();
                                System.out.println("Nhap tuoi");
                                int age = sc.nextInt();
                                System.out.println("Nhap diem tb");
                                float avgScore = sc.nextFloat();

                                students.put(IdStd, new Student(name, age, avgScore));
                                break;
                            }
                        }while (true);
                    }
                break;

                case 3:
                    System.out.println("NHap ma sv can xoa");
                    String inputId = sc.next().toUpperCase().trim();
                    if (students.containsKey(inputId)) {
                        students.remove(inputId);
                        System.out.println("Xoa thanh cong");
                    }else{
                        System.out.println("ma sv khong ton tai");
                    }
                break;

                case 4:
                    float totalAvgScore = 0;
                    for ( String key : students.keySet()) {
                        totalAvgScore += students.get(key).getAvgScore();
                    }
                    System.out.println("Diem tb cua tat ca sv: " + totalAvgScore);
                break;

                case 5:
                    List<Map.Entry<String,Student>> newStudents = new ArrayList<>(students.entrySet());

                    newStudents.sort(Map.Entry.comparingByValue(stu));



                break;

                case 6:

                break;

                case 7:
                    return;

                default:
                    System.out.println("sai cu phap");

            }

        }while (true);
    }
}