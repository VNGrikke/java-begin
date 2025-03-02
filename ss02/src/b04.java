public class b04 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        if (a && b) {
            System.out.println("ca a va b deu dung");
        }
        if (!a || b) {
            System.out.println("1 trong 2 dung");
        }
        if (!a == false && b == true) {
            System.out.println("khong dung");
        }
        boolean c = true;
        System.out.println(!c);
    }
}
