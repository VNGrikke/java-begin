package b21.b08;

public class InvalidPhoneNumberLengthException extends RuntimeException {
    public InvalidPhoneNumberLengthException() {
        super();
    }

    public InvalidPhoneNumberLengthException(String message) {
        super(message);
    }

    public static String validatePhoneNumber(String phone) {
        if (phone.length() != 10) {
            throw new InvalidPhoneNumberLengthException("Do dai khong hop le");
        }

        if (phone.charAt(0) != '0') {
            throw new InvalidPhoneNumberLengthException("Phai bat dau bang so 0");
        }

        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                throw new InvalidPhoneNumberLengthException("Chua ki tu khong hop le");
            }
        }

        return "-";
    }

    @Override
    public String toString() {
        return "Lỗi: " + getMessage();
    }
}