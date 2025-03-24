package OOP01.validator;

import java.util.HashSet;
import java.util.Set;

public class Validator {
    private static final Set<String> bookIds = new HashSet<>();
    private static final Set<String> bookNames = new HashSet<>();

    public static boolean isValidBookId(String bookId) {
        return bookId != null && !bookId.trim().isEmpty() && bookIds.add(bookId);
    }

    public static boolean isValidBookName(String bookName) {
        return bookName != null && bookName.length() == 4 && bookName.startsWith("B") && bookNames.add(bookName);
    }

    public static boolean isValidImportPrice(float importPrice) {
        return importPrice > 0;
    }

    public static boolean isValidExportPrice(float importPrice, float exportPrice) {
        return exportPrice >= importPrice * 1.3f;
    }

    public static boolean isValidAuthor(String author) {
        return author.length() >= 6 && author.length() <= 50;
    }

    public static boolean isValidYear(int year) {
        return year > 2000;
    }

    @FunctionalInterface
    public interface StringValidator { boolean validate(String input); }

    @FunctionalInterface
    public interface FloatValidator { boolean validate(float input); }

    @FunctionalInterface
    public interface IntValidator { boolean validate(int input); }
}
