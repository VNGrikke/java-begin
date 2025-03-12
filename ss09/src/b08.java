public class b08 {
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

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Đã nạp " + amount + " vào tài khoản " + accountNumber);
        } else {
            System.out.println("Số tiền nạp không hợp lệ.");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Số dư không đủ trong tài khoản " + accountNumber);
        } else {
            balance -= amount;
            System.out.println("Đã rút " + amount + " từ tài khoản " + accountNumber);
        }
    }

    public void transfer(BankAccount recipient, double amount) {
        if (amount > balance) {
            System.out.println("Số dư không đủ trong tài khoản " + accountNumber + " để chuyển tiền.");
        } else {
            this.withdraw(amount);
            recipient.deposit(amount);
            System.out.println("Đã chuyển " + amount + " từ tài khoản " + accountNumber + " sang tài khoản " + recipient.accountNumber);
        }
    }

    public void display() {
        System.out.println("Số tài khoản: " + accountNumber);
        System.out.println("Chủ tài khoản: " + accountHolder);
        System.out.println("Số dư: " + balance);
    }
}