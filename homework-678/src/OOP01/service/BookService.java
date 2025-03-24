package OOP01.service;

import OOP01.enity.Book;
import java.util.List;

public interface BookService {
    void addBooks(int n);
    void displayBooks();
    void sortByExportPrice();
    void sortByInterest();
    Book findBookByName(String name);
    void statisticsByYear();
    void statisticsByAuthor();
}
