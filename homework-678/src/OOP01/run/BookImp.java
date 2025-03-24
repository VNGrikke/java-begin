package OOP01.run;

import OOP01.service.BookService;
import OOP01.service.Library;
import java.util.Scanner;

public class BookImp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookService bookService = new Library();

        while (true) {
            System.out.println("\n******** MENU ********");
            System.out.println("1. Nhập thông tin sách");
            System.out.println("2. Hiển thị danh sách sách");
            System.out.println("3. Sắp xếp theo giá xuất tăng dần");
            System.out.println("4. Sắp xếp theo lợi nhuận giảm dần");
            System.out.println("5. Tìm sách theo tên");
            System.out.println("6. Thống kê sách theo năm");
            System.out.println("7. Thống kê sách theo tác giả");
            System.out.println("8. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = getIntInput(scanner);

            switch (choice) {
                case 1 :
                    System.out.print("Nhập số lượng sách cần thêm: ");
                    int numberOfBooks = getIntInput(scanner);
                    bookService.addBooks(numberOfBooks);
                break;

                case 2 :
                    bookService.displayBooks();
                break;

                case 3 :
                    bookService.sortByExportPrice();
                    System.out.println("Sách đã được sắp xếp theo giá xuất tăng dần.");
                break;

                case 4 :
                    bookService.sortByInterest();
                    System.out.println("Sách đã được sắp xếp theo lợi nhuận giảm dần.");
                break;

                case 5 :
                    System.out.print("Nhập tên sách cần tìm: ");
                    String bookName = scanner.nextLine();
                    System.out.println(bookService.findBookByName(bookName));
                break;

                case 6 :
                    bookService.statisticsByYear();
                break;

                case 7 :
                    bookService.statisticsByAuthor();
                break;

                case 8 :
                    System.out.println("Thoát chương trình...");
                    System.exit(0);
                break;

                default :
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
            }
        }
    }

    private static int getIntInput(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Dữ liệu không hợp lệ! Vui lòng nhập số: ");
            }
        }
    }
}
