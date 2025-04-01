package b21.b09;

public class BankException extends RuntimeException {

    public BankException() {
      super();
    }

    public BankException(String message) {
        super(message);
    }

    public void deposit (double amount) {
        if (amount <= 0) {
            throw new BankException("So tien khong duoc nho hon 0");
        }else if (amount > 0) {

        }
    }
}
