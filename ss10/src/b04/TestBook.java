package b04;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book();

        book.setTitle("Kẻ điên bên trái, ...");
        book.setAuthor("Vương");
        book.setPrice(120000);

        System.out.println("Tên sách: " + book.getTitle());
        System.out.println("Tác giả: " + book.getAuthor());
        System.out.println("Giá sách: " + book.getPrice() + " VND");

        book.setPrice(-50000);
        System.out.println("Giá sách sau khi thử thiết lập không hợp lệ: " + book.getPrice() + " VND"); // Giá không thay đổi
    }
}
