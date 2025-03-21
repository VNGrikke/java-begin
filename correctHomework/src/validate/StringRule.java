package validate;

public class StringRule {
    private final int minLength;
    private final int maxLength;

    public StringRule(int minLength, int maxLength) {
        this.minLength = minLength;
        this.maxLength = maxLength;
    }
    public boolean isValid(String value) {
        if (value == null || value.isEmpty()) {
            return false;
        }

        return value.length() <= this.maxLength && value.length() >= this.minLength;
    }
}
