package practice;

import java.util.Scanner;

public class Book {
    private String bookId;
    private String bookName;
    private double importPrice;
    private double exportPrice;
    private String title;
    private String author;
    private double interest;
    private int year;

    public Book() {}

    public Book(String bookId, String bookName, double importPrice, double exportPrice, String title, String author, int year) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.title = title;
        this.author = author;
        this.year = year;
        this.calInterest();
    }

    public String getBookId() {
        return bookId;
    }
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getImportPrice() {
        return importPrice;
    }
    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
    }

    public double getExportPrice() {
        return exportPrice;
    }
    public void setExportPrice(double exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public double getInterest() {
        return interest;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void calInterest() {
        this.interest = this.exportPrice - this.importPrice;
    }

    public void inputData(Scanner scanner) {
        while (true) {
            System.out.print("Nhập mã sách (Bxxxx): ");
            String input = scanner.nextLine();
            if (isValidBookId(input)) {
                this.bookId = input;
                break;
            } else {
                System.out.println("Mã sách không hợp lệ! Vui lòng nhập lại theo định dạng Bxxxx (x là số).");
            }
        }
        System.out.print("Nhập tên sách: ");
        this.bookName = scanner.nextLine();

        System.out.print("Nhập giá nhập: ");
        this.importPrice = Double.parseDouble(scanner.nextLine());

        do {
            System.out.print("Nhập giá bán: ");
            this.exportPrice = Double.parseDouble(scanner.nextLine());
            if (this.exportPrice < this.importPrice * 1.1) {
                System.out.println("Giá bán phải cao hơn giá nhập ít nhất 10%. Vui lòng nhập lại!");
            }
        } while (this.exportPrice < this.importPrice * 1.1);

        System.out.print("Nhập tiêu đề: ");
        this.title = scanner.nextLine();

        System.out.print("Nhập tác giả: ");
        this.author = scanner.nextLine();
        int currentYear = java.time.Year.now().getValue();

        do {
            System.out.print("Nhập năm xuất bản (sau 1970 và không quá năm hiện tại): ");
            this.year = Integer.parseInt(scanner.nextLine());
            if (this.year < 1970 || this.year > currentYear) {
                System.out.println("Năm xuất bản không hợp lệ. Vui lòng nhập lại!");
            }
        } while (this.year < 1970 || this.year > currentYear);

        calInterest();
    }

    public void displayData() {
        System.out.println("Mã sách: " + bookId);
        System.out.println("Tên sách: " + bookName);
        System.out.println("Giá nhập: " + importPrice);
        System.out.println("Giá bán: " + exportPrice);
        System.out.println("Lợi nhuận: " + interest);
        System.out.println("Tiêu đề: " + title);
        System.out.println("Tác giả: " + author);
        System.out.println("Năm xuất bản: " + year);
    }

    private boolean isValidBookId(String bookId) {
        String regex = "^B\\d{4}$";
        return bookId.matches(regex);
    }
}
