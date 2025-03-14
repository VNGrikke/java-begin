//1.Kế thừa (Inheritance) là một trong bốn nguyên lý cơ bản của lập trình hướng đối tượng (OOP).
//  Kế thừa cho phép một lớp (lớp con) kế thừa các thuộc tính và phương thức từ một lớp khác (lớp cha).
//  Điều này giúp tái sử dụng mã nguồn và tạo ra một cấu trúc phân cấp giữa các lớp.
//
//  Lợi ích của kế thừa trong lập trình hướng đối tượng:
//
//      Tái sử dụng mã nguồn: Bạn có thể sử dụng lại các thuộc tính và phương thức của lớp cha trong lớp con mà không cần phải viết lại.
//
//      Tính kế thừa và mở rộng: Lớp con có thể mở rộng hoặc thay đổi hành vi của lớp cha bằng cách ghi đè (override) các phương thức.
//
//      Tạo cấu trúc phân cấp: Kế thừa giúp tạo ra một cấu trúc phân cấp rõ ràng giữa các lớp, giúp mã nguồn dễ hiểu và dễ quản lý hơn.
//
//2. Sự khác biệt giữa kế thừa và bao đóng (encapsulation) trong Java:

//      Tiêu chí	Kế thừa (Inheritance)	            Bao đóng (Encapsulation)
//
//      Định nghĩa	Lớp con kế thừa thuộc tính          Ẩn dữ liệu và cung cấp phương thức
//                  và phương thức từ lớp cha.	        truy cập thông qua getter và setter.
//
//      Mục đích	Tái sử dụng mã nguồn và tạo         Bảo vệ dữ liệu và kiểm soát quyền truy cập.
//                  cấu trúc phân cấp.
//
//      Cách thực   Sử dụng từ khóa extends.            Sử dụng các thuộc tính private và phương
//      hiện		                                    thức getter, setter.
//
//      Ví dụ	    Lớp Dog kế thừa từ lớp Animal.	    Lớp Person có thuộc tính private name và
//                                                      phương thức getName(), setName().
//VD:
//  class Animal {
//      private String name;
//
//      public void eat() {
//        System.out.println("Animal is eating.");
//      }
//
//      public String getName() {
//        return name;
//      }
//
//      public void setName(String name) {
//        this.name = name;
//      }
//  }
//
//  class Dog extends Animal {
//      public void bark() {
//        System.out.println("Dog is barking.");
//      }
//  }
//
//  public class Main {
//      public static void main(String[] args) {
//        Dog dog = new Dog();
//
//        dog.setName("Buddy");
//        System.out.println("Dog's name: " + dog.getName());
//        dog.eat();
//
//        dog.bark();
//      }
//  }
//
//
//4.
//Lợi ích:
//
//Tái sử dụng mã nguồn: Giảm thiểu việc viết lại mã nguồn bằng cách kế thừa các thuộc tính và phương thức từ lớp cha.
//
//Tính mở rộng: Lớp con có thể mở rộng hoặc thay đổi hành vi của lớp cha bằng cách ghi đè (override) các phương thức.
//
//Tạo cấu trúc phân cấp rõ ràng: Giúp mã nguồn dễ hiểu và dễ quản lý hơn.
//
//Dễ bảo trì: Thay đổi trong lớp cha có thể tự động áp dụng cho tất cả các lớp con, giảm thiểu công sức bảo trì.
//
//Hạn chế:
//
//Tính phụ thuộc cao: Lớp con phụ thuộc vào lớp cha, nếu lớp cha thay đổi, lớp con có thể bị ảnh hưởng.
//
//Khó hiểu và phức tạp: Nếu cấu trúc kế thừa quá phức tạp, mã nguồn có thể trở nên khó hiểu và khó quản lý.
//
//Vi phạm nguyên lý đóng gói: Kế thừa có thể làm lộ các chi tiết cài đặt của lớp cha, vi phạm nguyên lý đóng gói.
//
//Khó thay thế: Nếu cần thay đổi hành vi của lớp con, có thể phải thay đổi cả lớp cha, dẫn đến việc phải sửa đổi nhiều lớp.