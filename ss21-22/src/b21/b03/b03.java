package b21.b03;

import java.util.Scanner;

public class b03 {
    public static void main(String[] args) throws ageException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tuoi");
        int age = Integer.parseInt(sc.nextLine());

        System.out.println(checkAge(age));
    }

    public static String checkAge(int age)  throws ageException {
        if (age < 18) {
            throw new ageException("Ban deo co tuoi");
        }
        return "Chao mung ban";
    }
}
