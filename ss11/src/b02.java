//Định nghĩa
//Tính trừu tượng trong lập trình hướng đối tượng (OOP) là khái niệm ẩn giấu các chi tiết thực hiện phức tạp và chỉ hiển
//thị những đặc điểm thiết yếu của một đối tượng cho người dùng. Vai trò của nó là đơn giản hóa việc tương tác với các hệ
//thống phức tạp bằng cách cho phép người dùng tập trung vào các hoạt động ở mức độ cao mà không cần hiểu những cách thức
//hoạt động phức tạp bên dưới. Điều này thúc đẩy mã nguồn rõ ràng hơn, dễ bảo trì hơn và tái sử dụng mã hiệu quả hơn. Tổng
//thể, tính trừu tượng là rất cần thiết để quản lý độ phức tạp trong phát triển phần mềm.
//
//Phân tích
//- Tính trừu tượng cần thiết trong phần mềm phức tạp vì nó giúp giảm thiểu độ phức tạp bằng cách cho phép lập trình viên
// làm việc với các khái niệm và giao diện ở mức cao mà không cần chú ý đến từng chi tiết nhỏ. Điều này cải thiện khả năng
// hiểu, bảo trì và phát triển phần mềm một cách linh hoạt và nhanh chóng.
//
//Lớp trừu tượng: Có thể chứa cả phương thức trừu tượng và phương thức cụ thể, cho phép chia sẻ mã giữa các lớp con. Nó
// có thể có trạng thái và kế thừa từ các lớp khác.
//
//Giao diện: Chỉ chứa phương thức trừu tượng (trước Java 8) và không có trạng thái. Giao diện định nghĩa một hợp đồng mà
// các lớp có thể thực hiện mà không cần kế thừa.


// Ví dụ Máy ATM
//Máy ATM cho phép người dùng thực hiện các giao dịch như rút tiền hoặc kiểm tra số dư mà không cần hiểu cách mà máy giao
//tiếp với ngân hàng hoặc xử lý thông tin. Giao diện đơn giản giúp người dùng tập trung vào các chức năng chính.