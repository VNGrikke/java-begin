import java.util.Scanner;

public class b06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int math, physical, english;
        System.out.printf("nhap ten: ");
        name = sc.nextLine();
        System.out.printf("nhap diem toan ly anh: ");
        math = sc.nextInt();
        physical = sc.nextInt();
        english = sc.nextInt();

        float avg = (math + physical + english) / 3;
        String rank;

        rank = avg < 5? "yeu" : avg < 6.5? "trung binh" : avg < 8? "kha" : "gioi";

        System.out.printf("Hoc sinh %s \ndiem trung binh: %.2f \nxep loai: %s", name, avg, rank);
    }
}
