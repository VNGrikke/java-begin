package b08;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("015112005", "Nguyen Van Vuong", 800.0);
        BankAccount account2 = new BankAccount("017092005", "Tran Thi Mai", 500.0);

        System.out.println("Thông tin tài khoản ban đầu:");
        account1.display();
        account2.display();

        account1.deposit(200.0);
        System.out.println("\nSau khi nạp 200 vào tài khoản 1:");
        account1.display();

        account2.withdraw(100.0);
        System.out.println("\nSau khi rút 100 từ tài khoản 2:");
        account2.display();

        account1.transfer(account2, 300.0);
        System.out.println("\nSau khi chuyển 300 từ tài khoản 1 sang tài khoản 2:");
        account1.display();
        account2.display();
    }
}
