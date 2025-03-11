
public class b02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello, Java World!");
        System.out.println(sb.toString());
        sb.delete(6, 11);
        System.out.println(sb.toString());
        sb.replace(7,11,"Universe");
        System.out.println(sb.toString());

    }
}
