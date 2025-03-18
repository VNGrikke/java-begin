package polymorphism;

public class Story extends Book {
//    OVERIDING - GHI ĐÈ
//    Điều kiện ghi đè:
//    1. Điều kiện cần
//        - phải có quan hệ kế thừa
//    2. Điều kiện đủ
//        - cùng kiểu dữ liệu trả về, cùng tên phương thức cùng tham số
//        - Bổ từ truy cập của phương thức ghi đè phải có phạm vi lớn hơn hoặc bằng phương thức
//

    @Override
    public void displayData() {
        System.out.println("This is the story");
    }

    public String toString̣(){
        return "This is the story";
    }
}
