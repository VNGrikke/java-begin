package b21.b09;

import java.util.Scanner;

public class Main {
    static BankAccount account1 = new BankAccount("AC001", 50000);
    static BankAccount account2 = new BankAccount("AC002", 40000);
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("Nhap lua chon");
            System.out.println("1. Gui tien");
            System.out.println("2. Rut tien");
            System.out.println("3. Chuyen tien");

            switch (sc.nextInt()) {
                case 1:
            }

        }while (true);
    }
    public static void depositMoney(double amount) throws BankException {
        System.out.println("Nhap so tien gui vao tk");
        try {
            double getMoney = Double.parseDouble(String.valueOf(sc.nextDouble()));

        } catch (NumberFormatException e) {
            System.out.println("Chua ki tu khong hop le");
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }

    }
}
