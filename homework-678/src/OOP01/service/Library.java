package OOP01.service;

import OOP01.enity.Book;
import java.util.*;

public class Library implements BookService {
    private final List<Book> bookList = new ArrayList<>();

    @Override
    public void addBooks(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sách thứ " + (i + 1) + ":");
            Book book = new Book();
            book.inputData();
            bookList.add(book);
        }
    }

    @Override
    public void displayBooks() {
        if (bookList.isEmpty()) {
            System.out.println("Danh sách sách trống!");
            return;
        }
        for (Book book : bookList) {
            book.displayData();
        }
    }

    @Override
    public void sortByExportPrice() {
        bookList.sort(Comparator.comparingDouble(Book::getExportPrice));
    }

    @Override
    public void sortByInterest() {
        bookList.sort((b1, b2) -> Float.compare(b2.getInterest(), b1.getInterest()));
    }

    @Override
    public Book findBookByName(String name) {
        for (Book book : bookList) {
            if (book.getBookName().equalsIgnoreCase(name)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public void statisticsByYear() {
        Map<Integer, Integer> yearCount = new HashMap<>();
        for (Book book : bookList) {
            yearCount.put(book.getYear(), yearCount.getOrDefault(book.getYear(), 0) + 1);
        }
        yearCount.forEach((year, count) -> System.out.println("Năm " + year + ": " + count + " sách"));
    }

    @Override
    public void statisticsByAuthor() {
        Map<String, Integer> authorCount = new HashMap<>();
        for (Book book : bookList) {
            authorCount.put(book.getAuthor(), authorCount.getOrDefault(book.getAuthor(), 0) + 1);
        }
        authorCount.forEach((author, count) -> System.out.println("Tác giả " + author + ": " + count + " sách"));
    }
}
