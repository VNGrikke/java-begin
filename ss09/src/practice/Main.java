package practice;

import java.util.Scanner;

public class Main {
    private static Book[] bookList = new Book[1000];
    private static int bookCount = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("****************************MENU*************************");
            System.out.println("1. Danh sách sách");
            System.out.println("2. Thêm mới sách");
            System.out.println("3. Tính lợi nhuận của các sách");
            System.out.println("4. Cập nhật sách");
            System.out.println("5. Xóa sách");
            System.out.println("6. Sắp xếp sách theo lợi nhuận tăng dần");
            System.out.println("7. Tìm kiếm sách theo tác giả");
            System.out.println("8. Tìm kiếm sách theo khoảng giá");
            System.out.println("9. Thống kê sách theo mỗi tác giả");
            System.out.println("10. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    if (bookCount == 0) {
                        System.out.println("Hiện chưa có sách mời thêm mới sách");
                    }
                    for (int i = 0; i < bookCount; i++) {
                        bookList[i].displayData();
                        System.out.println("----------------------");
                    }
                    break;
                case 2:
                    if (bookCount < bookList.length) {
                        Book book = new Book();
                        book.inputData(scanner);
                        bookList[bookCount++] = book;
                        System.out.println("Thêm sách thành công!");
                    } else {
                        System.out.println("Danh sách sách đã đầy, không thể thêm mới.");
                    }
                    break;
                case 3:
                    for (int i = 0; i < bookCount; i++) {
                        bookList[i].calInterest();
                    }
                    System.out.println("Lợi nhuận của các sách đã được tính toán.");
                    break;
                case 4:
                    System.out.print("Nhập mã sách cần cập nhật: ");
                    String bookId = scanner.nextLine();
                    for (int i = 0; i < bookCount; i++) {
                        if (bookList[i].getBookId().equalsIgnoreCase(bookId)) {
                            bookList[i].inputData(scanner);
                            System.out.println("Cập nhật sách thành công!");
                            break;
                        }
                    }
                    System.out.println("Không tìm thấy sách với mã đã nhập.");
                    break;
                case 5:
                    System.out.print("Nhập mã sách cần xóa: ");
                    String deleteId = scanner.nextLine();
                    for (int i = 0; i < bookCount; i++) {
                        if (bookList[i].getBookId().equalsIgnoreCase(deleteId)) {
                            for (int j = i; j < bookCount - 1; j++) {
                                bookList[j] = bookList[j + 1];
                            }
                            bookCount--;
                            System.out.println("Xóa sách thành công!");
                            break;
                        }
                    }
                    break;
                case 6:
                    for (int i = 0; i < bookCount - 1; i++) {
                        for (int j = i + 1; j < bookCount; j++) {
                            if (bookList[i].getInterest() > bookList[j].getInterest()) {
                                Book temp = bookList[i];
                                bookList[i] = bookList[j];
                                bookList[j] = temp;
                            }
                        }
                    }
                    System.out.println("Sách đã được sắp xếp theo lợi nhuận tăng dần.");
                    break;
                case 7:
                    System.out.print("Nhập tên tác giả cần tìm: ");
                    String author = scanner.nextLine();
                    for (int i = 0; i < bookCount; i++) {
                        if (bookList[i].getAuthor().equalsIgnoreCase(author)) {
                            bookList[i].displayData();
                        }
                    }
                    break;
                case 8:
                    System.out.print("Nhập giá thấp nhất: ");
                    double minPrice = Double.parseDouble(scanner.nextLine());
                    System.out.print("Nhập giá cao nhất: ");
                    double maxPrice = Double.parseDouble(scanner.nextLine());
                    for (int i = 0; i < bookCount; i++) {
                        if (bookList[i].getExportPrice() >= minPrice && bookList[i].getExportPrice() <= maxPrice) {
                            bookList[i].displayData();
                        }
                    }
                    break;
                case 9:
                    String[] authors = new String[bookCount];
                    int[] counts = new int[bookCount];
                    int uniqueAuthorCount = 0;

                    for (int i = 0; i < bookCount; i++) {
                        String currentAuthor = bookList[i].getAuthor();
                        boolean found = false;
                        for (int j = 0; j < uniqueAuthorCount; j++) {
                            if (authors[j].equalsIgnoreCase(currentAuthor)) {
                                counts[j]++;
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            authors[uniqueAuthorCount] = currentAuthor;
                            counts[uniqueAuthorCount] = 1;
                            uniqueAuthorCount++;
                        }
                    }

                    for (int i = 0; i < uniqueAuthorCount; i++) {
                        System.out.println("Tác giả: " + authors[i] + " - Số lượng sách: " + counts[i]);
                    }
                    break;
                case 10:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại.");
            }
        } while (choice != 10);
    }
}
