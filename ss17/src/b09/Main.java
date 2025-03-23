package b09;
import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Library library = new Library();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMENU");
            System.out.println("1. Danh sach sach co trong thu vien");
            System.out.println("2. Them sach");
            System.out.println("3. Tim kiem sach theo nam");
            System.out.println("4. Sap xep sach theo ten");
            System.out.println("5. Thoat");
            System.out.print("Nhap lua chon: ");

            switch (scanner.nextInt()) {
                case 1:
                    displayBooks();
                    break;
                case 2 :
                    addBook();
                    break;
                case 3 :
                    filterBooksByYear();
                    break;
                case 4 :
                    sortBooksByTitle();
                    break;
                case 5 :
                    exitProgram();
                    break;
                default:
                    System.out.println("Lua chon khong hop le!!!!.");
            }
        }
    }

    private static void displayBooks() {
        if (library.getBooks().isEmpty()) {
            System.out.println("Khong co sach");
            return;
        }
        System.out.println("*-----------------------------------------------------------------*");
        System.out.println("| Ma sach | Ten sach             | Ten tac gia     | Nam |"  );
        System.out.println("*-----------------------------------------------------------------*");

        library.displayBooks(new ArrayList<>(library.getBooks()));
        System.out.println("*-----------------------------------------------------------------*");

    }

    private static void addBook() {
        scanner.nextLine();
        System.out.print("Nhap ma sach: ");
        String id = scanner.nextLine();
        System.out.print("Nhap ten sach: ");
        String title = scanner.nextLine();
        System.out.print("Nhap ten tac gia: ");
        String author = scanner.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        int year = scanner.nextInt();
        if (library.addBook(new Book(id, title, author, year))) {
            System.out.println("Them sach thanh cong.");
        } else {
            System.out.println("Ma sach da ton tai.");
        }
    }

    private static void filterBooksByYear() {
        System.out.print("Nhap so nam suat ban: ");
        int year = scanner.nextInt();
        List<Book> filteredBooks = library.filterBooksByYear(year);
        System.out.println("Sach xuat sau nam " + year + ":");
        library.displayBooks(filteredBooks);
    }

    private static void sortBooksByTitle() {
        List<Book> sortedBooks = library.getSortedBooksByTitle();
        library.displayBooks(sortedBooks);
    }

    private static void exitProgram() {
        System.out.println("Thoat");
        scanner.close();
        System.exit(0);
    }
}
