package polymorphism;

public class Empolyee {
//    OVERLOADING - Nạp chồng
//    Điều kiện nạp chồng:
//    1. Cần:
//        - Các phương thức nạp chồng phải trong cùng 1 lớp
//        - Các phương thức phải cùng tên
//    2. Đủ;
//        - Số lượng tham số khác nhau
//        - Thứ tự tham số khác nhau
//        - Kiểu dũ liệu tham số khác nhau
//

    public int addd(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int add(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber + secondNumber + thirdNumber;
    }

    public float add(float firstNumber, float secondNumber) {
        return firstNumber + secondNumber;
    }

    public void test(int number, String str){
        return ;
    }

    public void test(String str, int number){

    }

}
