public class Stringdemo {
    public static void main(String[] args) {
        /*
        * 1. String imutable - khong the thay doi duoc gai tri trong literal
        * 2. Cach khai báo string
        *   - Cách 1: literal -> primitive -> imutable
        *       String str = "value";
        *   - Cách 2: Construction cua lop string -> object -> reference -> mutable
        *       String str = new String("value")
        * */

        String str1 = "Rikkei Edu";
        String str2 = new String("Rikkei Edu");
        String str3 = "PTIT";
        String str4 = "Rikkei Edu";
        str1 = "Rikkei Aca";
        String str5 = "Rikkei Edu";
        String str6 = "Rikkei Edu";
        /*
        * 2 cách so sánh chuỗi == và equals
        * - Sử dụng == so sánh tuyệt đối
        * - sử dụng equals so sánh tương đối*/
//      ==
        System.out.println(str4 == str6);
        System.out.println(str4 == str2);
        System.out.println(str5 == str2);
//      equals
        System.out.println(str4.equals(str6));
        System.out.println(str4.equals(str2));
        System.out.println(str5.equals(str2));
    }
}
