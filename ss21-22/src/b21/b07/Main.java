package b21.b07;

import java.util.Scanner;

public class Main {
    static float balance = 500000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhap so tien muon rut");

            float money = Float.parseFloat(sc.nextLine());
            tranferMoney(money);
            System.out.println("So du tai khoan: " + balance);
        }catch (NumberFormatException e) {
            throw new NumberFormatException("Vui long nhap so tien hop le");
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void tranferMoney (float money) throws bankException {
        if (balance - money < 50000) {
            throw new bankException("tai khoan phai duy tri so du 50000");
        }

        if (money > balance) {
            throw new bankException("So du khong du");
        }else if (money <= balance) {
            balance -= money;
            System.out.println("tk -" + money);
        }
    }
}
