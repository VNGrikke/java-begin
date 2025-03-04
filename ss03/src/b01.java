import java.util.Scanner;

public class b01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        if ( a == 0 ){
            System.out.print("khong chan khong le");
        }else if ( a % 2 == 0 ){
            System.out.print("So chan");
        }else {
            System.out.print("So le");
        }
    }
}
