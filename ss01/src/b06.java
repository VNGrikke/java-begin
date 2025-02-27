//Moi quan he:
//  JVM (Java Virtual Machine): Là máy ảo chạy chương trình Java. Nó chuyển đổi bytecode thành mã máy phù hợp
//                            với hệ điều hành và phần cứng cụ thể. JVM là thành phần cốt lõi giúp Java có tính di động.
//  JRE (Java Runtime Environment): Là môi trường chạy ứng dụng Java, bao gồm JVM và các thư viện Java cần thiết để chạy chương trình.
//  JDK (Java Development Kit): Là bộ công cụ phát triển Java, bao gồm JRE, trình biên dịch Java (javac),
//                              các công cụ debug, và nhiều tiện ích khác phục vụ cho việc lập trình.
//Mối quan hệ:
//  JDK ⊃ JRE ⊃ JVM.
//  JDK giúp lập trình viên viết mã, biên dịch và chạy chương trình Java.
//  JRE chỉ cung cấp môi trường để chạy ứng dụng, còn JVM là thành phần chịu trách nhiệm thực thi mã Java.
//
//
//"Write once, run anywhere" và tính đa nền tảng của Java
// Câu slogan "Write once, run anywhere" (WORA) thể hiện đặc điểm của Java: một chương trình Java chỉ cần viết một lần và có thể chạy trên nhiều nền tảng khác nhau mà không cần biên dịch lại.
//
//  Cơ chế hỗ trợ WORA:
//      Biên dịch sang bytecode: Khi viết mã Java và biên dịch bằng javac, mã nguồn .java được chuyển thành bytecode (.class).
//      Thực thi bởi JVM: JVM trên mỗi nền tảng có nhiệm vụ chuyển bytecode này thành mã máy phù hợp với hệ điều hành cụ thể.
//      Độc lập nền tảng: Vì bytecode không phụ thuộc vào hệ điều hành hay phần cứng, bất kỳ hệ thống nào có
//                        JVM phù hợp đều có thể chạy chương trình Java mà không cần biên dịch lại.
//
//
//
//Cài đặt và chạy chương trình Java đầu tiên trên IntelliJ IDEA
//Bước 1: Cài đặt IntelliJ IDEA và JDK
//  - Tải và cài đặt IntelliJ IDEA.
//  - Cài đặt JDK (ví dụ OpenJDK hoặc Oracle JDK) và thiết lập biến môi trường nếu cần.
//Bước 2: Tạo một dự án Java mới
//  - Mở IntelliJ IDEA và chọn "New Project".
//  - Chọn "Java", chọn phiên bản JDK phù hợp và nhấn Next.
//  - Đặt tên và chọn thư mục lưu dự án, sau đó nhấn Finish.
//Bước 3: Viết mã Java đầu tiên
//  - Trong cửa sổ dự án, tạo một thư mục src nếu chưa có.
//  - Nhấp chuột phải vào src → New → Java Class, đặt tên là Main.
//  - Nhập mã sau vào tệp Main.java:
//          public class Main {
//              public static void main(String[] args) {
//                  System.out.println("Hello, Java!");
//              }
//          }
//Bước 4: Chạy chương trình
//  Nhấn Run (hoặc tổ hợp phím Shift + F10).
//  Kết quả sẽ hiển thị:
//  Hello, Java!
//
//
//
//Các phiên bản của Java và sự khác biệt giữa Java SE, Java EE, Java ME
//Java có nhiều phiên bản được phát hành định kỳ, thường gồm các bản LTS (Long-Term Support)
//như Java 8, Java 11, Java 17,... và các bản mới nhất như Java 20+.
//
//Phân biệt Java SE, Java EE, Java ME:
//
//  - Java SE :
//              +Mục đích sử dụng: Phiên bản tiêu chuẩn, cung cấp các thư viện và API cơ bản như Java Core, JDBC, Swing, Collections.
//              +Đối tượng hướng đến: Dành cho ứng dụng desktop, ứng dụng console, và lập trình Java nói chung.
//  - Java EE:
//              +Mục đích sử dụng: Mở rộng từ Java SE, hỗ trợ phát triển ứng dụng web, server-side, microservices
//                                 với các công nghệ như Servlet, JSP, EJB, JPA.
//              +Đối tượng hướng đến: Dành cho doanh nghiệp, ứng dụng web, hệ thống lớn.
//  - Java ME:
//              +Mục đích sử dụng: Phiên bản Java tối ưu hóa cho thiết bị nhúng, mobile, IoT.
//              +Đối tượng hướng đến: Dành cho điện thoại cũ, thiết bị nhúng như IoT, hệ thống nhúng.
