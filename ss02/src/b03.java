public class b03 {
    public static void main(String[] args) {
        int y = 6, x = 3;
        System.out.println(x>y);    //false
        System.out.println(x<y);    // true
        System.out.println(x==y);   //false
        System.out.println(x!=y);   // true
        System.out.println(x>=y);   //false
        System.out.println(x<=y);   // true

        x = 6;
        y = 3;
        if (x>y){
            System.out.println("x lon hon y");
        }
        x = 6;
        y = 6;
        if (x==y){
            System.out.println("x bang y");
        }
        x = 6;
        y = 3;
        if (x!=y){
            System.out.println("x khac y");
        }
    }
}
