package b01;

public class Main {
    public static void main(String[] args) {
        Account ac1 = Account.getInstance();

        ac1.setName("John");
        ac1.setAge(23);
        ac1.setId(1);
        System.out.println(ac1.getId());

        Account ac2 = Account.getInstance();
        System.out.println(ac2.getId());
    }
}










/*
* 1. Định nghĩa Singleton
* Singleton là 1 mẫu thiết kế (design pattern) nhằm đảm bảo:
*   - chỉ có 1 thể diện duy nhất của 1 lớp được tạo ra trong suốt quá trình chạy của chương trình
*   - cung cấp 1 điểm truy cập toàn cục để truy cập thể diện đó
* (thể diện chỉ một đối tượng đối tượng duy nhất được tạo từ 1 lớp trong lập trình)
*
* 2. Cách hoạt động của Singleton
*   - sử dụng biến tĩnh(static): private static Singleton instance; để lưu giữ thể diện duy nhất của lớp
*   - ẩn contructor: đặt contructor là private để ngăn việc tạo đối tượng bên ngoài bằng từ khóa new
*   - cung cấp phương thức getInstance(): đây là cách duy nhất để truy cập thể diện của lớp đó. nó kiểm tra xem thể diện đã tồn tại chưa
*      + nếu chưa tồn tại -> tạo 1 thể diện mới
*      + nếu đã tồn tại -> trả về thể diện hiện tại
* */