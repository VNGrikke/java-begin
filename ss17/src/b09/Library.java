package b09;
import java.util.*;

public class Library {
    private final Set<Book> books;

    public Library() {
        this.books = new HashSet<>();
    }

    public boolean addBook(Book book) {
        return books.add(book);
    }

    public List<Book> filterBooksByYear(int year) {
        List<Book> filteredBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() > year) {
                filteredBooks.add(book);
            }
        }
        return filteredBooks;
    }

    public List<Book> getSortedBooksByTitle() {
        List<Book> sortedBooks = new ArrayList<>(books);
        Collections.sort(sortedBooks, Comparator.comparing(Book::getTitle));
        return sortedBooks;
    }

    public void displayBooks(Collection<Book> bookList) {
        if (bookList.isEmpty()) {
            System.out.println("Danh sách trống.");
        } else {
            for (Book book : bookList) {
                System.out.println(book);
            }
        }
    }

    public Set<Book> getBooks() {
        return books;
    }
}
