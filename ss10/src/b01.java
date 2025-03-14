/*
*   Tính đóng gói:- cho phép chúng ta giấu thông tin của đối tượng và chỉ cho phép các
*                   phương thức được định nghĩa trong lớp đó mới có thể truy cập và sử
*                   dụng các thuộc tính và phương thức đó. Nó giúp che dấu và bảo vệ dữ
*                   liệu bên trong đối tượng khỏi truy cập trực tiếp từ bên ngoài.
*
*                 - Điều này giúp giảm thiểu sự phụ thuộc giữa các đối tượng và tăng tính bảo mật cho chương trình.
*
*   Tính đóng gói (Encapsulation) là một trong bốn nguyên lý cơ bản của lập trình hướng đối tượng (OOP).
*   Trong Java, tính đóng gói được thực hiện bằng cách:
*       Ẩn dữ liệu (Data Hiding): Đặt các thuộc tính của lớp là private để ngăn chặn việc truy cập trực tiếp từ
*       bên ngoài lớp.
*       Cung cấp phương thức truy cập (Access Methods): Sử dụng các phương thức getter và setter để truy cập và
*       thay đổi giá trị của các thuộc tính.
*
*
*
*
*
*   VD:
*       public class Person {
            private String name;
            private int age;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                if (age > 0) {
                    this.age = age;
                } else {
                    System.out.println("Tuổi không hợp lệ.");
                }
            }
        }

        public class Main {
            public static void main(String[] args) {
                Person person = new Person();

                person.setName("John Doe");
                person.setAge(30);

                System.out.println("Name: " + person.getName());
                System.out.println("Age: " + person.getAge());
            }
        }
*
*   Lợi ích của tính đóng gói:
*       Bảo vệ dữ liệu: Bằng cách đặt các thuộc tính là private, bạn ngăn chặn việc truy cập
*                       trực tiếp từ bên ngoài lớp, giúp bảo vệ dữ liệu khỏi việc bị thay đổi một cách không kiểm soát.

        Kiểm soát quyền truy cập:   Bạn có thể kiểm soát cách dữ liệu được đọc và ghi thông qua các
*                                   phương thức getter và setter. Ví dụ, bạn có thể thêm các điều kiện
*                                   kiểm tra trong phương thức setter để đảm bảo dữ liệu được thiết lập một cách hợp lệ.

        Tăng tính linh hoạt và bảo trì: Bạn có thể thay đổi cách lưu trữ dữ liệu bên trong lớp mà không
                                        ảnh hưởng đến các lớp khác sử dụng nó, miễn là các phương thức getter và setter vẫn giữ nguyên cách thức hoạt động.

        Dễ dàng kiểm tra và gỡ lỗi: Bạn có thể thêm các câu lệnh ghi log hoặc kiểm tra trong các phương
                                    thức getter và setter để theo dõi việc truy cập và thay đổi dữ liệu.
* */