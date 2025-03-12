package b08;

public class BankAccount {
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
