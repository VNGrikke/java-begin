package OOP01.enity;

import OOP01.validator.Validator;
import java.util.Scanner;

public class Book {
    private String bookId;
    private String bookName;
    private float importPrice;
    private float exportPrice;
    private String author;
    private float interest;
    private int year;

    public Book() {}

    public Book(String bookId, String bookName, float importPrice, float exportPrice, String author, int year) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.author = author;
        this.year = year;
        calculateInterest();
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        this.bookId = getValidInput(scanner, "Nhập mã sách: ", Validator::isValidBookId);
        this.bookName = getValidInput(scanner, "Nhập tên sách: ", Validator::isValidBookName);
        this.importPrice = getValidFloat(scanner, "Nhập giá nhập: ", Validator::isValidImportPrice);
        this.exportPrice = getValidFloat(scanner, "Nhập giá xuất: ", price -> Validator.isValidExportPrice(importPrice, price));
        this.author = getValidInput(scanner, "Nhập tên tác giả: ", Validator::isValidAuthor);
        this.year = getValidInt(scanner, "Nhập năm xuất bản: ", Validator::isValidYear);
        calculateInterest();
    }

    private String getValidInput(Scanner scanner, String message, Validator.StringValidator validator) {
        String input;
        do {
            System.out.print(message);
            input = scanner.nextLine();
        } while (!validator.validate(input));
        return input;
    }

    private float getValidFloat(Scanner scanner, String message, Validator.FloatValidator validator) {
        float input;
        do {
            System.out.print(message);
            input = Float.parseFloat(scanner.nextLine());
        } while (!validator.validate(input));
        return input;
    }

    private int getValidInt(Scanner scanner, String message, Validator.IntValidator validator) {
        int input;
        do {
            System.out.print(message);
            input = Integer.parseInt(scanner.nextLine());
        } while (!validator.validate(input));
        return input;
    }

    public void calculateInterest() {
        this.interest = exportPrice - importPrice;
    }

    public void displayData() {
        System.out.printf("Mã sách: %s | Tên sách: %s | Giá nhập: %.2f | Giá xuất: %.2f | Tác giả: %s | Lợi nhuận: %.2f | Năm xuất bản: %d%n",
                bookId, bookName, importPrice, exportPrice, author, interest, year);
    }

    public String getBookId() { return bookId; }
    public String getBookName() { return bookName; }
    public float getImportPrice() { return importPrice; }
    public float getExportPrice() { return exportPrice; }
    public String getAuthor() { return author; }
    public float getInterest() { return interest; }
    public int getYear() { return year; }
}
